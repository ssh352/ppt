
package com.explosion.trade.ctp;



import org.apache.log4j.Logger;

import com.explosion.trade.ctp.EntrustPublish;
import com.explosion.trade.ctp.type.DPCThostFtdcInputOrderField;
import com.explosion.trade.ctp.type.DPCThostFtdcOrderField;
import com.explosion.trade.ctp.type.DPCThostFtdcTradeField;
import com.explosion.trade.util.Entrust;

import net.jctp.*;
import net.jtrader.JTraderException;


public class JCTP extends Thread implements JctpConstants, TraderApiListener {
	
	private TraderApi 			m_TraderApi;
	private Logger 				m_log 							= Logger.getLogger(JCTP.class);
    private EntrustPublish 		m_publisher;
    private TraderApiListener 	m_listener;
    
	private String 				m_sConFilePath	 				= "tmp_traderapi";
    private String 				m_TraderFrontUrl;
    public  String 				m_brokerId;
    public  String 				m_userId;
    public  String 				m_investorId;
    public  String 				m_password;
    private String 				m_OrderRef;
    private String 				m_sNow;
    
    private int 				m_SessionID;
    private int 				m_FrontID;
    private int 				m_limitpersecond;
    private int 				m_Entrustcount;

    
    public JCTP(String  straderFrontUrl, String sbrokerId, String  suserId, String  sinvestorId, String spassword, EntrustPublish p) throws Throwable{
    	m_TraderFrontUrl 	= straderFrontUrl;
        m_brokerId 			= sbrokerId;
        m_userId 			= suserId;
        m_investorId		= sinvestorId;
        m_password 			= spassword;
        m_publisher			= p;
        
        m_listener 			= this;
    }
    
    public boolean SyncReqUserLogin(String sConFile){
    	
        m_log.info("Connecting " + m_TraderFrontUrl + " ... ");
        if(sConFile == null){
        	sConFile = m_sConFilePath;
        }
        	
        m_TraderApi = new TraderApi(sConFile);
        m_TraderApi.setListener(m_listener);
//        traderApi.setAutoSleepReqQry(true);
        m_TraderApi.SubscribePrivateTopic(JctpConstants.THOST_TERT_QUICK);
        m_TraderApi.SubscribePublicTopic(JctpConstants.THOST_TERT_QUICK);
        try {
			m_TraderApi.SyncConnect(m_TraderFrontUrl);
			Thread.sleep(200);
		} catch (JTraderException | InterruptedException e) {
			// TODO Auto-generated catch block
			m_log.error(e.toString());
			return false;
		}
        
        m_log.info("TraderApi connect sussess, login");
        CThostFtdcReqUserLoginField f = new CThostFtdcReqUserLoginField();
        f.BrokerID = m_brokerId;
        f.UserID   = m_userId;
        f.Password = m_password;
        CThostFtdcRspUserLoginField r = new CThostFtdcRspUserLoginField();
        
		try {
			r = m_TraderApi.SyncReqUserLogin(f);
		} catch (JTraderException e) {
			// TODO Auto-generated catch block
			m_log.error(e.toString());
			return false;
		}
        return true;
    }
    
    public void SyncReqQrySettlementInfoConfirm()
    {
    	if(!IsConnected())
    	{
    		return;
    	}
        
    	CThostFtdcQrySettlementInfoConfirmField qrySettlementInfoConfirmField = new CThostFtdcQrySettlementInfoConfirmField(m_brokerId,m_userId);
    	CThostFtdcSettlementInfoConfirmField settlementInfoConfirmField;
		try {
			settlementInfoConfirmField = m_TraderApi.SyncReqQrySettlementInfoConfirm(qrySettlementInfoConfirmField);
	         if ( settlementInfoConfirmField==null || !m_TraderApi.GetTradingDay().equals(settlementInfoConfirmField.ConfirmDate) )
	         {
	             m_log.info("Query lastdate settlement");
	             m_log.info("Confirm settlement");
	             
	             settlementInfoConfirmField = new CThostFtdcSettlementInfoConfirmField(m_brokerId,m_userId,m_TraderApi.GetTradingDay(),null);
	             settlementInfoConfirmField = m_TraderApi.SyncReqSettlementInfoConfirm(settlementInfoConfirmField);
	         }
		} catch (JTraderException e) {
			// TODO Auto-generated catch block
			m_log.error(e.toString());
		}
    }

//    public void SyncAllReqQryExchangeMarginRate() throws Throwable
//    {
//        m_log.info("查交易所保证金率...");
//        CThostFtdcQryExchangeMarginRateField f = new CThostFtdcQryExchangeMarginRateField(brokerId,instrumentId.substring(0, 2),JctpConstants.THOST_FTDC_HF_Speculation);
//        
//        CThostFtdcExchangeMarginRateField rr[] = traderApi.SyncAllReqQryExchangeMarginRate(f);
//        for(int i=0;i<rr.length;i++)
//        {
//        	CThostFtdcExchangeMarginRateField r = rr[i];
//            m_log.info(r.InstrumentID+" 多仓保证金�??(�?): "+r.LongMarginRatioByMoney+" 多仓保证金�??(�?): "+r.LongMarginRatioByVolume
//                    		+" 空仓保证金�??(�?): "+r.ShortMarginRatioByMoney+" 空仓保证金�??(�?): "+r.ShortMarginRatioByVolume);
//        }
//        Thread.sleep(10);
//    }
    
//    public void SyncReqQryInstrumentCommissionRate() throws Throwable
//    {
//        m_log.info("查交易所手续费率...");
//        CThostFtdcQryInstrumentCommissionRateField f = new CThostFtdcQryInstrumentCommissionRateField(brokerId,userId,instrumentId);
//        CThostFtdcInstrumentCommissionRateField r = traderApi.SyncReqQryInstrumentCommissionRate(f);
//        if ( r!=null )
//        {
//        	m_log.info(r.InstrumentID+" �?仓费�??(�?)�? "+r.OpenRatioByMoney+" �?仓费�??(�?)�? "+r.OpenRatioByVolume
//                +" 平仓费率(�?)�? "+r.CloseRatioByMoney+" 平仓费率(�?)�? "+r.CloseRatioByVolume
//                +" 今平费率(�?)�? "+r.CloseTodayRatioByMoney+" 今平费率(�?)�? "+r.CloseTodayRatioByVolume);
//        }
//        else
//        {
//        	m_log.info("交易�?无此合约费率");
//        }
//        Thread.sleep(10);
//    }
    
