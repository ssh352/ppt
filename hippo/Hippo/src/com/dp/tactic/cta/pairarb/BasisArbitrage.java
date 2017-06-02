package com.dp.tactic.cta.pairarb;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.apache.log4j.Logger;
import org.rosuda.JRI.REXP;
import org.rosuda.JRI.RVector;
import org.rosuda.JRI.Rengine;

import net.jctp.JctpConstants;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.explosion.base.helper;
import com.explosion.tactic.util.Portfolio;
import com.explosion.tactic.util.Tactic;
import com.explosion.tactic.util.TextConsole;
import com.explosion.trade.ctp.CTPInfo;
import com.explosion.trade.util.Entrust;

public class BasisArbitrage extends Tactic{
	private String sIF;
	private String sIC;
	private String sIH;
	
	private String HS300 = "000300";
	private String SZ50  = "999987";
	private String ZZ500 = "990905";
	
	private double uplimit;
	private double downlimit;
	private double closeval;
	private int    m_lookbacktime = 60;
	
	private Rengine m_Rengine;
	
	protected String sFormatGetPos         =  	"select " +
													"sum((case when direction = '0' then a.volumetraded else -a.volumetraded end))  as openVol " + 
												"from " +
													"dporder a " + 
												"where " +
													"portsname = 'CITICS_HEDGE_01' and " + 
													"tactictype = 'BasisArbitrage' and " +
													"userid = '%s' and  " +
													"insertdate >= '20160525' and " + 
													"SUBSTR(a.InstrumentID FROM 1 FOR 2) = 'IF'"; 
													
	protected String sFormatGetQuoteSQL 	=   "select szCode, nMatch as now from realtimefuturedata where SzCode in ('%s', '%s', '%s') union " +
												"select szCode, nLastIndex as now from realtimeindex where SzCode in ('%s', '%s', '%s')";
	
	public BasisArbitrage(ConcurrentLinkedQueue<Portfolio> q){
		m_ArithTradeLastOrderQueue 		= q;
		m_log 							= Logger.getLogger(BasisArbitrage.class);
		
		sIF 							= m_configProps.getProperty("tactic.strategy.BasisArbitrage.IF");
		sIC 							= m_configProps.getProperty("tactic.strategy.BasisArbitrage.IC");
		sIH 							= m_configProps.getProperty("tactic.strategy.BasisArbitrage.IH");
		
		uplimit 						= Double.parseDouble(m_configProps.getProperty("tactic.strategy.BasisArbitrage.uplimit"));
		downlimit 						= Double.parseDouble(m_configProps.getProperty("tactic.strategy.BasisArbitrage.downlimit"));
		closeval 						= Double.parseDouble(m_configProps.getProperty("tactic.strategy.BasisArbitrage.closeval"));
		m_HoldingLimit					= Integer.parseInt(m_configProps.getProperty("tactic.strategy.BasisArbitrage.m_HoldingLimit"));
		m_CancelTime  					= Integer.parseInt(m_configProps.getProperty("tactic.strategy.BasisArbitrage.m_CancelTime"));
		INTERVALCHECKPORT 				= Integer.parseInt(m_configProps.getProperty("tactic.strategy.BasisArbitrage.intervalCheckPort"));
		InitFuture();
		ConnectDB();
		
		SetPortInfo("CITICS_HEDGE_01", "BasisArbitrage");
		setInterVal(Integer.parseInt(m_configProps.getProperty("tactic.strategy.BasisArbitrage.interval")));
		m_tacticattr.setsRROOT(m_configProps.getProperty("tactic.strategy.BasisArbitrage.RROOT"));
		m_tacticattr.setsSingalFile(m_configProps.getProperty("tactic.strategy.BasisArbitrage.RSINGALFILE"));
		
		
		
		m_tacticattr.ExecRCmd(String.format("setwd('%s')", m_tacticattr.getsRROOT()));
		m_tacticattr.ExecRCmd(String.format("source('%s')", m_tacticattr.getsSingalFile()));
        
        InitHolding();
	}
	
	@Override
	public boolean PrepareData() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public double GetDoubleValue(String sJson, String key)
	{
		JSONArray jsonObj = JSONArray.parseArray(sJson);
		return jsonObj.getJSONObject(0).getDouble(key);
	}

