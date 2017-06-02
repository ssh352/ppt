package com.explosion.tactic.cta.pairarb.util;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.jctp.JctpConstants;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.explosion.base.helper;
import com.explosion.tactic.util.Portfolio;
import com.explosion.tactic.util.Tactic;
import com.explosion.trade.util.Entrust;


interface Command {
    double calcSignal(double Leg1Px, double Leg2Px);
}

public abstract class PairArbTactic extends Tactic{
	public  String 		FORCE_STOP				= "Force Stop";
	public 	double 		m_NSigmaOPEN			= 1;
	public 	double 		m_NSigmaAppend			= 1;
	public 	double 		m_NSigmaCLOSE			= 0;
	public 	double  	m_Leg1Spread 	     	= 0; 		// 优化价格偏差点
	public	double  	m_Leg2Spread 	   	 	= 0;
	public	double  	m_Leg1AppendSpread 	 	= 0;		// 补单追加价格
	public	double  	m_Leg2AppendSpread 	 	= 0;
	

	public 	double 		upSignal 				= 0;
	public 	double 		downSignal 				= 0;
	public 	double		m_SdLimit				= 0;
	
	public 	String  	m_sLeg1;
	public  String  	m_sLeg2;
	public	String 		m_Leg1Exchange     	 		= "";
	public	String 		m_Leg2Exchange     	 		= "";	
	public 	String 		m_sAMStopTradinigTime		= "11:28";
	public 	String 		m_sPMStopTradinigTime		= "14:58";
	public 	String 		m_sNightStopTradinigTime 	= "02:28";
	public 	String 		m_sSuspendStartTime			= "10:14";
	public 	String 		m_sSuspendEndTime			= "10:31";
	
	public 	String 		m_sSingalCalcMethod 		= "TimesDiff";
	public 	int 		m_sAMStopTradinigHour 		= 11;
	public 	int 		m_sPMStopTradinigHour 		= 14;
	public 	int 		m_sNightStopTradinigHour 	= 2;
	
	public 	Boolean		m_DailyTrading		 		= true;			// 默认日内交易,尾盘强平
	public  Boolean 	m_UseBidAskPrice	 		= true;			// 默认对手价计算信号
	
	public 	int 		m_numLeg1			 	= 0;
	public 	int 		m_numLeg2			 	= 0;
	public 	int  		m_Leg1Times				= 0;
	public 	int  		m_Leg2Times				= 0;
	public 	int			m_TradeMultiple			= 1;	
	public 	int    		m_SdLimitINTERVAL 		= 1000;
	public 	Long 		m_posUnixTimeStart		= (long) 0;			 // 默认获取当天持仓数据
	
