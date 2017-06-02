package com.dp.trade.oms;


import java.io.File;
import java.util.Properties;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.apache.log4j.Logger;
import org.zeromq.ZMQ;  
import org.zeromq.ZMQ.Context;  
import org.zeromq.ZMQ.Socket;

import com.alibaba.fastjson.JSONArray;
import com.explosion.base.helper;

public class OMSModule extends Thread{
	private Socket  						subscriber;
	private Context 						context;
	private ConcurrentLinkedQueue<Object> 	ObjQueue;
	private OMSDataCenter				 	OmsData;
	private OMSDataQuery				 	OmsDataQuery;
	private Logger 							m_log 	       = Logger.getLogger(OMSModule.class);
	private String 							sConfigFile	   = System.getProperty("user.dir") + File.separator + "conf" + File.separator + "config.properties";
	private Properties 						configProps    = new Properties();
	private SyncAcc							m_SyncAcc;
	public OMSModule(){
		ObjQueue 	= new ConcurrentLinkedQueue<Object>();
		
		InitDataCenter();
		InitOMSDataQuery();
		InitSyncAcc();
		configProps = helper.loadConfig(sConfigFile);
	}
	
	private void InitSyncAcc(){
		m_SyncAcc 	= new SyncAcc();
		Thread t 	= new Thread(m_SyncAcc);
		t.start();
		t.setName("OMSSYNCACCTHREAD");
	}
	
	private void InitOMSDataQuery(){
		OmsDataQuery = new OMSDataQuery();
		Thread OmsDataQueryThread = new Thread(OmsDataQuery);
		OmsDataQueryThread.start();
		OmsDataQueryThread.setName("OMSDATAQUERYTHREAD");
	}
	
	
	private void InitDataCenter(){
		OmsData = new OMSDataCenter(ObjQueue);
		Thread OMSDataCenterThread = new Thread(OmsData);
		OMSDataCenterThread.start();
		OMSDataCenterThread.setName("OMSDATACENTERTHREAD");
	}
	
	
	@Override
	public void run(){
	        while (true) {  
//	            System.out.println("oms module running!");
	            byte[] stringValue = subscriber.recv(0);  
	            ObjQueue.add(helper.toObject(stringValue));
//	            System.out.println("~~~ oms module received");
//	            try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					m_log.error(e.toString());
//				}
	        }  
	}
	
	public void StartCtpListen() {
        context 		= ZMQ.context(1);  
        subscriber 		= context.socket(ZMQ.SUB);  
        String sUrl = "tcp://" + configProps.getProperty("jctp.publish.host") + ":" + configProps.getProperty("jctp.publish.port");
        subscriber.connect(sUrl);  
        subscriber.subscribe("".getBytes());  
        m_log.info("OMSModule Subscribe: " + sUrl);
    }  
	
	public void StopCtpListen(){
		subscriber.close();  
        context.term();  
	}
	
	// 查询委托
	public JSONArray QueryOrder(String sTacticID){
		return OmsDataQuery.QueryOrder(sTacticID);
	}
	
	// 查询成交
	public JSONArray QueryTrade(String sTacticID){
		return OmsDataQuery.QueryTrade(sTacticID);
	}
	  

}
