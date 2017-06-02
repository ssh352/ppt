package com.dp.tactic.cta.pairarb;

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
import com.explosion.trade.ctp.CTPInfo;
import com.explosion.trade.util.Entrust;


/////全部成交
//#define THOST_FTDC_OST_AllTraded '0'
/////部分成交还在队列中
//#define THOST_FTDC_OST_PartTradedQueueing '1'
/////部分成交不在队列中
//#define THOST_FTDC_OST_PartTradedNotQueueing '2'
/////未成交还在队列中
//#define THOST_FTDC_OST_NoTradeQueueing '3'
/////未成交不在队列中
//#define THOST_FTDC_OST_NoTradeNotQueueing '4'
/////撤单
//#define THOST_FTDC_OST_Canceled '5'
/////未知
//#define THOST_FTDC_OST_Unknown 'a'
/////尚未触发
//#define THOST_FTDC_OST_NotTouched 'b'
/////已触发
//#define THOST_FTDC_OST_Touched 'c'


public class BasisArbIC00_IC03 extends Tactic{
	
	private Rengine 	m_Rengine;
	private String 		m_sIC00;
	private String 		m_sIC03;
	
	private double 		m_uplimit;
	private double 		m_downlimit;
	private double 		m_IC00Price;
	private double 		m_IC03Price;
	private double 		m_IC00RT_BID1;
	private double 		m_IC00RT_ASK1;
	private double 		m_IC03RT_BID1;
	private double 		m_IC03RT_ASK1;
	private double		m_IC00OptimizePoints;
	private double		m_IC03OptimizePoints;
	private double		m_stopLossLine;
	
	private double 			m_Miu 			= 0;
	private double    		m_Sd 			= 0;
	private double  		m_Closeoffset	= 0;
	private int    			m_Count 		= 0;
	
 
													
	protected String m_sFormatGetQuoteSQL 	=   "select szCode, nMatch as now from realtimefuturedata where SzCode in ('%s', '%s', '%s') union " +
												"select szCode, nLastIndex as now from realtimeindex where SzCode in ('%s', '%s', '%s')";
	
	
	public BasisArbIC00_IC03(ConcurrentLinkedQueue<Portfolio> q){
		m_ArithTradeLastOrderQueue 		= q;
		m_log 							= Logger.getLogger(BasisArbIC00_IC03.class);
		
		m_sIC00 						= m_configProps.getProperty("tactic.strategy.BasisArbIC00_IC03.IC00");
		m_sIC03 						= m_configProps.getProperty("tactic.strategy.BasisArbIC00_IC03.IC03");
		
		m_uplimit 						= Double.parseDouble(m_configProps.getProperty("tactic.strategy.BasisArbIC00_IC03.uplimit"));
		m_downlimit 					= Double.parseDouble(m_configProps.getProperty("tactic.strategy.BasisArbIC00_IC03.downlimit"));
		m_HoldingLimit					= Integer.parseInt(m_configProps.getProperty("tactic.strategy.BasisArbIC00_IC03.m_HoldingLimit"));
		m_CancelTime  					= Integer.parseInt(m_configProps.getProperty("tactic.strategy.BasisArbIC00_IC03.CancelTime"));
		INTERVALCHECKPORT 				= Integer.parseInt(m_configProps.getProperty("tactic.strategy.BasisArbIC00_IC03.intervalCheckPort"));
		m_IC00OptimizePoints			= Double.parseDouble(m_configProps.getProperty("tactic.strategy.BasisArbIC00_IC03.IC00.opt.points"));
		m_IC03OptimizePoints			= Double.parseDouble(m_configProps.getProperty("tactic.strategy.BasisArbIC00_IC03.IC03.opt.points"));
		m_stopLossLine					= Double.parseDouble(m_configProps.getProperty("tactic.strategy.BasisArbIC00_IC03.stopLossLine"));
		m_AppendRaise 					= Double.parseDouble(m_configProps.getProperty("tactic.strategy.BasisArbIC00_IC03.opt.append.raise"));
		m_Closeoffset					= Double.parseDouble(m_configProps.getProperty("tactic.strategy.BasisArbIC00_IC03.closeoffset"));
	
		
		InitFuture();
		ConnectDB();
		
		SetPortInfo("CITICS_HEDGE_01", "BasisArbIC00_IC03");
		setInterVal(Integer.parseInt(m_configProps.getProperty("tactic.strategy.BasisArbIC00_IC03.interval")));
		m_tacticattr.setsRROOT(m_configProps.getProperty("tactic.strategy.BasisArbIC00_IC03.RROOT"));
		m_tacticattr.setsSingalFile(m_configProps.getProperty("tactic.strategy.BasisArbIC00_IC03.RSINGALFILE"));
		
		
		m_Rengine = Rengine.getMainEngine();
// 		if there is no R engine, then new one
		if(m_Rengine == null){
//			m_Rengine = new Rengine(new String[] { "--vanilla" }, false, new TextConsole());
			m_Rengine = new Rengine(new String[] { "--vanilla" }, false, null);
		}	
		
        if (!m_Rengine.waitForR()) {
            m_log.error("Cannot load R");
        }
        
        m_tacticattr.ExecRCmd(String.format("setwd('%s')", 	m_tacticattr.getsRROOT()));
        m_tacticattr.ExecRCmd(String.format("source('%s')", 	m_tacticattr.getsSingalFile()));
        
        InitHolding();
        InitTacticID();
	}
	
