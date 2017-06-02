
package com.explosion.tactic.util;

import java.io.File;
import java.lang.String;
import java.util.Properties;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.jctp.JctpConstants;

import org.apache.log4j.Logger;
import org.zeromq.ZMQ;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.explosion.base.helper;
import com.explosion.db.DBMysql;
import com.explosion.db.DataBaseCfg;
import com.explosion.tactic.cta.pairarb.util.TacticAttr;
import com.explosion.trade.ctp.COMMODITYCONSTANT;
import com.explosion.trade.ctp.CTPInfo;
import com.explosion.trade.util.Entrust;

public abstract class Tactic extends Thread{
	protected   String 			m_sConfigFile;
	protected 	String 			m_sEntrustType		    	= " ";
	protected 	String 	  		m_TacticID;
	public 		String			m_SubCodes 					= "";	// dpquant 会使用m_SubCodes订阅行情数据
	protected 	Properties 		m_configProps 				= new Properties();
	public  	DBMysql 		m_DB;
	
	protected 	TacticSQL		m_TacticSQL;
	public 		CTPInfo			m_ctpinfo; 
	public 		CTPInfo 		m_shadowctpinfo;	// SReverse
	public 		ProdInfo 		m_ProdInfo;			// 20160309 增加账户、产品属性 	产品策略信息
	public 		ProdInfo 		m_ShadowProdInfo;
	protected 	Portfolio 		tmpPort;
	protected 	Logger 			m_log;
	public 		TacticAttr		m_tacticattr;
	
	protected 	Double 			m_AppendRaise           	= 2.0;
	
	protected int    			m_HoldingLimit 				= 1;
	protected int    			INTERVAL 					= 1000;
	protected int    			INTERVALCHECKPORT 			= 500;
	protected int 				m_IsHold 					= 0; 		// 记录持有仓位数目
	protected int	   			m_CancelTime;
	protected int				m_theSignal;
	

	
	protected boolean   		m_Start						= false;
	protected boolean 			OPENED						= false;
	protected boolean 			CLOSEED						= false;
	protected boolean 			m_isUnFinished				= false;
	
	
	protected ConcurrentLinkedQueue<Portfolio>  	m_ArithTradeLastOrderQueue;
	protected ConcurrentLinkedQueue<String>  		m_TacticQueue;
	private ZMQ.Context 							m_OmsContext;
	private ZMQ.Socket 								m_OmsSocket;
	protected DataBaseCfg 							m_Cfg;
	
	
	
	public abstract int 			CalcSignal();				//1:开	2:平	   0:无
	public abstract boolean 		PrepareData();
	public abstract boolean 		InitSecurity();
	public abstract boolean 		CheckPort();
	public abstract void 			GeneratePortfolio(String direction, String remark);
	protected abstract void			InitHolding();
	
	
	public void ConnectDB() {
		// TODO Auto-generated method stub
		ConcurrentLinkedQueue<String> SQLQueue = new ConcurrentLinkedQueue<String>();
		m_DB = new DBMysql(SQLQueue, m_Cfg, this.getName());
		Thread DBThread = new Thread(m_DB);
		DBThread.setName(String.format("%s_%s_BDThread",m_ProdInfo.getProdName(), m_ProdInfo.getStrategyName()));
		DBThread.start();
	}

	
	public Tactic(){
		m_sConfigFile		= String.format("%s%sconf%s%s.properties",System.getProperty("user.dir"), File.separator, File.separator , "config");
		m_TacticQueue		= new ConcurrentLinkedQueue<String>();
		m_Start 			= false;
		m_TacticSQL			= new TacticSQL();
		m_log 				= Logger.getLogger(Tactic.class);
		m_TacticID 			= helper.GenerateGuid();
		tmpPort 			= new Portfolio();
		tmpPort.m_TacticID  = this.m_TacticID;
		PrepareData();
		m_configProps 		= helper.loadConfig(m_sConfigFile);
		m_Cfg 				= new DataBaseCfg();
		m_Cfg.dbUser 		= m_configProps.getProperty("db.user");
		m_Cfg.dbPwd  		= m_configProps.getProperty("db.pwd");
		m_Cfg.dbName 		= m_configProps.getProperty("db.name");
		m_Cfg.dbHost 		= m_configProps.getProperty("db.host");
		m_Cfg.dbPort 		= m_configProps.getProperty("db.port");
		INTERVAL 			= 1000;

		InitQuery();
	}
	
