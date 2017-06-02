package com.explosion.trade.util;




import net.jctp.CThostFtdcInvestorPositionDetailField;
import net.jctp.CThostFtdcInvestorPositionField;
import net.jctp.CThostFtdcOrderField;
import net.jctp.CThostFtdcTradingAccountField;


public interface Trade {

	public abstract boolean 	Login(String sPath);										// 登陆
	public abstract void 		LimitOrderInsert(String TacticID,  Entrust e);				// Limit下单
	public abstract void 		BidAskOrderInsert(String TacticID, Entrust e);				// BidAsk下单
	public abstract void 		LastOrderInsert(String TacticID,   Entrust e);				// BidAsk下单
	public abstract void 		CancelOrder(String OrderRef, 
								String sInstrumentID, int SessionID, int FrontID); 			// 撤单
	
	public abstract void 		QueryTrade();												// 查询成交
	public abstract CThostFtdcOrderField[] 		QueryEntrust();								// 查询委托
	public abstract CThostFtdcTradingAccountField 		QueryAccount();						// 查询账户信息
	public abstract CThostFtdcInvestorPositionField[] 		QueryHolding();					// 查询持仓 
	public abstract CThostFtdcInvestorPositionDetailField[] 		QueryHoldingDetails();	// 查询持仓 
}

