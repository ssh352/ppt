package com.explosion.trade.cats;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.xBaseJ.DBF;
import org.xBaseJ.xBaseJException;
import org.xBaseJ.fields.CharField;
import org.xBaseJ.fields.NumField;

import com.explosion.base.base;
import com.explosion.trade.ctp.EntrustPublish;
import com.explosion.trade.ctp.type.DPCThostFtdcInputOrderField;
import com.explosion.trade.util.Entrust;
import com.explosion.trade.util.Trade;
import com.linuxense.javadbf.DBFException;

import net.jctp.CThostFtdcInputOrderField;
import net.jctp.CThostFtdcInvestorPositionDetailField;
import net.jctp.CThostFtdcInvestorPositionField;
import net.jctp.CThostFtdcOrderField;
import net.jctp.CThostFtdcTradingAccountField;
import net.jctp.JctpConstants;

public class catstrade extends base implements Trade, Runnable{

	public String m_Path 					= "";
	public String m_InstructionsDBF 		= "";
	public String m_AssetDBF 				= "";
	public String m_UserID					= "";
	private EntrustPublish 					m_publisher;
	
	
	public catstrade(String userID, EntrustPublish p){
		m_publisher 		= p;
		m_UserID 			= userID;
		
		m_log  				= Logger.getLogger(catstrade.class);
		m_Path 				= m_configProps.getProperty("com.explosion.trade.cats.catstrade.scanpath"); 
		m_InstructionsDBF	= m_configProps.getProperty("com.explosion.trade.cats.catstrade.instructionsdbf");
		m_AssetDBF			= m_configProps.getProperty("com.explosion.trade.cats.catstrade.assetdbf");
		
	}
	
	
	public void createInstructionDBF(String DBFname, boolean destroy){
		try {
			DBF aDB					= new DBF(DBFname, destroy);
			
			aDB.addField(catstradefields.INST_TYPE);
			aDB.addField(catstradefields.CLIENT_ID);
			aDB.addField(catstradefields.ACCT_TYPE);
			aDB.addField(catstradefields.ACCT);
			aDB.addField(catstradefields.ORD_NO);
			aDB.addField(catstradefields.SYMBOL);
			aDB.addField(catstradefields.TRADESIDE);
			aDB.addField(catstradefields.ORD_QTY);
			aDB.addField(catstradefields.ORD_PRICE);
			aDB.addField(catstradefields.ORD_TYPE);
			aDB.addField(catstradefields.ORD_PARAM);
			
		} catch (xBaseJException | IOException e) {
			// TODO Auto-generated catch block
			m_log.error(e.getMessage());
		}			
	}
	

	@Override
	public boolean Login(String sPath) {
		// TODO Auto-generated method stub
		return false;
	}

	private void OrderInsert(String TacticID, Entrust e, boolean isMarketOrder){
		try {
			DBF aDB 					 = new DBF(String.format("%s/%s", m_Path, m_InstructionsDBF));
			CharField	INST_TYPE		 = (CharField)aDB.getField(catstradefields.INSTRUCTIONS_INST_TYPE); 
			NumField	CLIENT_ID		 = (NumField)aDB.getField(catstradefields.INSTRUCTIONS_CLIENT_ID); 
			CharField	ACCT_TYPE		 = (CharField)aDB.getField(catstradefields.INSTRUCTIONS_ACCT_TYPE); 
			CharField	ACCT		 	 = (CharField)aDB.getField(catstradefields.INSTRUCTIONS_ACCT); 
			CharField	SYMBOL		 	 = (CharField)aDB.getField(catstradefields.INSTRUCTIONS_SYMBOL); 
			CharField	TRADESIDE		 = (CharField)aDB.getField(catstradefields.INSTRUCTIONS_TRADESIDE); 
			NumField	ORD_QTY		 	 = (NumField)aDB.getField(catstradefields.INSTRUCTIONS_ORD_QTY); 
			NumField	ORD_PRICE		 = (NumField)aDB.getField(catstradefields.INSTRUCTIONS_ORD_PRICE); 
			CharField	ORD_TYPE		 = (CharField)aDB.getField(catstradefields.INSTRUCTIONS_ORD_TYPE); 
		
			INST_TYPE.put(catstradeconstant.INST_TYPE_INSERTORDER);
			CLIENT_ID.put(++m_orderref);
			ACCT_TYPE.put(catstradeconstant.ACCT_TYPE_GUPIAOMONI);
			ACCT.put(m_UserID);
			SYMBOL.put(e.m_sSecurityID);
			if(e.m_cEntrustBS == JctpConstants.THOST_FTDC_D_Buy){
				TRADESIDE.put(catstradeconstant.TRADESIDE_BUY);
			}else{
				TRADESIDE.put(catstradeconstant.TRADESIDE_SELL);
			}
			ORD_QTY.put(e.m_iVolume);
			
			// market order
			if(isMarketOrder){
				ORD_PRICE.put(0.0);
				ORD_TYPE.put(catstradeconstant.ORD_TYPE_STOCK_MARKET);
			}
			// limit order
			else{
				ORD_PRICE.put(e.m_dEntrustPrice);
				ORD_TYPE.put(catstradeconstant.ORD_TYPE_STOCK_LIMIT);
			}
			aDB.write();	
			aDB.close();
		} catch (xBaseJException | IOException e1) {
			// TODO Auto-generated catch block
			m_log.error(e1.getMessage());
		}
		PushOrder(TacticID, e);
	}
	
