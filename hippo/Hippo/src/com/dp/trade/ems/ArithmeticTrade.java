package com.dp.trade.ems;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;

import org.apache.log4j.Logger;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.explosion.base.helper;
import com.explosion.db.DBMysql;
import com.explosion.db.DataBaseCfg;
import com.explosion.tactic.util.Portfolio;
import com.explosion.trade.ctp.CTPInfo;
import com.explosion.trade.ctp.EntrustPublish;
import com.explosion.trade.ctp.SimTradeCtp;
import com.explosion.trade.ctp.TradeCtp;
import com.explosion.trade.stock.TradeSecurity;
import com.explosion.trade.util.Entrust;

public class ArithmeticTrade extends Thread {

	public  TradeSecurity	m_tSecurity;
	private String 			m_sConfigFile			= System.getProperty("user.dir") + File.separator + "conf" + File.separator + "config.properties";
	private Properties 		m_configProps 			= new Properties();
	private Logger 			m_log 					= Logger.getLogger(ArithmeticTrade.class);
	private String			m_PaperPortfoilo;
	public 	EntrustPublish 	m_publisher;
	
	
	
	// 20160311 add by xujun 增加交易账户map 
	private Map<String, Object> 		   m_CtpTradeMap;
	
	// 20160311 add by xujun 增加委托数据map(未成交委托数据)
	private ConcurrentMap<String, Entrust> m_EntrustMap;

	
	private DBMysql 			m_DB;
	private String 				m_sGetEntrust = "select " +
													"orderref, sessionid, frontid, portsname, " +
													"tactictype, comboffsetflag, instrumentid, " +
													"volumetotal, volumetotaloriginal, volumetraded, " +
													"direction, tacticid, tactictype, validinvertal, limitprice, " +
													"unixtime " +
												"from " +
													"dp.dpOrder a " +
												"where " +
													"(a.orderstatus = '1' or a.orderstatus = '3') and " +
													"insertdate = date(SYSDATE())";
	
	private int	 				m_QueryEnrustFreq;
	
	public ArithmeticTrade(){
		
		m_configProps 		= helper.loadConfig(m_sConfigFile);
		m_PaperPortfoilo 	= m_configProps.getProperty("quant.paperportfolio");
		m_QueryEnrustFreq 	= Integer.parseInt(m_configProps.getProperty("ArithmeticTrade.QueryEnrustFreq"));
		DataBaseCfg Cfg = new DataBaseCfg();
		Cfg.dbUser = m_configProps.getProperty("db.user");
		Cfg.dbPwd  = m_configProps.getProperty("db.pwd");
		Cfg.dbName = m_configProps.getProperty("db.name");
		Cfg.dbHost = m_configProps.getProperty("db.host");
		Cfg.dbPort = m_configProps.getProperty("db.port");

		
		m_EntrustMap 		= new ConcurrentHashMap<String, Entrust>();
		m_CtpTradeMap 		= new HashMap<String, Object>();
		m_DB 				= new DBMysql(null, Cfg, "ArithmeticTrade");
		
		startEntrustPublish();
	}
	
	public TradeCtp getTradeCtp(String sPordID){
		if(!m_CtpTradeMap.containsKey(sPordID)){
			return null;
		}else{
			return (TradeCtp) m_CtpTradeMap.get(sPordID);
		}
		
	}
	
	private void startEntrustPublish(){
		m_publisher 		= new EntrustPublish();
		Thread EntrustPublishThread = new Thread(m_publisher);
		EntrustPublishThread.start();
		EntrustPublishThread.setName("ENTRUSTPUBLISHTHREAD");
		m_log.info("ENTRUSTPUBLISHTHREAD start");
	}

	public void RegisterTradeCtp(String sPordName, CTPInfo info){
		if(m_PaperPortfoilo.equals("false")){
			if(!m_CtpTradeMap.containsKey(sPordName)){
				TradeCtp tradectp = new TradeCtp(m_EntrustMap);
				m_log.info(tradectp.toString());
				tradectp.Init(info, m_publisher);
				tradectp.Login(sPordName);
				tradectp.SettlementInfoConfirm();
				m_CtpTradeMap.put(sPordName,  tradectp);
			}
		}	
		else{
			SimTradeCtp simCtp = new SimTradeCtp();
			m_CtpTradeMap.put(sPordName,  simCtp);
		}
	}
	