	@Override
	public boolean PrepareData() {
		// TODO Auto-generated method stub
		return false;
	}
	
	private void getMiuSD(){
		REXP value 	= m_Rengine.eval("RuningIndexFutureICArb.calcSignal()");
		if(value == null){
			return;
		}else{
	    	RVector r 	= value.asVector();
	    	m_Miu  		= r.at("Miu").asDouble();
	        m_Sd 		= r.at("sd").asDouble();
		}
	}
	

	@Override
	public int CalcSignal() {
		// TODO Auto-generated method stub
		
		int offSetFlag 	= 0;
		m_Count 		= m_Count + 1;
		if((m_Miu == 0 && m_Sd == 0) || m_Count == 60){
			getMiuSD();
			m_Count = 0;
		}
        
        REXP value 			= m_Rengine.eval(String.format("RuningIndexFutureICArb.Quote('%s.CFE', '%s.CFE')", m_sIC00, m_sIC03));
        if(value == null){
        	return offSetFlag; 
        }

    	RVector r 			= value.asVector();
    	if(r.at("CODE") == null){
    		return offSetFlag;
    	}
    	
		if(r.at("CODE").asStringArray()[0].contains(m_sIC00)){
			m_IC00Price 			= r.at("RT_LAST").asDoubleArray()[0];
			m_IC00RT_BID1			= r.at("RT_BID1").asDoubleArray()[0];
			m_IC00RT_ASK1			= r.at("RT_ASK1").asDoubleArray()[0];
			
	    	m_IC03Price 			= r.at("RT_LAST").asDoubleArray()[1];
	    	m_IC03RT_BID1			= r.at("RT_BID1").asDoubleArray()[1];
			m_IC03RT_ASK1			= r.at("RT_ASK1").asDoubleArray()[1];
		}
    	
        double Signal 			= m_IC00Price - m_IC03Price;
        double upOpenLine 		= m_Miu + m_uplimit*m_Sd;
        double downOpenLine 	= m_Miu - m_downlimit*m_Sd;
        m_log.info(String.format("ishold: %d   m_HoldingLimit: %d   miu: %f  sd: %f  upLimit: %f  donwLimit: %f  IC00Price: %f   IC03Price: %f  diff: %f IC00BID1: %f IC00ASK1: %f IC03BID1: %f IC03ASK1: %f", 
        							m_IsHold, m_HoldingLimit, m_Miu, m_Sd, upOpenLine, downOpenLine,  m_IC00Price, m_IC03Price, Signal, m_IC00RT_BID1, m_IC00RT_ASK1, m_IC03RT_BID1, m_IC03RT_ASK1));
        
        String sRemark = String.format("miu: %f  sd: %f  upLimit: %f  donwLimit: %f  IC00Price: %f  IC03Price: %f  diff: %f IC00BID1: %f IC00ASK1: %f IC03BID1: %f IC03ASK1: %f", 
        						m_Miu, m_Sd, upOpenLine, downOpenLine,  m_IC00Price, m_IC03Price, Signal, m_IC00RT_BID1, m_IC00RT_ASK1, m_IC03RT_BID1, m_IC03RT_ASK1);
        
        if(Signal > upOpenLine && Math.abs(m_IsHold) < m_HoldingLimit){
        	// LONG IC03 SHORT IC00
        	GeneratePortfolio("OPEN SHORT IC00", String.format("OPEN SHORT IC00 %s", sRemark));
        	m_sEntrustType 	= "OPEN SHORT IC00";
        	offSetFlag 		= 1;
        }
        else if(Signal < downOpenLine && Math.abs(m_IsHold) < m_HoldingLimit){
        	// LONG IC00 SHORT IC03
        	GeneratePortfolio("OPEN LONG IC00", String.format("OPEN LONG IC00 %s", sRemark));
        	m_sEntrustType 	= "OPEN LONG IC00";
        	offSetFlag 		= 1;
        }
//        else if(Math.abs(Signal - m_Miu)/m_Miu < 0.002 && ishold != 0){
        else if(((m_sEntrustType.equals("OPEN LONG IC00") && Signal >= m_Miu + m_Closeoffset) || (m_sEntrustType.equals("OPEN SHORT IC00") && Signal <= m_Miu - m_Closeoffset)) 
        		&& m_IsHold != 0){
        	
        	if(m_IsHold >= 0){
            	// LONG IC00 SHORT IC03
        		GeneratePortfolio("CLOSE SHORT IC00", String.format("CLOSE SHORT IC00 %s", sRemark));
        		m_sEntrustType 	= "CLOSE SHORT IC00";
        		offSetFlag 		= 2;
        	}else{
        		// CLOSE Short IC03, Long IC00
        		GeneratePortfolio("CLOSE LONG IC00", String.format("CLOSE LONG IC00 %s", sRemark));
        		m_sEntrustType 	= "CLOSE LONG IC00";
        		offSetFlag 		= 2;
        	}
        }
        else if(m_IsHold != 0){
        	// Stop Loss
//        	JSONArray arrEntrust =  getEntrust();
//        	JSONObject jsonOrder1 		= arrEntrust.getJSONObject(0);
//			JSONObject jsonOrder2 		= arrEntrust.getJSONObject(1);
//			
//			jsonOrder1.getString("");
        }
        
		return offSetFlag;
	}


