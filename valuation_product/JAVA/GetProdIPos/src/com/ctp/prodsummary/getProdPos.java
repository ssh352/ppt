package com.ctp.prodsummary;

import java.io.File;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.alibaba.fastjson.JSONArray;
import com.explosion.base.helper;
import com.explosion.db.DBWorker;
import com.explosion.db.DataBaseCfg;
import com.explosion.trade.ctp.CTPInfo;
import com.explosion.trade.ctp.TradeCtp;

import net.jctp.CThostFtdcInvestorPositionField;
import net.jctp.CThostFtdcTradingAccountField;
import net.jctp.JctpConstants;

public class getProdPos {
	private TradeCtp m_tradectp; 
	private CTPInfo  m_ctpinfo;
	private DataBaseCfg m_Cfg;
	private DBWorker m_DB;
	private String 	 m_PortID 			 = "";
	private String 	 m_PortSName		 = "";
	private String   m_ConfigFile 		 = "";
	private Logger   m_log 				 = Logger.getLogger(getProdPos.class);
	
	private Properties m_configProps;
	private ConcurrentLinkedQueue<String> m_SQLQueue;
	
	private String   m_DpFuturePosSQL    = "insert into jydb_all.dbo.dpFuturePos(Date,PortID,PortSName,ClientID,InstrID,ClearPrice,bTotalAmt,sTotalAmt,Margin,Actual,Transfee) " +
										   "values('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s')";
	private String   m_DpFuturePosSQL2   = "('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s')";
	private String 	 m_DpFuturePosDelSQL = "delete from jydb_all.dbo.dpFuturePos where Date = '%s' and PortID = '%s'";
	private String 	 m_Date;
	
	private String   m_DpFundCheckSQL 	 = "select count(*) as count from jydb_all.dbo.dpFund where Date = '%s' and PortID = '%s'"; 	
	private String 	 m_DpFundUPdateSQL   = "update jydb_all.dbo.dpFund set FutureCash = '%s', FutureMargin = '%s', FutureCapital = '%s'" +
										   "where Date = '%s' and PortID = '%s'";									

	
	static {  
        PropertyConfigurator.configure(System.getProperty("user.dir") + File.separator + "conf" + File.separator  
                + "log4j.properties");  
    }  
	
	
	public getProdPos(String sConfigFile){
		
		this.m_ConfigFile 	= String.format("%s%sconf%s%s.properties", System.getProperty("user.dir"), File.separator, File.separator , sConfigFile);
		m_configProps 		= helper.loadConfig(m_ConfigFile);
		m_PortID 			= m_configProps.getProperty("portid");
		m_PortSName 		= m_configProps.getProperty("portsname");
		m_SQLQueue 			= new ConcurrentLinkedQueue<String>();
		m_Date 				= helper.Today();
		
		// init CTP
		InitFuture();
		
		// init DB
		InitDB();
	}
	
	
	private void InitFuture(){
		m_ctpinfo 			= new CTPInfo();
		m_ctpinfo.setStraderFrontUrl(m_configProps.getProperty("traderfronturl"));
		m_ctpinfo.setSbrokerId(m_configProps.getProperty("brokerid"));
		m_ctpinfo.setSuserId(m_configProps.getProperty("userid"));
		m_ctpinfo.setSinvestorId(m_configProps.getProperty("userid"));
		m_ctpinfo.setSpassword(m_configProps.getProperty("password"));

		m_tradectp = new TradeCtp(null);
		m_tradectp.Init(m_ctpinfo, null);
		m_tradectp.Login(m_PortID);
		m_tradectp.SettlementInfoConfirm();
	}
	
	private void InitDBParam(){

		m_Cfg = new DataBaseCfg();
		m_Cfg.dbUser = m_configProps.getProperty("dbuser");
		m_Cfg.dbPwd  = m_configProps.getProperty("dbpwd");
		m_Cfg.dbName = m_configProps.getProperty("dbname");
		
		String sHost  = m_configProps.getProperty("dbhost");
		String dbport = m_configProps.getProperty("dbport");
		System.out.println(helper.Now() + " :Start read db param " + sHost + ":" + dbport);
		
		m_Cfg.dbHost = sHost;
		m_Cfg.dbPort = dbport;
		
		return;
	}
	
	
	
