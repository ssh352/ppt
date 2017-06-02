package com.dp.tactic.cta.pairarb;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.jctp.JctpConstants;
import org.apache.log4j.Logger;
import org.rosuda.JRI.REXP;
import org.rosuda.JRI.RVector;
import org.rosuda.JRI.Rengine;



import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.explosion.base.helper;
import com.explosion.tactic.util.Portfolio;
import com.explosion.tactic.util.Tactic;
import com.explosion.trade.ctp.CTPInfo;
import com.explosion.trade.util.Entrust;

public class Au2Ag extends Tactic{
	private String  m_sAG;
	private String  m_sAU;
	
	private double 	m_NSigmaOPEN;
	private double 	m_NSigmaCLOSE;
	
	private int    	m_Count        = 0;
	private double 	m_Miu 		   = 0;
	private double 	m_Sd 		   = 0;
	private String 	m_exchange     = "SHF";
	private double  m_AUSpread 	   = 0; 	// 优化价格偏差点
	private double  m_AGSpread 	   = 0; 	
	private int 	m_numAU;
	private int 	m_numAG;
	
	
	private double  m_AUPrice;
	private double  m_AURT_BID1;
	private double  m_AURT_ASK1;
	
	private double  m_AGPrice;
	private double  m_AGRT_BID1;
	private double  m_AGRT_ASK1;
	
	protected String 		m_sStopTradinigTime		= "14:58";
	protected String 		m_sStopTradinigTime2	= "02:28";

	
	public Au2Ag(ConcurrentLinkedQueue<Portfolio> q){
		m_ArithTradeLastOrderQueue 	= q;
		m_log 						= Logger.getLogger(Au2Ag.class);
		m_sAG						= m_configProps.getProperty("tactic.strategy.Au2Ag.AG");
		m_sAU						= m_configProps.getProperty("tactic.strategy.Au2Ag.AU");
		m_exchange					= m_configProps.getProperty("tactic.strategy.Au2Ag.EXCHANGE");
		m_sStopTradinigTime			= m_configProps.getProperty("tactic.strategy.Au2Ag.stopTradingTime");
		m_sStopTradinigTime2		= m_configProps.getProperty("tactic.strategy.Au2Ag.stopTradingTime2");
		
		m_NSigmaOPEN				= Double.parseDouble(m_configProps.getProperty("tactic.strategy.Au2Ag.NSigmaOPEN"));
		m_NSigmaCLOSE				= Double.parseDouble(m_configProps.getProperty("tactic.strategy.Au2Ag.NSigmaCLOSE"));
		
		INTERVALCHECKPORT 			= Integer.parseInt(m_configProps.getProperty("tactic.strategy.Au2Ag.intervalCheckPort"));
		
		m_numAU						= Integer.parseInt(m_configProps.getProperty("tactic.strategy.Au2Ag.NUMAU"));
		m_numAG						= Integer.parseInt(m_configProps.getProperty("tactic.strategy.Au2Ag.NUMAG"));
		m_HoldingLimit				= Integer.parseInt(m_configProps.getProperty("tactic.strategy.Au2Ag.HoldingLimit"));
		
		m_AUSpread  				= Double.parseDouble(m_configProps.getProperty("tactic.strategy.Au2Ag.AU.opt.points"));
		m_AGSpread  				= Double.parseDouble(m_configProps.getProperty("tactic.strategy.Au2Ag.AG.opt.points"));
		
		m_tacticattr.setsRROOT(m_configProps.getProperty("tactic.strategy.Au2Ag.RROOT"));
		m_tacticattr.setsSingalFile(m_configProps.getProperty("tactic.strategy.Au2Ag.RSINGALFILE"));
		setInterVal(Integer.parseInt(m_configProps.getProperty("tactic.strategy.Au2Ag.interval")));
		
		SetPortInfo("CITICS_HEDGE_02", "Au2Ag");
		
		InitFuture();
		ConnectDB();

		m_tacticattr.StartREngine(false);
		
        InitHolding();
        InitTacticID();
        
        m_log.info(String.format("Init Parameter: Holding: %d, TacticID: %s", m_IsHold, m_TacticID));
	}
	