    public CThostFtdcTradingAccountField SyncReqQryTradingAccount() throws Throwable
    {
        CThostFtdcQryTradingAccountField q = new CThostFtdcQryTradingAccountField(m_brokerId,m_userId,null);
        CThostFtdcTradingAccountField f = m_TraderApi.SyncReqQryTradingAccount(q);
        return f;
    }
    
    public CThostFtdcInvestorPositionDetailField[] SyncAllReqQryInvestorPositionDetail() throws Throwable
    {
        CThostFtdcQryInvestorPositionDetailField f = new CThostFtdcQryInvestorPositionDetailField();
        f.BrokerID = m_brokerId;
        f.InvestorID = m_userId;
        CThostFtdcInvestorPositionDetailField[] r= m_TraderApi.SyncAllReqQryInvestorPositionDetail(f);
        return r;
        	
    }
    

    
    public CThostFtdcInvestorPositionField[] SyncAllReqQryInvestorPosition() throws Throwable
    {
        CThostFtdcQryInvestorPositionField f = new CThostFtdcQryInvestorPositionField(m_brokerId,m_userId,null);
        CThostFtdcInvestorPositionField[] r= m_TraderApi.SyncAllReqQryInvestorPosition(f);
        return r;
    }
    
    public CThostFtdcOrderField[] SyncAllReqQryOrder() throws Throwable
    {
//    	m_log.info("查下单信�?...");
    	CThostFtdcQryOrderField f 	= new CThostFtdcQryOrderField();
    	f.BrokerID 					= m_brokerId; 
    	f.InvestorID 				= m_userId;
    	CThostFtdcOrderField[] r 	= m_TraderApi.SyncAllReqQryOrder(f);
    	return r;
    }
    
    private boolean IsConnected(){
    	if(!m_TraderApi.isConnected())
    	{
    		m_log.error("TraderApi is not connected");
    		return false;
    	}
    	
    	return true;
    }
    
    

    public void submitLastPriceOrder(String TacticID, String orderRef, Entrust e)
    {
    	CThostFtdcInputOrderField r = new CThostFtdcInputOrderField();
        r.BrokerID 					= m_brokerId;
        r.InvestorID 				= m_investorId;
        r.InstrumentID 				= e.m_sSecurityID;
        r.OrderRef 					= orderRef;
        r.UserID 					= m_investorId;
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

        m_log.info(String.format("timestamp: %s, info: %s", System.currentTimeMillis(), r));
        
        try{
            m_TraderApi.ReqOrderInsert(r);
        }catch(Throwable t){
        	m_log.error(t.toString());
        }
        
        DPCThostFtdcInputOrderField dpr = new DPCThostFtdcInputOrderField(r);
        dpr.TacticID 				= TacticID;
        dpr.TacticType 			= e.m_PortInfo.getStrategyName();
        dpr.PortName 			= e.m_PortInfo.getProdName();
        dpr.validinvertal 		= e.m_ValidInvertal;
        dpr.unixtime				= System.currentTimeMillis();
        dpr.sRemark				= e.m_remark;
        m_publisher.send(dpr);
    }
    
