

package com.dp.tactic.cta.hft;

import com.explosion.tactic.util.Portfolio;
import com.explosion.tactic.util.Tactic;
import com.explosion.trade.ctp.type.DPCThostFtdcDepthMarketDataField;
import com.explosion.trade.util.Entrust;

import net.jctp.JctpConstants;

import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.explosion.base.helper;
import com.explosion.quote.util.LastQuoteMap;

public class MakeMarketByVolume extends Tactic{
	private String 					 m_sStrategyName;
	private ConcurrentHashMap<String, DPCThostFtdcDepthMarketDataField> m_LastQuoteMap;
	private ConcurrentLinkedDeque<DPCThostFtdcDepthMarketDataField> m_LastQuoteQueue;
	private LastQuoteMap 			 m_cQuoteMap;
	private int 					 m_Spreads 		  = 1;
	private int 					 m_StopSpreads 	  = 3;
	private int 					 m_vol 			  = 1;
	private double 					 m_AskPrice 	  = 0;
	private double 					 m_BidPrice 	  = 0;
	private double 					 m_LastPrice 	  = 0;
	private double 					 m_TradedPrice 	  = 0;
	private double					 m_BeiShu		  = 10;
	private double					 m_signal;
	private double					 m_MinUnit;
	private String					 m_BS = "";
	private	int						 m_pos= 0;
	private MakeMarketSignal		 m_MakeMarketSignal;
	public 	Long 		m_posUnixTimeStart		= (long) 0;			 // 默认获取当天持仓数据
	
	private class MakeMarketSignal implements Runnable{
		
		MakeMarketSignal(){
			m_signal 							= 0; // 1 LONG; -1 SHORT
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(true){
				if(m_LastQuoteQueue.size() > 0 ){
					// get data
					DPCThostFtdcDepthMarketDataField e 	= m_LastQuoteQueue.poll();	
					m_AskPrice 			   = e.AskPrice1;
					m_BidPrice 			   = e.BidPrice1;
					m_LastPrice			   = e.LastPrice;
//					if(e.AskVolume1 * m_BeiShu < e.BidVolume1 & e.BidPrice1 == e.LastPrice){
					if(e.AskVolume1 < 20 & e.BidVolume1 > 500){
//					if(e.AskVolume1 * m_BeiShu < e.BidVolume1){
						m_signal = 1;
//					}else if (e.BidVolume1 * m_BeiShu < e.AskVolume1 & e.AskPrice1 == e.LastPrice){
					}else if(e.BidVolume1 < 20 &  e.AskVolume1 > 500){	
//					}else if (e.BidVolume1 * m_BeiShu < e.AskVolume1){
						m_signal = -1;
					}
//					m_log.info(String.format("finish calc signal: %s", System.currentTimeMillis()));
//					m_log.info(String.format("AskVolume1:%s, AskPrice1:%s, BidVolume1:%s, BidPrice1:%s",
//											 e.AskVolume1, m_AskPrice, e.BidVolume1, m_BidPrice));
					
				}
				try {
					sleep(INTERVAL);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					m_log.error(e1.toString());
				}
			}
		}	
	}
	
	
	public void InitConfigFile(){
		m_sConfigFile					= String.format("%s%sconf%ss_%s.properties",System.getProperty("user.dir"), File.separator, File.separator, m_sStrategyName.toLowerCase());
		m_configProps 					= helper.loadConfig(m_sConfigFile);	
	}
	
	public MakeMarketByVolume(ConcurrentLinkedQueue<Portfolio> q){
		m_sStrategyName 				= "MakeMarketByVolume";
		m_ArithTradeLastOrderQueue 		= q; // Entrust Queue;
		m_posUnixTimeStart 				= System.currentTimeMillis();
				
		InitConfig();	
		InitFuture();
		
		m_LastQuoteMap 					= new ConcurrentHashMap<String, DPCThostFtdcDepthMarketDataField>();
		m_LastQuoteQueue				= new ConcurrentLinkedDeque<DPCThostFtdcDepthMarketDataField>();
		
		InitInstrMap();
		StartQuoteMap();
		ConnectDB();
		
		m_MakeMarketSignal = new MakeMarketSignal();
		Thread MakeMarketSignalThread 	= new Thread(m_MakeMarketSignal);
		MakeMarketSignalThread.start();
		MakeMarketSignalThread.setName("MAKEMARKETBYVOLUMESIGNALTHREAD");
	}

