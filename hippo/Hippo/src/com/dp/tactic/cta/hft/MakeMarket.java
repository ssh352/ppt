

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

public class MakeMarket extends Tactic{
	private String 					 m_sStrategyName;
	private ConcurrentHashMap<String, DPCThostFtdcDepthMarketDataField> m_LastQuoteMap;
	private ConcurrentLinkedDeque<DPCThostFtdcDepthMarketDataField> m_LastQuoteQueue;
	private LastQuoteMap 			 m_cQuoteMap;
	private int 					 m_Spreads 		  = 1;
	private int 					 m_StopSpreads 	  = 3;
	private int 					 m_vol 			  = 1;
	private int 					 m_Width 		  = 5;
	private double					 m_LongThreshold  = 0.8;
	private double 					 m_ShortThreshold = 0.2;
	private double 					 m_AskPrice 	  = 0;
	private double 					 m_BidPrice 	  = 0;
	private double 					 m_LastPrice 	  = 0;
	private double 					 m_TradedPrice 	  = 0;
	private double[]			 	 m_AskPriceList;
	private double[]			 	 m_BidPriceList;
	private double[]			 	 m_LastPriceList;
	private double					 m_signal;
	private double					 m_MinUnit;
	private String					 m_BS = "";
	private	int						 m_pos= 0;
	private MakeMarketSignal		 m_MakeMarketSignal;
	public 	Long 		m_posUnixTimeStart		= (long) 0;			 // 默认获取当天持仓数据
	
	private class MakeMarketSignal implements Runnable{
		