	@Override
	public boolean PrepareData() {
		// TODO Auto-generated method stub
		return false;
	}
	
	private void getMiuSD(){
		REXP value 	= m_tacticattr.ExecRCmd(String.format("Au2AG.CalcMiuSd('%s.%s', '%s.%s')", m_sAU, m_exchange, m_sAG, m_exchange));
		if(value == null){
			return;
		}else{
	    	RVector r 	= value.asVector();
	    	m_Miu  		= r.at("Miu").asDouble();
	        m_Sd 		= r.at("sd").asDouble();
		}
	}
	
	private int OpenLong(String sRemark){
    	GeneratePortfolio("OPEN-BUY", String.format("OPEN LONG AU %s", sRemark)); 		// open: long au short ag
    	m_sEntrustType 	= "OPEN-BUY";
    	return	1;
	}
	
	private int OpenShort(String sRemark){
    	GeneratePortfolio("OPEN-SELL", String.format("OPEN SHORT AU %s", sRemark));		// open: short au long ag
    	m_sEntrustType 	= "OPEN-SELL";
    	return	1;
	}

	private int CloseLong(String sRemark){
		GeneratePortfolio("CLOSE-BUY", String.format("CLOSE LONG AU %s", sRemark));		//  close: long au short ag
		m_sEntrustType 	= "CLOSE-BUY";
    	return	2;
	}
	
	private int CloseShort(String sRemark){
		GeneratePortfolio("CLOSE-SELL", String.format("CLOSE SHORT AU %s", sRemark));	//  close: short au long ag
		m_sEntrustType 	= "CLOSE-SELL";
    	return	2;
	}

	private List<Double> CalcSignalR(){
		
		List<Double> SignalList = new ArrayList<Double>();
		String sRcmd 			= String.format("Au2AG.CalcSignal('%s.%s', '%s.%s')", m_sAU, m_exchange, m_sAG, m_exchange);
		REXP value 				= m_tacticattr.ExecRCmd(sRcmd);
		if(value == null){
			m_log.error(String.format("Value is NULL! CMD: %s", sRcmd));
			return SignalList; 
		}

		RVector r 					= value.asVector();
		double[] ShortAuSignalarr 	= r.at("ShortAuSignal").asDoubleArray();
		
        if(ShortAuSignalarr.length > 0 ){
        	SignalList.add(r.at("ShortAuSignal").asDoubleArray()[0]);		// upSignal 	
        	SignalList.add(r.at("LongAuSignal").asDoubleArray()[0]);		// downSignal
        }else{
        	m_log.error(String.format("Signal is NULL! CMD: %s", sRcmd));
			return SignalList;
        }

        if(r.at("CODE").asStringArray()[0].contains(m_sAU.toUpperCase())){
        	m_AUPrice 		= r.at("RT_LAST").asDoubleArray()[0];
        	m_AURT_BID1 	= r.at("RT_BID1").asDoubleArray()[0];
        	m_AURT_ASK1 	= r.at("RT_ASK1").asDoubleArray()[0];
        	
        	m_AGPrice 		= r.at("RT_LAST").asDoubleArray()[1];
	    	m_AGRT_BID1		= r.at("RT_BID1").asDoubleArray()[1];
	    	m_AGRT_ASK1		= r.at("RT_ASK1").asDoubleArray()[1];
	    
		}else if(r.at("CODE").asStringArray()[0].contains(m_sAG.toUpperCase())){
			m_AUPrice 		= r.at("RT_LAST").asDoubleArray()[1];
        	m_AURT_BID1 	= r.at("RT_BID1").asDoubleArray()[1];
        	m_AURT_ASK1 	= r.at("RT_ASK1").asDoubleArray()[1];
        	
        	m_AGPrice 		= r.at("RT_LAST").asDoubleArray()[0];
	    	m_AGRT_BID1		= r.at("RT_BID1").asDoubleArray()[0];
	    	m_AGRT_ASK1		= r.at("RT_ASK1").asDoubleArray()[0];
		}
        
        return SignalList;
	}
	