	public void SetPortInfo(String PortName, String StrategyName){

		m_ProdInfo 			= new ProdInfo();
		m_ProdInfo.setProdName(PortName);
		m_ProdInfo.setStrategyName(StrategyName);
		
		tmpPort.m_PortInfo 	= m_ProdInfo;
	}

	public void InitQuery(){
		m_OmsContext 			= ZMQ.context(1);  
		m_OmsSocket 			= m_OmsContext.socket(ZMQ.REQ);  
		String url 				= "tcp://" + m_configProps.getProperty("omsdataquery.host") + ":" + m_configProps.getProperty("omsdataquery.port");
        m_OmsSocket.connect(url);  
        m_log.info("Tactic OMS Connected: " + url);
	} 
	
	public boolean Trade() {
		// TODO Auto-generated method stub
		m_isUnFinished = true;
		m_ArithTradeLastOrderQueue.add(tmpPort);
		return true;
	}
	
	
	public void Start(){
		m_Start = true;
	}
	
	public void Terminate(){
		m_Start = false;
	}
	
	protected void setInterVal(int n){
		INTERVAL = n;
	}

	public void QueryOrder(){
		JSONObject obj = new JSONObject();
		obj.put("func", "QueryOrder");
		obj.put("param1", m_TacticID);
		SendReq(obj, m_OmsSocket);
	}
	
	public void QueryTrade(){
		JSONObject obj = new JSONObject();
		obj.put("func", "QueryTrade");
		obj.put("param1", m_TacticID);
		SendReq(obj, m_OmsSocket);
	}

	
	protected void CancelOrder(JSONObject jsonOrder2){
		if(jsonOrder2.getString("orderstatus") != JctpConstants.STRING_THOST_FTDC_OST_Canceled){
			Entrust e = new Entrust(jsonOrder2.getString("instrumentid"), "", ' ', -1);
			e.m_Cancel 		= true;
			e.m_sOrderref 	= jsonOrder2.getString("orderref");
			e.m_Sessionid 	= jsonOrder2.getInteger("sessionid");
			e.m_Frontid 	= jsonOrder2.getInteger("frontid");
			e.m_PortInfo	= m_ProdInfo;
			
			Portfolio Port 		= new Portfolio();
			Port.m_ListFuture.clear();
			Port.m_ListSecurity.clear();
			Port.m_ListFuture.add(e);
			Port.m_PortInfo 	= m_ProdInfo;
			Port.m_TacticID 	= m_TacticID;
			m_ArithTradeLastOrderQueue.add(Port);
		}
	}
	
	protected boolean CancelOrderWithRet(JSONObject jsonOrder2){
		if(jsonOrder2.getString("orderstatus") != JctpConstants.STRING_THOST_FTDC_OST_Canceled){
			Entrust e = new Entrust(jsonOrder2.getString("instrumentid"), "", ' ', -1);
			e.m_Cancel 		= true;
			e.m_sOrderref 	= jsonOrder2.getString("orderref");
			e.m_Sessionid 	= jsonOrder2.getInteger("sessionid");
			e.m_Frontid 	= jsonOrder2.getInteger("frontid");
			e.m_PortInfo	= m_ProdInfo;
			
			Portfolio Port 		= new Portfolio();
			Port.m_ListFuture.clear();
			Port.m_ListSecurity.clear();
			Port.m_ListFuture.add(e);
			Port.m_PortInfo 	= m_ProdInfo;
			Port.m_TacticID 	= m_TacticID;
			m_ArithTradeLastOrderQueue.add(Port);
		}
		
		while(true){
			JSONArray arrEntrust = getSQLData(String.format(m_TacticSQL.m_sFormatQueryOrderSQL, 
																jsonOrder2.getString("orderref"), 
																jsonOrder2.getInteger("sessionid"), 
																jsonOrder2.getInteger("frontid")));
			if(arrEntrust.size() == 1){
				JSONObject jsonOrder1 		= arrEntrust.getJSONObject(0);
				String sOrderStatus1 		= jsonOrder1.getString("orderstatus");
				
				if(sOrderStatus1.equals(JctpConstants.STRING_THOST_FTDC_OST_Canceled)){
					// 2. 重新下单
					m_isUnFinished = false;
					return true;
				} // 考虑到在撤单的时候，未成交那笔正好有成交回报回来问题 
				else if(sOrderStatus1.equals(JctpConstants.STRING_THOST_FTDC_OST_AllTraded)){
					m_isUnFinished = false;
					return false;
				}
			}else{
				m_log.error("Query Order Fail!!!");
				return false;
			}		
			
			try {
				sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				m_log.error(e.toString());
			}
		}
	}
	