	@Override
	public void LimitOrderInsert(String TacticID, Entrust e) {
		// limit price order 
		OrderInsert(TacticID, e, false);
	}
	
	
	
	
	// publish order
	private void PushOrder(String TacticID, Entrust e){
		if(m_publisher == null){
			return;
		}
		
    	CThostFtdcInputOrderField r = new CThostFtdcInputOrderField();
        r.BrokerID 					= "";
        r.InvestorID 				= m_UserID;
        r.InstrumentID 				= e.m_sSecurityID;
        r.OrderRef 					= String.format("%d", m_orderref);
        r.UserID 					= m_UserID;
        r.MinVolume 				= 1;
        r.ForceCloseReason 			= JctpConstants.THOST_FTDC_FCC_NotForceClose; 			
        r.IsAutoSuspend 			= false; 												
        r.UserForceClose 			= false; 												
        r.TimeCondition 			= JctpConstants.THOST_FTDC_TC_GFD; 						
        r.StopPrice 				= 0; 													
        r.OrderPriceType 			= JctpConstants.THOST_FTDC_OPT_LastPrice; 			
        r.Direction 				= e.m_cEntrustBS; 									
        r.CombOffsetFlag 			= e.m_sOpenClose;													
        r.CombHedgeFlag 			= JctpConstants.STRING_THOST_FTDC_HF_Speculation; 					
        r.ContingentCondition 		= JctpConstants.THOST_FTDC_CC_Immediately; 						
        r.VolumeCondition 			= JctpConstants.THOST_FTDC_VC_AV; 								
        r.VolumeTotalOriginal 		= e.m_iVolume; 										
		
        DPCThostFtdcInputOrderField dpr = new DPCThostFtdcInputOrderField(r);
        dpr.TacticID 				= TacticID;
        dpr.TacticType 				= e.m_PortInfo.getStrategyName();
        dpr.PortName 				= e.m_PortInfo.getProdName();
        dpr.validinvertal 			= e.m_ValidInvertal;
        dpr.unixtime				= System.currentTimeMillis();
        dpr.sRemark					= e.m_remark;
        m_publisher.send(dpr);
	}


	@Override
	public void BidAskOrderInsert(String TacticID, Entrust e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void LastOrderInsert(String TacticID, Entrust e) {
		// Market Order
		OrderInsert(TacticID, e, true);
	}


	@Override
	public void QueryTrade() {
		// TODO Auto-generated method stub
	}


	@Override
	public CThostFtdcOrderField[] QueryEntrust() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public CThostFtdcTradingAccountField QueryAccount() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public CThostFtdcInvestorPositionField[] QueryHolding() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public CThostFtdcInvestorPositionDetailField[] QueryHoldingDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void CancelOrder(String OrderRef, String sInstrumentID, int SessionID, int FrontID) {
		// TODO Auto-generated method stub
		try {
			DBF aDB 					 = new DBF(String.format("%s/%s", m_Path, m_InstructionsDBF));
			CharField	INST_TYPE		 = (CharField)aDB.getField(catstradefields.INSTRUCTIONS_INST_TYPE); 
			NumField	CLIENT_ID		 = (NumField)aDB.getField(catstradefields.INSTRUCTIONS_CLIENT_ID); 
			CharField	ACCT_TYPE		 = (CharField)aDB.getField(catstradefields.INSTRUCTIONS_ACCT_TYPE); 
			CharField	ACCT		 	 = (CharField)aDB.getField(catstradefields.INSTRUCTIONS_ACCT); 
			CharField 	ORD_NO 			 = (CharField)aDB.getField(catstradefields.INSTRUCTIONS_ORD_NO);
			
			
			INST_TYPE.put(catstradeconstant.INST_TYPE_INSERTORDER);
			CLIENT_ID.put(++m_orderref);
			ACCT_TYPE.put(catstradeconstant.ACCT_TYPE_GUPIAOMONI);
			ACCT.put(m_UserID);
//			ORD_NO 
			

			aDB.write();	
			aDB.close();
		} catch (xBaseJException | IOException e1) {
			// TODO Auto-generated catch block
			m_log.error(e1.getMessage());
		}	
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	public static void main(String[] args) throws DBFException{

		catstrade cats = new catstrade("123123", null);
		cats.LimitOrderInsert("", new Entrust("002521.SZ", 10.54, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Buy, 100));
//		cats.LastOrderInsert("",  new Entrust("601595.SH",        JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Buy, 1000));
//		cats.LimitOrderInsert("",  new Entrust("601595.SH",    33.2,   JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Buy, 1000));
		
		
	}
	
}
