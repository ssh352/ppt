package com.dp.quant;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.dp.hq.HqModule;
import com.dp.rms.RiskModule;
import com.dp.rms.util.RiskConst;
import com.dp.rms.util.RiskRule;
import com.dp.trade.ems.EMSModule;
import com.dp.trade.oms.OMSModule;
import com.explosion.base.helper;
import com.explosion.tactic.util.Portfolio;
import com.explosion.tactic.util.Tactic;
import com.explosion.trade.ctp.quote.MarketDataServer;

public class DpQuant {
	private String 				sConfigfile;
	private Properties 			configProps;
	public 	EMSModule 			EmsModule;
	private ArrayList<Tactic> 	ListTactic;
	private Logger 	  			m_log;
	private MarketDataServer 	RealTimeDataServer;
	private OMSModule 			OmsModule;
	private RiskModule 			riskmodule;
	
	public DpQuant(){
		m_log				= Logger.getLogger(DpQuant.class);
		String sPath 		= System.getProperty("java.library.path");
		for(String path : sPath.split(";")){
			m_log.info(String.format("java.library.path: %s", path));
		} 
		
		sConfigfile 		= System.getProperty("user.dir") + File.separator + "conf" + File.separator + "config.properties";		
		configProps 		= helper.loadConfig(sConfigfile);
		
		// 初始化 CTP行情服务器
		RealTimeDataServer = new MarketDataServer();
		
		// 初始化 OMS		
		OmsModule = new OMSModule();
		OmsModule.StartCtpListen();
		Thread OmsModuleThread = new Thread(OmsModule);
		OmsModuleThread.start();
		OmsModuleThread.setName("OMSMODULETHREAD");		

		// 初始化EMS
		EmsModule 			= new EMSModule();
		ListTactic			= new ArrayList<Tactic>();
		this.EmsModule.ArithTradeLastOrderQueue = new ConcurrentLinkedQueue<Portfolio>();
		StartEMS();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		StartStrategies();
		
		
		// 初始化RiskModule
		RiskModule riskmodule = new RiskModule();
		InitRiskModule(riskmodule);
		this.SetRiskModule(riskmodule);
	}

	@SuppressWarnings("rawtypes")
	public void StartStrategies(){
		
		String sStrategy 	 = configProps.getProperty("tactic.strategy");
		String[] StrategyArr = sStrategy.split(",");
		
		for(String s : StrategyArr){
			if(s.equals("")){
				break;
			}
			m_log.info("##########################" + s + " start" + "##########################");
			// 启动策略
			try {
				Class<?> T 						= Class.forName(s);
				Constructor constructor 		= T.getConstructor(ConcurrentLinkedQueue.class);
				constructor.setAccessible(true);
				Tactic t 						=  (Tactic) constructor.newInstance(this.EmsModule.ArithTradeLastOrderQueue);
				t.Start();				
				ListTactic.add(t);
				
				if(!t.m_SubCodes.equals("")){
					RealTimeDataServer.startSub(t.m_SubCodes);
				}
				
				if(s.equals("com.dp.tactic.SReverse")){
					EMSModule.RegisterFutureInfo(t.m_ProdInfo.getProdName(), 		t.m_ctpinfo);
					EMSModule.RegisterFutureInfo(t.m_ShadowProdInfo.getProdName(),  t.m_shadowctpinfo);
				}else{
					EMSModule.RegisterFutureInfo(t.m_ProdInfo.getProdName(), 		t.m_ctpinfo);		// 20160823 modify by xujun, map's key changes to product's name
				}
				Thread TThread = new Thread(t);
				TThread.start();
				TThread.setName(String.format("%sTHREAD", s));	
			} catch (ClassNotFoundException | SecurityException | InstantiationException | 
					IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException e) {
				// TODO Auto-generated catch block
				m_log.error(e.getMessage());
				e.printStackTrace();
			}
			m_log.info("############################################################################");
		}
	}
	
	private void StartEMS(){
		// 启动EMSModule线程
		Thread EmsModuleThread = new Thread(EmsModule);
		EmsModuleThread.start();
		EmsModuleThread.setName("EMSMODULETHREAD");
	}
	
	
	public void SetRiskModule(RiskModule r){
		EmsModule.SetRiskMamage(r);
	}
	
	public void AddTactic(Tactic t){
		ListTactic.add(t);
	}
	
	public void SetArithTradeLastOrderQueue(ConcurrentLinkedQueue<Portfolio> q){
		this.EmsModule.ArithTradeLastOrderQueue = q;
	}
	
	public static void InitRiskModule(RiskModule riskmodule){
		// 设置期货开仓十手限制
		RiskRule r = new RiskRule();
		r.RiskType = RiskConst.RISKTYPE_FUTUREOPENLIMIT;
		r.LimitValue = 10;
		r.RuleID = 1;
		riskmodule.AddRiskRule(r);
	}
	
	static {  
        PropertyConfigurator.configure(System.getProperty("user.dir") + File.separator + "conf" + File.separator  
                + "log4j.properties");  
    }  
	
	public static void main(String[] args){
		// 初始化HQ
//		HqModule hqmodule = new HqModule();
//		hqmodule.ConnectHHsoft();
		
//		Thread HqModuleThread = new Thread(hqmodule);
//		HqModuleThread.start();
//		HqModuleThread.setName("HqModuleThread");
		

		DpQuant Quant = new DpQuant();

		try {
			Thread.currentThread().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
