package com.dp.trade.ems;

import java.util.concurrent.ConcurrentLinkedQueue;

import org.apache.log4j.Logger;

import com.dp.rms.RiskModule;
import com.explosion.tactic.util.Portfolio;
import com.explosion.trade.ctp.CTPInfo;
import com.explosion.trade.ctp.TradeCtp;

public class EMSModule extends Thread{
	public  static ArithmeticTrade 			m_ArithTrade;
	public ConcurrentLinkedQueue<Portfolio> ArithTradeLastOrderQueue;
	private RiskModule						RiskModule;
	protected Logger 	  					m_log;
	private static int 						INTERVAL = 1;

	static{
		m_ArithTrade 			= new ArithmeticTrade();
		// ∆Ù∂ØArithTradeœﬂ≥Ã
		Thread ArithTradeThread = new Thread(m_ArithTrade);
		ArithTradeThread.start();
		ArithTradeThread.setName("ARITHTRADETHREAD");
	}
	
	public static void RegisterFutureInfo(String PortNameStrategy , CTPInfo info){
		m_ArithTrade.RegisterTradeCtp(PortNameStrategy, info);
	}

	public static TradeCtp getTradeCtp(String sProdID){
		return m_ArithTrade.getTradeCtp(sProdID);
	}
	
	public EMSModule(){
		m_log		 = Logger.getLogger(EMSModule.class);
		m_log.info("EMSModule Start!");
	}
	
	public EMSModule(ConcurrentLinkedQueue<Portfolio> q){
		m_ArithTrade = new ArithmeticTrade();
		ArithTradeLastOrderQueue = q;
	}
	
	public EMSModule(RiskModule rMamage){
		m_ArithTrade = new ArithmeticTrade();
		this.RiskModule = rMamage;
	}
	
	public void SetRiskMamage(RiskModule rMamage){
		this.RiskModule = rMamage;
	}
 
		
	@Override
	public void run(){
		while(true){
			while(ArithTradeLastOrderQueue != null && ArithTradeLastOrderQueue.size()>0){
				Portfolio port = ArithTradeLastOrderQueue.poll();
//				if(RiskModule.CheckPort(port))
//				{
					m_ArithTrade.HandlePortfolioOrder(port);
//				}
			}
			try {
				sleep(INTERVAL);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				m_log.error(e.toString());
			}
		}
	}
}
