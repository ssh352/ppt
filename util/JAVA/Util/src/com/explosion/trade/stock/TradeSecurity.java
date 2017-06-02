package com.explosion.trade.stock;

import com.explosion.trade.util.Entrust;
import com.explosion.trade.util.Trade;

import net.jctp.CThostFtdcInvestorPositionDetailField;
import net.jctp.CThostFtdcInvestorPositionField;
import net.jctp.CThostFtdcOrderField;
import net.jctp.CThostFtdcTradingAccountField;

public class TradeSecurity implements Trade{

	@Override
	public boolean Login(String sPath) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void QueryTrade() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CThostFtdcOrderField[] QueryEntrust() {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public CThostFtdcTradingAccountField QueryAccount() {
		return null;
		// TODO Auto-generated method stub
		
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
	public void LimitOrderInsert(String TacticID, Entrust e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BidAskOrderInsert(String TacticID, Entrust e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void LastOrderInsert(String TacticID, Entrust e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CancelOrder(String OrderRef, String sInstrumentID, int SessionID, int FrontID) {
		// TODO Auto-generated method stub
		
	}

}