	protected Map<String, Command>				m_SignalFuncMap;
	
	
	public void InitConfig(){
		String sStrategy 			= m_ProdInfo.getStrategyName();
		sStrategy					= sStrategy.toLowerCase();
		
		m_sLeg1						= m_configProps.getProperty(String.format("tactic.strategy.%s.leg1", 					sStrategy));
		m_sLeg2						= m_configProps.getProperty(String.format("tactic.strategy.%s.leg2", 					sStrategy));
		m_Leg1Exchange				= m_configProps.getProperty(String.format("tactic.strategy.%s.leg1.exchange", 			sStrategy));
		m_Leg2Exchange				= m_configProps.getProperty(String.format("tactic.strategy.%s.leg2.exchange", 			sStrategy));
		m_sSingalCalcMethod			= m_configProps.getProperty(String.format("tactic.strategy.%s.singalfuncmethod", 		sStrategy));
		
		m_sAMStopTradinigTime		= m_configProps.getProperty(String.format("tactic.strategy.%s.am.stoptradingtime", 		sStrategy));
		m_sPMStopTradinigTime		= m_configProps.getProperty(String.format("tactic.strategy.%s.pm.stoptradingtime", 		sStrategy));
		m_sNightStopTradinigTime	= m_configProps.getProperty(String.format("tactic.strategy.%s.night.stoptradingtime", 	sStrategy));
		m_sSuspendStartTime			= m_configProps.getProperty(String.format("tactic.strategy.%s.suspendstarttime", 		sStrategy));
		m_sSuspendEndTime			= m_configProps.getProperty(String.format("tactic.strategy.%s.suspendendtime", 			sStrategy));
		
		m_sAMStopTradinigHour		= Integer.parseInt(m_configProps.getProperty(String.format("tactic.strategy.%s.am.stoptradinghour", 		sStrategy)));
		m_sPMStopTradinigHour		= Integer.parseInt(m_configProps.getProperty(String.format("tactic.strategy.%s.pm.stoptradinghour", 		sStrategy)));
		m_sNightStopTradinigHour	= Integer.parseInt(m_configProps.getProperty(String.format("tactic.strategy.%s.night.stoptradinghour", 		sStrategy)));
				
		
		m_NSigmaOPEN				= Double.parseDouble(m_configProps.getProperty(String.format("tactic.strategy.%s.nsigmaopen", 			sStrategy)));
		m_NSigmaAppend				= Double.parseDouble(m_configProps.getProperty(String.format("tactic.strategy.%s.nsigmaappend", 		sStrategy)));
		m_NSigmaCLOSE				= Double.parseDouble(m_configProps.getProperty(String.format("tactic.strategy.%s.nsigmaclose", 			sStrategy)));
		m_SdLimit					= Double.parseDouble(m_configProps.getProperty(String.format("tactic.strategy.%s.sdlimit", 				sStrategy)));
		m_Leg1Spread  				= Double.parseDouble(m_configProps.getProperty(String.format("tactic.strategy.%s.leg1.opt.points", 		sStrategy)));
		m_Leg2Spread  				= Double.parseDouble(m_configProps.getProperty(String.format("tactic.strategy.%s.leg2.opt.points", 		sStrategy)));
		m_Leg1AppendSpread			= Double.parseDouble(m_configProps.getProperty(String.format("tactic.strategy.%s.leg1.appendspread", 	sStrategy)));
		m_Leg2AppendSpread			= Double.parseDouble(m_configProps.getProperty(String.format("tactic.strategy.%s.leg2.appendspread", 	sStrategy)));
		
		m_DailyTrading				= Boolean.parseBoolean(m_configProps.getProperty(String.format("tactic.strategy.%s.dailytrading", 		sStrategy)));
		m_UseBidAskPrice			= Boolean.parseBoolean(m_configProps.getProperty(String.format("tactic.strategy.%s.bidaskprice", 		sStrategy)));
		
		INTERVALCHECKPORT 			= Integer.parseInt(m_configProps.getProperty(String.format("tactic.strategy.%s.intervalcheckport", 	sStrategy)));
		m_numLeg1					= Integer.parseInt(m_configProps.getProperty(String.format("tactic.strategy.%s.leg1.num", 			sStrategy)));
		m_numLeg2					= Integer.parseInt(m_configProps.getProperty(String.format("tactic.strategy.%s.leg2.num", 			sStrategy)));
		m_Leg1Times					= Integer.parseInt(m_configProps.getProperty(String.format("tactic.strategy.%s.leg1.times", 		sStrategy)));
		m_Leg2Times					= Integer.parseInt(m_configProps.getProperty(String.format("tactic.strategy.%s.leg2.times", 		sStrategy)));
		m_TradeMultiple				= Integer.parseInt(m_configProps.getProperty(String.format("tactic.strategy.%s.trade.multiple", 	sStrategy)));
		
		m_HoldingLimit				= Integer.parseInt(m_configProps.getProperty(String.format("tactic.strategy.%s.holdinglimit", 		sStrategy)));
		m_SdLimitINTERVAL			= Integer.parseInt(m_configProps.getProperty(String.format("tactic.strategy.%s.sdlimit.interval", 	sStrategy)));
		m_posUnixTimeStart			= Long.parseLong(m_configProps.getProperty(String.format("tactic.strategy.%s.posunixtimestart", 	sStrategy)));
		setInterVal(Integer.parseInt(m_configProps.getProperty(String.format("tactic.strategy.%s.interval", 							sStrategy))));
		
		SetCalcSignalFunc();
		
	}
	