	private int InitDB(){
		InitDBParam();
		m_DB = new DBWorker(m_SQLQueue, m_Cfg);		
		Thread m_DBThread = new Thread(m_DB);
		m_DBThread.start();
		m_DBThread.setName("T" + m_PortID + "DB");
		return 0;
	}
	
	
	public int CheckDpFund(){
		String sSQL = String.format(m_DpFundCheckSQL, m_Date, m_PortID);
		JSONArray arr = m_DB.Query(sSQL);
		m_log.info(sSQL);
		if(arr.getJSONObject(0).getInteger("count")==0){
			m_log.error(String.format("%s do not load dpfund data", m_PortSName));
			return -1;
		}
		return 0;
	}
	
	
	public void QueryHoldingDetails(){
		m_tradectp.QueryHoldingDetails();
	}
	
	public void LoadAccountData(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(CheckDpFund() == 0){
			CThostFtdcTradingAccountField f = m_tradectp.QueryAccount();
			
			String 		sSQL = String.format(m_DpFundUPdateSQL, f.Available, f.CurrMargin, f.Balance,
											 m_Date, m_PortID);
			m_SQLQueue.add(sSQL);
			m_log.info(sSQL);
		}else{
			m_log.error("please load dpfund data first!");
		}
	}
	
	public void LoadHoldingData(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CThostFtdcInvestorPositionField[] r = m_tradectp.QueryHolding();
		ArrayList<String> SqlList 			= new ArrayList<>();
		
		for(int i=0; i<r.length; i++){
			CThostFtdcInvestorPositionField d = r[i];
			int bTotalAmt = 0;
			int sTotalAmt = 0;
			if(d.PosiDirection == JctpConstants.THOST_FTDC_PD_Long){
				bTotalAmt = d.Position;
			}else if(d.PosiDirection == JctpConstants.THOST_FTDC_PD_Short){
				sTotalAmt = d.Position;
			}
			String FormatSQL;
			if(i == 0){
				FormatSQL = m_DpFuturePosSQL;
			}else{
				FormatSQL = m_DpFuturePosSQL2;
			}
			
			SqlList.add(String.format(FormatSQL, 
											d.TradingDay,
											this.m_PortID,
											this.m_PortSName,
											m_ctpinfo.getSuserId(),
											d.InstrumentID,
											d.SettlementPrice,
											bTotalAmt,
											sTotalAmt,
											d.UseMargin,
											d.PositionProfit,
											d.CashIn));
			
		}
		if(SqlList.size() > 0){
			String sSQL = StringUtils.join(SqlList, ",");
	
			m_SQLQueue.add(String.format(m_DpFuturePosDelSQL, m_Date, m_PortID));
			m_SQLQueue.add(sSQL);
			m_log.info(sSQL);
		}else{
			m_log.info(String.format("%s has no future position.", m_PortSName));
		}
	}
	
	
	public static void main(String[] args){
		getProdPos CS9Z01 = new getProdPos("CS9Z01");
		CS9Z01.LoadAccountData();
		CS9Z01.LoadHoldingData();
		
		getProdPos CS2B02 = new getProdPos("CS2B02");
		CS2B02.LoadAccountData();
		CS2B02.LoadHoldingData();
		
		getProdPos CS1D01 = new getProdPos("CS1D01");
		CS1D01.LoadAccountData();
		CS1D01.LoadHoldingData();
	
//		getProdPos CS1B01 = new getProdPos("CM1B01");
//		CS1B01.LoadAccountData();
//		CS1B01.LoadHoldingData();

		getProdPos CM1A01 = new getProdPos("CM1A01");
		CM1A01.LoadAccountData();
		CM1A01.LoadHoldingData();
		
		getProdPos CM1H01 = new getProdPos("CM1H01");
		CM1H01.LoadAccountData();
		CM1H01.LoadHoldingData();
		
		getProdPos CS1E02 = new getProdPos("CS1E02");
		CS1E02.LoadAccountData();
		CS1E02.LoadHoldingData();
		
		System.out.println("~~~~~~~finish~~~~~~~~");
	}
}
