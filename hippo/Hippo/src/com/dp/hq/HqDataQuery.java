package com.dp.hq;

import java.io.File;
import java.util.Properties;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.apache.log4j.Logger;
import org.zeromq.ZMQ;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.explosion.base.helper;
import com.explosion.db.DBMysql;
import com.explosion.db.DataBaseCfg;


public class HqDataQuery extends Thread{
	private Logger 							m_log 			= Logger.getLogger(HqDataQuery.class);
	private String 							sConfigFile		= System.getProperty("user.dir") + File.separator + "conf" + File.separator + "config.properties";
	private Properties 						configProps 	= new Properties();
	private ZMQ.Context 					context;
	private ZMQ.Socket 						socket;
	private ConcurrentLinkedQueue<String> 	SQLQueue;
	private DBMysql 						DB;
//	private String 							sFormatStockQuoteSql  = "select SzWindCode,nActionDay,nTradingDay,nTime,nStatus,nPreClose,nOpen,nHigh,nLow,nMatch,nAskPrice1,nAskPrice2,nAskPrice3,nAskPrice4,nAskPrice5,nAskPrice6,nAskPrice7,nAskPrice8,nAskPrice9,nAskPrice10,nAskVol1,nAskVol2,nAskVol3,nAskVol4,nAskVol5,nAskVol6,nAskVol7,nAskVol8,nAskVol9,nAskVol10,nBidPrice1,nBidPrice2,nBidPrice3,nBidPrice4,nBidPrice5,nBidPrice6,nBidPrice7,nBidPrice8,nBidPrice9,nBidPrice10,nBidVol1,nBidVol2,nBidVol3,nBidVol4,nBidVol5,nBidVol6,nBidVol7,nBidVol8,nBidVol9,nBidVol10,nNumTrades,iVolume,iTurnover,nTotalBidVol,nTotalAskVol,nWeightedAvgBidPrice,nWeightedAvgAskPrice,nIOPV,nYieldToMaturity,nHighLimited,nLowLimited,timestamp from realtimemarketdata where szCode = '%s'";
	private String 							sFormatStockQuoteSql  = "select SzWindCode from realtimemarketdata where szCode = '%s'";
	private String 							sFormatFutureQuoteSql = "select szWindCode,szCode,nActionDay,nTradingDay,nTime,nStatus,iPreOpenInterest,nPreClose,nPreSettlePrice,nOpen,nHigh,nLow,nMatch,iVolume,iTurnover,iOpenInterest,nClose,nSettlePrice,nHighLimited,nLowLimited,nAskPrice1,nAskPrice2,nAskPrice3,nAskPrice4,nAskPrice5,nAskVol1,nAskVol2,nAskVol3,nAskVol4,nAskVol5,nBidPrice1,nBidPrice2,nBidPrice3,nBidPrice4,nBidPrice5,nBidVol1,nBidVol2,nBidVol3,nBidVol4,nBidVol5,timestamp from realtimefuturedata where szCode = '%s'";
	private String 							sFormatIndexQuoteSql  = "select SzWindCode,szCode,nActionDay,nTradingDay,nTime,nOpenIndex,nHighIndex,nLowIndex,nLastIndex,iTotalVolume,iTurnover,nPreCloseIndex,timestamp from realtimeindex where szCode = '%s'";
	
	
	public HqDataQuery(){
		m_log.info("HqDataQuery Start!");
		
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
		DBThread.setName("HqDataQueryDBThread");
		
		Listen();
	}
	
	private void Listen(){
        // 绑定到端口,并且在io_thread中accept连接  
        context = ZMQ.context(1);  
        socket = context.socket(ZMQ.REP);  
        String sBind = "tcp://*:" + configProps.getProperty("hqdataquery.port");
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
//	            m_log.info("Received request: [" + new String(request, 0, request.length - 1) + "]");
	            
	            // 返回一个最后一位为0的字符串到客户端  
	            long start = System.currentTimeMillis();
	            byte[] reply = HandleRequest(new String(request)).getBytes();
	            m_log.info("Query: " + (System.currentTimeMillis() - start) + "ms");
	            start = System.currentTimeMillis();
	            reply[reply.length - 1] = 0;  
	            socket.send(reply, ZMQ.NOBLOCK);  
	            m_log.info("Send: " + (System.currentTimeMillis() - start) + "ms");
	            
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
		if(obj.getString("func").equals("GetQuote"))
		{
			sRet = GetQuote(obj.getString("code"), obj.getString("type")).toString() + " "; 
		}
		return sRet;
	}
	
	private JSONArray GetQuote(String sCode, String sType){
		String sql = null;
		JSONArray ret = new JSONArray();
		if(sType.equals("STOCK"))
		{
			sql = String.format(sFormatStockQuoteSql, sCode);
		}
		else if(sType.equals("FUTURE"))
		{
			sql = String.format(sFormatFutureQuoteSql, sCode);
		}
		else if(sType.equals("INDEX"))
		{
			sql = String.format(sFormatIndexQuoteSql, sCode);	
		}
		if(sql != null){
			ret = DB.Query(sql);
		}
		
		return ret;
	}
}