	@Override
	public int CalcSignal() {
		// TODO Auto-generated method stub
		int offSetFlag 	= 0;
		m_Count 		= m_Count + 1;
		
		if((m_Miu == 0 && m_Sd == 0) || m_Count == 30){
			getMiuSD();
			m_Count = 0;
		}
		
		
		List<Double> SignalList = CalcSignalR();
		if(SignalList.size() != 2 ){
			return offSetFlag;
		}
		
		double upSignal			= SignalList.get(0);
		double downSignal		= SignalList.get(1);
        double upOpenLine 		= m_Miu + m_NSigmaOPEN*m_Sd;
        double upCloseLine		= m_Miu + m_NSigmaCLOSE*m_Sd;
        double downOpenLine 	= m_Miu - m_NSigmaOPEN*m_Sd;
        double downCloseLine	= m_Miu - m_NSigmaCLOSE*m_Sd;
        
        String sRemark = String.format("holding: %d, miu: %f, sd: %f, upLimit: %f, donwLimit: %f, upSignal: %f, downSignal: %f, InStr1Price: %f, InStr2Price: %f, InStr1BID1: %f, InStr1ASK1: %f, InStr2BID1: %f, InStr2ASK1: %f", 
        							m_IsHold, m_Miu, m_Sd, upOpenLine, downOpenLine, upSignal, downSignal, m_AUPrice, m_AGPrice,  m_AURT_BID1, m_AURT_ASK1, m_AGRT_BID1, m_AGRT_ASK1);
        m_log.info(sRemark);
        
        if(Math.abs(m_IsHold) < m_HoldingLimit){ 
        	if( upSignal > upOpenLine){
            	offSetFlag		= OpenShort(sRemark);
            }
        	else if( downSignal < downOpenLine){
        		offSetFlag 		= OpenLong(sRemark);
            }
        }
        else if(m_IsHold <= -1){
        	if(upSignal < upCloseLine){
        		offSetFlag 		= CloseLong(sRemark);
            }        	
        }
        else if(m_IsHold >= 1){
        	if(downSignal > downCloseLine){
            	offSetFlag 		= CloseShort(sRemark);
            }
        }

        // 判断是否要强平（不过夜）
//        if(m_IsHold != 0 ){
//        	if(helper.GetHour().equals("14:00") && helper.TimeCompare(helper.GetTimeMin(), m_sStopTradinigTime)){
//        		// 强平
//        		if(m_IsHold <= -1){
//        			offSetFlag 		= CloseLong(String.format("Time Stop %s", sRemark));
//        		}else if(m_IsHold >= 1){
//        			offSetFlag 		= CloseShort(String.format("Time Stop %s", sRemark));
//        		}
//        		Terminate();
//        	}
//        	
//        	if(helper.GetHour().equals("02:00") && helper.TimeCompare(helper.GetTimeMin(), m_sStopTradinigTime2)){
//        		// 强平
//        		if(m_IsHold <= -1){
//        			offSetFlag 		= CloseLong(String.format("Time Stop %s", sRemark));
//        		}else if(m_IsHold >= 1){
//        			offSetFlag 		= CloseShort(String.format("Time Stop %s", sRemark));
//        		}
//        		Terminate();
//        	}
//        	
//        }
//        
        return offSetFlag;
	}

	@Override
	public boolean InitFuture() {
		// TODO Auto-generated method stub
		// 初始化CTP
		m_ctpinfo = new CTPInfo();
		m_ctpinfo.setStraderFrontUrl(m_configProps.getProperty("tactic.strategy.Au2Ag.traderFrontUrl"));
		m_ctpinfo.setSbrokerId(m_configProps.getProperty("tactic.strategy.Au2Ag.brokerId"));
		m_ctpinfo.setSuserId(m_configProps.getProperty("tactic.strategy.Au2Ag.userId"));
		m_ctpinfo.setSinvestorId(m_configProps.getProperty("tactic.strategy.Au2Ag.userId"));
		m_ctpinfo.setSpassword(m_configProps.getProperty("tactic.strategy.Au2Ag.password"));
		
		return true;
	}

