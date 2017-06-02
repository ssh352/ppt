package com.explosion.trade.ctp.quote;

import java.io.File;
import java.util.Properties;
import java.util.concurrent.BlockingQueue;
import org.apache.log4j.Logger;
import org.zeromq.ZMQ;
import org.zeromq.ZMQ.Context;
import org.zeromq.ZMQ.Socket;

import com.explosion.base.helper;
import com.explosion.trade.ctp.type.DPCThostFtdcDepthMarketDataField;

import net.jctp.CThostFtdcDepthMarketDataField;


public class MarketDataCenter implements Runnable{
	
	private BlockingQueue<CThostFtdcDepthMarketDataField> marketDataQueue 	= null;
	private Logger 	  			m_log;
	private   	String 			m_sConfigFile			= System.getProperty("user.dir") + File.separator + "conf" + File.separator + "config.properties";
	protected 	Properties 		m_configProps 			= new Properties();
	
    private Context context; 
    private Socket publisher;
    
	public MarketDataCenter(BlockingQueue<CThostFtdcDepthMarketDataField> q){
		marketDataQueue 		= q;
		m_configProps 			= helper.loadConfig(m_sConfigFile);
		m_log 					= Logger.getLogger(MarketDataCenter.class);
		StartPub();
	}
	
    private void StartPub() {  
    	context = ZMQ.context(1);  
        publisher = context.socket(ZMQ.PUB);
        String sUrl = "tcp://*:" + m_configProps.getProperty("ctp.hq.publish.port");
        publisher.bind(sUrl);  
        m_log.info("JCTP Hq Server Start publish: " + sUrl);
    }  
    
    
	@Override
    public void run() {
        while(true){
            CThostFtdcDepthMarketDataField field 	= null;
            try{
                field 		= marketDataQueue.take();
                if(field == null){
                    continue;
                }
            }catch(InterruptedException e){
            	m_log.error(e.toString());
            }
            DPCThostFtdcDepthMarketDataField dpField = new DPCThostFtdcDepthMarketDataField(field);
            publisher.send(helper.toByteArray(dpField), ZMQ.NOBLOCK);
        }
    }
}