    //public void submitBidAskOrder(String TacticID, String TacticType, String instrumentId,String orderRef,char direction, String open, int volume){
    public void submitBidAskOrder(String TacticID, String orderRef, Entrust e){
    	
		CThostFtdcInputOrderField r = new CThostFtdcInputOrderField();
		r.BrokerID 				= m_brokerId;
		r.InvestorID 				= m_investorId;
		r.InstrumentID 			= e.m_sSecurityID;
		r.OrderRef 				= orderRef;
		r.UserID 					= m_investorId;
		r.MinVolume 				= 1;
		r.ForceCloseReason 	= JctpConstants.THOST_FTDC_FCC_NotForceClose; 	// 强平原因: 非强�??
		r.IsAutoSuspend 		= false; 																	// 自动挂起标�??: 不挂�??
		r.UserForceClose 		= false; 																	// 用户强评标�??: �?
		r.TimeCondition 		= JctpConstants.THOST_FTDC_TC_GFD; 						// 当日有效
		r.StopPrice 				= 0; 																			// 止损�??
		
		if(e.m_cEntrustBS == JctpConstants.THOST_FTDC_D_Buy)
		{
			r.OrderPriceType = JctpConstants.THOST_FTDC_OPT_AskPrice1; 				/////卖一�??
		}
		else if(e.m_cEntrustBS == JctpConstants.THOST_FTDC_D_Sell)
		{
			r.OrderPriceType = JctpConstants.THOST_FTDC_OPT_BidPrice1; 				/////买一�??
		}
		
//		r.OrderPriceType 		= JctpConstants.THOST_FTDC_OPT_LastPrice; 				// �?新�??
		r.Direction 					= e.m_cEntrustBS; 													// 买卖标志
		r.CombOffsetFlag 			= e.m_sOpenClose;												// �?平标�??
		r.CombHedgeFlag 			= JctpConstants.STRING_THOST_FTDC_HF_Speculation; 								// 投�??
		r.ContingentCondition 	= JctpConstants.THOST_FTDC_CC_Immediately; 											// 立即�????
		r.VolumeCondition 		= JctpConstants.THOST_FTDC_VC_AV; 														// 任意数量成�??
		r.VolumeTotalOriginal 	= e.m_iVolume; 																							// 数�??
		
		m_log.info(String.format("timestamp: %s, info: %s", System.currentTimeMillis(), r));
		try{
			m_TraderApi.ReqOrderInsert(r);
		}catch(Throwable t){
			m_log.error(t.toString());
		}
		
        DPCThostFtdcInputOrderField dpr = new DPCThostFtdcInputOrderField(r);
        dpr.TacticID = TacticID;
        dpr.TacticType 		= e.m_PortInfo.getStrategyName();
        dpr.PortName 		= e.m_PortInfo.getProdName();
        dpr.validinvertal 	= e.m_ValidInvertal;
        dpr.unixtime			= System.currentTimeMillis();
        dpr.sRemark			= e.m_remark;
        
        m_publisher.send(dpr);
    }

    public void submitLimitPriceOrder(String TacticID, String orderRef, Entrust e)
    {
        CThostFtdcInputOrderField r = new CThostFtdcInputOrderField();
        
        r.BrokerID 					= m_brokerId;
        r.InvestorID 				= m_investorId;
        r.InstrumentID 				= e.m_sSecurityID;
        r.OrderRef 					= orderRef;
        r.UserID 					= m_investorId;
        r.MinVolume 				= 1;
        r.ForceCloseReason 			= JctpConstants.THOST_FTDC_FCC_NotForceClose; 	// 强平原因: 非强�??
        r.IsAutoSuspend 			= false; 																	// 自动挂起标�??: 不挂�??
        r.UserForceClose 			= false; 																	// 用户强评标�??: �?
        r.TimeCondition 			= JctpConstants.THOST_FTDC_TC_GFD; 						// 当日有效
        r.StopPrice 				= 0; 																			// 止损�??

        r.OrderPriceType 			= JctpConstants.THOST_FTDC_OPT_LimitPrice; 			// 限�??
        r.LimitPrice 				= e.m_dEntrustPrice;
        r.Direction 				= e.m_cEntrustBS; 														// 买卖标志
        r.CombOffsetFlag 			= e.m_sOpenClose;													// �?平标�??
        r.CombHedgeFlag 			=  STRING_THOST_FTDC_HF_Speculation; 					// 投�??
        r.ContingentCondition 	= THOST_FTDC_CC_Immediately; 								// 立即�????
        r.VolumeCondition 		= THOST_FTDC_VC_AV; 											// 任意数量成�??
        r.VolumeTotalOriginal 	= e.m_iVolume; 															// 数�??

        m_log.info(String.format("timestamp: %s, info: %s", System.currentTimeMillis(), r));
        try{
            m_TraderApi.ReqOrderInsert(r);
        }catch(Throwable t){
        	m_log.error(t.toString());
        }
        
        DPCThostFtdcInputOrderField dpr 	= new DPCThostFtdcInputOrderField(r);
        dpr.TacticID 									= TacticID;
        dpr.TacticType 								= e.m_PortInfo.getStrategyName();
        dpr.PortName 								= e.m_PortInfo.getProdName();
        dpr.validinvertal 							= e.m_ValidInvertal;
        dpr.unixtime									= System.currentTimeMillis();
        dpr.sRemark									= e.m_remark;        
        m_publisher.send(dpr);
    }
    
    
    public void submitCancelOrder(String OrderRef, String sInstrumentID, int SessionID, int FrontID){
    	CThostFtdcInputOrderActionField r = new CThostFtdcInputOrderActionField();
    	
        r.BrokerID 			= m_brokerId;
        r.InvestorID 		= m_investorId;
        r.UserID 			= m_investorId;
        
        r.InstrumentID 		= sInstrumentID;
    	r.OrderRef 			= OrderRef;
    	r.SessionID 		= SessionID;
    	r.FrontID 			= FrontID;
    	
    	r.ActionFlag 		= JctpConstants.THOST_FTDC_AF_Delete;
    
    	m_log.info(r);
    	try {
			m_TraderApi.ReqOrderAction(r);
		} catch (JTraderException e) {
			// TODO Auto-generated catch block
			m_log.error(e.toString());
		}
    }
    
    public String GetOrderRef()
    {
    	if(m_OrderRef == null)
    	{
    		m_log.error("OrderRef Init Failed");
    		return null;
    	}
    	int Ref = Integer.parseInt(m_OrderRef);
    	m_OrderRef = String.format("%d", ++Ref);
    	return m_OrderRef;
    }
    