	private void SetCalcSignalFunc(){
		m_SignalFuncMap		= new HashMap<>();

		m_SignalFuncMap.put("DIFF", 	new Command(){  
				public double calcSignal(double Leg1Px, double Leg2Px) { return Leg1Px - Leg2Px; }
		});
		
		m_SignalFuncMap.put("Ration", 	new Command(){
				public double calcSignal(double Leg1Px, double Leg2Px){return Leg1Px / Leg2Px;}
		});
	
		m_SignalFuncMap.put("TimesDiff", 	new Command(){
			public double calcSignal(double Leg1Px, double Leg2Px){return Leg1Px*m_Leg1Times*m_numLeg1 - Leg2Px*m_Leg2Times*m_numLeg2;}
		});
	}
	
	public PairArbTactic(ConcurrentLinkedQueue<Portfolio> q, String ProdName, String StrategyName){
		
		m_sConfigFile		= String.format("%s%sconf%ss_%s.properties",System.getProperty("user.dir"), File.separator, File.separator, StrategyName.toLowerCase());
		m_configProps 		= helper.loadConfig(m_sConfigFile);
		m_ArithTradeLastOrderQueue 	= q;
		
		SetPortInfo(ProdName, StrategyName);
		InitConfig();
		InitFuture();
		ConnectDB();
		InitHolding();
        InitTacticID();
        m_tacticattr 		 = new	TacticAttr(StrategyName);
        startTacticAttr();
        
        m_log.info(String.format("strategy: %s, Init Parameter: Holding: %d, TacticID: %s", StrategyName, m_IsHold, m_TacticID));
	}
	
	public int OpenLong(String sRemark){
    	GeneratePortfolio("OPEN-BUY", 	String.format("OPEN LONG LEG1 %s", sRemark)); 		//  open: long leg1 short leg2
    	m_sEntrustType 	= "OPEN-BUY";
    	return	1;
	}
	
	public int OpenShort(String sRemark){
    	GeneratePortfolio("OPEN-SELL", 	String.format("OPEN SHORT LEG1 %s", sRemark));		//  open: short leg1 long leg2
    	m_sEntrustType 	= "OPEN-SELL";
    	return	1;
	}

	public int CloseLong(String sRemark){
		GeneratePortfolio("CLOSE-BUY", 	String.format("CLOSE LONG LEG1 %s", sRemark));		//  close: long leg1 short leg2
		m_sEntrustType 	= "CLOSE-BUY";
    	return	2;
	}
	
	public int CloseShort(String sRemark){
		GeneratePortfolio("CLOSE-SELL", String.format("CLOSE SHORT LEG1 %s", sRemark));		//  close: short leg1 long leg2
		m_sEntrustType 	= "CLOSE-SELL";
    	return	2;
	}
	
	private Boolean IsSuspendTime(){
		return (helper.TimeCompare(helper.GetTimeMin(), m_sSuspendStartTime) && 
			   !helper.TimeCompare(helper.GetTimeMin(), m_sSuspendEndTime));
	}

	private Boolean IsForceCloseTime(){
		return helper.GetHourOfDay() == m_sPMStopTradinigHour && helper.TimeCompare(helper.GetTimeMin(), m_sPMStopTradinigTime);
	}
	
	private Boolean IsNoneTradeTime(){
		return (helper.GetHourOfDay() == m_sAMStopTradinigHour && helper.TimeCompare(helper.GetTimeMin(), m_sAMStopTradinigTime)) ||
			   (helper.GetHourOfDay() == m_sPMStopTradinigHour && helper.TimeCompare(helper.GetTimeMin(), m_sPMStopTradinigTime)) ||
			   (helper.GetHourOfDay() == m_sNightStopTradinigHour && helper.TimeCompare(helper.GetTimeMin(), m_sNightStopTradinigTime));
	}
	