	// 20160311 add by xujun 增加未成交委托数据轮询，超过设置时间间隔则撤单，然后补单
	@Override
	public void run(){
		while(true)
		{
//			JSONArray arrEntrust =  m_DB.Query(m_sGetEntrust);
//			
//			for(int i=0; i<arrEntrust.size(); i++){
//				JSONObject obj 		= arrEntrust.getJSONObject(i);
//				if(obj.containsKey("unixtime") && obj.containsKey("validinvertal")){
//					long entrusttime 	= obj.getLong("unixtime");
//					int validinvertal 	= obj.getInteger("validinvertal");
//					
//					String portsname = obj.getString("portsname");
//					String strategy = obj.getString("tactictype");
//					
//					
//					if(m_CtpTradeMap.containsKey(String.format("%s_%s", portsname, strategy))){
//						if(System.currentTimeMillis() - entrusttime > validinvertal){						
//							// 1. 撤单
//							String orderref 	= obj.getString("orderref");
//							String sInstrumentID= obj.getString("instrumentid");
//							int sessionid 		= obj.getInteger("sessionid");
//							int frontid 		= obj.getInteger("frontid");
//							CancelOrder(String.format("%s_%s", portsname, strategy), sInstrumentID, orderref, sessionid, frontid);
//							
//							// 2. 重新下单
//							String sSecurityID 	= obj.getString("instrumentid");
//							String sOpenClose 	= obj.getString("comboffsetflag");
//							String cEntrustBS 	= obj.getString("direction");
//							String sTacticID 	= obj.getString("tacticid");
//							String tacticType 	= obj.getString("tactictype");
//							int ValidInvertal 	= obj.getInteger("validinvertal");
//							
//							int vol 			= obj.getInteger("volumetotal");
//							Entrust e1 			= new Entrust(sSecurityID, sOpenClose, cEntrustBS.charAt(0), vol);
//							e1.m_ValidInvertal 	= ValidInvertal;
//							e1.m_PortInfo.setPortName(portsname);
//							e1.m_PortInfo.setStrategyName(tacticType);
//							BidAskOrderInsert(sTacticID, portsname, e1);
//							
//							// 3. 删除原来Entrust，重新插入委托数据
//		//					m_EntrustMap.remove(orderref);
//						}
//						else{
//							// Nothing
//						}
//					}
//				}
//			}
			
			try {
				sleep(m_QueryEnrustFreq);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				m_log.error(e.toString());
			}	
		}
	}
	
	
	// 组合下单拆分为子单(股票)
	public ArrayList<Entrust> GenerateSecurityOrder(Portfolio port){
		return null;
	}
	
	// 组合下单拆分为子单(期货)
	public ArrayList<Entrust> GenerateFutureOrder(Portfolio port){
		ArrayList<Entrust> arrE 	  = port.m_ListFuture;
		return arrE;
	}
	
	// 撤单
	public void CancelOrder(String sProdName, String sInstrumentID, String OrderRef, int SessionID, int FrontID){
 		if(m_CtpTradeMap.containsKey(sProdName)){
			TradeCtp m_tCtp = (TradeCtp) m_CtpTradeMap.get(sProdName);
			m_tCtp.CancelOrder(OrderRef, sInstrumentID, SessionID, FrontID);
		}
		else{
			m_log.error("Please register future information first! [" + sProdName + "]");
		}
		
	}
	
	// 20160314 add by xujun 增加单笔委托
	public void BidAskOrderInsert(String sTacticID, String Prod_Strategy, Entrust e){
		if(m_CtpTradeMap.containsKey(Prod_Strategy)){
			TradeCtp m_tCtp = (TradeCtp) m_CtpTradeMap.get(Prod_Strategy);
			m_tCtp.BidAskOrderInsert(sTacticID, e);
		}
		else{
			m_log.error("Please register future information first! [" + Prod_Strategy + "]");
		}
	}
	