    // TraderApiListener

    @Override
    public void OnFrontConnected() {

//        m_log.info("TraderListener.OnFrontDisconnected enter");

    }

    @Override
    public void OnFrontDisconnected(int nReason) {

        m_log.info("TraderListener.OnFrontDisconnected enter: "
                + nReason);

    }

    @Override
    public void OnHeartBeatWarning(int nTimeLapse) {
    }

    @Override
    public void OnRspAuthenticate(
            CThostFtdcRspAuthenticateField pRspAuthenticateField,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        m_log.info("TraderListener.OnRspAuthenticate enter: "
                + pRspAuthenticateField + "," + pRspInfo + "," + nRequestID
                + "," + bIsLast);
    }

    @Override
    public void OnRspUserLogin(CThostFtdcRspUserLoginField pRspUserLogin,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

    	m_OrderRef = pRspUserLogin.MaxOrderRef;
    	
    	//20160310 add by xujun 保存会话与前置机编�?? 
        m_SessionID = pRspUserLogin.SessionID;
        m_FrontID = pRspUserLogin.FrontID;
    	
//        m_log.info("TraderListener.OnRspUserLogin enter: "
//                + pRspUserLogin + "," + pRspInfo + "," + nRequestID + ","
//                + bIsLast);
    }

    public void OnRspSettlementInfoConfirm(
            CThostFtdcSettlementInfoConfirmField pSettlementInfoConfirm,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        m_log.info("TraderListener.OnRspSettlementInfoConfirm enter: "
                + pSettlementInfoConfirm + "," + pRspInfo + "," + nRequestID
                + "," + bIsLast);

    }

    public void OnRspUserLogout(CThostFtdcUserLogoutField pUserLogout,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        m_log.info("TraderListener.OnRspUserLogout enter: "
                + pUserLogout + "," + pRspInfo + "," + nRequestID + ","
                + bIsLast);
    }

    public void OnRspUserPasswordUpdate(
            CThostFtdcUserPasswordUpdateField pUserPasswordUpdate,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        m_log.info("TraderListener.OnRspUserPasswordUpdate enter: "
                + pUserPasswordUpdate + "," + pRspInfo + "," + nRequestID + ","
                + bIsLast);
    }

    public void OnRspTradingAccountPasswordUpdate(
            CThostFtdcTradingAccountPasswordUpdateField pTradingAccountPasswordUpdate,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

    	m_log.info("TraderListener.OnRspTradingAccountPasswordUpdate enter: "
                        + pTradingAccountPasswordUpdate
                        + ","
                        + pRspInfo
                        + ","
                        + nRequestID + "," + bIsLast);
    }

    public void OnRspOrderInsert(CThostFtdcInputOrderField pInputOrder,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        m_log.info("TraderListener.OnRspOrderInsert enter: "
                + pInputOrder + "," + pRspInfo + "," + nRequestID + ","
                + bIsLast);
    }

    public void OnRspParkedOrderInsert(CThostFtdcParkedOrderField pParkedOrder,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        m_log.info("TraderListener.OnRspParkedOrderInsert enter: "
                + pParkedOrder + "," + pRspInfo + "," + nRequestID + ","
                + bIsLast);
    }

    public void OnRspParkedOrderAction(
            CThostFtdcParkedOrderActionField pParkedOrderAction,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        m_log.info("TraderListener.OnRspParkedOrderAction enter: "
                + pParkedOrderAction + "," + pRspInfo + "," + nRequestID + ","
                + bIsLast);
    }

    public void OnRspOrderAction(
            CThostFtdcInputOrderActionField pInputOrderAction,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        m_log.info("TraderListener.OnRspOrderAction enter: "
                + pInputOrderAction + "," + pRspInfo + "," + nRequestID + ","
                + bIsLast);
    }

    public void OnRspQueryMaxOrderVolume(
            CThostFtdcQueryMaxOrderVolumeField pQueryMaxOrderVolume,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        m_log.info("TraderListener.OnRspQueryMaxOrderVolume enter: "
                + pQueryMaxOrderVolume + "," + pRspInfo + "," + nRequestID
                + "," + bIsLast);
    }

    public void OnRspRemoveParkedOrder(
            CThostFtdcRemoveParkedOrderField pRemoveParkedOrder,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        m_log.info("TraderListener.OnRspRemoveParkedOrder enter: "
                + pRemoveParkedOrder + "," + pRspInfo + "," + nRequestID + ","
                + bIsLast);
    }

    public void OnRspRemoveParkedOrderAction(
            CThostFtdcRemoveParkedOrderActionField pRemoveParkedOrderAction,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

    	m_log.info("TraderListener.OnRspRemoveParkedOrderAction enter: "
                        + pRemoveParkedOrderAction + "," + pRspInfo + ","
                        + nRequestID + "," + bIsLast);
    }

    public void OnRspQryOrder(CThostFtdcOrderField pOrder,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

//        m_log.info("TraderListener.OnRspQryOrder enter: " + pOrder
//                + "," + pRspInfo + "," + nRequestID + "," + bIsLast);
    }

    public void OnRspQryTrade(CThostFtdcTradeField pTrade,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        m_log.info("TraderListener.OnRspQryTrade enter: " + pTrade
                + "," + pRspInfo + "," + nRequestID + "," + bIsLast);
    }