	@Override
	public int CalcSignal() {
		// TODO Auto-generated method stub
//		String sJson = "";
//		String sSql = String.format(sFormatGetQuoteSQL, sIF, sIC, sIH, HS300, SZ50, ZZ500);
//		ResultSet rs = m_DB.QuerySet(sSql);
//		double IFPrice = 0;
//		double ICPrice = 0;
//		double IHPrice = 0;
//		double IndexHS300 = 0;
//		double IndexSZ50 = 0;
//		double IndexZZ500 = 0;
//		try {
//			while(rs.next()){
//				if(rs.getString("szCode").equals(sIF)){
//					IFPrice = rs.getDouble("now");
//				}
//				else if(rs.getString("szCode").equals(sIC)){
//					ICPrice = rs.getDouble("now");
//				}
//				else if(rs.getString("szCode").equals(sIH)){
//					IHPrice = rs.getDouble("now");
//				}
//				else if(rs.getString("szCode").equals(HS300)){
//					IndexHS300 = rs.getDouble("now");
//				}
//				else if(rs.getString("szCode").equals(SZ50)){
//					IndexSZ50 = rs.getDouble("now");
//				}
//				else if(rs.getString("szCode").equals(ZZ500)){
//					IndexZZ500 = rs.getDouble("now");
//				}
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		double signal = ((2/3.0)*(IHPrice/IndexSZ50 - 1) + (1/3.0)*(ICPrice/IndexZZ500 - 1) - (IFPrice/IndexHS300 - 1)) * 100;
		

		REXP value = m_Rengine.eval("BasisArbitrage.calcSignal()");
        double signal = value.asDouble();
        m_log.info(String.format("ishold: %d   m_HoldingLimit: %d   signal: %f", m_IsHold, m_HoldingLimit,  signal));
		
		if(signal > uplimit && Math.abs(m_IsHold) < m_HoldingLimit ){
			GeneratePortfolio("OPEN LONG IF", " ");
			m_IsHold = m_IsHold + 1; 
			return 1;
		}
		else if(signal < downlimit && Math.abs(m_IsHold) < m_HoldingLimit ){
			GeneratePortfolio("OPEN SHORT IF", " ");
			m_IsHold = m_IsHold - 1;
			return 1;
		}
		else if(Math.abs(signal - closeval) < 0.01){
			if(m_IsHold > 0){
				GeneratePortfolio("CLOSE LONG IF", " ");
				m_IsHold = m_IsHold - 1;
			}else if(m_IsHold	< 0){
				GeneratePortfolio("CLOSE SHORT IF", " ");
				m_IsHold = m_IsHold + 1;
			}
			return 2;
		}
		return 0;
	}