	public boolean HandlePortfolioOrder(Portfolio port){
		ArrayList<Entrust> arrSecurityEntrust 	= GenerateSecurityOrder(port);
		ArrayList<Entrust> arrFutureEntrust 	= GenerateFutureOrder(port);
		if(arrFutureEntrust != null && arrFutureEntrust.size()>0){
			// 期货子单处理
			for(int i=0; i<arrFutureEntrust.size(); i++){
				String ProdID = port.m_PortInfo.getProdName();	//  20160826 modify by xujun. Change key to product's name 
				Entrust e1 = arrFutureEntrust.get(i);
				if(e1.m_Cancel){
					CancelOrder(e1.m_PortInfo.getProdName(), e1.m_sSecurityID, e1.m_sOrderref, e1.m_Sessionid, e1.m_Frontid);
				}else{
					if(m_PaperPortfoilo.equals("true")){
						if(m_CtpTradeMap.containsKey(ProdID)){
							SimTradeCtp simCtp = (SimTradeCtp) m_CtpTradeMap.get(ProdID);
							if(e1.LastPrice()){
								simCtp.LastOrderInsert(port.m_TacticID, e1);
							}
							else if(e1.LimitPrice()){
								simCtp.LimitOrderInsert(port.m_TacticID, e1);
							}
							else if(e1.BidAsk()){
								simCtp.BidAskOrderInsert(port.m_TacticID, e1);
							}
						}
						else{
							m_log.error("Please register future information first! [" + ProdID + "]");
						}
					}
					else if(m_PaperPortfoilo.equals("false")){
						if(m_CtpTradeMap.containsKey(ProdID)){
							TradeCtp m_tCtp = (TradeCtp) m_CtpTradeMap.get(ProdID);
							if(e1.LastPrice()){
								// 市价
								m_tCtp.LastOrderInsert(port.m_TacticID, arrFutureEntrust.get(i));
							}
							else if(e1.LimitPrice()){
								// 限价
								m_tCtp.LimitOrderInsert(port.m_TacticID, e1);
							}
							else if(e1.BidAsk()){
								// 对手价
								m_tCtp.BidAskOrderInsert(port.m_TacticID, e1);
							}
						}
						else{
							m_log.error("Please register future information first! [" + ProdID + "]");
						}
					}
				}
			}
		}
		
		if(arrSecurityEntrust != null && arrSecurityEntrust.size()>0){
			// 股票子单处理
		}
		return true;
		
	}
	
//	public boolean BidAskPortfolioInsert(Portfolio port){
//		ArrayList<Entrust> arrSecurityEntrust 	= GenerateSecurityOrder(port);
//		ArrayList<Entrust> arrFutureEntrust 	= GenerateFutureOrder(port);
//		if(port.m_FutureFirst && arrFutureEntrust != null && arrFutureEntrust.size()>0)
//		{
//			// 期货子单处理
//			for(int i=0; i<arrFutureEntrust.size(); i++)
//			{
//				String portname = port.m_PortInfo.getPortName();
//				if(m_PaperPortfoilo.equals("true")){
//					if(m_CtpTradeMap.containsKey(portname)){
//						SimTradeCtp simCtp = (SimTradeCtp) m_CtpTradeMap.get(portname);
//						simCtp.BidAskOrderInsert(port.m_TacticID, arrFutureEntrust.get(i));
//					}
//					else{
//						m_log.error("Please register future information first! [" + portname + "]");
//					}
//				}
//				else if(m_PaperPortfoilo.equals("false")){
//					if(m_CtpTradeMap.containsKey(portname)){
//						TradeCtp m_tCtp = (TradeCtp) m_CtpTradeMap.get(portname);
//						Entrust e =  arrFutureEntrust.get(i);
//						m_tCtp.BidAskOrderInsert(port.m_TacticID, e);
//					}
//					else{
//						m_log.error("Please register future information first! [" + portname + "]");
//					}
//					
//				}
//			}
//		}
//		else if(arrSecurityEntrust != null && arrSecurityEntrust.size()>0)
//		{
//			// 股票子单处理
//		}
//		return true;
//	}

	
//	public boolean LastOrderInsert(Portfolio port){
//		ArrayList<Entrust> arrSecurityEntrust 	= GenerateSecurityOrder(port);
//		ArrayList<Entrust> arrFutureEntrust 	= GenerateFutureOrder(port);
//		if(port.m_FutureFirst && arrFutureEntrust != null && arrFutureEntrust.size()>0)
//		{
//			// 期货子单处理
//			for(int i=0; i<arrFutureEntrust.size(); i++)
//			{
//				String portname = port.m_PortInfo.getPortName();
//				if(m_PaperPortfoilo.equals("true")){
//					if(m_CtpTradeMap.containsKey(portname)){
//						SimTradeCtp simCtp = (SimTradeCtp) m_CtpTradeMap.get(portname);
//						simCtp.LastOrderInsert(port.m_TacticID, arrFutureEntrust.get(i));
//					}
//					else{
//						m_log.error("Please register future information first! [" + portname + "]");
//					}
//					
//				}
//				else if(m_PaperPortfoilo.equals("false")){
//					if(m_CtpTradeMap.containsKey(portname)){
//						TradeCtp m_tCtp = (TradeCtp) m_CtpTradeMap.get(portname);
//						m_tCtp.LastOrderInsert(port.m_TacticID, arrFutureEntrust.get(i));
//					}
//					else{
//						m_log.error("Please register future information first! [" + portname + "]");
//					}
//				}
//			}
//		}
//		else if(arrSecurityEntrust != null && arrSecurityEntrust.size()>0)
//		{
//			// 股票子单处理
//		}
//		return true;
//	}
	
}

