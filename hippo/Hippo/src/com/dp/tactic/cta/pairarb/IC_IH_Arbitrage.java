package com.dp.tactic.cta.pairarb;

import java.util.concurrent.ConcurrentLinkedQueue;

import net.jctp.JctpConstants;
import org.apache.log4j.Logger;

import com.explosion.base.helper;
import com.explosion.tactic.util.Portfolio;
import com.explosion.tactic.util.Tactic;
import com.explosion.trade.ctp.CTPInfo;
import com.explosion.trade.util.Entrust;


public class IC_IH_Arbitrage  extends Tactic{
	private String sIC;
	private String sIH;
	private String sAMTime;
	private String sPMTime;

	
	public IC_IH_Arbitrage(ConcurrentLinkedQueue<Portfolio> q){
		m_ArithTradeLastOrderQueue 		= q;
		m_log 							= Logger.getLogger(IC_IH_Arbitrage.class);

		sIC 		= m_configProps.getProperty("tactic.strategy.IC_IH_Arbitrage.IC");
		sIH 		= m_configProps.getProperty("tactic.strategy.IC_IH_Arbitrage.IH");
		sAMTime 	= m_configProps.getProperty("tactic.strategy.IC_IH_Arbitrage.AM");
		sPMTime 	= m_configProps.getProperty("tactic.strategy.IC_IH_Arbitrage.PM");
		m_CancelTime  = Integer.parseInt(m_configProps.getProperty("tactic.strategy.IC_IH_Arbitrage.m_CancelTime"));
		
		setInterVal(Integer.parseInt(m_configProps.getProperty("tactic.strategy.IC_IH_Arbitrage.interval")));
		

		InitFuture();
		ConnectDB();	
		
		SetPortInfo("CITICS_HEDGE_01", "IC_IH_ARBITRAGE");
	}
	
	@Override
	public boolean PrepareData() {
		// TODO Auto-generated method stub
		return false;
	}

	
	// 1 : OPEN
	// 2 : CLOSE
	// 0 : NOTHING
	@Override
	public int CalcSignal() {
		// TODO Auto-generated method stub
		System.out.println(helper.GetTimeMin());
		if(helper.GetTimeMin().equals(sAMTime)){
			GeneratePortfolio("AM", " ");
			return 1;
		}
		else if(helper.GetTimeMin().equals(sPMTime)){
			GeneratePortfolio("PM", " ");
			return 2;
		}
		return 0;
	}

	// AM : OPEN
	// PM : CLOSE
	@Override
	public void GeneratePortfolio(String direction, String Remark) {
		// TODO Auto-generated method stub
		tmpPort.m_ListFuture.clear();
		tmpPort.m_ListSecurity.clear();
		
		if(direction.equals("AM"))
		{
			Entrust e1 = new Entrust(sIH, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Buy, 2);
			e1.m_PortInfo = m_ProdInfo;
			tmpPort.m_ListFuture.add(e1);
			
			Entrust e2 = new Entrust(sIC, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Sell, 1);
			e2.m_PortInfo = m_ProdInfo;
			tmpPort.m_ListFuture.add(e2);
		}
		else if(direction.equals("PM")){
//			Entrust e1 = new Entrust(sIH, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Sell, 2);
//			e1.m_PortInfo = m_PortInfo;
//			m_Port.m_ListFuture.add(e1);
//					
//			Entrust e2 = new Entrust(sIC, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Buy, 1);
//			e2.m_PortInfo = m_PortInfo;
//			m_Port.m_ListFuture.add(e2);
			
			Entrust e1 = new Entrust(sIH, 2170, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Sell, 2);
			e1.m_PortInfo = m_ProdInfo;
			e1.m_ValidInvertal = m_CancelTime;
					
			tmpPort.m_ListFuture.add(e1);
		}
		
		tmpPort.m_cOpenClose 		= JctpConstants.STRING_THOST_FTDC_OF_Open;
		tmpPort.m_FutureFirst 		= true;
	}

	
	@Override
	public boolean InitFuture() {
		// TODO Auto-generated method stub
		// ≥ı ºªØCTP
		m_ctpinfo = new CTPInfo();
		m_ctpinfo.setStraderFrontUrl(m_configProps.getProperty("tactic.strategy.IC_IH_Arbitrage.traderFrontUrl"));
		m_ctpinfo.setSbrokerId(m_configProps.getProperty("tactic.strategy.IC_IH_Arbitrage.brokerId"));
		m_ctpinfo.setSuserId(m_configProps.getProperty("tactic.strategy.IC_IH_Arbitrage.userId"));
		m_ctpinfo.setSinvestorId(m_configProps.getProperty("tactic.strategy.IC_IH_Arbitrage.userId"));
		m_ctpinfo.setSpassword(m_configProps.getProperty("tactic.strategy.IC_IH_Arbitrage.password"));
		
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
		return false;
	}

	@Override
	public void InitHolding() {
		// TODO Auto-generated method stub
		
	}

}
