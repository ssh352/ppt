package com.dp.tactic.cta.pairarb;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import net.jctp.JctpConstants;

import com.explosion.base.helper;
import com.explosion.tactic.util.Portfolio;
import com.explosion.tactic.util.ProdInfo;
import com.explosion.tactic.util.Tactic;
import com.explosion.trade.ctp.COMMODITYCONSTANT;
import com.explosion.trade.ctp.CTPInfo;
import com.explosion.trade.util.Entrust;

public class SReverse extends Tactic{
	private String 							m_sStrategyName;
	private List<String>					m_KeysList;
	private long 							m_StartUnixTime  = System.currentTimeMillis();
	private double							m_AppendSpread   = 0.0;
	private int								m_Multiple		 = 1;
	private String 							m_sQueryOrderSQL =  "select " 																	+
																"	instrumentid,limitprice,comboffsetflag,direction,volumetotaloriginal, " +
																"	volumetotal,volumetraded,ordertype,sessionid,frontid,orderref " 		+
																"from " 																	+
																"	dporder " 																+
																"where " 																	+
																"	userid 	= '%s' 	and " 													+
																"	(orderstatus = '0' or orderstatus = '5') and "							+
																"	unixtime >= '%s'";
			
	public SReverse(ConcurrentLinkedQueue<Portfolio> q){
		m_sStrategyName 				= "SReverse";
		m_KeysList						= new ArrayList<String>();
		m_sConfigFile					= String.format("%s%sconf%ss_%s.properties",System.getProperty("user.dir"), File.separator, File.separator, m_sStrategyName.toLowerCase());
		m_configProps 					= helper.loadConfig(m_sConfigFile);
		m_ArithTradeLastOrderQueue 		= q;	
		SetPortInfo("CS9Z01", 				"SReverse");
		SetShadowPortInfo("CS9Z01Shadow", 	"ShadowSReverse");
		  
		InitConfig();
		InitFuture();
		InitShadowFuture();
		ConnectDB();
	}
	
	@Override
	public void SetPortInfo(String PortName, String StrategyName){
		m_ProdInfo 					= new ProdInfo();
		m_ProdInfo.setProdName(PortName);
		m_ProdInfo.setStrategyName(StrategyName);
	}
	
	
	public void InitConfig(){
		String sStrategy 			= m_ProdInfo.getStrategyName().toLowerCase();
		
		setInterVal(Integer.parseInt(m_configProps.getProperty(String.format("tactic.strategy.%s.interval", 			sStrategy))));
		m_AppendSpread 	= Double.parseDouble(m_configProps.getProperty(String.format("tactic.strategy.%s.appendspread", sStrategy)));
		m_Multiple		= Integer.parseInt(m_configProps.getProperty(String.format("tactic.strategy.%s.multiple", 		sStrategy)));
	}
	
	public boolean InitShadowFuture(){
		String sStrategy 	= m_ShadowProdInfo.getStrategyName();
		sStrategy			= sStrategy.toLowerCase(); 
		m_shadowctpinfo = new CTPInfo();
		m_shadowctpinfo.setStraderFrontUrl(m_configProps.getProperty(String.format("tactic.strategy.%s.traderfronturl", sStrategy)));
		m_shadowctpinfo.setSbrokerId(m_configProps.getProperty(String.format("tactic.strategy.%s.brokerid", 			sStrategy)));
		m_shadowctpinfo.setSuserId(m_configProps.getProperty(String.format("tactic.strategy.%s.userid", 				sStrategy)));
		m_shadowctpinfo.setSinvestorId(m_configProps.getProperty(String.format("tactic.strategy.%s.userid", 			sStrategy)));
		m_shadowctpinfo.setSpassword(m_configProps.getProperty(String.format("tactic.strategy.%s.password", 			sStrategy)));
		return true;
	}
	
	private void SetShadowPortInfo(String PortName, String StrategyName){

		m_ShadowProdInfo 			= new ProdInfo();
		m_ShadowProdInfo.setProdName(PortName);
		m_ShadowProdInfo.setStrategyName(StrategyName);
		
		tmpPort.m_PortInfo 			= m_ShadowProdInfo;
	}


	private String generateKey(String orderref, String sessionid, String frontid){
		return String.format("%s-%s-%s", orderref, sessionid, frontid);
	}
	

	private void generateOrder(JSONObject jsonOrder){
		tmpPort.m_ListFuture.clear();
		tmpPort.m_ListSecurity.clear();
		tmpPort.m_PortInfo			= m_ShadowProdInfo;
		tmpPort.m_TacticID 			= m_TacticID;
		
		String sInstrumentid		= jsonOrder.getString("instrumentid");
		String sComboffsetflag		= jsonOrder.getString("comboffsetflag");
		String SDirection			= jsonOrder.getString("direction");
		double Price 				= jsonOrder.getDoubleValue("limitprice");
		
		
		int nTradedVol				= jsonOrder.getIntValue("volumetraded");
		char   BS 					= SDirection.equals("0") ? '1':'0';
		double EntrustPrice			= calcPrice(BS, sInstrumentid, Price, m_AppendSpread);
		Entrust e					= new Entrust(sInstrumentid, EntrustPrice, sComboffsetflag, BS, m_Multiple*nTradedVol);
		e.m_PortInfo 				= m_ProdInfo;
		e.m_remark					= "SReverse Shadow Order";
		tmpPort.m_ListFuture.add(e);
		tmpPort.m_FutureFirst 		= true;
	}
	
	@Override
	public void run(){
		while(m_Start){
			JSONArray arrEntrust = m_DB.Query(String.format(m_sQueryOrderSQL, 
															m_ctpinfo.getSuserId(), 
															m_StartUnixTime));
			for(int i=0; i<arrEntrust.size(); i++){
				JSONObject jsonOrder 		= arrEntrust.getJSONObject(i);
				String sOrderref 			= jsonOrder.getString("orderref");
				String sSessionid 			= jsonOrder.getString("sessionid");
				String sFrontid 			= jsonOrder.getString("frontid");
				String sKey 				= generateKey(sOrderref, sSessionid, sFrontid);
				int nTradedVol				= jsonOrder.getIntValue("volumetraded");
				
				if(!m_KeysList.contains(sKey)){
					if(nTradedVol > 0){
						generateOrder(jsonOrder);
						m_ArithTradeLastOrderQueue.add(tmpPort);
					}
					m_KeysList.add(sKey);
				}
			}
			
			try {
				sleep(INTERVAL);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				m_log.error(e1.toString());
			}
		}
	}

	@Override
	public int CalcSignal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean PrepareData() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean InitSecurity() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean CheckPort() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void GeneratePortfolio(String direction, String remark) {
		// TODO Auto-generated method stub
	}

	@Override
	protected void InitHolding() {
		// TODO Auto-generated method stub
	}
}