    public void OnRspQryInvestorPosition(
            CThostFtdcInvestorPositionField pInvestorPosition,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        m_log.info("TraderListener.OnRspQryInvestorPosition enter: "
                + pInvestorPosition + "," + pRspInfo + "," + nRequestID + ","
                + bIsLast);
    }

    public void OnRspQryTradingAccount(
            CThostFtdcTradingAccountField pTradingAccount,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        m_log.info("TraderListener.OnRspQryTradingAccount enter: "
                + pTradingAccount + "," + pRspInfo + "," + nRequestID + ","
                + bIsLast);
    }

    public void OnRspQryInvestor(CThostFtdcInvestorField pInvestor,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        System.out
                .println("TraderListener.OnRspQryInvestor enter: " + pInvestor
                        + "," + pRspInfo + "," + nRequestID + "," + bIsLast);
    }

    public void OnRspQryTradingCode(CThostFtdcTradingCodeField pTradingCode,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        m_log.info("TraderListener.OnRspQryTradingCode enter: "
                + pTradingCode + "," + pRspInfo + "," + nRequestID + ","
                + bIsLast);
    }

    public void OnRspQryInstrumentMarginRate(
            CThostFtdcInstrumentMarginRateField pInstrumentMarginRate,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

    	m_log.info("TraderListener.OnRspQryInstrumentMarginRate enter: "
                        + pInstrumentMarginRate + "," + pRspInfo + ","
                        + nRequestID + "," + bIsLast);
    }

    public void OnRspQryInstrumentCommissionRate(
            CThostFtdcInstrumentCommissionRateField pInstrumentCommissionRate,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

    	m_log.info("TraderListener.OnRspQryInstrumentCommissionRate enter: "
                        + pInstrumentCommissionRate
                        + ","
                        + pRspInfo
                        + ","
                        + nRequestID + "," + bIsLast);
    }

    public void OnRspQryExchange(CThostFtdcExchangeField pExchange,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        m_log.info("TraderListener.OnRspQryExchange enter: " + pExchange
                        + "," + pRspInfo + "," + nRequestID + "," + bIsLast);
    }

    public void OnRspQryInstrument(CThostFtdcInstrumentField pInstrument,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        m_log.info("TraderListener.OnRspQryInstrument enter: "
                + pInstrument + "," + pRspInfo + "," + nRequestID + ","
                + bIsLast);
    }

    public void OnRspQryDepthMarketData(
            CThostFtdcDepthMarketDataField pDepthMarketData,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        m_log.info("TraderListener.OnRspQryDepthMarketData enter: "
                + pDepthMarketData + "," + pRspInfo + "," + nRequestID + ","
                + bIsLast);
    }

    public void OnRspQrySettlementInfo(
            CThostFtdcSettlementInfoField pSettlementInfo,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        m_log.info("TraderListener.OnRspQrySettlementInfo enter: "
                + pSettlementInfo + "," + pRspInfo + "," + nRequestID + ","
                + bIsLast);
    }

    public void OnRspQryTransferBank(CThostFtdcTransferBankField pTransferBank,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        m_log.info("TraderListener.OnRspQryTransferBank enter: "
                + pTransferBank + "," + pRspInfo + "," + nRequestID + ","
                + bIsLast);
    }

    public void OnRspQryInvestorPositionDetail(
            CThostFtdcInvestorPositionDetailField pInvestorPositionDetail,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

    	m_log.info("TraderListener.OnRspQryInvestorPositionDetail enter: "
                        + pInvestorPositionDetail
                        + ","
                        + pRspInfo
                        + ","
                        + nRequestID + "," + bIsLast);
    }

    public void OnRspQryNotice(CThostFtdcNoticeField pNotice,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        m_log.info("TraderListener.OnRspQryNotice enter: " + pNotice
                + "," + pRspInfo + "," + nRequestID + "," + bIsLast);
    }

    public void OnRspQrySettlementInfoConfirm(
            CThostFtdcSettlementInfoConfirmField pSettlementInfoConfirm,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
    	m_log.info("TraderListener.OnRspQrySettlementInfoConfirm enter: "
                        + pSettlementInfoConfirm + "," + pRspInfo + ","
                        + nRequestID + "," + bIsLast);
    }

    public void OnRspQryInvestorPositionCombineDetail(
            CThostFtdcInvestorPositionCombineDetailField pInvestorPositionCombineDetail,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

    	m_log.info("TraderListener.OnRspQryInvestorPositionCombineDetail enter: "
                        + pInvestorPositionCombineDetail
                        + ","
                        + pRspInfo
                        + ","
                        + nRequestID + "," + bIsLast);
    }

    public void OnRspQryCFMMCTradingAccountKey(
            CThostFtdcCFMMCTradingAccountKeyField pCFMMCTradingAccountKey,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

    	m_log.info("TraderListener.OnRspQryCFMMCTradingAccountKey enter: "
                        + pCFMMCTradingAccountKey
                        + ","
                        + pRspInfo
                        + ","
                        + nRequestID + "," + bIsLast);
    }

    public void OnRspQryEWarrantOffset(
            CThostFtdcEWarrantOffsetField pEWarrantOffset,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        m_log.info("TraderListener.OnRspQryEWarrantOffset enter: "
                + pEWarrantOffset + "," + pRspInfo + "," + nRequestID + ","
                + bIsLast);
    }

