package com.explosion.trade.ctp;

import java.io.File;
import java.util.Properties;

import net.jctp.JctpConstants;
import org.apache.log4j.PropertyConfigurator;

import com.explosion.base.helper;

import net.jctp.*;


public class JCTPtest {
	
	static {  
        PropertyConfigurator.configure(System.getProperty("user.dir") + File.separator + "conf" + File.separator  
                + "log4j.properties");  
    }  
	
	public static void main(String[] args) throws Throwable
	{
		String sConfigFile				= System.getProperty("user.dir") + File.separator + "conf" + File.separator + "config.properties";
		Properties configProps = helper.loadConfig(sConfigFile);
		
    	String straderFrontUrl 	= configProps.getProperty("ctp.traderFrontUrl");
    	String sbrokerId 		= configProps.getProperty("ctp.brokerId");
    	String suserId 			= configProps.getProperty("ctp.userId");
    	String sinvestorId		= configProps.getProperty("ctp.userId");
    	String spassword 		= configProps.getProperty("ctp.password");
        
		JCTP jctp = new JCTP(straderFrontUrl, sbrokerId, suserId, sinvestorId, spassword, null);
		jctp.SyncReqUserLogin(null);
		jctp.SyncReqQrySettlementInfoConfirm();
//		jctp.SyncReqQryTradingAccount();
		

		
//		jctp.submitLastPriceOrder("", "","IF1603", "0" , JctpConstants.THOST_FTDC_D_Buy, JctpConstants.STRING_THOST_FTDC_OF_Open, 1);
//		jctp.submitCancelOrder("1234578", 12, 1234);
		
		Thread.sleep(1000);
//		jctp.SyncAllReqQryInvestorPosition();
		
//		jctp.SyncAllReqQryInvestorPositionDetail();
//		jctp.SyncAllReqQryOrder();
		
		while(true)
		{
			Thread.sleep(1000);
		}
		
		
		

		
	}
}


