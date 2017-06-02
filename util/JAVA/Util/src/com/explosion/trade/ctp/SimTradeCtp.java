package com.explosion.trade.ctp;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.concurrent.ConcurrentLinkedQueue;

import net.jctp.JctpConstants;

import org.apache.log4j.Logger;

import com.explosion.base.helper;
import com.explosion.db.DBMysql;
import com.explosion.db.DBWorker;
import com.explosion.db.DataBaseCfg;
import com.explosion.trade.util.Entrust;


public class SimTradeCtp extends Thread{
	
	private DBWorker 	SqlServerDB;
	private DBMysql 	MySqlDB;
	private String 		sConfigFile				= System.getProperty("user.dir") + File.separator + "conf" + File.separator + "config.properties";
	private Properties 	configProps 			= new Properties();
	private Logger 		m_log 					= Logger.getLogger(SimTradeCtp.class);
	
	private String sFormatTradeSql = "insert into paperportfoilo.dbo.dpPortfolioTrade(PortSName,OperateID,EntrustBS,OffsetFlag,SecurityID,SecurityType,TradeDate,TradeTime,TradePrice,TradeVolume)" + 
									 "values('%s','%s','%s','%s','%s','%s',%s,%s,'%s','%s')";
	protected String sFormatFutureQuoteSQL = "select nMatch, nBidPrice1, nAskprice1 from realtimefuturedata where SzCode = '%s'";
	
	private ConcurrentLinkedQueue<String> m_SQLQueue;
	
	public SimTradeCtp(){
		m_log.info("SimTradeCtp start");
		configProps = helper.loadConfig(sConfigFile);
		m_SQLQueue = new ConcurrentLinkedQueue<String>();
		InitDB();
	}
	protected int InitDB(){
		
		DataBaseCfg Cfg = new DataBaseCfg();
		Cfg.dbHost = configProps.getProperty("quant.paperportfolio.dbhost");
		Cfg.dbPort = configProps.getProperty("quant.paperportfolio.dbport");
		Cfg.dbUser = configProps.getProperty("quant.paperportfolio.dbuser");
		Cfg.dbPwd  = configProps.getProperty("quant.paperportfolio.dbpwd");
		Cfg.dbName = configProps.getProperty("quant.paperportfolio.dbname");
		 
		SqlServerDB = new DBWorker(m_SQLQueue, Cfg);		
		Thread m_DBThread = new Thread(SqlServerDB);
		m_DBThread.start();
		m_DBThread.setName("SqlServerThreadDB");
		 
		Cfg = new DataBaseCfg();
		Cfg.dbUser = configProps.getProperty("db.user");
		Cfg.dbPwd  = configProps.getProperty("db.pwd");
		Cfg.dbName = configProps.getProperty("db.name");
		Cfg.dbHost = configProps.getProperty("db.host");
		Cfg.dbPort = configProps.getProperty("db.port");
		ConcurrentLinkedQueue<String> SQLQueue2 = new ConcurrentLinkedQueue<String>();
		MySqlDB = new DBMysql(SQLQueue2, Cfg, this.getName());
		Thread DBThread = new Thread(MySqlDB);
		DBThread.setName("SimTradeCtpMysqlDBThread");
		DBThread.start();
		return 0;
	}
	
	public void BidAskOrderInsert(String TacticID, Entrust e) {
		
		String sSql = String.format(sFormatFutureQuoteSQL, e.m_sSecurityID);
		String EntrustBS = "";
		ResultSet rs = MySqlDB.QuerySet(sSql);
		double price = 0;
		try {
			if(rs.next()){
				if(e.m_cEntrustBS == JctpConstants.THOST_FTDC_D_Sell ){
					price = rs.getDouble("nBidPrice1");
					EntrustBS = "Âô³ö";
				}
				else if(e.m_cEntrustBS == JctpConstants.THOST_FTDC_D_Buy){
					price = rs.getDouble("nAskprice1");
					EntrustBS = "ÂòÈë";
				}
				
				sSql = String.format(sFormatTradeSql, 
									e.m_PortInfo.getStrategyName(),
									TacticID,
									EntrustBS,
									e.m_sOpenClose,
									e.m_sSecurityID,
									"2",
									"convert(varchar, GETDATE(), 112)",
									"convert(varchar, GETDATE(), 108)",
									price,
									e.m_iVolume);
				m_SQLQueue.add(sSql);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
	}
	
	public void LimitOrderInsert(String TacticID, Entrust e) {
		
	}
	
	public void LastOrderInsert(String TacticID, Entrust e) {
		BidAskOrderInsert(TacticID, e);
	}
}