	private void MarketPriceOrder(JSONObject jsonOrder2){
		String sSecurityID 	= jsonOrder2.getString("instrumentid");
		String sOpenClose 	= jsonOrder2.getString("comboffsetflag");
		String cEntrustBS 	= jsonOrder2.getString("direction");
		String tacticType 	= jsonOrder2.getString("tactictype");
		String sRemark 		= jsonOrder2.getString("remark");
		int ValidInvertal 	= jsonOrder2.getInteger("validinvertal");
		int vol 			= jsonOrder2.getInteger("volumetotal");
		
		Entrust e1 			= new Entrust(sSecurityID, sOpenClose, cEntrustBS.charAt(0), vol);
		
		e1.m_ValidInvertal 	= ValidInvertal;
		e1.m_PortInfo.setProdName(m_ProdInfo.getProdName());
		e1.m_PortInfo.setStrategyName(tacticType);
		e1.m_remark = String.format("Append order %s ", sRemark);
		Portfolio Port1 	= new Portfolio();
		 
		Port1.m_ListFuture.clear();
		Port1.m_ListSecurity.clear();
		Port1.m_ListFuture.add(e1);
		Port1.m_PortInfo 	= m_ProdInfo;
		Port1.m_TacticID 	= m_TacticID;
		m_ArithTradeLastOrderQueue.add(Port1);
	}
	
	public double AppendPrice(String SecurityID, double Px, String BS){
		if(BS.equals("SELL")){
			return Math.round(Px * (1 - m_AppendRaise/100));
		}else{
			return Math.round(Px * (1 + m_AppendRaise/100));
		}
	}
	
	private void LimitPriceOrder(JSONObject jsonOrder2){
		m_log.info(jsonOrder2.toString());
		String sSecurityID 	= jsonOrder2.getString("instrumentid");
		String sOpenClose	= jsonOrder2.getString("comboffsetflag");
		String cEntrustBS 	= jsonOrder2.getString("direction");
		String tacticType 	= jsonOrder2.getString("tactictype");
		String sRemark 		= jsonOrder2.getString("remark");
		double Price   		= jsonOrder2.getDoubleValue("limitprice"); 
		int ValidInvertal 	= jsonOrder2.getInteger("validinvertal");
		int vol 			= jsonOrder2.getInteger("volumetotal");
		
		if(cEntrustBS.equals(JctpConstants.STRING_THOST_FTDC_D_Sell)){
			Price = AppendPrice(sSecurityID, Price, "SELL");
		}else{
			Price = AppendPrice(sSecurityID, Price, "BUY");
		}
		
		Entrust e1 			= new Entrust(sSecurityID, Price, sOpenClose, cEntrustBS.charAt(0), vol);
		m_log.info(String.format("Append order: %s", e1.toString()));
		
		e1.m_ValidInvertal 	= ValidInvertal;
		e1.m_PortInfo.setProdName(m_ProdInfo.getProdName());
		e1.m_PortInfo.setStrategyName(tacticType);
		e1.m_remark = String.format("Append order %s ", sRemark);
		Portfolio Port1 	= new Portfolio();
		 
		Port1.m_ListFuture.clear();
		Port1.m_ListSecurity.clear();
		Port1.m_ListFuture.add(e1);
		Port1.m_PortInfo 	= m_ProdInfo;
		Port1.m_TacticID 	= m_TacticID;
		m_ArithTradeLastOrderQueue.add(Port1);
	}	
	
	
	protected JSONArray getSQLData(String QuerySQL){
		m_log.info(QuerySQL);
		return m_DB.Query(QuerySQL);
	}
	