	@Override
	public boolean InitSecurity() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void GeneratePortfolio(String direction, String remark) {
		// TODO Auto-generated method stub
		if(direction.contains("OPEN")){
			m_TacticID = helper.GenerateGuid();
		}	
		
		tmpPort.m_ListFuture.clear();
		tmpPort.m_ListSecurity.clear();
		tmpPort.m_PortInfo		= m_ProdInfo;
		tmpPort.m_TacticID 		= m_TacticID;
		
		if(direction.equals("OPEN-SELL")){
			Entrust e1 			= new Entrust(m_sAG, m_AGRT_ASK1 - m_AGSpread, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Buy, m_numAG);
//			Entrust e1 			= new Entrust(m_sAG, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Buy, m_numAG);
			e1.m_PortInfo 		= m_ProdInfo;
			e1.m_remark			= remark;
			tmpPort.m_ListFuture.add(e1);
			
			Entrust e2 			= new Entrust(m_sAU, m_AURT_BID1 + m_AUSpread, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Sell, m_numAU);
//			Entrust e2 			= new Entrust(m_sAU, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Sell, m_numAU);
			e2.m_PortInfo 		= m_ProdInfo;
			e2.m_remark			= remark;
			tmpPort.m_ListFuture.add(e2);
		}
		else if(direction.equals("OPEN-BUY")){
			Entrust e1 			= new Entrust(m_sAU, m_AURT_ASK1 - m_AUSpread, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Buy, m_numAU);
//			Entrust e1 			= new Entrust(m_sAU, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Buy, m_numAU);
			e1.m_PortInfo 		= m_ProdInfo;
			e1.m_remark			= remark;
			tmpPort.m_ListFuture.add(e1);
			
			Entrust e2 			= new Entrust(m_sAG, m_AGRT_BID1 + m_AGSpread, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Sell, m_numAG);
//			Entrust e2 			= new Entrust(m_sAG, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Sell, m_numAG);
			e2.m_PortInfo 		= m_ProdInfo;
			e2.m_remark			= remark;
			tmpPort.m_ListFuture.add(e2);
		}
		else if(direction.equals("CLOSE-BUY")){
//			Entrust e1 			= new Entrust(m_sAU, m_AURT_ASK1 - m_AUSpread, JctpConstants.STRING_THOST_FTDC_OF_Close, JctpConstants.THOST_FTDC_D_Buy, m_numAU);
			Entrust e1 			= new Entrust(m_sAU, m_AURT_ASK1 - m_AUSpread, JctpConstants.STRING_THOST_FTDC_OF_CloseToday, JctpConstants.THOST_FTDC_D_Buy, m_numAU);
//			Entrust e1 			= new Entrust(m_sAU, JctpConstants.STRING_THOST_FTDC_OF_CloseToday, JctpConstants.THOST_FTDC_D_Buy, m_numAU);
			e1.m_PortInfo 		= m_ProdInfo;
			e1.m_remark			= remark;
			tmpPort.m_ListFuture.add(e1);
			
			Entrust e2 			= new Entrust(m_sAG, m_AGRT_BID1 + m_AGSpread, JctpConstants.STRING_THOST_FTDC_OF_CloseToday, JctpConstants.THOST_FTDC_D_Sell, m_numAG);
//			Entrust e2 			= new Entrust(m_sAG, JctpConstants.STRING_THOST_FTDC_OF_CloseToday, JctpConstants.THOST_FTDC_D_Sell, m_numAG);
			e2.m_PortInfo 		= m_ProdInfo;
			e2.m_remark			= remark;
			tmpPort.m_ListFuture.add(e2);
		}
		else if(direction.equals("CLOSE-SELL")){
			Entrust e1 			= new Entrust(m_sAU, m_AURT_BID1 + m_AUSpread, JctpConstants.STRING_THOST_FTDC_OF_CloseToday, JctpConstants.THOST_FTDC_D_Sell, m_numAU);
//			Entrust e1 			= new Entrust(m_sAU, JctpConstants.STRING_THOST_FTDC_OF_CloseToday, JctpConstants.THOST_FTDC_D_Sell, m_numAU);
			e1.m_PortInfo 		= m_ProdInfo;
			e1.m_remark			= remark;
			tmpPort.m_ListFuture.add(e1);
			
			Entrust e2 			= new Entrust(m_sAG, m_AGRT_ASK1 - m_AGSpread, JctpConstants.STRING_THOST_FTDC_OF_CloseToday, JctpConstants.THOST_FTDC_D_Buy, m_numAG);
//			Entrust e2 			= new Entrust(m_sAG, JctpConstants.STRING_THOST_FTDC_OF_CloseToday, JctpConstants.THOST_FTDC_D_Buy, m_numAG);
			e2.m_PortInfo 		= m_ProdInfo;
			e2.m_remark			= remark;
			tmpPort.m_ListFuture.add(e2);
		}		
		tmpPort.m_FutureFirst 	= true;
	}

	
	

