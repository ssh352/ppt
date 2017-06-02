package com.explosion.trade.ctp;

import java.io.File;
import java.util.Properties;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.apache.log4j.Logger;
import org.zeromq.ZMQ;
import org.zeromq.ZMQ.Context;
import org.zeromq.ZMQ.Socket;

import com.explosion.base.helper;


public class EntrustPublish extends Thread{
	private ConcurrentLinkedQueue<Object> 		m_MsgQueue;
	private String 		m_sConfigFile			= System.getProperty("user.dir") + File.separator + "conf" + File.separator + "config.properties";
    private Properties 	m_configProps 			= new Properties();
    private Logger 		m_log 					= Logger.getLogger(EntrustPublish.class);
	private Context 	m_context; 
    private Socket 		m_publisher;
    
    
    public EntrustPublish(){
    	m_configProps 	= helper.loadConfig(m_sConfigFile);
    	m_log 			= Logger.getLogger(EntrustPublish.class);
    	m_MsgQueue		= new ConcurrentLinkedQueue<Object>();
    	StartPub();
    }
    
    public void send(Object dpr){
    	m_MsgQueue.add(dpr);
    	
    }
    
    
    public void StartPub() {  
    	m_context = ZMQ.context(1);  
        m_publisher = m_context.socket(ZMQ.PUB);
        String sUrl = "tcp://*:" + m_configProps.getProperty("jctp.publish.port");
        m_publisher.bind(sUrl);  
        m_log.info("EntrustPublish Start publish: " + sUrl);
    }
    
    public void ClosePub(){
        m_publisher.close();  
        m_context.term();  
    }
    
    public void run(){
    	while(true){
			while(m_MsgQueue != null && m_MsgQueue.size()>0){
				Object dpr = m_MsgQueue.poll();
				m_publisher.send(helper.toByteArray(dpr), ZMQ.NOBLOCK);
			}
			try {
				sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				m_log.error(e.toString());
			}
		}
    }


}
