package com.port.utils;


import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.explosion.ENTRUSTBS;
import com.explosion.FUTURESETTLEMENTDETAILS;
import com.explosion.FUTURETRADEDETAILS;

import com.explosion.ReadXTFiles;
import com.explosion.SECURITYTYPE;
import com.explosion.base.helper;
import com.explosion.db.DBWorker;
import com.explosion.db.DataBaseCfg;
import com.explosion.file.ReadExcel;
import com.explosion.file.WatchFile;

public abstract class Port extends Thread {
	protected String m_PortID;
	protected String m_PortSName;
	protected String m_EntrustFile;
	protected String m_CapitalFile;
	protected String m_TransFile;
	protected String m_FilePath;
	protected String m_MoneyType;
	protected String m_SplitComma 	= ",";
	
	private Logger 	  						m_log;
	protected ConcurrentLinkedQueue<String> m_SQLQueue;
	protected ConcurrentLinkedQueue<String> m_FileCreateList;
	protected ReadXTFiles m_TXT;
	protected ReadExcel m_Excel;
	protected PortDetails PD;

	protected HashMap<String, Integer> m_dpFundLocationMap;
	protected HashMap<String, Integer> m_dpPortDetailsLocationMap;
	protected HashMap<String, Integer> m_dpEntrustLocationMap;
	protected HashMap<String, Integer> m_dpTransDetailsLocationMap;

	protected String m_Date;
	private DBWorker m_DB;
	private String FUTURESELL 	 = "Âô";
	private String FUTUREBUY 	 = "Âò";
	private String FUTURECLOSE 	 = "Æ½²Ö";
	private String FUTUREOPEN 	 = "¿ª²Ö";
	private String m_Config		 = System.getProperty("user.dir") + File.separator + "conf" + File.separator + "config.properties";
	private Configuration 	config;

	// Table dpFund define
	protected String s_dpFundSQL		 =  "insert into jydb_all.dbo.dpFund(Date, PortID, PortSName, MoneyType,StockCash, SecurityCapital) " +
			  					   			"values('%s', '%s', '%s', '%s', %s, %s)";
	protected String s_dpFundDel		 =  "delete from jydb_all.dbo.dpFund where Date = '%s' and PortID = '%s'";
	
	// Table dpPortDetails define
	private String s_dpPortDetailsSQL  = "insert into jydb_all.dbo.dpPortDetails(Date,PortID,PortSName,SecurityID,SecurityName,SecurityType,HoldingAmount,EnableAmount,MoneyType,CostPx,CurrentMarketValue,ClosePx,HolderAccount,PnL,BuyVolume,SellVolume,CostMarketValue)" +
										   "values('%s','%s','%s','%s','%s','%s',%s,%s,'%s',%s,%s,%s,'%s',%s,%s,%s,%s)";
	private String s_dpPortDetailsSQL2 = 		 "('%s','%s','%s','%s','%s','%s',%s,%s,'%s',%s,%s,%s,'%s',%s,%s,%s,%s)";
	private String s_dpPortDetailsDel  = "delete from jydb_all.dbo.dpPortDetails where Date = '%s' and PortID = '%s'";
	
	// Table dpEntrust define
	private String s_dpEntrustSQL 	   = "insert into jydb_all.dbo.dpEntrust(Date,PortID,PortSName,EntrustBS, SecurityName,SecurityID,EntrustPrice,EntrustAmount,TradePrice,TradeVolume,TradeStatus,EntrustTime,EnturstNo,HolderAccount,QuoteWay,EntrustWay,EntrustIndex)" +
										 "values('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s')";
	private String s_dpEntrustSQL2 	   =       "('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s')";
	private String s_dpEntrustDel  	   = "delete from jydb_all.dbo.dpEntrust where Date = '%s' and PortID = '%s'";
	