	public void InitConfig(){
		InitConfigFile();
		SetPortInfo(m_configProps.getProperty(String.format("tactic.strategy.%s.portid", m_sStrategyName.toLowerCase())), 	m_sStrategyName);
		setInterVal(Integer.parseInt(m_configProps.getProperty(String.format("tactic.strategy.%s.interval", 					m_sStrategyName.toLowerCase()))));
		m_Spreads 		 = Integer.parseInt(m_configProps.getProperty(String.format("tactic.strategy.%s.spreads", 				m_sStrategyName.toLowerCase())));
		m_StopSpreads 	 = Integer.parseInt(m_configProps.getProperty(String.format("tactic.strategy.%s.stopspreads", 			m_sStrategyName.toLowerCase())));
		m_vol			 = Integer.parseInt(m_configProps.getProperty(String.format("tactic.strategy.%s.vol", 					m_sStrategyName.toLowerCase())));
		m_MinUnit		 = Double.parseDouble(m_configProps.getProperty(String.format("tactic.strategy.%s.minunit", 			m_sStrategyName.toLowerCase())));  
	}
	
	private void StartQuoteMap(){
		m_cQuoteMap 			= new LastQuoteMap(m_LastQuoteMap);
		m_cQuoteMap.SetQuoteQueue(m_LastQuoteQueue);
		m_cQuoteMap.SetRefreshMap(false);
		Thread QuoteMapThread 	= new Thread(m_cQuoteMap);
		QuoteMapThread.start();
		QuoteMapThread.setName("MAKEMARKETBYVOLUMEQUOTEMAPTHREAD");
	}
	
	private boolean InitInstrMap(){
		m_SubCodes = m_configProps.getProperty(String.format("tactic.strategy.%s.ctpid", m_sStrategyName.toLowerCase()));
		return true;
	}

	private boolean Open() {
		Portfolio Port 			= new Portfolio();
		Port.m_PortInfo			= m_ProdInfo;
		Entrust e 				= null;
		String Remark 			= String.format("askprice:%s bidprice:%s lastprice:%s signal:%s", m_AskPrice, m_BidPrice, m_LastPrice, m_signal);		
		Port.m_ListFuture.clear();
		Port.m_ListSecurity.clear();
		m_log.info(Remark);
		if(m_signal == 1){
			// OPEN LONG
//			e 						= new Entrust(m_SubCodes, m_LastPrice, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Buy, m_vol);
//			e 						= new Entrust(m_SubCodes, m_BidPrice, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Buy, m_vol);
			e 						= new Entrust(m_SubCodes, m_AskPrice, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Buy, m_vol);			
			m_BS 					= "OPEN LONG";
		}else if(m_signal == -1){
			// OPEN SHORT
//			e 						= new Entrust(m_SubCodes, m_LastPrice, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Sell, m_vol);
//			e 						= new Entrust(m_SubCodes, m_AskPrice, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Sell, m_vol);
			e 						= new Entrust(m_SubCodes, m_BidPrice, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Sell, m_vol);
			m_BS 					= "OPEN SHORT";
		}
		
		if(e != null){
			m_TacticID 				= helper.GenerateGuid();
			e.m_PortInfo 			= m_ProdInfo;
			e.m_remark				= Remark;
			Port.m_TacticID 		= m_TacticID;
			Port.m_ListFuture.add(e);
			m_ArithTradeLastOrderQueue.add(Port);
			m_isUnFinished 			= true;
			return true;
		}
		return false;
	}
	