		MakeMarketSignal(){
			m_AskPriceList 						= new double[m_Width];
			m_BidPriceList 						= new double[m_Width];
			m_LastPriceList						= new double[m_Width];
			m_signal 							= 0.5;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			int i = 0;
			while(true){
				if(m_LastQuoteQueue.size() > 0 ){
					// get data
					DPCThostFtdcDepthMarketDataField e 	= m_LastQuoteQueue.poll();	
					int index 		   	   = i++ % m_Width;
					m_AskPrice 			   = e.AskPrice1;
					m_BidPrice 			   = e.BidPrice1;
					m_LastPrice			   = e.LastPrice;
					m_AskPriceList[index]  = e.AskPrice1;
					m_BidPriceList[index]  = e.BidPrice1;
					m_LastPriceList[index] = e.LastPrice;
					double meanlp = 0;
					double meanap = 0;
					double meanbp = 0;
					if(m_AskPriceList.length == m_Width){
						for(int j=0; j<m_AskPriceList.length; j++){
							meanlp = meanlp + m_LastPriceList[j];
							meanap = meanap + m_AskPriceList[j];
							meanbp = meanbp + m_BidPriceList[j];
						}
						meanlp 	 = meanlp/m_Width;
						meanap 	 = meanap/m_Width;
						meanbp 	 = meanbp/m_Width;
						m_signal = (meanlp - meanbp)/(meanap - meanbp);
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
	}
	
	
	public void InitConfigFile(){
		m_sConfigFile					= String.format("%s%sconf%ss_%s.properties",System.getProperty("user.dir"), File.separator, File.separator, m_sStrategyName.toLowerCase());
		m_configProps 					= helper.loadConfig(m_sConfigFile);	
	}
	
	public MakeMarket(ConcurrentLinkedQueue<Portfolio> q){
		m_sStrategyName 				= "MakeMarket";
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
		MakeMarketSignalThread.setName("MAKEMARKETSIGNALTHREAD");
	}

	public void InitConfig(){
		InitConfigFile();
		SetPortInfo(m_configProps.getProperty(String.format("tactic.strategy.%s.portid", m_sStrategyName.toLowerCase())), 	m_sStrategyName);
		setInterVal(Integer.parseInt(m_configProps.getProperty(String.format("tactic.strategy.%s.interval", 					m_sStrategyName.toLowerCase()))));
		m_Spreads 		 = Integer.parseInt(m_configProps.getProperty(String.format("tactic.strategy.%s.spreads", 				m_sStrategyName.toLowerCase())));
		m_StopSpreads 	 = Integer.parseInt(m_configProps.getProperty(String.format("tactic.strategy.%s.stopspreads", 			m_sStrategyName.toLowerCase())));
		m_Width			 = Integer.parseInt(m_configProps.getProperty(String.format("tactic.strategy.%s.width", 				m_sStrategyName.toLowerCase())));
		m_vol			 = Integer.parseInt(m_configProps.getProperty(String.format("tactic.strategy.%s.vol", 					m_sStrategyName.toLowerCase())));
		m_LongThreshold  = Double.parseDouble(m_configProps.getProperty(String.format("tactic.strategy.%s.longthreshold", 		m_sStrategyName.toLowerCase())));
		m_ShortThreshold = Double.parseDouble(m_configProps.getProperty(String.format("tactic.strategy.%s.shortthreshold", 		m_sStrategyName.toLowerCase())));
		m_MinUnit		 = Double.parseDouble(m_configProps.getProperty(String.format("tactic.strategy.%s.minunit", 			m_sStrategyName.toLowerCase())));  
	}
	
	private void StartQuoteMap(){
		m_cQuoteMap 			= new LastQuoteMap(m_LastQuoteMap);
		m_cQuoteMap.SetQuoteQueue(m_LastQuoteQueue);
		m_cQuoteMap.SetRefreshMap(false);
		Thread QuoteMapThread 	= new Thread(m_cQuoteMap);
		QuoteMapThread.start();
		QuoteMapThread.setName("MAKEMARKETQUOTEMAPTHREAD");
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
		if(m_signal > m_LongThreshold){
			// OPEN LONG
			e 						= new Entrust(m_SubCodes, m_LastPrice, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Buy, m_vol);
			m_BS 					= "OPEN LONG";
		}else if(m_signal < m_ShortThreshold){
			// OPEN SHORT
			e 						= new Entrust(m_SubCodes, m_LastPrice, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Sell, m_vol);
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
	
	private boolean Close(boolean stoploss){

		Portfolio Port 			= new Portfolio();
		Port.m_PortInfo			= m_ProdInfo;
		Entrust e 				= null;
		String Remark 			= String.format("askprice:%s bidprice:%s lastprice:%s signal:%s", m_AskPrice, m_BidPrice, m_LastPrice, m_signal);
		Port.m_ListFuture.clear();
		Port.m_ListSecurity.clear();
		
		if(m_pos < 0){
			// CLOSE LONG
			if(stoploss){
//				e 						= new Entrust(m_SubCodes, m_AskPrice, JctpConstants.STRING_THOST_FTDC_OF_CloseToday, JctpConstants.THOST_FTDC_D_Buy, m_vol);
				e 						= new Entrust(m_SubCodes, m_LastPrice, JctpConstants.STRING_THOST_FTDC_OF_CloseToday, JctpConstants.THOST_FTDC_D_Buy, m_vol);
				Remark 					= String.format("Stop Loss %s", Remark);
			}else{
				e 						= new Entrust(m_SubCodes, m_TradedPrice - m_Spreads * m_MinUnit, JctpConstants.STRING_THOST_FTDC_OF_CloseToday, JctpConstants.THOST_FTDC_D_Buy, m_vol);				
			}
			m_BS 						= "";
		}else if(m_pos > 0){
			// CLOSE SHORT
			if(stoploss){
//				e 						= new Entrust(m_SubCodes, m_BidPrice, JctpConstants.STRING_THOST_FTDC_OF_CloseToday, JctpConstants.THOST_FTDC_D_Sell, m_vol);
				e 						= new Entrust(m_SubCodes, m_LastPrice, JctpConstants.STRING_THOST_FTDC_OF_CloseToday, JctpConstants.THOST_FTDC_D_Sell, m_vol);
				Remark 					= String.format("Stop Loss %s", Remark);
			}else{
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
	
	private boolean NeedStopLoss(){
		if(m_pos != 0 ){
			// 多头 开仓, 考虑下跌止损 close short, use bid price 
//			if(m_pos > 0 &&  (m_BidPrice-m_TradedPrice)  <= -m_StopSpreads * m_MinUnit){
			if(m_pos > 0 &&  (m_LastPrice-m_TradedPrice)  <= -m_StopSpreads * m_MinUnit){
				return true;
			}
			// 空头 开仓, 考虑下跌止损 close long, use ask price
//			else if(m_pos < 0 && (-(m_AskPrice-m_TradedPrice) <= -m_StopSpreads * m_MinUnit)){
			else if(m_pos < 0 && (-(m_LastPrice-m_TradedPrice) <= -m_StopSpreads * m_MinUnit)){
				return true;
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
					Opened = CheckPortForOpen();
				}
				if(Opened){
					if(Close(false)){
						while(m_isUnFinished){
							Pause(20);
							CheckPort();
							if(NeedStopLoss()){
								// 先撤单再止损
								Cancel();
								Pause(20);
								if(isCanceled()){
									Close(true);
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
			Pause(1000);
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
			 
//			if(m_BS.contains("OPEN")){
//				// 超过 2s 没成交撤单
//				if(System.currentTimeMillis() - entrusttime >= 2000){
//					CancelOrder(jsonOrder1);
//				}
//			}
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
