package com.explosion.quote.util;

import java.io.File;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;

import org.zeromq.ZMQ;
import com.explosion.base.helper;
import com.explosion.trade.ctp.type.DPCThostFtdcDepthMarketDataField;


// 订阅行情数据
// 最新行情数据放入 m_LastQuoteMap	(if m_refreshQuoteMap is true)
// 最新行情数据放入 m_LastQuoteQueue (if m_LastQuoteQueue is not null)
public class LastQuoteMap extends Thread{
	private 	ZMQ.Context 	m_HqContext;
	private 	ZMQ.Socket 		m_Hqsubscriber;
	private   	String 			m_sConfigFile			= System.getProperty("user.dir") + File.separator + "conf" + File.separator + "config.properties";
	private 	Properties 		m_configProps 			= new Properties();
	private		boolean			m_refreshQuoteMap 		= true;
	private 	ConcurrentHashMap<String, DPCThostFtdcDepthMarketDataField> 	m_LastQuoteMap;
	private 	ConcurrentLinkedDeque<DPCThostFtdcDepthMarketDataField> 		m_LastQuoteQueue;
	 
	public LastQuoteMap(ConcurrentHashMap<String, DPCThostFtdcDepthMarketDataField> QuoteMap){
		m_LastQuoteMap				= QuoteMap;
		m_configProps 				= helper.loadConfig(m_sConfigFile);
        m_HqContext 				= ZMQ.context(1);
        m_Hqsubscriber 				= m_HqContext.socket(ZMQ.SUB);
        m_Hqsubscriber.connect("tcp://" + m_configProps.getProperty("ctp.hq.publish.host") + ":" + m_configProps.getProperty("ctp.hq.publish.port"));  
        m_Hqsubscriber.subscribe("".getBytes());
	}
	
	public void SetRefreshMap(boolean b){
		m_refreshQuoteMap = b;
	}
	
	public void SetQuoteQueue(ConcurrentLinkedDeque<DPCThostFtdcDepthMarketDataField> q){
		m_LastQuoteQueue = q;
	}
	
	public void run(){ 
		while(true){
			byte[] stringValue 			= m_Hqsubscriber.recv(0);
//			System.out.println(String.format("receive hq: %s", System.currentTimeMillis()));
			Object obj 					= helper.toObject(stringValue);
			if(DPCThostFtdcDepthMarketDataField.class.equals(obj.getClass())){
				DPCThostFtdcDepthMarketDataField mkData = (DPCThostFtdcDepthMarketDataField) obj;
				if(m_refreshQuoteMap){
					if(m_LastQuoteMap.containsKey(mkData.InstrumentID)){
						m_LastQuoteMap.replace(mkData.InstrumentID, mkData); 
					}
				}
				if(m_LastQuoteQueue != null){
					m_LastQuoteQueue.add(mkData);
//					LastQuoteMap.class.notify();
				}
			}
		}
	}	
}