	@Override
	public int CalcSignal() {
		// TODO Auto-generated method stub
		int offSetFlag 			= 0;
		double m_Miu 			= m_tacticattr.m_Miu;
		double m_Sd 			= m_tacticattr.m_Sd;
		
        // 行情数据未准备就绪直接返回，若到非交易时间则停止程序
        if(!(m_tacticattr.m_PairQuote.m_Leg1Price > 0 && m_tacticattr.m_PairQuote.m_Leg2Price > 0) || 
        	(m_Miu == 0 && m_Sd == 0)){
			if(IsNoneTradeTime()){
	            // 控制交易时间
	        	Terminate();
	        }
        	return offSetFlag;
        }
		
		double upOpenLine 		= m_Miu + (m_NSigmaOPEN + Math.abs(m_IsHold)*m_NSigmaAppend)*m_Sd;
        double downOpenLine 	= m_Miu - (m_NSigmaOPEN + Math.abs(m_IsHold)*m_NSigmaAppend)*m_Sd;
        double upCloseLine		= m_Miu + m_NSigmaCLOSE*m_Sd;
        double downCloseLine	= m_Miu - m_NSigmaCLOSE*m_Sd;

        if(m_UseBidAskPrice){
			upSignal 	= m_SignalFuncMap.get(m_sSingalCalcMethod).calcSignal(m_tacticattr.m_PairQuote.m_Leg1RT_BID1, m_tacticattr.m_PairQuote.m_Leg2RT_ASK1);	// ShortLeg1Signal
			downSignal	= m_SignalFuncMap.get(m_sSingalCalcMethod).calcSignal(m_tacticattr.m_PairQuote.m_Leg1RT_ASK1, m_tacticattr.m_PairQuote.m_Leg2RT_BID1);	// LongLeg1Signal
        }else{
			upSignal 	= m_SignalFuncMap.get(m_sSingalCalcMethod).calcSignal(m_tacticattr.m_PairQuote.m_Leg1Price, m_tacticattr.m_PairQuote.m_Leg2Price);		// ShortLeg1Signal
			upSignal 	= m_SignalFuncMap.get(m_sSingalCalcMethod).calcSignal(m_tacticattr.m_PairQuote.m_Leg1Price, m_tacticattr.m_PairQuote.m_Leg2Price);		// LongLeg1Signal
        }   
        String sRemark = String.format("holding: %d, miu: %f, sd: %f, upLimit: %f, donwLimit: %f, upSignal: %f, downSignal: %f, InStr1Price: %f, InStr2Price: %f, InStr1BID1: %f, InStr1ASK1: %f, InStr2BID1: %f, InStr2ASK1: %f", 
        							m_IsHold, m_Miu, m_Sd, upOpenLine, downOpenLine, upSignal, downSignal, m_tacticattr.m_PairQuote.m_Leg1Price, m_tacticattr.m_PairQuote.m_Leg2Price,  
        							m_tacticattr.m_PairQuote.m_Leg1RT_BID1, m_tacticattr.m_PairQuote.m_Leg1RT_ASK1, m_tacticattr.m_PairQuote.m_Leg2RT_BID1, m_tacticattr.m_PairQuote.m_Leg2RT_ASK1);
       
		
        // 交易时间控制
        if(!IsNoneTradeTime() && !IsSuspendTime()){
        	if((m_SdLimit != 0 && m_Sd > m_SdLimit)){
        		if(Math.abs(m_IsHold) < m_HoldingLimit){
		        	if( upSignal > upOpenLine){
		            	offSetFlag		= OpenShort(sRemark);
		            }
		        	else if( downSignal < downOpenLine){
		        		offSetFlag 		= OpenLong(sRemark);
		            }
        		}
	        }
        	else{
	        	m_log.info(String.format("Strategy: %s, TimeStamp: %s: Sd is less then Sd Limit, Not allow open. now sd: %f, Limit sd: %f", m_ProdInfo.getStrategyName(), helper.Unixtime(), m_Sd, m_SdLimit));
				try {
					Thread.sleep(m_SdLimitINTERVAL);
				} catch (InterruptedException e) {
					m_log.info(e.getMessage());
				}
	        }
        	
	       
	       	if(m_IsHold <= -1){
	        	if(downSignal < upCloseLine){
	        		offSetFlag 		= CloseLong(sRemark);
	            }        	
	        }
	       	if(m_IsHold >= 1){
	        	if(upSignal > downCloseLine){
	            	offSetFlag 		= CloseShort(sRemark);
	            }
	        }
        }
       
        if(offSetFlag == 0 && m_DailyTrading && m_IsHold != 0 && IsForceCloseTime()){
        	// 强平
    		if(m_IsHold <= -1){
    			offSetFlag 		= CloseLong(String.format("Time Force Stop %s", sRemark));
    		}else if(m_IsHold >= 1){
    			offSetFlag 		= CloseShort(String.format("Time Force Stop %s", sRemark));
    		}
    		Terminate();
        }
        else if(IsNoneTradeTime()){
            // 控制交易时间
        	Terminate();
        	offSetFlag = 0;
        }
        
        if(System.currentTimeMillis() % 1000 == 0){
        	m_log.info(String.format("timestamp: %s, strategy: %s, info: %s", System.currentTimeMillis(), m_ProdInfo.getStrategyName(), sRemark));
        }
        return offSetFlag;
	}