	@Override
	public void GeneratePortfolio(String direction, String remark) {
		// TODO Auto-generated method stub
		
		if(direction.contains("OPEN")){
			m_TacticID = helper.GenerateGuid();
		}		
	
		tmpPort.m_ListFuture.clear();
		tmpPort.m_ListSecurity.clear();
		tmpPort.m_PortInfo		= m_ProdInfo;
		tmpPort.m_TacticID 		= m_TacticID;
	
		
		if(direction.equals("OPEN SHORT IC00"))
		{
			Entrust e1 			= new Entrust(m_sIC00, m_IC00Price + m_IC00OptimizePoints, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Sell, 1);
			e1.m_PortInfo 		= m_ProdInfo;
			e1.m_ValidInvertal  = m_CancelTime;
			e1.m_remark			= remark;
			tmpPort.m_ListFuture.add(e1);
			
			Entrust e2 			= new Entrust(m_sIC03, m_IC03Price + m_IC03OptimizePoints, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Buy, 1);
			e2.m_PortInfo 		= m_ProdInfo;
			e2.m_ValidInvertal 	= m_CancelTime;
			e2.m_remark			= remark;
			tmpPort.m_ListFuture.add(e2);
		}
		else if(direction.equals("OPEN LONG IC00")){
			Entrust e1 			= new Entrust(m_sIC00, m_IC00Price - m_IC00OptimizePoints, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Buy, 1);
			e1.m_PortInfo 		= m_ProdInfo;
			e1.m_ValidInvertal  = m_CancelTime;
			e1.m_remark			= remark;
			tmpPort.m_ListFuture.add(e1);
			
			Entrust e2 			= new Entrust(m_sIC03, m_IC03Price - m_IC03OptimizePoints, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Sell, 1);
			e2.m_PortInfo 		= m_ProdInfo;
			e2.m_ValidInvertal  = m_CancelTime;
			e2.m_remark			= remark;
			tmpPort.m_ListFuture.add(e2);
			
		}
		else if(direction.equals("CLOSE SHORT IC00")){
			Entrust e1 			= new Entrust(m_sIC00, m_IC00Price + m_IC00OptimizePoints, JctpConstants.STRING_THOST_FTDC_OF_Close, JctpConstants.THOST_FTDC_D_Sell, 1);
			e1.m_PortInfo 		= m_ProdInfo;
			e1.m_ValidInvertal  = m_CancelTime;
			e1.m_remark			= remark;
			tmpPort.m_ListFuture.add(e1);
			
			Entrust e2 			= new Entrust(m_sIC03, m_IC03Price + m_IC03OptimizePoints, JctpConstants.STRING_THOST_FTDC_OF_Close, JctpConstants.THOST_FTDC_D_Buy, 1);
			e2.m_PortInfo 		= m_ProdInfo;
			e2.m_ValidInvertal  = m_CancelTime;
			e2.m_remark			= remark;
			tmpPort.m_ListFuture.add(e2);
		}
		else if(direction.equals("CLOSE LONG IC00")){
			Entrust e1 			= new Entrust(m_sIC00, m_IC00Price - m_IC00OptimizePoints, JctpConstants.STRING_THOST_FTDC_OF_Close, JctpConstants.THOST_FTDC_D_Buy, 1);
			e1.m_PortInfo 		= m_ProdInfo;
			e1.m_ValidInvertal  = m_CancelTime;
			e1.m_remark			= remark;
			tmpPort.m_ListFuture.add(e1);
			
			Entrust e2 			= new Entrust(m_sIC03, m_IC03Price - m_IC03OptimizePoints, JctpConstants.STRING_THOST_FTDC_OF_Close, JctpConstants.THOST_FTDC_D_Sell, 1);
			e2.m_PortInfo 		= m_ProdInfo;
			e2.m_ValidInvertal 	= m_CancelTime;
			e2.m_remark			= remark;
			tmpPort.m_ListFuture.add(e2);
		}
		
		tmpPort.m_cOpenClose 		= JctpConstants.STRING_THOST_FTDC_OF_Open;
		tmpPort.m_FutureFirst 		= true;
	}
	