	// Table dpTransDetails define 
	protected String s_dpTransDetailsSQL = "insert into jydb_all.dbo.dpTransDetails(Date,PortID,PortSName,SecurityType,SecurityID,SecurityName,EntrustBS,TradeTime,TradeVolume,AvgPx,TradeAmount,EnturstNo,HolderAccount,TradeID)" + 
										 "values('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s')";
	protected String s_dpTransDetailsSQL2 = 	   "('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s')";
	protected String s_dpTransDetailsDel  = "delete from jydb_all.dbo.dpTransDetails where Date = '%s' and PortID = '%s'";
	
	// Table dpFuturePos define
	private String s_dpFuturePosSQL 	= "insert into jydb_all.dbo.dpFuturePos( Date,PortID,PortSName,PartID,ClientID,InstrID,ClearPrice,BopenAmt,BoffAmt,BuyAmt,SopenAmt,SoffAmt,SellAmt,BuySum,SellSum,bTotalAmt,sTotalAmt,Margin,Actual,Transfee)" +  
										  "values('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s')";
	private String s_dpFuturePosSQL2    = "('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s')";
	protected String s_dpFuturePosDel 	= "delete from jydb_all.dbo.dpFuturePos where Date = '%s' and PortID = '%s'";
	
	// Table dpFutureTransDetails define
	
	private String s_dpFutureTransDetailsSQL = "insert into jydb_all.dbo.dpFutureTransDetails(Date,portID,PortSName,InstrID,TradeAmount,TradeID,TradePrice,TradeTime,TradeVolume,EntrustBS,OffsetFlag,OrderID)" +
											   "values('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s')";
	private String s_dpFutureTransDetailsSQL2 = "('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s')";
	private String s_dpFutureTransDetailsDel = "delete from jydb_all.dbo.dpFutureTransDetails where date = '%s' and portID = '%s'";
	
			
	
	// To His
	private String sdpHisFund        = "insert into jydb_all.dbo.dpHisFund select * from jydb_all.dpFund where Date = '%s'";
	private String sdpHisFundjour    = "insert into jydb_all.dbo.dpHisFundjour select * from jydb_all.dpFundjour where Date = '%s'";
	private String sdpHisEntrust     = "insert into jydb_all.dbo.sdpHisEntrust select * from jydb_all.dpEntrust where Date = '%s'";
	private String dpHisPortDetials  = "insert into jydb_all.dbo.dpHisPortDetials select * from jydb_all.dpPortDetails where Date = '%s'";
	private String dpHisTransDetails = "insert into jydb_all.dbo.dpHisTransDetails select * from jydb_all.dpTransDetails where Date = '%s'";
	
	private String sDpHisFundDel	  = "delete from jydb_all.dbo.dpFund where Date = '%s'";
	private String sDpFundjourDel	  = "delete from jydb_all.dbo.dpFundjour where Date = '%s'";
	private String sDpEntrustDel	  = "delete from jydb_all.dbo.dpEntrust where Date = '%s'";
	private String sdpPortDetailsDel  = "delete from jydb_all.dbo.dpPortDetails where Date = '%s'";
	private String sDpTransDetailsDel = "delete from jydb_all.dbo.dpTransDetails where Date = '%s'";
	
	protected String sDpFundUPdateSQL   = "update jydb_all.dbo.dpFund set FutureCash = '%s', FutureMargin = '%s', FutureCapital = '%s'" +
										"where Date = '%s' and PortID = '%s'";
	private DataBaseCfg Cfg;
	private boolean DeleteTransFlag;
	
	protected Port(){
		m_TXT 							= new ReadXTFiles();
		PD 								= new PortDetails();
		m_FileCreateList 				= new ConcurrentLinkedQueue<String>();
		m_SQLQueue 						= new ConcurrentLinkedQueue<String>();
		m_dpFundLocationMap				= new HashMap<String, Integer>();
		m_dpPortDetailsLocationMap  	= new HashMap<String, Integer>();
		m_dpEntrustLocationMap 	 		= new HashMap<String, Integer>();
		m_dpTransDetailsLocationMap 	= new HashMap<String, Integer>();
		m_log							= Logger.getLogger(Port.class);
		
		InitPortParam();
		SetFundLocation();
		SetportDetailsLocation();
		SetEntrustLocation();
		SetTransDetailsLocation();

	}
	