	@Override
	public void GeneratePortfolio(String direction, String remark) {
		// TODO Auto-generated method stub
		if(direction.contains("OPEN")){
			m_TacticID = helper.GenerateGuid();
			m_TacticQueue.add(m_TacticID);
		}else{
			m_TacticID = m_TacticQueue.poll(); 
		}
		
		tmpPort.m_ListFuture.clear();
		tmpPort.m_ListSecurity.clear();
		tmpPort.m_PortInfo		= m_ProdInfo;
		tmpPort.m_TacticID 		= m_TacticID;
		
		
		// Force Stop 
		int numLeg1 = m_numLeg1*m_TradeMultiple;
		int numLeg2 = m_numLeg2*m_TradeMultiple;
		if(remark.contains(FORCE_STOP)){
			numLeg1 = m_numLeg1*m_TradeMultiple*Math.abs(m_IsHold);
			numLeg2 = m_numLeg2*m_TradeMultiple*Math.abs(m_IsHold);
		}
		
		if(direction.equals("OPEN-SELL")){
			Entrust e1 = null;
			Entrust e2 = null;
			if(m_UseBidAskPrice){
				e1 			= new Entrust(m_sLeg2, m_tacticattr.m_PairQuote.m_Leg2RT_ASK1 - m_Leg2Spread, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Buy, m_numLeg2*m_TradeMultiple);
				e2 			= new Entrust(m_sLeg1, m_tacticattr.m_PairQuote.m_Leg1RT_BID1 + m_Leg1Spread, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Sell, m_numLeg1*m_TradeMultiple);
			}else{
				e1 			= new Entrust(m_sLeg2, m_tacticattr.m_PairQuote.m_Leg2Price - m_Leg2Spread, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Buy, m_numLeg2*m_TradeMultiple);
				e2 			= new Entrust(m_sLeg1, m_tacticattr.m_PairQuote.m_Leg1Price + m_Leg1Spread, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Sell, m_numLeg1*m_TradeMultiple);
			}
			e1.m_PortInfo 		= m_ProdInfo;
			e1.m_remark			= remark;
			tmpPort.m_ListFuture.add(e1);
			
			e2.m_PortInfo 		= m_ProdInfo;
			e2.m_remark			= remark;
			tmpPort.m_ListFuture.add(e2);
		}
		else if(direction.equals("OPEN-BUY")){
			Entrust e1			= null;
			Entrust e2			= null;
			if(m_UseBidAskPrice){
				e1 			= new Entrust(m_sLeg1, m_tacticattr.m_PairQuote.m_Leg1RT_ASK1 - m_Leg1Spread, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Buy, m_numLeg1*m_TradeMultiple);
				e2 			= new Entrust(m_sLeg2, m_tacticattr.m_PairQuote.m_Leg2RT_BID1 + m_Leg2Spread, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Sell, m_numLeg2*m_TradeMultiple);
			}else{
				e1 			= new Entrust(m_sLeg1, m_tacticattr.m_PairQuote.m_Leg1Price - m_Leg1Spread, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Buy, m_numLeg1*m_TradeMultiple);
				e2 			= new Entrust(m_sLeg2, m_tacticattr.m_PairQuote.m_Leg2Price + m_Leg2Spread, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Sell, m_numLeg2*m_TradeMultiple);
			}
			e1.m_PortInfo 		= m_ProdInfo;
			e1.m_remark			= remark;
			tmpPort.m_ListFuture.add(e1);
			
			e2.m_PortInfo 		= m_ProdInfo;
			e2.m_remark			= remark;
			tmpPort.m_ListFuture.add(e2);
		}
		else if(direction.equals("CLOSE-BUY")){
			Entrust e1 		= null;
			Entrust e2 		= null;
			if(m_UseBidAskPrice){
				e1 			= new Entrust(m_sLeg1, m_tacticattr.m_PairQuote.m_Leg1RT_ASK1 - m_Leg1Spread, JctpConstants.STRING_THOST_FTDC_OF_CloseToday, JctpConstants.THOST_FTDC_D_Buy, numLeg1);
				e2 			= new Entrust(m_sLeg2, m_tacticattr.m_PairQuote.m_Leg2RT_BID1 + m_Leg2Spread, JctpConstants.STRING_THOST_FTDC_OF_CloseToday, JctpConstants.THOST_FTDC_D_Sell, numLeg2);
			}else{
				e1 			= new Entrust(m_sLeg1, m_tacticattr.m_PairQuote.m_Leg1Price - m_Leg1Spread, JctpConstants.STRING_THOST_FTDC_OF_CloseToday, JctpConstants.THOST_FTDC_D_Buy, numLeg1);
				e2 			= new Entrust(m_sLeg2, m_tacticattr.m_PairQuote.m_Leg2Price + m_Leg2Spread, JctpConstants.STRING_THOST_FTDC_OF_CloseToday, JctpConstants.THOST_FTDC_D_Sell, numLeg2);
			}
			e1.m_PortInfo 		= m_ProdInfo;
			e1.m_remark			= remark;
			tmpPort.m_ListFuture.add(e1);
			
			e2.m_PortInfo 		= m_ProdInfo;
			e2.m_remark			= remark;
			tmpPort.m_ListFuture.add(e2);
		}
		else if(direction.equals("CLOSE-SELL")){
			Entrust e1 		= null;
			Entrust e2 		= null;
			if(m_UseBidAskPrice){
				e1 			= new Entrust(m_sLeg1, m_tacticattr.m_PairQuote.m_Leg1RT_BID1 + m_Leg1Spread, JctpConstants.STRING_THOST_FTDC_OF_CloseToday, JctpConstants.THOST_FTDC_D_Sell, numLeg1);
				e2 			= new Entrust(m_sLeg2, m_tacticattr.m_PairQuote.m_Leg2RT_ASK1 - m_Leg2Spread, JctpConstants.STRING_THOST_FTDC_OF_CloseToday, JctpConstants.THOST_FTDC_D_Buy, numLeg2);
			}else{
				e1 			= new Entrust(m_sLeg1, m_tacticattr.m_PairQuote.m_Leg1Price + m_Leg1Spread, JctpConstants.STRING_THOST_FTDC_OF_CloseToday, JctpConstants.THOST_FTDC_D_Sell, numLeg1);
				e2 			= new Entrust(m_sLeg2, m_tacticattr.m_PairQuote.m_Leg2Price - m_Leg2Spread, JctpConstants.STRING_THOST_FTDC_OF_CloseToday, JctpConstants.THOST_FTDC_D_Buy, numLeg2);
			}
			e1.m_PortInfo 		= m_ProdInfo;
			e1.m_remark			= remark;
			tmpPort.m_ListFuture.add(e1);
			
			e2.m_PortInfo 		= m_ProdInfo;
			e2.m_remark			= remark;
			tmpPort.m_ListFuture.add(e2);
		}		
		tmpPort.m_FutureFirst 	= true;
	}