    public void OnRspQryInvestorProductGroupMargin(
            CThostFtdcInvestorProductGroupMarginField pInvestorProductGroupMargin,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        m_log.info("TraderListener.OnRspQryInvestorProductGroupMargin enter: "
                        + pInvestorProductGroupMargin
                        + ","
                        + pRspInfo
                        + ","
                        + nRequestID + "," + bIsLast);
    }

    public void OnRspQryExchangeMarginRate(
            CThostFtdcExchangeMarginRateField pExchangeMarginRate,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        m_log.info("TraderListener.OnRspQryExchangeMarginRate enter: "
                + pExchangeMarginRate + "," + pRspInfo + "," + nRequestID + ","
                + bIsLast);
    }

    public void OnRspQryExchangeMarginRateAdjust(
            CThostFtdcExchangeMarginRateAdjustField pExchangeMarginRateAdjust,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        System.out
                .println("TraderListener.OnRspQryExchangeMarginRateAdjust enter: "
                        + pExchangeMarginRateAdjust
                        + ","
                        + pRspInfo
                        + ","
                        + nRequestID + "," + bIsLast);
    }

    public void OnRspQryTransferSerial(
            CThostFtdcTransferSerialField pTransferSerial,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        m_log.info("TraderListener.OnRspQryTransferSerial enter: "
                + pTransferSerial + "," + pRspInfo + "," + nRequestID + ","
                + bIsLast);
    }

    public void OnRspQryAccountregister(
            CThostFtdcAccountregisterField pAccountregister,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        m_log.info("TraderListener.OnRspQryAccountregister enter: "
                + pAccountregister + "," + pRspInfo + "," + nRequestID + ","
                + bIsLast);
    }

    public void OnRspError(CThostFtdcRspInfoField pRspInfo, int nRequestID,
            boolean bIsLast) {

        m_log.info("TraderListener.OnRspError enter: " + pRspInfo + ","
                + nRequestID + "," + bIsLast);
    }

    public void OnRtnOrder(CThostFtdcOrderField pOrder) {
    	DPCThostFtdcOrderField dpr = new DPCThostFtdcOrderField(pOrder);
    	if(m_publisher != null){
    		m_publisher.send(dpr);
    	}
        m_log.info("TraderListener.OnRtnOrder enter: " + pOrder);
    }

    public void OnRtnTrade(CThostFtdcTradeField pTrade) {
    	DPCThostFtdcTradeField dpr = new DPCThostFtdcTradeField(pTrade);
    	if(m_publisher != null){
    		m_publisher.send(dpr);  
    	}
        
        m_log.info("TraderListener.OnRtnTrade enter: " + pTrade);
    }

    public void OnErrRtnOrderInsert(CThostFtdcInputOrderField pInputOrder,
            CThostFtdcRspInfoField pRspInfo) {

        m_log.info("TraderListener.OnErrRtnOrderInsert enter: "
                + pInputOrder + "," + pRspInfo);
    }

    public void OnErrRtnOrderAction(CThostFtdcOrderActionField pOrderAction,
            CThostFtdcRspInfoField pRspInfo) {

        m_log.info("TraderListener.OnErrRtnOrderAction enter: "
                + pOrderAction + "," + pRspInfo);
    }

    public void OnRtnInstrumentStatus(
            CThostFtdcInstrumentStatusField pInstrumentStatus) {
        m_log.info("TraderListener.OnRtnInstrumentStatus enter: "
                + pInstrumentStatus);
    }

    public void OnRtnTradingNotice(
            CThostFtdcTradingNoticeInfoField pTradingNoticeInfo) {

        m_log.info("TraderListener.OnRtnTradingNotice enter: "
                + pTradingNoticeInfo);
    }

    public void OnRtnErrorConditionalOrder(
            CThostFtdcErrorConditionalOrderField pErrorConditionalOrder) {

        m_log.info("TraderListener.OnRtnErrorConditionalOrder enter: "
                + pErrorConditionalOrder);
    }

    public void OnRspQryContractBank(CThostFtdcContractBankField pContractBank,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        m_log.info("TraderListener.OnRspQryContractBank enter: "
                + pContractBank + "," + pRspInfo + "," + nRequestID + ","
                + bIsLast);
    }

    public void OnRspQryParkedOrder(CThostFtdcParkedOrderField pParkedOrder,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        m_log.info("TraderListener.OnRspQryParkedOrder enter: "
                + pParkedOrder + "," + pRspInfo + "," + nRequestID + ","
                + bIsLast);
    }

    public void OnRspQryParkedOrderAction(
            CThostFtdcParkedOrderActionField pParkedOrderAction,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        m_log.info("TraderListener.OnRspQryParkedOrderAction enter: "
                + pParkedOrderAction + "," + pRspInfo + "," + nRequestID + ","
                + bIsLast);
    }

    public void OnRspQryTradingNotice(
            CThostFtdcTradingNoticeField pTradingNotice,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        m_log.info("TraderListener.OnRspQryTradingNotice enter: "
                + pTradingNotice + "," + pRspInfo + "," + nRequestID + ","
                + bIsLast);
    }