	protected void SetDeleteTransFlag(boolean flag)
	{
		DeleteTransFlag = flag;
	}
	
	protected void SetTransSQL(String sql1, String sql2)
	{
		s_dpTransDetailsSQL 	= sql1;
		s_dpTransDetailsSQL2 	= sql2;
	}
	
	protected int InitDB()
	{
		InitDBParam();
		m_DB 				= new DBWorker(m_SQLQueue, Cfg);		
		Thread m_DBThread 	= new Thread(m_DB);
		m_DBThread.start();
		m_DBThread.setName("T" + m_PortID + "DB");
		
		return 0;
	}
	

	protected int GenerateFundToHisSQL(){
		// m_Date
		return 0;
	};
	protected int GenerateStockToHisSQL(){
		return 0;
	};
	protected int GenerateTransDetialsToHisSQL(){
		return 0;
	};
	protected int GenerateEntrustToHisSQL(){
		return 0;
	};
	
	
	protected int SetFundLocation(){
		// TODO Auto-generated method stub
		m_dpFundLocationMap.put("SECURITYCAPITAL", 	5);
		m_dpFundLocationMap.put("STOCKCASH", 		6);
		return 0;
	}
	
	protected int SetportDetailsLocation() {
		// TODO Auto-generated method stub
		m_dpPortDetailsLocationMap.put("SECURITYID", 			5);
		m_dpPortDetailsLocationMap.put("SECURITYNAME", 			6);
		m_dpPortDetailsLocationMap.put("HOLDINGAMOUNT", 		7);
		m_dpPortDetailsLocationMap.put("ENABLEAMOUNT", 			14);
		m_dpPortDetailsLocationMap.put("MONEYTYPE",	 			-1);
		m_dpPortDetailsLocationMap.put("COSTPX", 				8);
		m_dpPortDetailsLocationMap.put("CURRENTMARKETVALUE", 	10);
		m_dpPortDetailsLocationMap.put("CLOSEPX", 				17);
		m_dpPortDetailsLocationMap.put("HOLDERACCOUNT", 		1);
		m_dpPortDetailsLocationMap.put("PNL", 					11);
		m_dpPortDetailsLocationMap.put("BUYVOLUME", 			-1);
		m_dpPortDetailsLocationMap.put("SELLVOLUME", 			-1);
		m_dpPortDetailsLocationMap.put("COSTMARKETVALUE", 		9);
		return 0;
	}

	protected int SetEntrustLocation() {
		// TODO Auto-generated method stub
		m_dpEntrustLocationMap.put("ENTRUSTBS", 		21);
		m_dpEntrustLocationMap.put("SECURITYNAME", 		8);
		m_dpEntrustLocationMap.put("SECURITYID", 		7); 
		m_dpEntrustLocationMap.put("ENTRUSTPRICE", 		9);
		m_dpEntrustLocationMap.put("ENTRUSTAMOUNT", 	10);
		m_dpEntrustLocationMap.put("TRADEPRICE", 		19);
		m_dpEntrustLocationMap.put("TRADEVOLUME", 		13);
		m_dpEntrustLocationMap.put("TRADESTATUS", 		12);
		m_dpEntrustLocationMap.put("ENTRUSTTIME", 		18);
		m_dpEntrustLocationMap.put("ENTURSTNO", 		11);
		m_dpEntrustLocationMap.put("HOLDERACCOUNT", 	1);
		m_dpEntrustLocationMap.put("QUOTEWAY", 			5);
		m_dpEntrustLocationMap.put("ENTRUSTWAY", 		5);
		m_dpEntrustLocationMap.put("ENTRUSTINDEX", 		-1);
		return 0;
	}