	private void ModifyHolding(String sRemarks){
		if(m_sEntrustType.equals("OPEN-SELL")){
			m_IsHold 	= m_IsHold - 1;
		}else if(m_sEntrustType.equals("OPEN-BUY")){
			m_IsHold 	= m_IsHold + 1;
		}else if(m_sEntrustType.equals("CLOSE-SELL")){
			m_IsHold 	= m_IsHold - 1;
		}else if(m_sEntrustType.equals("CLOSE-BUY")){
			m_IsHold 	= m_IsHold + 1;
		}
		
		if(sRemarks.contains(FORCE_STOP)){
			m_IsHold 	= 0;
		}
	}
	
	@Override
	public boolean CheckPort() {
		// TODO Auto-generated method stub
		JSONArray arrEntrust = getSQLData(String.format(m_TacticSQL.m_sFormatOrderSQL, 
															m_ProdInfo.getStrategyName(), 
															m_ctpinfo.getSuserId(), 
															m_posUnixTimeStart,
															2));
				
		if(arrEntrust.size() == 2 ){
			JSONObject jsonOrder1 		= arrEntrust.getJSONObject(0);
			JSONObject jsonOrder2 		= arrEntrust.getJSONObject(1);
			String sOrderStatus1 		= jsonOrder1.getString("orderstatus");
			String sOrderStatus2 		= jsonOrder2.getString("orderstatus");
			String sRemarks				= jsonOrder1.getString("remark");
			if(sOrderStatus1 != null && sOrderStatus2 != null){
				if(sOrderStatus1.equals(JctpConstants.STRING_THOST_FTDC_OST_AllTraded) && sOrderStatus2.equals(JctpConstants.STRING_THOST_FTDC_OST_AllTraded)){
					m_isUnFinished = false;
					ModifyHolding(sRemarks);
				}else if((sOrderStatus1.equals(JctpConstants.STRING_THOST_FTDC_OST_Canceled) && sOrderStatus2.equals(JctpConstants.STRING_THOST_FTDC_OST_Canceled))){
					m_isUnFinished = false;
				}else if(sOrderStatus1.equals(JctpConstants.STRING_THOST_FTDC_OST_AllTraded) && !sOrderStatus2.equals(JctpConstants.STRING_THOST_FTDC_OST_Canceled)){
					Append(jsonOrder2);
					ModifyHolding(sRemarks);
				}else if(sOrderStatus2.equals(JctpConstants.STRING_THOST_FTDC_OST_AllTraded) && !sOrderStatus1.equals(JctpConstants.STRING_THOST_FTDC_OST_Canceled)){
					Append(jsonOrder1);
					ModifyHolding(sRemarks);
				}
			}
		}
		return false;
	}
	
