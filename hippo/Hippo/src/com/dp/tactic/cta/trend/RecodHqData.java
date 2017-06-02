

package com.dp.tactic.cta.trend;

import com.explosion.tactic.util.Portfolio;
import com.explosion.tactic.util.Tactic;
import com.explosion.trade.ctp.type.DPCThostFtdcDepthMarketDataField;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.apache.commons.lang.StringUtils;
import org.rosuda.JRI.REXP;
import org.rosuda.JRI.RVector;

import com.explosion.base.helper;
import com.explosion.quote.util.LastQuoteMap;
import com.explosion.tactic.cta.pairarb.util.TacticAttr;

public class RecodHqData extends Tactic{
	private String 					 m_sStrategyName;
	private String 					 m_sRfunc;
	private String					 m_sDataPath;
	private ConcurrentHashMap<String, DPCThostFtdcDepthMarketDataField> m_LastQuoteMap;
	private ConcurrentLinkedDeque<DPCThostFtdcDepthMarketDataField> m_LastQuoteQueue;
	private LastQuoteMap 			 m_cQuoteMap;
	private boolean 				 m_InitSuccess = false;
	
	
	public RecodHqData(ConcurrentLinkedQueue<Portfolio> q){
		
		m_sStrategyName 				= "RecodHqData";
		InitConfig();	
		InitFuture();
		
		m_tacticattr 		 			= new TacticAttr(m_sStrategyName);
		m_LastQuoteMap 					= new ConcurrentHashMap<String, DPCThostFtdcDepthMarketDataField>();
		m_LastQuoteQueue				= new ConcurrentLinkedDeque<DPCThostFtdcDepthMarketDataField>();
		
		m_InitSuccess 					= InitInstrMap();
		
		if(m_InitSuccess){
			StartQuoteMap();
		}
	}
	
	private void StartQuoteMap(){
		m_cQuoteMap 			= new LastQuoteMap(m_LastQuoteMap);
		m_cQuoteMap.SetQuoteQueue(m_LastQuoteQueue);
		Thread QuoteMapThread 	= new Thread(m_cQuoteMap);
		QuoteMapThread.start();
		QuoteMapThread.setName("QUOTEMAPTHREAD");
	}
	
	private boolean InitInstrMap(){
		String sCmd 				= String.format("%s()", m_sRfunc); 
		REXP value					= m_tacticattr.ExecRCmd(sCmd);
		
		if(value == null){
			m_log.info(String.format("R cmd '%s' got nothing return.", sCmd));
			return false;
		}else{
			RVector r 				= value.asVector();
			String[] ctpid  		= r.at("ctpid").asStringArray();
			m_SubCodes 				= StringUtils.join(ctpid, ",");
			for(String id : ctpid){
				String sFileName = String.format("%s%s%s", m_sDataPath, File.separator, id.toLowerCase());
				File f 			 = new File(sFileName);
				try {
					if(!f.exists()){
						f.createNewFile();
					}
				} catch (IOException e) {
					m_log.error(e.getMessage());
				}
			}
		}
		return true;
	}
	
	
	 
	@Override
	public void run(){
		if(!m_InitSuccess){
			Terminate();
		}
		
		while(m_Start){
			if(m_LastQuoteQueue.size() > 0 ){
				// record data
				DPCThostFtdcDepthMarketDataField e 	= m_LastQuoteQueue.poll();
				String sFileName 					= String.format("%s%s%s", m_sDataPath, File.separator, e.InstrumentID.toString());
				try {
					helper.writeFileContent(sFileName, e.toCSVString());
				} catch (IOException e1) {
					m_log.error(e1.getMessage());
				}
				m_log.warn(e);
			}
			try {
				sleep(INTERVAL);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				m_log.error(e1.toString());
			}
		}
		
		m_log.warn(String.format("%s Quit!", m_ProdInfo.getStrategyName()));
	}
	
	public void InitConfigFile(){
		m_sConfigFile					= String.format("%s%sconf%ss_%s.properties",System.getProperty("user.dir"), File.separator, File.separator, m_sStrategyName.toLowerCase());
		m_configProps 					= helper.loadConfig(m_sConfigFile);	
	}
	
	public void InitConfig(){
		InitConfigFile();
		m_sRfunc 						= m_configProps.getProperty("tactic.strategy.recodhqdata.rfunc");
		m_sDataPath						= m_configProps.getProperty("tactic.strategy.recodhqdata.tickdatapath");
		m_sDataPath						= String.format("%s%s%s", m_sDataPath, File.separator, helper.Today());
		SetPortInfo(m_configProps.getProperty("tactic.strategy.recodhqdata.portid"), 				m_sStrategyName);
		setInterVal(Integer.parseInt(m_configProps.getProperty("tactic.strategy.recodhqdata.interval")));
		File f = new File(m_sDataPath);
		f.mkdir();
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
	protected void InitTacticID(){
		
	}

	@Override
	protected void InitHolding() {
		// TODO Auto-generated method stub
		
	}

}
