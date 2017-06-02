package com.dp.trade.oms;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.apache.log4j.Logger;
import org.zeromq.ZMQ;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.explosion.base.helper;
import com.explosion.db.DBMysql;
import com.explosion.db.DataBaseCfg;


public class OMSDataQuery extends Thread{
	private Logger m_log 							= Logger.getLogger(OMSDataQuery.class);
	private DBMysql DB;
	private ConcurrentLinkedQueue<String> SQLQueue;
	
	private String 							sOrderQuerySQL = "select * from dpOrder where date(`TIMESTAMP`) = '%s' and tacticid = '%s'";
	private String 							sTradeQuerySQL = "select * from dpTrade where date = '%s' and tacticid = '%s'";
	private String sConfigFile				= System.getProperty("user.dir") + File.separator + "conf" + File.separator + "config.properties";
	private Properties configProps 			= new Properties();
	private ZMQ.Context context;
	private ZMQ.Socket socket;
	
	public OMSDataQuery(){
		SQLQueue = new ConcurrentLinkedQueue<String>();
		
		configProps = helper.loadConfig(sConfigFile);
		DataBaseCfg Cfg = new DataBaseCfg();
		Cfg.dbUser = configProps.getProperty("db.user");
		Cfg.dbPwd  = configProps.getProperty("db.pwd");
		Cfg.dbName = configProps.getProperty("db.name");
		Cfg.dbHost = configProps.getProperty("db.host");
		Cfg.dbPort = configProps.getProperty("db.port");
		
		DB = new DBMysql(SQLQueue, Cfg, this.getName());
		Thread DBThread = new Thread(DB);
		DBThread.start();
		DBThread.setName("TOMSDATAQUERYTHREADB");
		
		Listen();
	}
	
	private void Listen(){
        // 绑定到端口,并且在io_thread中accept连接  
        context = ZMQ.context(1);  
        socket = context.socket(ZMQ.REP);  
        String sBind = "tcp://*:" + configProps.getProperty("omsdataquery.port");
        socket.bind(sBind);  
        m_log.info("Listen REP: " + sBind);
	}
	
	@Override
	public void run(){
	    while (true) {  
            byte[] request;  
            // 等待下一个client端的请求  
            // 等待一个以0结尾的字符串  
            // 忽略最后一位的0打印  
            request = socket.recv(0);  
            m_log.info("Received request: [" + new String(request, 0, request.length - 1) + "]");
            
            // 返回一个最后一位为0的字符串到客户端  
            byte[] reply = HandleRequest(new String(request)).getBytes();
            reply[reply.length - 1] = 0;  
            socket.send(reply, ZMQ.NOBLOCK);  
  
            try {  
                Thread.sleep(2);  
            } catch (InterruptedException e) {  
            	m_log.error(e.toString());  
            }  

        }  
	}
	
	private String HandleRequest(String sReq){
		String sRet = null;
		JSONObject obj = JSONObject.parseObject(sReq.trim());
		if(obj.getString("func").equals("QueryOrder"))
		{
			sRet = QueryOrder(obj.getString("param1")).toString() + " "; 
		}
		else if(obj.getString("func").equals("QueryTrade"))
		{
			sRet = QueryTrade(obj.getString("param1")).toString() + " ";
		}
		m_log.info(sRet);
		return sRet;
	}
	
	// 查询委托
	public JSONArray QueryOrder(String sTacticID){
		String sql = String.format(sOrderQuerySQL, helper.Today(), sTacticID);
		return DB.Query(sql);
//		m_log.info(DB.Query(sql));
//		try {
//			 Statement st = DB.m_Connection.createStatement();
//			 ResultSet rs = st.executeQuery(sql);
//			 return helper.resultSetToJsonArry(rs);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			m_log.error(sql);
//			m_log.error(e.toString());
//		}
//		return null;
	}
	
	// 查询成交
	public JSONArray QueryTrade(String sTacticID){
		String sql = String.format(sTradeQuerySQL, helper.Today(), sTacticID);
		m_log.info(DB.Query(sql));
		
		try {
			 Statement st = DB.m_Connection.createStatement();
			 ResultSet rs = st.executeQuery(sql);
			 return helper.resultSetToJsonArry(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			m_log.error(sql);
			m_log.error(e.toString());
		}
		return null;
	}
}
