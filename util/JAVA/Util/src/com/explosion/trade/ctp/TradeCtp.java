package com.explosion.trade.ctp;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;

import net.jctp.CThostFtdcInvestorPositionDetailField;
import net.jctp.CThostFtdcInvestorPositionField;
import net.jctp.CThostFtdcOrderField;
import net.jctp.CThostFtdcTradingAccountField;
import net.jctp.JctpConstants;

import org.apache.log4j.Logger;

import com.explosion.base.helper;
import com.explosion.db.DataBaseCfg;
import com.explosion.trade.util.Entrust;
import com.explosion.trade.util.Trade;


public class TradeCtp implements Trade {
	private JCTP 	m_JCTP;
	private Logger  m_log 					= Logger.getLogger(JCTP.class);

	private Map<String, Object> 			m_CtpTradeMap;
	
	// 200160311 add by xujun 增加委托map
	private ConcurrentMap<String, Entrust> m_EntrustMap;
	public TradeCtp(ConcurrentMap<String, Entrust> EntrustMap){
		m_EntrustMap = EntrustMap;
	}
	
	public boolean Init(CTPInfo ctp, EntrustPublish p) {
		
		// TODO Auto-generated method stub
		boolean r = false;
		try {
//			String  straderFrontUrl, String sbrokerId, String  suserId, String  sinvestorId, String spassword
			m_JCTP 	= new JCTP(ctp.getStraderFrontUrl(), ctp.getSbrokerId(), ctp.getSuserId(), ctp.getSinvestorId(), ctp.getSpassword(), p);
			
			r 		= true;
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			m_log.error(e.toString());
			r = false;
		}
		return r;
	}

	@Override
	public boolean Login(String sConFile) {
		// TODO Auto-generated method stub
		return m_JCTP.SyncReqUserLogin(sConFile);
	}

	@Override
	public void QueryTrade() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CThostFtdcOrderField[] QueryEntrust() {
		// TODO Auto-generated method stub
		CThostFtdcOrderField[] r = null;
		try {
			r = m_JCTP.SyncAllReqQryOrder();
			if ( r!=null)
			{
				for(int i=0;i<r.length;i++)
				{
					m_log.info(
		            		 "InstrumentID:" + r[i].InstrumentID + ", " +
		    				 "Direction:" + r[i].Direction + " " + 
		    				 "StatusMsg:" + r[i].StatusMsg + " " +
		    				 "CombOffsetFlag:" + r[i].CombOffsetFlag + " " +
		    				 "InsertTime:" + r[i].InsertTime  + " " +
		    				 "InsertDate:" + r[i].InsertDate  +" " +
		    				 "OrderSubmitStatus:" + r[i].OrderSubmitStatus +" " + 
		    				 "LimitPrice:" + r[i].LimitPrice  +" " +
		    				 "VolumeTraded:" + r[i].VolumeTraded  +" " +
		    				 "VolumeTotal:" + r[i].VolumeTotal  +" " +
		    				 "VolumeTotalOriginal:" + r[i].VolumeTotalOriginal +" " + 
		    				 "OrderPriceType:" + r[i].OrderPriceType);
				}
			}
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			m_log.error(e.toString());
		}
		return r;
	}

	@Override
	public CThostFtdcTradingAccountField QueryAccount() {
		// TODO Auto-generated method stub
		
		CThostFtdcTradingAccountField f = null;
		try {
			f = m_JCTP.SyncReqQryTradingAccount();
	        m_log.info("总额: "	+f.Balance+
  				  " 可用: "	+f.Available+
  				  " 保证金: " +f.CurrMargin);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			m_log.error(e.toString());
		}
		
		return f;
	}

	
	public CThostFtdcInvestorPositionField[] QueryHolding() {
		// TODO Auto-generated method stub
		CThostFtdcInvestorPositionField[] r = null;
		
		try {
			r = m_JCTP.SyncAllReqQryInvestorPosition();
	        for(int i=0;i<r.length;i++)
	        {
	        	CThostFtdcInvestorPositionField d= r[i];
	       
	        	
	            m_log.info("InstrumentID:" + d.InstrumentID + 
	            				   ", PosiDirection:" + (d.PosiDirection) +
	            				   ", SettlementPrice:" + d.SettlementPrice + 
	            				   ", OpenVolume:" + d.OpenVolume +
	            				   ", Position:" + d.Position + 
	            				   ", TradingDay:" + d.TradingDay);
	        }
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			m_log.error(e.toString());
		}
		return r;	
		
		
	}

