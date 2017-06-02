package com.explosion.quote.util;

import java.io.File;
import java.util.Properties;

import org.zeromq.ZMQ;

import com.explosion.base.helper;
import com.explosion.trade.ctp.type.DPCThostFtdcDepthMarketDataField;

public class PairQuote extends Thread{
	private 	ZMQ.Context 	m_HqContext;
	protected 	ZMQ.Socket 		m_Hqsubscriber;
	private   	String 			m_sConfigFile			= System.getProperty("user.dir") + File.separator + "conf" + File.separator + "config.properties";
	protected 	Properties 		m_configProps 			= new Properties();
	private 	String  		m_sLeg1;
	private  	String  		m_sLeg2;
	public 		double  		m_Leg1Price  			= 0;
	public 		double  		m_Leg1RT_BID1			= 0;
	public 		double  		m_Leg1RT_ASK1			= 0;
	public 		double  		m_Leg2Price				= 0;
	public 		double  		m_Leg2RT_BID1			= 0;
	public 		double  		m_Leg2RT_ASK1			= 0;
	
	
	public PairQuote(String leg1, String leg2){
		m_sLeg1 = leg1;
		m_sLeg2 = leg2;
		m_configProps 				= helper.loadConfig(m_sConfigFile);
        m_HqContext 				= ZMQ.context(1);  
        m_Hqsubscriber 				= m_HqContext.socket(ZMQ.SUB);  
        String url 					= "tcp://" + m_configProps.getProperty("ctp.hq.publish.host") + ":" + m_configProps.getProperty("ctp.hq.publish.port");
        m_Hqsubscriber.connect(url);  
        m_Hqsubscriber.subscribe("".getBytes());  
	}
	
	public void run(){ 
		while(true){
			byte[] stringValue 			= m_Hqsubscriber.recv(0);
			Object obj 					= helper.toObject(stringValue);
			if(DPCThostFtdcDepthMarketDataField.class.equals(obj.getClass())){
				DPCThostFtdcDepthMarketDataField mkData = (DPCThostFtdcDepthMarketDataField) obj;
		        if(mkData.InstrumentID.toUpperCase().contains(m_sLeg1.toUpperCase())){
		        	m_Leg1Price 		= mkData.LastPrice;
		        	m_Leg1RT_BID1 		= mkData.BidPrice1;
		        	m_Leg1RT_ASK1 		= mkData.AskPrice1;
				}else if(mkData.InstrumentID.toUpperCase().contains(m_sLeg2.toUpperCase())){
					m_Leg2Price 		= mkData.LastPrice;
		        	m_Leg2RT_BID1 		= mkData.BidPrice1;
		        	m_Leg2RT_ASK1 		= mkData.AskPrice1;
				}   
			}		
		}
	}
}