	@Override
	public void GeneratePortfolio(String direction, String Remark) {
		// TODO Auto-generated method stub
		
		if(direction.contains("OPEN")){
			m_TacticID = helper.GenerateGuid();
		}		
		
		tmpPort.m_PortInfo = m_ProdInfo;
		tmpPort.m_TacticID = m_TacticID;
		tmpPort.m_ListFuture.clear();
		tmpPort.m_ListSecurity.clear();
		
		if(direction.equals("OPEN SHORT IF"))
		{
			Entrust e1 = new Entrust(sIF, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Sell, 4);
			e1.m_PortInfo = m_ProdInfo;
			e1.m_ValidInvertal = m_CancelTime;
			tmpPort.m_ListFuture.add(e1);
			
			Entrust e2 = new Entrust(sIH, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Buy, 4);
			e2.m_PortInfo = m_ProdInfo;
			e2.m_ValidInvertal = m_CancelTime;
			tmpPort.m_ListFuture.add(e2);
			
			Entrust e3 = new Entrust(sIC, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Buy, 1);
			e3.m_PortInfo = m_ProdInfo;
			e3.m_ValidInvertal = m_CancelTime;
			tmpPort.m_ListFuture.add(e3);
		}
		else if(direction.equals("OPEN LONG IF")){
			Entrust e1 = new Entrust(sIF, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Buy, 4);
			e1.m_PortInfo = m_ProdInfo;
			e1.m_ValidInvertal = m_CancelTime;
			tmpPort.m_ListFuture.add(e1);
			
			Entrust e2 = new Entrust(sIH, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Sell, 4);
			e2.m_PortInfo = m_ProdInfo;
			e2.m_ValidInvertal = m_CancelTime;
			tmpPort.m_ListFuture.add(e2);
			
			Entrust e3 = new Entrust(sIC, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Sell, 1);
			e3.m_PortInfo = m_ProdInfo;
			e3.m_ValidInvertal = m_CancelTime;
			tmpPort.m_ListFuture.add(e3);
		}
		else if(direction.equals("CLOSE LONG IF")){
			Entrust e1 = new Entrust(sIF, JctpConstants.STRING_THOST_FTDC_OF_Close, JctpConstants.THOST_FTDC_D_Sell, 4);
			e1.m_PortInfo = m_ProdInfo;
			e1.m_ValidInvertal = m_CancelTime;
			tmpPort.m_ListFuture.add(e1);
			
			Entrust e2 = new Entrust(sIH, JctpConstants.STRING_THOST_FTDC_OF_Close, JctpConstants.THOST_FTDC_D_Buy, 4);
			e2.m_PortInfo = m_ProdInfo;
			e2.m_ValidInvertal = m_CancelTime;
			tmpPort.m_ListFuture.add(e2);
			
			Entrust e3 = new Entrust(sIC, JctpConstants.STRING_THOST_FTDC_OF_Close, JctpConstants.THOST_FTDC_D_Buy, 1);
			e3.m_PortInfo = m_ProdInfo;
			e3.m_ValidInvertal = m_CancelTime;
			tmpPort.m_ListFuture.add(e3);
		}
		else if(direction.equals("CLOSE SHORT IF"))
		{
			Entrust e1 = new Entrust(sIF, JctpConstants.STRING_THOST_FTDC_OF_Close, JctpConstants.THOST_FTDC_D_Buy, 4);
			e1.m_PortInfo = m_ProdInfo;
			e1.m_ValidInvertal = m_CancelTime;
			tmpPort.m_ListFuture.add(e1);
			
			Entrust e2 = new Entrust(sIH, JctpConstants.STRING_THOST_FTDC_OF_Close, JctpConstants.THOST_FTDC_D_Sell, 4);
			e2.m_PortInfo = m_ProdInfo;
			e2.m_ValidInvertal = m_CancelTime;
			tmpPort.m_ListFuture.add(e2);
			
			Entrust e3 = new Entrust(sIC, JctpConstants.STRING_THOST_FTDC_OF_Close, JctpConstants.THOST_FTDC_D_Sell, 1);
			e3.m_PortInfo = m_ProdInfo;
			e3.m_ValidInvertal = m_CancelTime;
			tmpPort.m_ListFuture.add(e3);
		}
		
//		m_Port.m_cOpenClose 		= JctpConstants.STRING_THOST_FTDC_OF_Open;
		tmpPort.m_FutureFirst 		= true;
	}
	


	public void InitHolding(){
		JSONArray holdling =  getSQLData(String.format(sFormatGetPos,  m_ctpinfo.getSuserId()));
		if(holdling.size() >= 0){
			JSONObject jsonHolding 		= holdling.getJSONObject(0);
			m_IsHold 						= jsonHolding.getInteger("openVol") / (4); 
		}
	}
	
	@Override
	public boolean InitFuture() {
		// TODO Auto-generated method stub
		// ³õÊ¼»¯CTP
		m_ctpinfo = new CTPInfo();
		m_ctpinfo.setStraderFrontUrl(m_configProps.getProperty("tactic.strategy.BasisArbitrage.traderFrontUrl"));
		m_ctpinfo.setSbrokerId(m_configProps.getProperty("tactic.strategy.BasisArbitrage.brokerId"));
		m_ctpinfo.setSuserId(m_configProps.getProperty("tactic.strategy.BasisArbitrage.userId"));
		m_ctpinfo.setSinvestorId(m_configProps.getProperty("tactic.strategy.BasisArbitrage.userId"));
		m_ctpinfo.setSpassword(m_configProps.getProperty("tactic.strategy.BasisArbitrage.password"));
		
		return true;
	}

	@Override
	public boolean InitSecurity() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean CheckPort() {
		// TODO Auto-generated method stub
		
		JSONArray arrEntrust =  getSQLData(String.format(m_TacticSQL.m_sFormatOrderSQL, m_ProdInfo.getStrategyName(), m_ctpinfo.getSuserId(), 3));
		
		if(arrEntrust.size() > 0 ){
			JSONObject jsonOrder1 		= arrEntrust.getJSONObject(0);
			JSONObject jsonOrder2 		= arrEntrust.getJSONObject(1);
			JSONObject jsonOrder3 		= arrEntrust.getJSONObject(2);
			
			String sOrderStatus1 = jsonOrder1.getString("orderstatus");
			String sOrderStatus2 = jsonOrder2.getString("orderstatus");
			String sOrderStatus3 = jsonOrder3.getString("orderstatus");
	
			if(sOrderStatus1.equals("0") && sOrderStatus2.equals("0") && sOrderStatus3.equals("0")){
				m_isUnFinished = false;
			}
		}
		return false;
	}
	
	
}
