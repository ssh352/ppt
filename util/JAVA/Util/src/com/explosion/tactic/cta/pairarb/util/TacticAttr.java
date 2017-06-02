package com.explosion.tactic.cta.pairarb.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Vector;

import org.apache.log4j.Logger;
import org.rosuda.JRI.REXP;
import org.rosuda.JRI.RVector;
import org.rosuda.JRI.Rengine;

import com.explosion.base.helper;
import com.explosion.quote.util.PairQuote;
import com.explosion.tactic.util.TextConsole;

public class TacticAttr extends Thread{
	
	private   	String 			m_sConfigFile;
	protected 	Properties 		m_configProps 			= new Properties();
	protected 	Rengine 		m_Rengine;
	protected 	Logger 			m_log;	
	
	private 	String 			m_sSingalCalcMethod 	= "Ration";
	private		String 			m_Leg1Exchange     	 	= "";
	private		String 			m_Leg2Exchange     	 	= "";
	private 	String  		m_sLeg1;
	private 	String  		m_sLeg1ID;
	private  	String  		m_sLeg2;
	private 	String  		m_sLeg2ID;
	private	  	String 			m_sRROOT;
	private	  	String 			m_sSingalFile;
	
	private 	int 			m_windows				= 100;
	private 	int    			INTERVAL 				= 1000;	
	private		int				m_numLeg1				= 1;
	private		int				m_numLeg2				= 1;
	
	protected 	String 			m_sMeanSdCalcFunc;
	
	public		double 			m_Miu 		   		 	= 0;
	public		double 			m_Sd 		   			= 0;

	public 		PairQuote		m_PairQuote;
	
	public TacticAttr(String sStrategy){
		m_log 						= Logger.getLogger(TacticAttr.class);
		sStrategy					= sStrategy.toLowerCase();
		m_sConfigFile				= String.format("%s%sconf%ss_%s.properties",System.getProperty("user.dir"), File.separator, File.separator, sStrategy);
		m_configProps 				= helper.loadConfig(m_sConfigFile);
		if(m_configProps.containsKey(String.format("tactic.strategy.%s.meansdcalcfunc", sStrategy))){
			m_sMeanSdCalcFunc			= m_configProps.getProperty(String.format("tactic.strategy.%s.meansdcalcfunc", sStrategy));
			m_sLeg1						= m_configProps.getProperty(String.format("tactic.strategy.%s.leg1", sStrategy));
			m_sLeg2						= m_configProps.getProperty(String.format("tactic.strategy.%s.leg2", sStrategy));
			m_Leg1Exchange				= m_configProps.getProperty(String.format("tactic.strategy.%s.leg1.exchange", sStrategy));
			m_Leg2Exchange				= m_configProps.getProperty(String.format("tactic.strategy.%s.leg2.exchange", sStrategy));
			m_sSingalCalcMethod			= m_configProps.getProperty(String.format("tactic.strategy.%s.singalfuncmethod", sStrategy));
			m_windows					= Integer.parseInt(m_configProps.getProperty(String.format("tactic.strategy.%s.windows", sStrategy)));
			INTERVAL					= Integer.parseInt(m_configProps.getProperty(String.format("tactic.strategy.%s.tacticattr.interval", sStrategy)));
			m_numLeg1					= Integer.parseInt(m_configProps.getProperty(String.format("tactic.strategy.%s.leg1.num", 			sStrategy)));
			m_numLeg2					= Integer.parseInt(m_configProps.getProperty(String.format("tactic.strategy.%s.leg2.num", 			sStrategy)));
			m_sLeg1ID					= sStrategy.split("2")[0];
			m_sLeg2ID					= sStrategy.split("2")[1];
			m_log.info("Pair arbitrage R script init.");
			
			StartQuote();
		}else{
			m_log.info("None pair arbitrage R script init.");
		}
		setsRROOT(m_configProps.getProperty(String.format("tactic.strategy.%s.rroot", sStrategy)));
		setsSingalFile(m_configProps.getProperty(String.format("tactic.strategy.%s.rsingalfile", sStrategy)));
		StartREngine(Boolean.parseBoolean(m_configProps.getProperty(String.format("tactic.strategy.%s.routput", sStrategy))));
	}
	
	private void StartQuote(){
		m_PairQuote = new PairQuote(m_sLeg1, m_sLeg2);
		Thread TacticQuoteThread = new Thread(m_PairQuote);
		TacticQuoteThread.start();
		TacticQuoteThread.setName("TACTICQUOTETHREAD");
	}
	
	@Override
	public void run(){
		while(true){
			getMiuSD();
			try {
				sleep(INTERVAL);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				m_log.error(e1.getMessage());
		
			}
		}
	}

	private void getMiuSD(){
		REXP value 	= m_Rengine.eval(String.format("%s('%s.%s', '%s.%s', '%s', '%s', %s, '%s', %s, %s)", 
									m_sMeanSdCalcFunc, 
									m_sLeg1, m_Leg1Exchange, 
									m_sLeg2, m_Leg2Exchange, 
									m_sLeg1ID.toUpperCase(), m_sLeg2ID.toUpperCase(),
									m_windows, m_sSingalCalcMethod, m_numLeg1, m_numLeg2));
	
		if(value == null){
			return;
		}else{
	    	RVector r 	= value.asVector();
	    	m_Miu  		= r.at("Miu").asDouble();
	        m_Sd 		= r.at("sd").asDouble();
		}
	}
	
	public REXP ExecRCmd(String sCmd){
		REXP value = m_Rengine.eval(sCmd);
		return value;
	}
	
	public void StartREngine(Boolean WithConsole){
		m_Rengine = Rengine.getMainEngine();
		
		if(m_Rengine == null){
			if(WithConsole){
				m_Rengine = new Rengine(new String[] { "--vanilla" }, false, new TextConsole());
			}else{
				m_Rengine = new Rengine(new String[] { "--vanilla" }, false, null);
			}
		}
		
        if (!m_Rengine.waitForR()) {
            m_log.error("Cannot load R");
        }
        
        m_Rengine.eval(String.format("setwd('%s')",  getsRROOT()));        m_Rengine.eval(String.format("source('%s')", getsSingalFile()));
	}
	
	public String getsRROOT() {
		return m_sRROOT;
	}
	
	public void setsRROOT(String sRROOT) {
		this.m_sRROOT = sRROOT;
	}
	
	public String getsSingalFile() {
		return m_sSingalFile;
	}
	
	public void setsSingalFile(String sSingalFile) {
		this.m_sSingalFile = sSingalFile;
	}
}

