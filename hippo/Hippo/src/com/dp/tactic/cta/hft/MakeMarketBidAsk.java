

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

public class MakeMarketBidAsk extends Tactic{
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
	
	public MakeMarketBidAsk(ConcurrentLinkedQueue<Portfolio> q){
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
		String Remark 			= String.format("askprice:%s bidprice:%s lastprice:%s signal:%s", m_AskPrice, m_BidPrice, m_LastPrice, m_signal);		
		Port.m_ListFuture.clear();
		Port.m_ListSecurity.clear();
		m_log.info(Remark);

		Entrust e1 				= new Entrust(m_SubCodes, m_BidPrice, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Buy, m_vol);
		Entrust e2 				= new Entrust(m_SubCodes, m_AskPrice, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Sell, m_vol);
		m_TacticID 				= helper.GenerateGuid();
		e1.m_PortInfo 			= m_ProdInfo;
		e2.m_PortInfo 			= m_ProdInfo;
		e1.m_remark				= Remark;
		e2.m_remark				= Remark;
		Port.m_TacticID 		= m_TacticID;
		Port.m_ListFuture.add(e1);
		Port.m_ListFuture.add(e2);
		m_ArithTradeLastOrderQueue.add(Port);
		m_isUnFinished 			= true;
		return true;
	}
	
	
	private boolean Close(JSONObject jsonOrder1, boolean stoploss){
		Portfolio Port 			= new Portfolio();
		Port.m_PortInfo			= m_ProdInfo;
		Entrust e 				= null;
		String Remark 			= String.format("askprice:%s bidprice:%s lastprice:%s signal:%s", m_AskPrice, m_BidPrice, m_LastPrice, m_signal);
		Port.m_ListFuture.clear();
		Port.m_ListSecurity.clear();
		
		String sBS  	= jsonOrder1.getString("direction");
		m_TradedPrice 	= jsonOrder1.getDouble("limitprice");
		if(!stoploss){
			// 非止损单，进来的jsonOrder1，是成交的open order
			if(sBS.equals(JctpConstants.STRING_THOST_FTDC_D_Buy)){
				// CLOSE SHORT
				e 						= new Entrust(m_SubCodes, m_TradedPrice + m_Spreads * m_MinUnit, JctpConstants.STRING_THOST_FTDC_OF_CloseToday, JctpConstants.THOST_FTDC_D_Sell, m_vol);
				m_pos					= m_vol;
			}else if(sBS.equals(JctpConstants.STRING_THOST_FTDC_D_Sell)){
				// CLOSE LONG
				e 						= new Entrust(m_SubCodes, m_TradedPrice - m_Spreads * m_MinUnit, JctpConstants.STRING_THOST_FTDC_OF_CloseToday, JctpConstants.THOST_FTDC_D_Buy, m_vol);
				m_pos					= -m_vol;
			}
		}else if(stoploss){
			// 损单，进来的jsonOrder1，是未成交的close order
			if(sBS.equals(JctpConstants.STRING_THOST_FTDC_D_Buy)){
				// CLOSE LONG
				e 						= new Entrust(m_SubCodes, m_LastPrice, JctpConstants.STRING_THOST_FTDC_OF_CloseToday, JctpConstants.THOST_FTDC_D_Buy, m_vol);
				m_isUnFinished 			= true;
				Remark 					= String.format("Stop Loss %s", Remark);
			}else if(sBS.equals(JctpConstants.STRING_THOST_FTDC_D_Sell)){
				// CLOSE SHORT
				e 						= new Entrust(m_SubCodes, m_LastPrice, JctpConstants.STRING_THOST_FTDC_OF_CloseToday, JctpConstants.THOST_FTDC_D_Sell, m_vol);
				m_isUnFinished 			= true;
				Remark 					= String.format("Stop Loss %s", Remark);
			}
		}
		
		
		if(e != null){
			e.m_PortInfo 			= m_ProdInfo;
			e.m_remark				= Remark;
			Port.m_TacticID 		= m_TacticID;
			Port.m_ListFuture.add(e);
			m_ArithTradeLastOrderQueue.add(Port);
			
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
					Opened = CheckPortForOpen();
				}
				
				if(Opened){
					m_isUnFinished = true;
					while(m_isUnFinished){
						Pause(20);
						boolean closed = CheckPortForClose();
						if(closed){
							break;
						}
						if(NeedStopLoss()){
							// 先撤单再止损
							if(Cancel()){
								Close();
								while(m_isUnFinished){
									Pause(20);
									CheckPortForClose();
								}
							}
						}
					}
				}
			}
			Pause(500);
		}
	}
	
	
	// false:  	end   结束一轮
	// true: 	opend 反向开仓
	private boolean CheckPortForOpen(){
		// TODO Auto-generated method stub
		JSONArray arrEntrust = getSQLData(String.format(m_TacticSQL.m_sFormatOrderSQL, 
														m_ProdInfo.getStrategyName(), 
														m_ctpinfo.getSuserId(), 
														m_posUnixTimeStart,
														2));

		if(arrEntrust.size() == 2 ){
			JSONObject jsonOrder1 		= arrEntrust.getJSONObject(0);
			JSONObject jsonOrder2 		= arrEntrust.getJSONObject(1);
			String sOrderStatus1 		= jsonOrder1.getString("orderstatus");
			String sOrderStatus2 		= jsonOrder2.getString("orderstatus");
			if(sOrderStatus1 != null && sOrderStatus2 != null){
				if(sOrderStatus1.equals(JctpConstants.STRING_THOST_FTDC_OST_AllTraded) && sOrderStatus2.equals(JctpConstants.STRING_THOST_FTDC_OST_AllTraded)){
					m_isUnFinished = false;
					return false;     // Bid Ask 均成交 本次套利结束，进入下一轮
				}else if((sOrderStatus1.equals(JctpConstants.STRING_THOST_FTDC_OST_Canceled) && sOrderStatus2.equals(JctpConstants.STRING_THOST_FTDC_OST_Canceled))){
					m_isUnFinished = false;
					return false;  	 // Bid Ask 均撤单 本次套利结束，进入下一轮
				}else if(sOrderStatus1.equals(JctpConstants.STRING_THOST_FTDC_OST_AllTraded) && !sOrderStatus2.equals(JctpConstants.STRING_THOST_FTDC_OST_Canceled)){
					if(CancelOrderWithRet(jsonOrder2)){
						m_isUnFinished = false;
						Close(jsonOrder1, false);	// 单边成交，另一边撤单，然后再反向平仓
						return true;
					}else{
						return false; // 撤单失败，Bid Ask 都成交，本次套利结束，进入下一轮
					}
				}else if(sOrderStatus2.equals(JctpConstants.STRING_THOST_FTDC_OST_AllTraded) && !sOrderStatus1.equals(JctpConstants.STRING_THOST_FTDC_OST_Canceled)){
					if(CancelOrderWithRet(jsonOrder1)){
						m_isUnFinished = false;
						Close(jsonOrder2, false);	// 单边成交，另一边撤单，然后再反向平仓
						return true;
					}else{
						return false; // 撤单失败，Bid Ask 都成交，本次套利结束，进入下一轮
					}

				}
			}
		}
		return true;
	}
	
	
	public boolean Close() {
		// TODO Auto-generated method stub
		JSONArray arrEntrust = getSQLData(String.format(m_TacticSQL.m_sFormatOrderSQL, 
															m_ProdInfo.getStrategyName(), 
															m_ctpinfo.getSuserId(), 
															m_posUnixTimeStart,
															1));
		if(arrEntrust.size() == 1 ){
			JSONObject jsonOrder1 		= arrEntrust.getJSONObject(0);
			Close(jsonOrder1, true);
		}
		return true;
	}
	
	// false:  	unclosed
	// true: 	closed 
	public boolean CheckPortForClose() {
		// TODO Auto-generated method stub
		JSONArray arrEntrust = getSQLData(String.format(m_TacticSQL.m_sFormatOrderSQL, 
															m_ProdInfo.getStrategyName(), 
															m_ctpinfo.getSuserId(), 
															m_posUnixTimeStart,
															1));
		if(arrEntrust.size() == 1 ){
			JSONObject jsonOrder1 		= arrEntrust.getJSONObject(0);
			String sOrderStatus1 		= jsonOrder1.getString("orderstatus");
			
			if(sOrderStatus1 != null){
				if(sOrderStatus1.equals(JctpConstants.STRING_THOST_FTDC_OST_AllTraded)){
					m_isUnFinished 	= false;
					m_pos 			= 0;
					return true;
				}else if(sOrderStatus1.equals(JctpConstants.STRING_THOST_FTDC_OST_Canceled)){
					m_isUnFinished = false;
					return false;
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

	@Override
	public boolean CheckPort() {
		// TODO Auto-generated method stub
		return false;
	}

}