	protected void Append(JSONObject jsonOrder2){
		// 1. 撤单
		CancelOrder(jsonOrder2);
		
		
		// add 确认是否撤单成功，确认成功之后重新下单！！！
		while(true){
			JSONArray arrEntrust = getSQLData(String.format(m_TacticSQL.m_sFormatQueryOrderSQL, 
																jsonOrder2.getString("orderref"), 
																jsonOrder2.getInteger("sessionid"), 
																jsonOrder2.getInteger("frontid")));
			
			if(arrEntrust.size() == 1){
				JSONObject jsonOrder1 		= arrEntrust.getJSONObject(0);
				String sOrderStatus1 		= jsonOrder1.getString("orderstatus");
				
				if(sOrderStatus1.equals(JctpConstants.STRING_THOST_FTDC_OST_Canceled)){
					// 2. 重新下单
					LimitPriceOrder(jsonOrder1);
					m_isUnFinished = false;
					break;
				
				} // 考虑到在撤单的时候，未成交那笔正好有成交回报回来问题 
				else if(sOrderStatus1.equals(JctpConstants.STRING_THOST_FTDC_OST_AllTraded)){
					m_isUnFinished = false;
					break;
				}
				
			}else{
				m_log.error("Query Order Fail!!!");
				break;
			}		
			
			try {
				sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				m_log.error(e.toString());
			}
		}
		
	}  

	@Override
	public void run(){
		while(m_Start){
			try {
				sleep(INTERVAL);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				m_log.error(e1.toString());
			}

			m_theSignal = CalcSignal();
			
			// 1: open  2: close
			if(m_theSignal == 1 || m_theSignal == 2){
				Trade(); // buy direction
				try {
					sleep(INTERVAL);
					while(m_isUnFinished){
						sleep(INTERVALCHECKPORT);
			        	CheckPort();			        	
			        }   
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					m_log.error(e.toString());
				}
			}
		
		}
		m_log.info(String.format("%s Quit!", m_ProdInfo.getStrategyName()));
	}
	
	private String SendReq(JSONObject obj, ZMQ.Socket stocket){
		String req = obj.toString() + " ";
		byte[] request = req.getBytes();  
		request[request.length - 1] = 0; 
		stocket.send(request, ZMQ.NOBLOCK);  
		// 获得返回值  
        byte[] reply = stocket.recv(0);  
        // 输出去掉末尾0的字符串  
        return new String(reply, 0, reply.length - 1); 
	}
	

	
	protected void InitTacticID(){
		JSONArray tacticList =  getSQLData(String.format(m_TacticSQL.m_sFormatGetTacticID, 
														 m_ProdInfo.getStrategyName(),
														 m_ctpinfo.getSuserId()));
		if(tacticList.size() > 0){
			JSONObject jsonHolding 		= tacticList.getJSONObject(0);
			if(jsonHolding.getString("tacticid") != null){
				m_TacticID 						= jsonHolding.getString("tacticid");
			}else{
				m_TacticID 						= helper.GenerateGuid();
			}
		}else{
			m_TacticID 							= helper.GenerateGuid();
		}
	}
	
	public boolean 	InitFuture(){
		String sStrategy 	= m_ProdInfo.getStrategyName();
		sStrategy			= sStrategy.toLowerCase(); 
		m_ctpinfo = new CTPInfo();
		m_ctpinfo.setStraderFrontUrl(m_configProps.getProperty(String.format("tactic.strategy.%s.traderfronturl", 	sStrategy)));
		m_ctpinfo.setSbrokerId(m_configProps.getProperty(String.format("tactic.strategy.%s.brokerid", 				sStrategy)));
		m_ctpinfo.setSuserId(m_configProps.getProperty(String.format("tactic.strategy.%s.userid", 					sStrategy)));
		m_ctpinfo.setSinvestorId(m_configProps.getProperty(String.format("tactic.strategy.%s.userid", 				sStrategy)));
		m_ctpinfo.setSpassword(m_configProps.getProperty(String.format("tactic.strategy.%s.password", 				sStrategy)));
		return true;
	}

	public void startTacticAttr(){
		Thread TacticAttrThread = new Thread(m_tacticattr);
		TacticAttrThread.start();
		TacticAttrThread.setName("TACTICATTRTHREAD");
	}
	
	public double calcPrice(char sBS, String sInstrumentid, double price, double AppendSpread){
		String pattern = "(\\D+)(\\d+)";
	    Pattern r = Pattern.compile(pattern);
	    Matcher m = r.matcher(sInstrumentid);
	    double  p = price;

	    if (m.find()) {
		    if(sBS == JctpConstants.THOST_FTDC_D_Buy){
		    	p = p + AppendSpread * COMMODITYCONSTANT.COMMODITYUNITMAP.get(m.group(1).toUpperCase());	
		    }else{
		    	p = p - AppendSpread * COMMODITYCONSTANT.COMMODITYUNITMAP.get(m.group(1).toUpperCase());
		    }
	    } else {
	        m_log.info(String.format("Can't get commodity id: %s", sInstrumentid));
	    }
	    return p;
	}
	
}