	@Override
	public void InitHolding(){
		JSONArray holdling =  getSQLData(String.format(m_TacticSQL.m_sFormatGetPos,
											m_ProdInfo.getProdName(),
											m_ProdInfo.getStrategyName(),
											m_ctpinfo.getSuserId(), 
											m_sIC00));
		
		if(holdling.size() >= 0){
			JSONObject jsonHolding 		= holdling.getJSONObject(0);
			if(jsonHolding.getInteger("openVol") != null){
				m_IsHold 						= jsonHolding.getInteger("openVol") / (1);
				if(m_IsHold > 0){
					m_sEntrustType 	= "OPEN LONG IC00";
				}
				else if(m_IsHold < 0){
					m_sEntrustType 	= "OPEN SHORT IC00";
				}
			}else{
				m_IsHold 					= 0;
				m_sEntrustType				= " ";
			}
		}else{
			m_IsHold = 0;
		}		
	}
	
	
	@Override
	public boolean InitFuture() {
		// TODO Auto-generated method stub
		// 初始化CTP
		m_ctpinfo = new CTPInfo();
		m_ctpinfo.setStraderFrontUrl(m_configProps.getProperty("tactic.strategy.BasisArbIC00_IC03.traderFrontUrl"));
		m_ctpinfo.setSbrokerId(m_configProps.getProperty("tactic.strategy.BasisArbIC00_IC03.brokerId"));
		m_ctpinfo.setSuserId(m_configProps.getProperty("tactic.strategy.BasisArbIC00_IC03.userId"));
		m_ctpinfo.setSinvestorId(m_configProps.getProperty("tactic.strategy.BasisArbIC00_IC03.userId"));
		m_ctpinfo.setSpassword(m_configProps.getProperty("tactic.strategy.BasisArbIC00_IC03.password"));
		
		return true;
	}

	@Override
	public boolean InitSecurity() {
		// TODO Auto-generated method stubs
		return false;
	}

	private void ModifyHolding(){
		if(m_sEntrustType == "OPEN SHORT IC00"){
			m_IsHold 	= m_IsHold - 1;
		}else if(m_sEntrustType == "OPEN LONG IC00"){
			m_IsHold 	= m_IsHold + 1;
		}else if(m_sEntrustType == "CLOSE SHORT IC00"){
			m_IsHold 	= m_IsHold - 1;
		}else if(m_sEntrustType == "CLOSE LONG IC00"){
			m_IsHold 	= m_IsHold + 1;
		}
	}
	
	@Override
	public boolean CheckPort() {
		// TODO Auto-generated method stub
		JSONArray arrEntrust = getSQLData(String.format(m_TacticSQL.m_sFormatOrderSQL, 
														m_ProdInfo.getStrategyName(), 
													 	m_ctpinfo.getSuserId(), 
														2));
		
		if(arrEntrust.size() > 1 ){
			JSONObject jsonOrder1 		= arrEntrust.getJSONObject(0);
			JSONObject jsonOrder2 		= arrEntrust.getJSONObject(1);
			String sOrderStatus1 		= jsonOrder1.getString("orderstatus");
			String sOrderStatus2 		= jsonOrder2.getString("orderstatus");
			
			if((sOrderStatus1.equals(JctpConstants.STRING_THOST_FTDC_OST_AllTraded) && sOrderStatus2.equals(JctpConstants.STRING_THOST_FTDC_OST_AllTraded))){
				m_isUnFinished = false;
				ModifyHolding();
			}else if( (sOrderStatus1.equals(JctpConstants.STRING_THOST_FTDC_OST_Canceled) && sOrderStatus2.equals(JctpConstants.STRING_THOST_FTDC_OST_Canceled))){
				m_isUnFinished = false;
			}else if(sOrderStatus1.equals(JctpConstants.STRING_THOST_FTDC_OST_AllTraded) && !sOrderStatus2.equals(JctpConstants.STRING_THOST_FTDC_OST_Canceled)){			
				Append(jsonOrder2);
				ModifyHolding();
			}else if(sOrderStatus2.equals(JctpConstants.STRING_THOST_FTDC_OST_AllTraded) && !sOrderStatus1.equals(JctpConstants.STRING_THOST_FTDC_OST_Canceled)){
				Append(jsonOrder1);
				ModifyHolding();
			}
		}
		return false;
	}
}
