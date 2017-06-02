package com.explosion.trade.ctp.quote;

import java.util.*;
import java.io.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.explosion.base.helper;

import net.jctp.*;
import net.jtrader.JTraderException;

public class MarketDataServer implements MdApiListener{
	
	static {  
        PropertyConfigurator.configure(System.getProperty("user.dir") + File.separator + "conf" + File.separator  
                + "log4j.properties");  
    }      
    
	private BlockingQueue<CThostFtdcDepthMarketDataField> m_marketDataQueue 	= new LinkedBlockingDeque<CThostFtdcDepthMarketDataField>();
	private AtomicInteger	 m_dataCount 										= new AtomicInteger();
    private String 			 m_sConfigFile										= System.getProperty("user.dir") + File.separator + "conf" + File.separator + "config.properties";
    private Properties 		 m_configProps 										= helper.loadConfig(m_sConfigFile);
    private MdApi 			 m_mdApi 											= null; 
    private String 			 m_SubIDs;
    private MarketDataCenter m_dataCenter;
    private Logger 	  		 m_log;
    
    public MarketDataServer(){
    	m_log 							= Logger.getLogger(MarketDataServer.class);
    	m_SubIDs 						= m_configProps.getProperty("marketDataServer.instrumentIds");
        String frontUrl 				= m_configProps.getProperty("ctp.hq.mdFrontUrl");
        String brokerId 				= m_configProps.getProperty("ctp.hq.brokerId");
        String userId 					= m_configProps.getProperty("ctp.hq.userId");
        String password 				= m_configProps.getProperty("ctp.hq.password");
        
        m_dataCenter 					= new MarketDataCenter(m_marketDataQueue);
        startDataCenter();
        
        m_mdApi 						= new MdApi("", false, false);
        try {
			m_mdApi.SyncConnect(frontUrl, brokerId, userId, password);
			setListener();
			startSub();
		} catch (JTraderException e) {
			m_log.info(e.getMessage());
		}
        
    }
    
    private void setListener(){
    	m_mdApi.setListener(this);
    }
    
    private void startDataCenter(){
    	m_log.info("MarketDataCenter thread start!");
    	Thread saverThread 		= new Thread(m_dataCenter);
        saverThread.setName("Market data center thread");
        saverThread.setDaemon(true);
        saverThread.start();
    }
    
    private void startSub(){
    	String[] ids = m_SubIDs.split(",");
    	m_log.info("Subscribe: " + m_SubIDs);
    	try {
			m_mdApi.SubscribeMarketData(ids);
		} catch (JTraderException e) {
			m_log.info(e.getMessage());
		}
    }
    
    public void startSub(String codes){
    	String[] ids = codes.split(",");
    	m_log.info("Subscribe: " + codes);
    	try {
			m_mdApi.SubscribeMarketData(ids);
		} catch (JTraderException e) {
			m_log.info(e.getMessage());
		}
    }
    
    @Override
    public void OnRtnDepthMarketData(CThostFtdcDepthMarketDataField pDepthMarketData) {
        m_dataCount.incrementAndGet();
        try {
            m_marketDataQueue.put(pDepthMarketData);
        } catch (InterruptedException e) {}
    }
    
    @Override
    public void OnRspUserLogout(CThostFtdcUserLogoutField pUserLogout, CThostFtdcRspInfoField pRspInfo, int nRequestID,
            boolean bIsLast) {
        
    }
    
    @Override
    public void OnRspUserLogin(CThostFtdcRspUserLoginField pRspUserLogin, CThostFtdcRspInfoField pRspInfo,
            int nRequestID, boolean bIsLast) {
        m_log.info("DataServer login.");
    }
    
    @Override
    public void OnRspUnSubMarketData(CThostFtdcSpecificInstrumentField pSpecificInstrument,
    	CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
        
    }
    
    @Override
    public void OnRspSubMarketData(CThostFtdcSpecificInstrumentField pSpecificInstrument,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
        m_log.info("DataServer subscribe market data: " + pSpecificInstrument.InstrumentID);
    }
    
    @Override
    public void OnRspError(CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
        m_log.info("DataServer get error message: " + pRspInfo);
    }
    
    @Override
    public void OnHeartBeatWarning(int nTimeLapse) {
        
    }
    
    @Override
    public void OnFrontDisconnected(int nReason) {
        m_log.info("DataServer disconnected.");
    }
    
    @Override
    public void OnFrontConnected() {
        m_log.info("DataServer connected.");
    }

	@Override
	public void OnRspSubForQuoteRsp(
			CThostFtdcSpecificInstrumentField pSpecificInstrument,
			CThostFtdcRspInfoField pRspInfo, int nRequestID,
			boolean bIsLast) {
		
	}

	@Override
	public void OnRspUnSubForQuoteRsp(
			CThostFtdcSpecificInstrumentField pSpecificInstrument,
			CThostFtdcRspInfoField pRspInfo, int nRequestID,
			boolean bIsLast) {
		
	}
    
//    public static void main(String[] args){
//    	MarketDataServer RealTimeDataServer = new MarketDataServer(); 
//    	
//    	try {
//			Thread.currentThread().join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        
//    }

}