    public void OnRspQryBrokerTradingParams(
            CThostFtdcBrokerTradingParamsField pBrokerTradingParams,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        m_log.info("TraderListener.OnRspQryBrokerTradingParams enter: "
                + pBrokerTradingParams + "," + pRspInfo + "," + nRequestID
                + "," + bIsLast);
    }

    public void OnRspQryBrokerTradingAlgos(
            CThostFtdcBrokerTradingAlgosField pBrokerTradingAlgos,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        m_log.info("TraderListener.OnRspQryBrokerTradingAlgos enter: "
                + pBrokerTradingAlgos + "," + pRspInfo + "," + nRequestID + ","
                + bIsLast);
    }

    public void OnRtnFromBankToFutureByBank(
            CThostFtdcRspTransferField pRspTransfer) {

        m_log.info("TraderListener.OnRtnFromBankToFutureByBank enter: "
                + pRspTransfer);
    }

    public void OnRtnFromFutureToBankByBank(
            CThostFtdcRspTransferField pRspTransfer) {

        m_log.info("TraderListener.OnRtnFromFutureToBankByBank enter: "
                + pRspTransfer);
    }

    public void OnRtnRepealFromBankToFutureByBank(
            CThostFtdcRspRepealField pRspRepeal) {

        System.out
                .println("TraderListener.OnRtnRepealFromBankToFutureByBank enter: "
                        + pRspRepeal);
    }

    public void OnRtnRepealFromFutureToBankByBank(
            CThostFtdcRspRepealField pRspRepeal) {

        System.out
                .println("TraderListener.OnRtnRepealFromFutureToBankByBank enter: "
                        + pRspRepeal);
    }

    public void OnRtnFromBankToFutureByFuture(
            CThostFtdcRspTransferField pRspTransfer) {

        System.out
                .println("TraderListener.OnRtnFromBankToFutureByFuture enter: "
                        + pRspTransfer);
    }

    public void OnRtnFromFutureToBankByFuture(
            CThostFtdcRspTransferField pRspTransfer) {

        System.out
                .println("TraderListener.OnRtnFromFutureToBankByFuture enter: "
                        + pRspTransfer);
    }

    public void OnRtnRepealFromBankToFutureByFutureManual(
            CThostFtdcRspRepealField pRspRepeal) {

        System.out
                .println("TraderListener.OnRtnRepealFromBankToFutureByFutureManual enter: "
                        + pRspRepeal);
    }

    public void OnRtnRepealFromFutureToBankByFutureManual(
            CThostFtdcRspRepealField pRspRepeal) {

        System.out
                .println("TraderListener.OnRtnRepealFromFutureToBankByFutureManual enter: "
                        + pRspRepeal);
    }

    public void OnRtnQueryBankBalanceByFuture(
            CThostFtdcNotifyQueryAccountField pNotifyQueryAccount) {

        System.out
                .println("TraderListener.OnRtnQueryBankBalanceByFuture enter: "
                        + pNotifyQueryAccount);
    }

    public void OnErrRtnBankToFutureByFuture(
            CThostFtdcReqTransferField pReqTransfer,
            CThostFtdcRspInfoField pRspInfo) {

        System.out
                .println("TraderListener.OnErrRtnBankToFutureByFuture enter: "
                        + pReqTransfer + "," + pRspInfo);
    }

    public void OnErrRtnFutureToBankByFuture(
            CThostFtdcReqTransferField pReqTransfer,
            CThostFtdcRspInfoField pRspInfo) {

        System.out
                .println("TraderListener.OnErrRtnFutureToBankByFuture enter: "
                        + pReqTransfer + "," + pRspInfo);
    }

    public void OnErrRtnRepealBankToFutureByFutureManual(
            CThostFtdcReqRepealField pReqRepeal, CThostFtdcRspInfoField pRspInfo) {

        System.out
                .println("TraderListener.OnErrRtnRepealBankToFutureByFutureManual enter: "
                        + pReqRepeal + "," + pRspInfo);
    }

    public void OnErrRtnRepealFutureToBankByFutureManual(
            CThostFtdcReqRepealField pReqRepeal, CThostFtdcRspInfoField pRspInfo) {

        System.out
                .println("TraderListener.OnErrRtnRepealFutureToBankByFutureManual enter: "
                        + pReqRepeal + "," + pRspInfo);
    }

    public void OnErrRtnQueryBankBalanceByFuture(
            CThostFtdcReqQueryAccountField pReqQueryAccount,
            CThostFtdcRspInfoField pRspInfo) {

        System.out
                .println("TraderListener.OnErrRtnQueryBankBalanceByFuture enter: "
                        + pReqQueryAccount + "," + pRspInfo);
    }

    public void OnRtnRepealFromBankToFutureByFuture(
            CThostFtdcRspRepealField pRspRepeal) {

        System.out
                .println("TraderListener.OnRtnRepealFromBankToFutureByFuture enter: "
                        + pRspRepeal);
    }

    public void OnRtnRepealFromFutureToBankByFuture(
            CThostFtdcRspRepealField pRspRepeal) {

        System.out
                .println("TraderListener.OnRtnRepealFromFutureToBankByFuture enter: "
                        + pRspRepeal);
    }

    public void OnRspFromBankToFutureByFuture(
            CThostFtdcReqTransferField pReqTransfer,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        System.out
                .println("TraderListener.OnRspFromBankToFutureByFuture enter: "
                        + pReqTransfer + "," + pRspInfo + "," + nRequestID
                        + "," + bIsLast);
    }