	private void ModifyHolding(){
		if(m_sEntrustType.equals("OPEN-SELL")){
			m_IsHold 	= m_IsHold - 1;
		}else if(m_sEntrustType.equals("OPEN-BUY")){
			m_IsHold 	= m_IsHold + 1;
		}else if(m_sEntrustType.equals("CLOSE-SELL")){
			m_IsHold 	= m_IsHold - 1;
		}else if(m_sEntrustType.equals("CLOSE-BUY")){
			m_IsHold 	= m_IsHold + 1;
		}
	}
	
	@Override
	public boolean CheckPort() {
		// TODO Auto-generated method stub
		JSONArray arrEntrust = getSQLData(String.format(m_TacticSQL.m_sFormatOrderSQL, 
															m_ProdInfo.getStrategyName(), 
															m_ctpinfo.getSuserId(), 
															2));
				
		if(arrEntrust.size() == 2 ){
			JSONObject jsonOrder1 		= arrEntrust.getJSONObject(0);
			JSONObject jsonOrder2 		= arrEntrust.getJSONObject(1);
			String sOrderStatus1 		= jsonOrder1.getString("orderstatus");
			String sOrderStatus2 		= jsonOrder2.getString("orderstatus");
	
			if(sOrderStatus1.equals(JctpConstants.STRING_THOST_FTDC_OST_AllTraded) && sOrderStatus2.equals(JctpConstants.STRING_THOST_FTDC_OST_AllTraded)){
				m_isUnFinished = false;
				ModifyHolding();
			}else if((sOrderStatus1.equals(JctpConstants.STRING_THOST_FTDC_OST_Canceled) && sOrderStatus2.equals(JctpConstants.STRING_THOST_FTDC_OST_Canceled))){
				m_isUnFinished = false;
			}else if(sOrderStatus1.equals(JctpConstants.STRING_THOST_FTDC_OST_AllTraded) && !sOrderStatus2.equals(JctpConstants.STRING_THOST_FTDC_OST_Canceled)){
				Append(jsonOrder2);
				ModifyHolding();
			}else if(sOrderStatus2.equals(JctpConstants.STRING_THOST_FTDC_OST_AllTraded) && !sOrderStatus1.equals(JctpConstants.STRING_THOST_FTDC_OST_Canceled)){
				Append(jsonOrder1);
				ModifyHolding();
			}
		}
		return false;
	}

	@Override
	public void InitHolding() {
		// TODO Auto-generated method stub
		JSONArray holdling = getSQLData(String.format(m_TacticSQL.m_sFormatGetPos,
											m_ProdInfo.getProdName(),
											m_ProdInfo.getStrategyName(),
											m_ctpinfo.getSuserId(), 
											m_sAU));

		if( holdling.size() >= 0){
			JSONObject jsonHolding 		= holdling.getJSONObject(0);
			if(jsonHolding.getInteger("openVol") != null){
				m_IsHold 						= jsonHolding.getInteger("openVol") / m_numAU;
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
		
//		m_IsHold = 1;
//		m_sEntrustType = "OPEN-BUY";
	}
	
	@Override
	protected void InitTacticID(){
		JSONArray tacticList =  getSQLData(String.format(m_TacticSQL.m_sOnLineFormatGetTacticID, 
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
}