	private boolean Close(boolean stoploss, int stoplossclass){

		Portfolio Port 			= new Portfolio();
		Port.m_PortInfo			= m_ProdInfo;
		Entrust e 				= null;
		String Remark 			= String.format("askprice:%s bidprice:%s lastprice:%s signal:%s", m_AskPrice, m_BidPrice, m_LastPrice, m_signal);
		Port.m_ListFuture.clear();
		Port.m_ListSecurity.clear();
		
		if(m_pos < 0){
			// CLOSE LONG
			if(stoploss && stoplossclass == 3){
				e 						= new Entrust(m_SubCodes, m_AskPrice, JctpConstants.STRING_THOST_FTDC_OF_CloseToday, JctpConstants.THOST_FTDC_D_Buy, m_vol);
				Remark 					= String.format("Stop Loss %s", Remark);
			}else if(stoploss && stoplossclass == 2){
				e 						= new Entrust(m_SubCodes, m_LastPrice, JctpConstants.STRING_THOST_FTDC_OF_CloseToday, JctpConstants.THOST_FTDC_D_Buy, m_vol);
				Remark 					= String.format("Stop Loss %s", Remark);
			}else if(stoploss && stoplossclass == 1){
				e 						= new Entrust(m_SubCodes, m_LastPrice - m_MinUnit, JctpConstants.STRING_THOST_FTDC_OF_CloseToday, JctpConstants.THOST_FTDC_D_Buy, m_vol);
				Remark 					= String.format("Stop Loss %s", Remark);
			}
			else if(!stoploss){
				e 						= new Entrust(m_SubCodes, m_TradedPrice - m_Spreads * m_MinUnit, JctpConstants.STRING_THOST_FTDC_OF_CloseToday, JctpConstants.THOST_FTDC_D_Buy, m_vol);				
			}
			m_BS 						= "";
		}else if(m_pos > 0){
			// CLOSE SHORT
			if(stoploss && stoplossclass == 3){
				e 						= new Entrust(m_SubCodes, m_BidPrice, JctpConstants.STRING_THOST_FTDC_OF_CloseToday, JctpConstants.THOST_FTDC_D_Sell, m_vol);
				Remark 					= String.format("Stop Loss %s", Remark);
			}else if(stoploss && stoplossclass == 2){
				e 						= new Entrust(m_SubCodes, m_LastPrice, JctpConstants.STRING_THOST_FTDC_OF_CloseToday, JctpConstants.THOST_FTDC_D_Sell, m_vol);
				Remark 					= String.format("Stop Loss %s", Remark);
			}else if(stoploss && stoplossclass == 1){
				e 						= new Entrust(m_SubCodes, m_LastPrice + m_MinUnit, JctpConstants.STRING_THOST_FTDC_OF_CloseToday, JctpConstants.THOST_FTDC_D_Sell, m_vol);
				Remark 					= String.format("Stop Loss %s", Remark);
			}else if(!stoploss){
				e 						= new Entrust(m_SubCodes, m_TradedPrice + m_Spreads * m_MinUnit, JctpConstants.STRING_THOST_FTDC_OF_CloseToday, JctpConstants.THOST_FTDC_D_Sell, m_vol);	
			}
			m_BS 						= "";
		}
		
		if(e != null){
			e.m_PortInfo 			= m_ProdInfo;
			e.m_remark				= Remark;
			Port.m_TacticID 		= m_TacticID;
			Port.m_ListFuture.add(e);
			m_ArithTradeLastOrderQueue.add(Port);
			m_isUnFinished 			= true;
			return true;
		}
		return false;
	}
	
	// bid ask used for loss calc:  2
	// lastprice used for loss cac: 1
	private boolean NeedStopLoss(int stoplossclass, int addtionalspread){
		if(m_pos != 0 ){ 
			if(stoplossclass == 1){
				if(m_pos > 0 &&  (m_LastPrice-m_TradedPrice)  <= -(m_StopSpreads + addtionalspread) * m_MinUnit){
					return true;
				}
				else if(m_pos < 0 && (-(m_LastPrice-m_TradedPrice) <= -(m_StopSpreads + addtionalspread) * m_MinUnit)){
					return true;
				}
			}else if(stoplossclass == 2){
				// ??? ????, ?????μ???? close short, use bid price
				if(m_pos > 0 &&  (m_BidPrice-m_TradedPrice)  <= -(m_StopSpreads + addtionalspread) * m_MinUnit){
					return true;
				}
				// ??? ????, ?????μ???? close long, use ask price
				else if(m_pos < 0 && (-(m_AskPrice-m_TradedPrice) <= -(m_StopSpreads + addtionalspread) * m_MinUnit)){
					return true;
				}
			}
		}
		return false;
	}
	private void Pause(int times){
		try {
			sleep(INTERVAL * times);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			m_log.error(e1.toString());
		}
	}
	