	@Override
	public double AppendPrice(String sSecurityID, double Px, String BS){
		if(BS.equals("SELL")){
			if(sSecurityID.toUpperCase().contains(m_sLeg1.toUpperCase())){
				Px = Px - m_Leg1AppendSpread;
			}else{
				Px = Px - m_Leg2AppendSpread;
			}
		}else{
			if(sSecurityID.toUpperCase().contains(m_sLeg1.toUpperCase())){
				Px = Px + m_Leg1AppendSpread;
			}else{
				Px = Px + m_Leg2AppendSpread;
			}
		}
		return Px;
	}

	@Override
	protected void InitHolding() {
		// TODO Auto-generated method stub
		JSONArray holdling =  getSQLData(String.format(m_TacticSQL.m_sFormatGetPos,
											m_ProdInfo.getProdName(),
											m_ProdInfo.getStrategyName(),
											m_ctpinfo.getSuserId(), 
											m_sLeg1,
											m_posUnixTimeStart));

		if( holdling.size() >= 0){
			JSONObject jsonHolding 		= holdling.getJSONObject(0);
			if(jsonHolding.getInteger("openVol") != null){
				m_IsHold 				= jsonHolding.getInteger("openVol") / (m_numLeg1*m_TradeMultiple);
				if(m_IsHold > 0){
					m_sEntrustType 	= "OPEN-BUY";
				}
				else if(m_IsHold < 0){
					m_sEntrustType 	= "OPEN-SELL";
				}
			}else{
				m_IsHold 					= 0;
				m_sEntrustType				= " ";
			}
		}else{
			m_IsHold = 0;
		}
	}
	
	@Override
	protected void InitTacticID(){
		JSONArray tacticList =  getSQLData(String.format(m_TacticSQL.m_sOnLineFormatGetTacticID, 
														 m_posUnixTimeStart,
														 m_ProdInfo.getStrategyName(), 
														 m_ctpinfo.getSuserId()));
		
		if(tacticList.size() > 0){
			for(int i = 0; i <tacticList.size(); i++){
				JSONObject jsonHolding 		= tacticList.getJSONObject(i);
				if(jsonHolding.getString("tacticid") != null){
					m_TacticID 				= jsonHolding.getString("tacticid");
					m_log.info(String.format("%s Init tacticid: %s", m_ProdInfo.getStrategyName(), m_TacticID));
					m_TacticQueue.add(m_TacticID);
				}
			}
		}else{
			m_TacticID 							= helper.GenerateGuid();
		}
	}
}