	protected int SetTransDetailsLocation() {
		// TODO Auto-generated method stub
		m_dpTransDetailsLocationMap.put("SECURITYID", 		7);
		m_dpTransDetailsLocationMap.put("SECURITYNAME", 	8);
		m_dpTransDetailsLocationMap.put("ENTRUSTBS", 		11);
		m_dpTransDetailsLocationMap.put("TRADETIME", 		14);
		m_dpTransDetailsLocationMap.put("TRADEVOLUME", 		13);
		m_dpTransDetailsLocationMap.put("AVGPX", 			12);
		m_dpTransDetailsLocationMap.put("TRADEAMOUNT", 		17);
		m_dpTransDetailsLocationMap.put("ENTURSTNO", 		10);
		m_dpTransDetailsLocationMap.put("HOLDERACCOUNT", 	1);
		m_dpTransDetailsLocationMap.put("TRADEID", 			9);
		return 0;
	}
	
	protected abstract int InitPortParam();
	
	protected String GetPosDate(String sFile){
		return helper.Today();
	}
	
	protected String ChangeEntrustBS(String[] arr)
	{
		return GetEntrustLocationInfo(arr, "ENTRUSTBS");
	}
	
	protected String ChangeTradeBS(String[] arr)
	{
		return arr[m_dpTransDetailsLocationMap.get("ENTRUSTBS")];
	}
	
	protected String GetFutureTradeDate(String sFileName){
		File newFile = new File(sFileName);
		return newFile.getName().substring(10, 18);
	}
	
	
	protected int GenerateSQL() {
		// TODO Auto-generated method stub
		if(PD.m_PortFundList.size()>0)
		{
			GenerateFundSQL();
		}
		else if(PD.m_PortStockList.size()>0)
		{
			GenerateStockSQL();
		}
		else if(PD.m_PortEntrustList.size()>0)
		{
			GenerateEntrustSQL();
		}
		else if(PD.m_PortTransList.size()>0)
		{
			GenerateTransDetailsSQL();
		}
		else if(PD.m_portFutureCapital.size()>0)
		{
			GenerateFutureCapitalSQL();
		}
		else if(PD.m_portFuturePos.size()>0)
		{
			GenerateFuturePos();
		}
		else if(PD.m_portFutureTrade.size()>0)
		{
			GenerateFutureTrade();
		}
		return 0;
	}

	protected int GenerateFutureTrade()
	{
		ArrayList<String> SqlList = new ArrayList<>();
		for(int i=0; i<PD.m_portFutureTrade.size(); i++)
		{
			String sql = "";
			String[] arr =  PD.m_portFutureTrade.get(i).split(m_SplitComma);
			if(i == 0)
			{
				sql = FormatFutureTransDetails(s_dpFutureTransDetailsSQL, arr);
			}
			else
			{
				sql = FormatFutureTransDetails(s_dpFutureTransDetailsSQL2, arr);
			}
			SqlList.add(sql);
		}
		PD.m_portFutureTrade.clear();
		String sSQL = StringUtils.join(SqlList, ",");
		m_SQLQueue.add(String.format(s_dpFutureTransDetailsDel, m_Date, m_PortID));
		m_SQLQueue.add(sSQL);
		return 0;
	}
	
	private int GenerateFuturePos()
	{
		ArrayList<String> SqlList = new ArrayList<>();
		
		for(int i=0; i<PD.m_portFuturePos.size(); i++)
		{
			String sql = "";
			String[] arr =  PD.m_portFuturePos.get(i).split(m_SplitComma);
			if(i == 0 )
			{
				sql = FormatFuturePosSQL(s_dpFuturePosSQL, arr);
			}
			else{
				sql = FormatFuturePosSQL(s_dpFuturePosSQL2, arr);
			}
			SqlList.add(sql);
		}
		PD.m_portFuturePos.clear();
		String sSQL = StringUtils.join(SqlList, ",");
		m_SQLQueue.add(String.format(s_dpFuturePosDel, m_Date, m_PortID));
		m_SQLQueue.add(sSQL);
		return 0;
	}
	
	private int GenerateFutureCapitalSQL()
	{	
		String FutureCapital = "";
		String FutureCash    = "";
		String FutureMargin  = "";
		String[] Arr 		 = PD.m_portFutureCapital.get(1).split(m_SplitComma);
		FutureCapital 		 = Arr[10];
		FutureCash 			 = Arr[11];
		FutureMargin 		 = Arr[16];
		
		PD.m_portFutureCapital.clear();
		m_SQLQueue.add(String.format(sDpFundUPdateSQL, FutureCash, FutureMargin, FutureCapital, m_Date, m_PortID));
		return 0;
	}
	