	@Override
	public CThostFtdcInvestorPositionDetailField[] QueryHoldingDetails() {
		// TODO Auto-generated method stub
		m_log.info("查持仓明细...");
		CThostFtdcInvestorPositionDetailField[] r = null;
		try {
			r = m_JCTP.SyncAllReqQryInvestorPositionDetail();
	        for(int i=0;i<r.length;i++)
	        {
	            CThostFtdcInvestorPositionDetailField d= r[i];
	            m_log.info("InstrumentID:" + d.InstrumentID + 
	            				   ", Direction:" + (d.Direction==JctpConstants.THOST_FTDC_D_Buy?"多":"空") +
	            				   ", OpenPrice:" + d.OpenPrice + 
	            				   ", Volume:" + d.Volume +
	            				   ", OpenDate:" + d.OpenDate);
	        }
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			m_log.error(e.toString());
		}
		return r;
	}

	@Override
	public void LastOrderInsert(String TacticID, Entrust e) {
		// TODO Auto-generated method stub
		String timestamp = helper.Unixtime();
		String sOrderRef = timestamp.substring(timestamp.length()-8, timestamp.length());
		String OrderRef = m_JCTP.GetOrderRef() + sOrderRef;
		Entrust entrust = e;
//		m_EntrustMap.put(OrderRef, entrust);
		
		m_JCTP.submitLastPriceOrder(TacticID, OrderRef, entrust);
	}
	
	@Override
	public void LimitOrderInsert(String TacticID, Entrust e) {
		// TODO Auto-generated method stub
		String timestamp = helper.Unixtime();
		String sOrderRef = timestamp.substring(timestamp.length()-8, timestamp.length());
		String OrderRef = m_JCTP.GetOrderRef() + sOrderRef;
		Entrust entrust = e;
//		m_EntrustMap.put(OrderRef, entrust);
		
		m_JCTP.submitLimitPriceOrder(TacticID, OrderRef, entrust);
	}

	@Override
	public void BidAskOrderInsert(String TacticID, Entrust e) {
		// TODO Auto-generated method stub
		String timestamp = helper.Unixtime();
		String sOrderRef = timestamp.substring(timestamp.length()-8, timestamp.length());
		String OrderRef = m_JCTP.GetOrderRef() + sOrderRef;
		Entrust entrust = e;
//		m_EntrustMap.put(OrderRef, entrust);
		
		m_JCTP.submitBidAskOrder(TacticID, OrderRef, entrust);
	}

	@Override
	public void CancelOrder(String OrderRef, String sInstrumentID, int SessionID, int FrontID){
		m_JCTP.submitCancelOrder(OrderRef, sInstrumentID, SessionID, FrontID);
	}

	public void SettlementInfoConfirm(){
		m_JCTP.SyncReqQrySettlementInfoConfirm();
	}
	

	public CThostFtdcTradingAccountField SyncReqQryTradingAccount(){
		try {
			return m_JCTP.SyncReqQryTradingAccount();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public CThostFtdcInvestorPositionField[] SyncAllReqQryInvestorPosition(){
		try {
			return m_JCTP.SyncAllReqQryInvestorPosition();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public CThostFtdcInvestorPositionDetailField[] SyncAllReqQryInvestorPositionDetail(){
		try {
			return m_JCTP.SyncAllReqQryInvestorPositionDetail();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public CThostFtdcOrderField[] SyncAllReqQryOrder(){
		try {
			return m_JCTP.SyncAllReqQryOrder();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			m_log.error(e.getMessage());
//			e.printStackTrace();
		}
		return null;
	}

	
}
