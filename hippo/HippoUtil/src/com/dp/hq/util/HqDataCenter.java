package com.dp.hq.util;


import java.io.File;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.explosion.base.helper;
import com.explosion.db.DBMysql;
import com.explosion.db.DataBaseCfg;

import cn.com.wind.td.tdf.TDF_CODE;
import cn.com.wind.td.tdf.TDF_MSG_DATA;
import cn.com.wind.td.tdf.TDF_MSG_ID;


public class HqDataCenter  extends Thread{
	private ArrayList<DBMysql> DBList;
	private ConcurrentLinkedQueue<String> SQLQueue;
	private ConcurrentLinkedQueue<TDF_MSG_DATA> dataMsgsQue;
	private Logger m_log 					= Logger.getLogger(HqDataCenter.class);
	private String sConfigFile				= System.getProperty("user.dir") + File.separator + "conf" + File.separator + "config.properties";
	private Properties configProps 			= new Properties();
	static {  
        PropertyConfigurator.configure(System.getProperty("user.dir") + File.separator + "conf" + File.separator  
                + "log4j.properties");  
    }  
	public HqDataCenter ( ConcurrentLinkedQueue<TDF_MSG_DATA>  dataque) {
		m_log.info("HqDataCenter start!");
		SQLQueue = new ConcurrentLinkedQueue<String>();
	    this.dataMsgsQue = dataque;
		configProps = helper.loadConfig(sConfigFile);
		DataBaseCfg Cfg = new DataBaseCfg();
		Cfg.dbUser = configProps.getProperty("db.user");
		Cfg.dbPwd  = configProps.getProperty("db.pwd");
		Cfg.dbName = configProps.getProperty("db.name");
		Cfg.dbHost = configProps.getProperty("db.host");
		Cfg.dbPort = configProps.getProperty("db.port");
		
		String num = configProps.getProperty("hqdatacenter.threads");
		DBList = new ArrayList<DBMysql>();
		for(int i=0; i<Integer.parseInt(num); i++)
		{
			DBMysql DB = new DBMysql(SQLQueue, Cfg, this.getName());
			DBList.add(DB);
			Thread DBThread = new Thread(DB);
			DBThread.setName("HqDataCenterDBThead" + i);
			DBThread.start();
		}
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			while(dataMsgsQue.size()>0){
				TDF_MSG_DATA data = dataMsgsQue.poll();
				
				switch(data.getDataType()) {                          	 //消息分2类：系统消息（心跳，网络断开，网络连接结果，收到登陆响应，收到代码表，收到闭市，收到行情变更）
					//系统消息
					case TDF_MSG_ID.MSG_SYS_HEART_BEAT :	
						System.out.println("收到心跳信息！");
						break;
					case TDF_MSG_ID.MSG_SYS_DISCONNECT_NETWORK:
						System.out.println("网络断开！");
						//quitFlag = true;
						break;
					case TDF_MSG_ID.MSG_SYS_CONNECT_RESULT:{
						System.out.println("网络连接结果：");
						PrintHelper.printConnectResult(data.getConnectResult());               //再使用对应方法取具体数据
						break;
					}
					case TDF_MSG_ID.MSG_SYS_LOGIN_RESULT:{
						PrintHelper.printLoginResult(data.getLoginResult());				
						break;
					}
					case TDF_MSG_ID.MSG_SYS_CODETABLE_RESULT:{
						System.out.println("收到代码表！");
						PrintHelper.printCodeTableResult(data.getCodeTableResult());
//						printCodeTable();
						break;
					}
					case TDF_MSG_ID.MSG_SYS_MARKET_CLOSE:{
						PrintHelper.printMarketClose(data.getMarketClose());				
						break;
					}
					case TDF_MSG_ID.MSG_SYS_QUOTATIONDATE_CHANGE: {				
						PrintHelper.printDateChange(data.getDateChange());
						break;
					}
					//数据消息
					case TDF_MSG_ID.MSG_DATA_MARKET:
						SQLQueue.add(HqDataCenterHelper.FormatRealTimeMarketData(data));
						break;
					case TDF_MSG_ID.MSG_DATA_INDEX:
						SQLQueue.add(HqDataCenterHelper.FormatRealTimeIndexData(data));
						break;
					case TDF_MSG_ID.MSG_DATA_FUTURE:
						SQLQueue.add(HqDataCenterHelper.FormatRealTimeFutureData(data));
						break;
					case TDF_MSG_ID.MSG_DATA_TRANSACTION:
						PrintHelper.printTransaction(data.getTransaction());				
						break;
					case TDF_MSG_ID.MSG_DATA_ORDERQUEUE:
						PrintHelper.printOrderQueue(data.getOrderQueue());
						break;
					case TDF_MSG_ID.MSG_DATA_ORDER:
						PrintHelper.printOrder(data.getOrder());
						break;
					default:
						break;
				}
			}
			
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