    public void OnRspFromFutureToBankByFuture(
            CThostFtdcReqTransferField pReqTransfer,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        System.out
                .println("TraderListener.OnRspFromFutureToBankByFuture enter: "
                        + pReqTransfer + "," + pRspInfo + "," + nRequestID
                        + "," + bIsLast);
    }

    public void OnRspQueryBankAccountMoneyByFuture(
            CThostFtdcReqQueryAccountField pReqQueryAccount,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

        System.out
                .println("TraderListener.OnRspQueryBankAccountMoneyByFuture enter: "
                        + pReqQueryAccount
                        + ","
                        + pRspInfo
                        + ","
                        + nRequestID
                        + "," + bIsLast);
    }

    public void OnRtnOpenAccountByBank(CThostFtdcOpenAccountField pOpenAccount) {

        m_log.info("TraderListener.OnRtnOpenAccountByBank enter: "
                + pOpenAccount);
    }

    public void OnRtnCancelAccountByBank(
            CThostFtdcCancelAccountField pCancelAccount) {

        m_log.info("TraderListener.OnRtnCancelAccountByBank enter: "
                + pCancelAccount);
    }

    public void OnRtnChangeAccountByBank(
            CThostFtdcChangeAccountField pChangeAccount) {

        m_log.info("TraderListener.OnRtnChangeAccountByBank enter: "
                + pChangeAccount);
    }
    
	@Override
	public void OnRspQryProduct(CThostFtdcProductField pProduct,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		 m_log.info("TraderListener.OnRspQryProduct enter: "
	                + pProduct);
	}

	@Override
	public void OnRspQryExchangeRate(CThostFtdcExchangeRateField pExchangeRate,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		
		
	}

	@Override
	public void OnRspQrySecAgentACIDMap(
			CThostFtdcSecAgentACIDMapField pSecAgentACIDMap,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		
		
	}

	@Override
	public void OnRspExecOrderInsert(
			CThostFtdcInputExecOrderField pInputExecOrder,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		
		 m_log.info("TraderListener.OnRspQryProduct enter: "
	                + pInputExecOrder);
	}

	@Override
	public void OnRspExecOrderAction(
			CThostFtdcInputExecOrderActionField pInputExecOrderAction,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		 m_log.info("TraderListener.OnRspExecOrderAction enter: "
	                + pInputExecOrderAction);
		
	}

	@Override
	public void OnRspForQuoteInsert(
			CThostFtdcInputForQuoteField pInputForQuote,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		
		
	}

	@Override
	public void OnRspQuoteInsert(CThostFtdcInputQuoteField pInputQuote,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		
		
	}

	@Override
	public void OnRspQuoteAction(
			CThostFtdcInputQuoteActionField pInputQuoteAction,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		
		
	}

	@Override
	public void OnRspQryOptionInstrTradeCost(
			CThostFtdcOptionInstrTradeCostField pOptionInstrTradeCost,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		
		
	}

	@Override
	public void OnRspQryOptionInstrCommRate(
			CThostFtdcOptionInstrCommRateField pOptionInstrCommRate,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		
		
	}

	@Override
	public void OnRspQryExecOrder(CThostFtdcExecOrderField pExecOrder,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		 m_log.info("TraderListener.CThostFtdcExecOrderField enter: "
	                + pExecOrder);
		
	}

	@Override
	public void OnRspQryForQuote(CThostFtdcForQuoteField pForQuote,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		
		
	}

	@Override
	public void OnRspQryQuote(CThostFtdcQuoteField pQuote,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		
		
	}

	@Override
	public void OnRtnExecOrder(CThostFtdcExecOrderField pExecOrder) {
		 m_log.info("TraderListener.OnRtnExecOrder enter: "
	                + pExecOrder);
		
	}

	@Override
	public void OnErrRtnExecOrderInsert(
			CThostFtdcInputExecOrderField pInputExecOrder,
			CThostFtdcRspInfoField pRspInfo) {
		
		
	}

	@Override
	public void OnErrRtnExecOrderAction(
			CThostFtdcExecOrderActionField pExecOrderAction,
			CThostFtdcRspInfoField pRspInfo) {
		
		
	}

	@Override
	public void OnErrRtnForQuoteInsert(
			CThostFtdcInputForQuoteField pInputExecOrder,
			CThostFtdcRspInfoField pRspInfo) {
		
		
	}

	@Override
	public void OnRtnQuote(CThostFtdcQuoteField pQuote) {
		
		
	}

	@Override
	public void OnErrRtnQuoteInsert(CThostFtdcInputQuoteField pInputQuote,
			CThostFtdcRspInfoField pRspInfo) {
		
		
	}

	@Override
	public void OnErrRtnQuoteAction(CThostFtdcQuoteActionField pQuoteAction,
			CThostFtdcRspInfoField pRspInfo) {
		
		
	}

	@Override
	public void OnRtnForQuoteRsp(CThostFtdcForQuoteRspField pForQuoteRsp) {
		
		
	}

	@Override
	public void OnRtnCFMMCTradingAccountToken(
			CThostFtdcCFMMCTradingAccountTokenField pCFMMCTradingAccountToken) {
		
	}

	@Override
	public void OnRspQueryCFMMCTradingAccountToken(
			CThostFtdcQueryCFMMCTradingAccountTokenField pQueryCFMMCTradingAccountToken,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		
	}
}