	private boolean Cancel() {
		// TODO Auto-generated method stub
		JSONArray arrEntrust = getSQLData(String.format(m_TacticSQL.m_sFormatOrderSQL, 
															m_ProdInfo.getStrategyName(), 
															m_ctpinfo.getSuserId(), 
															m_posUnixTimeStart,
															1));
		 
		if(arrEntrust.size() == 1 ){
			JSONObject jsonOrder1 		= arrEntrust.getJSONObject(0);
			CancelOrder(jsonOrder1);
			Pause(50);
			if(isCanceled()){
				return true;
			}
		}
		return false;
	}
	
	private  boolean isCanceled(){
		JSONArray arrEntrust = getSQLData(String.format(m_TacticSQL.m_sFormatOrderSQL, 
				m_ProdInfo.getStrategyName(), 
				m_ctpinfo.getSuserId(), 
				m_posUnixTimeStart,
				1));

		if(arrEntrust.size() == 1 ){
			JSONObject jsonOrder1 		= arrEntrust.getJSONObject(0);
			String sOrderStatus1 		= jsonOrder1.getString("orderstatus");
			if(sOrderStatus1.equals(JctpConstants.STRING_THOST_FTDC_OST_Canceled)){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void run(){
		while(true){
			boolean Opened = false;
			if(Open()){
				while(m_isUnFinished){
					Pause(20);
					Opened = CheckPort();
				}
				if(Opened){
					if(Close(false, 0)){
						while(m_isUnFinished){
							Pause(20);
							boolean closed = CheckPort();
							if(!closed & NeedStopLoss(1, 0)){
								// ??????????
								if(Cancel()){
									Close(true, 1);
									while(m_isUnFinished){
										Pause(20);
										CheckPort();
										if(NeedStopLoss(1, 2)){
											if(Cancel()){
												Close(true, 2);
												while(m_isUnFinished){
													Pause(20);
													CheckPort();
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			Pause(100);
		}
	}
	
	
	private boolean CheckPortForOpen(){
		String sql = String.format("select  " +
									"	a.tacticid, " +
									"	a.direction, a.insertdate, a.inserttime, a.instrumentid,    " +
									"	a.comboffsetflag, a.limitprice, a.statusmsg, a.brokerorderseq,	a.ordersysid, b.Price, b.volume   " +
									"from   " +
									"	dporder a  " +
									"LEFT JOIN   " +
									"	dptrade b on (a.ordersysid = b.OrderSysID)  " +
									"where   " +
									"	a.tacticid = '%s' and " +
									"	a.tactictype = 'MakeMarket' and   " +
									"	!isNull(b.Price) and   " +
									"	a.userid = '%s' " , m_TacticID, m_ctpinfo.getSuserId());
		
		JSONArray arrEntrust = getSQLData(sql);
		if(arrEntrust.size() == 1 ){
			JSONObject jsonOrder1 		= arrEntrust.getJSONObject(0);
			String sOrderStatus1 		= jsonOrder1.getString("orderstatus");
			if(sOrderStatus1 != null){
				if(sOrderStatus1.equals(JctpConstants.STRING_THOST_FTDC_OST_AllTraded)){
					m_isUnFinished = false;
					m_TradedPrice  = jsonOrder1.getDouble("Price");
					if(m_BS.equals("OPEN LONG")){
						m_pos = m_vol;
					}else if(m_BS.equals("OPEN SHORT")){
						m_pos = -m_vol;
					}else{
						m_pos = 0;
					}
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean CheckPort() {
		// TODO Auto-generated method stub
		JSONArray arrEntrust = getSQLData(String.format(m_TacticSQL.m_sFormatOrderSQL, 
															m_ProdInfo.getStrategyName(), 
															m_ctpinfo.getSuserId(), 
															m_posUnixTimeStart,
															1));
		if(arrEntrust.size() == 1 ){
			JSONObject jsonOrder1 		= arrEntrust.getJSONObject(0);
			String sOrderStatus1 		= jsonOrder1.getString("orderstatus");
			long   entrusttime 			= jsonOrder1.getLong("unixtime");
			
			if(sOrderStatus1 != null){
				if(sOrderStatus1.equals(JctpConstants.STRING_THOST_FTDC_OST_AllTraded)){
					m_isUnFinished = false;
					m_TradedPrice  = jsonOrder1.getDouble("limitprice");
					if(m_BS.equals("OPEN LONG")){
						m_pos = m_vol;
					}else if(m_BS.equals("OPEN SHORT")){
						m_pos = -m_vol;
					}else{
						m_pos = 0;
					}
					return true;
				}else if(sOrderStatus1.equals(JctpConstants.STRING_THOST_FTDC_OST_Canceled)){
					m_isUnFinished = false;
					return false;
				}
			}
			 
			if(m_BS.contains("OPEN")){
				// ???? 2s ????????
				if(System.currentTimeMillis() - entrusttime >= 10000){
					String sBS  	= jsonOrder1.getString("direction");
					if(m_signal == 1 && sBS.equals(JctpConstants.STRING_THOST_FTDC_D_Buy) && jsonOrder1.getDouble("limitprice") == m_BidPrice){
//					if(m_signal == 1 && sBS.equals(JctpConstants.STRING_THOST_FTDC_D_Buy) && jsonOrder1.getDouble("limitprice") == m_AskPrice){
						// do nothing
					}else if(m_signal == -1 && sBS.equals(JctpConstants.STRING_THOST_FTDC_D_Sell) && jsonOrder1.getDouble("limitprice") == m_AskPrice){
//					}else if(m_signal == -1 && sBS.equals(JctpConstants.STRING_THOST_FTDC_D_Sell) && jsonOrder1.getDouble("limitprice") == m_BidPrice){	
						// do nothing						
					}else{
						CancelOrder(jsonOrder1);
						while(!m_isUnFinished ){
							Pause(20);
							JSONArray arrtmpEntrust = getSQLData(String.format(m_TacticSQL.m_sFormatOrderSQL, 
									m_ProdInfo.getStrategyName(), 
									m_ctpinfo.getSuserId(), 
									m_posUnixTimeStart,
									1));
							if(arrtmpEntrust.size() > 0){
								JSONObject tmpjsonOrder 			= arrEntrust.getJSONObject(0);
								String stmpOrderStatus1 			= tmpjsonOrder.getString("orderstatus");
								if(stmpOrderStatus1.equals(JctpConstants.STRING_THOST_FTDC_OST_AllTraded)){
									m_isUnFinished = false;
									m_TradedPrice  = tmpjsonOrder.getDouble("limitprice");
									if(m_BS.equals("OPEN LONG")){
										m_pos = m_vol;
									}else if(m_BS.equals("OPEN SHORT")){
										m_pos = -m_vol;
									}else{
										m_pos = 0;
									}
									return true;
								}else if(stmpOrderStatus1.equals(JctpConstants.STRING_THOST_FTDC_OST_Canceled)){
									m_isUnFinished = false;
									return false;
								}
							}
						}
					}
				}
			}
		}
		return false;
	}

	

	@Override
	public int CalcSignal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean PrepareData() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean InitSecurity() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public void GeneratePortfolio(String direction, String remark) {
		// TODO Auto-generated method stub
	}

	
	@Override
	protected void InitTacticID(){
		
	}

	@Override
	protected void InitHolding() {
		// TODO Auto-generated method stub
	}

}