	protected void MonitrPath(String sPathConfig)
	{
		String src;											// local source dictionary
    	List<String> ListPath = new ArrayList<String>();
    	String sConfigFile    = m_Config;
    	
    	m_log.info(String.format("%s %s: read config file '%s'", helper.Now(), m_PortID, sConfigFile));
    	
		try {
			// read configure
			config = new PropertiesConfiguration(sConfigFile);
			src = config.getString(sPathConfig);
			ListPath.add(src);
			// start file watch server
			for(String sPath : ListPath)
			{
				m_log.info(String.format("%s %s: Start monitor dictinary '%s'", helper.Now(), m_PortID, sPath));
				new Thread(new WatchFile(sPath, m_FileCreateList, sConfigFile)).start(); 
			}
		} catch (ConfigurationException e) {
			// TODO Auto-generated catch block
			m_log.info(e.toString());
		}		
	}
	
	private void InitDBParam()
	{

		Cfg = new DataBaseCfg();
		
		String sHost  = config.getString("dbhost");
		String dbport = config.getString("dbport");
		m_log.info(helper.Now() + " :Start read db param " + sHost + ":" + dbport);
		
		Cfg.dbHost = sHost;
		Cfg.dbPort = dbport;
		Cfg.dbUser = config.getString("dbUser");
		Cfg.dbPwd  = config.getString("dbPwd");
		Cfg.dbName = config.getString("dbName");
		return;
	}
	
	private String GetFileDate(String sFilename){
		 return helper.Today();
	}
	
	private String RenameFile(String filename){
		File oldName = new File(filename);
		File newName = new File(filename.replaceAll("yyyymmdd", helper.Today()));
		if(oldName.renameTo(newName)) {
			m_log.info(String.format("Renamed. %s ----> %s", oldName.getName(), newName.getName()));
		} else {
			m_log.info("Error");
		}
		return filename.replaceAll("yyyymmdd", helper.Today());
	}
	
	@Override
	public void run(){
		String sFile = "";
		while(true){
			try {
				if(!m_FileCreateList.isEmpty())
				{
					sFile = m_FileCreateList.poll();
					m_log.info(String.format("Find file: %s", sFile));
//					sFile = RenameFile(sFile);
					Thread.sleep(500);
					if(sFile.toLowerCase().contains("stock")){
						m_Date = GetFileDate(sFile);
						m_TXT.GetData(sFile, PD);
					}
//					else if(sFile.toLowerCase().contains("future"))
//					{
//						m_Date = GetFileDate(sFile);
//						m_TXT.GetData(sFile.toLowerCase(), PD);
//					}
				}
				GenerateSQL();
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public String GetSecurityType(String sCode){
		if(sCode.substring(0, 1).equals("0") || sCode.substring(0, 1).equals("3") || 
				sCode.substring(0, 1).equals("6"))
		{
			return SECURITYTYPE.STOCK;
		}
		return SECURITYTYPE.FUND;
	}
	
	private String GetMONEYTYPE(String[] arr)
	{
		String Ret = "";
		if(m_dpPortDetailsLocationMap.get("MONEYTYPE") == -1)
		{
			Ret = m_MoneyType;
		}
		else{
			Ret = arr[m_dpPortDetailsLocationMap.get("MONEYTYPE")];
		}
		return Ret;
	}
	
	private String GetBUYVOLUME(String[] arr)
	{
		String Ret = "0";
		if(m_dpPortDetailsLocationMap.get("BUYVOLUME") != -1){
			Ret = arr[m_dpPortDetailsLocationMap.get("BUYVOLUME")];
		}
		return Ret;
	}
	
	private String GetSELLVOLUME(String[] arr)
	{
		String Ret = "0";
		if(m_dpPortDetailsLocationMap.get("SELLVOLUME") != -1){
			Ret = arr[m_dpPortDetailsLocationMap.get("SELLVOLUME")];
		}
		return Ret;
	}

	private String GetCOSTMARKETVALUE(String[] arr)
	{
		String Ret = "0";
		if(m_dpPortDetailsLocationMap.get("COSTMARKETVALUE") != -1){
			Ret = arr[m_dpPortDetailsLocationMap.get("COSTMARKETVALUE")];
		}
		return Ret;
	}
	
	private String GetEntrustLocationInfo(String[] arr, String sField){
		String Ret = "";
		if(m_dpEntrustLocationMap.get(sField) != -1)
		{
			Ret = arr[m_dpEntrustLocationMap.get(sField)];
			if((sField.equals("ENTRUSTAMOUNT") || sField.equals("TRADEVOLUME"))  && Ret.length() > 3 && Ret.substring(Ret.length()-3,Ret.length()).equals(".00"))
			{
				Ret = Ret.substring(0, Ret.length()-3);
			}
		}
		return Ret;
	}
	
	public String GetTransDetailsLocationInfo(String[] arr, String sField){
		String Ret = "";
		if(m_dpTransDetailsLocationMap.get(sField) != -1)
		{
			Ret = arr[m_dpTransDetailsLocationMap.get(sField)];
			if((sField.equals("ENTRUSTAMOUNT") || sField.equals("TRADEVOLUME"))  && Ret.length() > 3 && Ret.substring(Ret.length()-3,Ret.length()).equals(".00"))
			{
				Ret = Ret.substring(0, Ret.length()-3);
			}
		}
		return Ret;
	}
	
	private String FormatFuturePosSQL(String FormatStr, Object[] arr)
	{
		return String.format(FormatStr, m_Date, m_PortID, m_PortSName, 
																		arr[FUTURESETTLEMENTDETAILS.PARTID],
																		arr[FUTURESETTLEMENTDETAILS.CLIENTID],
																		arr[FUTURESETTLEMENTDETAILS.INSTRID],
																		arr[FUTURESETTLEMENTDETAILS.CLEARPRICE],
																		arr[FUTURESETTLEMENTDETAILS.BOPENAMT],
																		arr[FUTURESETTLEMENTDETAILS.BOFFAMT],
																		arr[FUTURESETTLEMENTDETAILS.BUYAMT],
																		arr[FUTURESETTLEMENTDETAILS.SOPENAMT],
																		arr[FUTURESETTLEMENTDETAILS.SOFFAMT],
																		arr[FUTURESETTLEMENTDETAILS.SELLAMT],
																		arr[FUTURESETTLEMENTDETAILS.BUYSUM],
																		arr[FUTURESETTLEMENTDETAILS.SELLSUM],
																		arr[FUTURESETTLEMENTDETAILS.BTOTALAMT],
																		arr[FUTURESETTLEMENTDETAILS.STOTALAMT],
																		arr[FUTURESETTLEMENTDETAILS.MARGIN],
																		arr[FUTURESETTLEMENTDETAILS.ACTUAL],
																		arr[FUTURESETTLEMENTDETAILS.TRANSFEE]);
	}
	
	private String ExChangeFutureEntrustBS(Object[] arr)
	{
		String ret = "";
		if(arr[FUTURETRADEDETAILS.ENTRUSTBS].toString().trim().equals(FUTURESELL))
		{
			if(arr[FUTURETRADEDETAILS.OFFSETFLAG].toString().trim().equals(FUTUREOPEN))
			{
				ret = ENTRUSTBS.OPENSELL;
			}
			else if(arr[FUTURETRADEDETAILS.OFFSETFLAG].toString().trim().equals(FUTURECLOSE))
			{
				ret = ENTRUSTBS.CLOSESELL;
			}
		}
		else if(arr[FUTURETRADEDETAILS.ENTRUSTBS].toString().trim().equals(FUTUREBUY))
		{
			if(arr[FUTURETRADEDETAILS.OFFSETFLAG].toString().trim().equals(FUTUREOPEN))
			{
				ret = ENTRUSTBS.OPENBUY;
			}
			else if(arr[FUTURETRADEDETAILS.OFFSETFLAG].toString().trim().equals(FUTURECLOSE))
			{
				ret = ENTRUSTBS.CLOSEBUY;
			}
		}
		else{
			ret = " ";
		}
		return ret;
	}
	
	private String FormatFutureTransDetails(String FormatStr, Object[] arr)
	{
		// Date,ProductID,ProdSName,InstrID,TradeAmount,TradeID,TradePrice,TradeTime,TradeVolume,EntrustBS,OffsetFlag,OrderID
		return String.format(FormatStr, m_Date, m_PortID, m_PortSName, 
						arr[FUTURETRADEDETAILS.INSTRID],
						arr[FUTURETRADEDETAILS.TRADEAMOUNT],
						arr[FUTURETRADEDETAILS.TRADEID],
						arr[FUTURETRADEDETAILS.TRADEPRICE],
						arr[FUTURETRADEDETAILS.TRADETIME],
						arr[FUTURETRADEDETAILS.TRADEVOLUME],
						ExChangeFutureEntrustBS(arr),
						arr[FUTURETRADEDETAILS.OFFSETFLAG],
						arr[FUTURETRADEDETAILS.ORDERID]);
	}
	
	private String FormatPortDetialsSQL(String FormatStr, String[] arr){
		return String.format(FormatStr,
									m_Date,
									m_PortID,
									m_PortSName,
									arr[m_dpPortDetailsLocationMap.get("SECURITYID")],
									arr[m_dpPortDetailsLocationMap.get("SECURITYNAME")],
									GetSecurityType(arr[m_dpPortDetailsLocationMap.get("SECURITYID")]),
									arr[m_dpPortDetailsLocationMap.get("HOLDINGAMOUNT")],
									arr[m_dpPortDetailsLocationMap.get("ENABLEAMOUNT")],
									GetMONEYTYPE(arr),
									arr[m_dpPortDetailsLocationMap.get("COSTPX")],
									arr[m_dpPortDetailsLocationMap.get("CURRENTMARKETVALUE")],
									arr[m_dpPortDetailsLocationMap.get("CLOSEPX")],
									arr[m_dpPortDetailsLocationMap.get("HOLDERACCOUNT")],
									arr[m_dpPortDetailsLocationMap.get("PNL")],
									GetBUYVOLUME(arr),
									GetSELLVOLUME(arr),
									GetCOSTMARKETVALUE(arr));
	}
	
	private String FormatEntust(String FormatStr, String[] arr){
		return String.format(FormatStr, 
				m_Date,
				m_PortID,
				m_PortSName,
				ChangeEntrustBS(arr),
//				GetEntrustLocationInfo(arr, "ENTRUSTBS"),
				GetEntrustLocationInfo(arr, "SECURITYNAME"), 		
				GetEntrustLocationInfo(arr, "SECURITYID"),	
				GetEntrustLocationInfo(arr, "ENTRUSTPRICE"), 		
				GetEntrustLocationInfo(arr, "ENTRUSTAMOUNT"), 		
				GetEntrustLocationInfo(arr, "TRADEPRICE"), 			
				GetEntrustLocationInfo(arr, "TRADEVOLUME"), 		
				GetEntrustLocationInfo(arr, "TRADESTATUS"), 		
				GetEntrustLocationInfo(arr, "ENTRUSTTIME"), 		
				GetEntrustLocationInfo(arr, "ENTURSTNO"), 			
				GetEntrustLocationInfo(arr, "HOLDERACCOUNT"), 		
				GetEntrustLocationInfo(arr, "QUOTEWAY"), 			
				GetEntrustLocationInfo(arr, "ENTRUSTWAY"), 			
				GetEntrustLocationInfo(arr, "ENTRUSTINDEX"));
	}
	
	protected String FormatdpTransDetails(String FormatStr, String[] arr)
	{
		return String.format(FormatStr, 
				m_Date,
				m_PortID,
				m_PortSName,
				GetSecurityType(arr[m_dpTransDetailsLocationMap.get("SECURITYID")]),
				arr[m_dpTransDetailsLocationMap.get("SECURITYID")],			
				arr[m_dpTransDetailsLocationMap.get("SECURITYNAME")],	
				ChangeTradeBS(arr),
				arr[m_dpTransDetailsLocationMap.get("TRADETIME")],			
				GetTransDetailsLocationInfo(arr, "TRADEVOLUME"),
				arr[m_dpTransDetailsLocationMap.get("AVGPX")],				
				arr[m_dpTransDetailsLocationMap.get("TRADEAMOUNT")],			
				arr[m_dpTransDetailsLocationMap.get("ENTURSTNO")],			
				arr[m_dpTransDetailsLocationMap.get("HOLDERACCOUNT")],		
				arr[m_dpTransDetailsLocationMap.get("TRADEID")]		);
	}
	
	protected int GenerateFundSQL() {	
		String[] fundInfo = PD.m_PortFundList.get(1).split(m_SplitComma);
		String sSQL = String.format(s_dpFundSQL, m_Date, m_PortID, m_PortSName, m_MoneyType, 
									fundInfo[m_dpFundLocationMap.get("STOCKCASH")], 
									fundInfo[m_dpFundLocationMap.get("SECURITYCAPITAL")]);
		m_SQLQueue.add(String.format(s_dpFundDel, m_Date, m_PortID));
		m_SQLQueue.add(sSQL);
		PD.m_PortFundList.clear();
		return 0;
	}
	
	private int GenerateStockSQL() {
		ArrayList<String> SqlList = new ArrayList<>();

		int count = PD.m_PortStockList.size();
		for(int i=1; i<count; i++)
		{
			String[] arr = PD.m_PortStockList.get(i).split(m_SplitComma);
			String sSQL = "";
			
			if(i == 1){
				sSQL = FormatPortDetialsSQL(s_dpPortDetailsSQL, arr);
			}
			else{
				sSQL = FormatPortDetialsSQL(s_dpPortDetailsSQL2, arr);
			}
			SqlList.add(sSQL);
		}
		
		String res = StringUtils.join(SqlList, ",");
		m_SQLQueue.add(String.format(s_dpPortDetailsDel, m_Date, m_PortID));
		m_SQLQueue.add(res);
		PD.m_PortStockList.clear();
		
		return 0;
	}
	
	protected int GenerateEntrustSQL()
	{
		ArrayList<String> SqlList = new ArrayList<>();
		int count = PD.m_PortEntrustList.size();
		for(int i=1; i<count; i++)
		{
			String[] arr = PD.m_PortEntrustList.get(i).split(m_SplitComma);
			String sSQL = "";

			if(i == 1){
				sSQL = FormatEntust(s_dpEntrustSQL, arr);
			}
			else{
				sSQL = FormatEntust(s_dpEntrustSQL2, arr);
			}
			SqlList.add(sSQL);
		}
		String res = StringUtils.join(SqlList, ",");
		m_SQLQueue.add(String.format(s_dpEntrustDel, m_Date, m_PortID));
		m_SQLQueue.add(res);
		PD.m_PortEntrustList.clear();
		return 0;
	}
	
	protected int GenerateTransDetailsSQL(){
		
		ArrayList<String> SqlList = new ArrayList<>();
		int count = PD.m_PortTransList.size();
		for(int i=1; i<count; i++)
		{
			String[] arr = PD.m_PortTransList.get(i).split(m_SplitComma);
			String sSQL = "";

			if(i == 1){
				sSQL = FormatdpTransDetails(s_dpTransDetailsSQL, arr);
			}
			else{
				sSQL = FormatdpTransDetails(s_dpTransDetailsSQL2, arr);
			}
			SqlList.add(sSQL);
		}
		String res = StringUtils.join(SqlList, ",");
		if(DeleteTransFlag)
		{
			m_SQLQueue.add(String.format(s_dpTransDetailsDel, m_Date, m_PortID));
		}
		m_SQLQueue.add(res);
		PD.m_PortTransList.clear();
		return 0;
		
	}
	
}


