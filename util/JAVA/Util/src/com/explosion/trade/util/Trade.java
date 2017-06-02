package com.explosion.trade.util;




import net.jctp.CThostFtdcInvestorPositionDetailField;
import net.jctp.CThostFtdcInvestorPositionField;
import net.jctp.CThostFtdcOrderField;
import net.jctp.CThostFtdcTradingAccountField;


public interface Trade {

	public abstract boolean 	Login(String sPath);										// ��½
	public abstract void 		LimitOrderInsert(String TacticID,  Entrust e);				// Limit�µ�
	public abstract void 		BidAskOrderInsert(String TacticID, Entrust e);				// BidAsk�µ�
	public abstract void 		LastOrderInsert(String TacticID,   Entrust e);				// BidAsk�µ�
	public abstract void 		CancelOrder(String OrderRef, 
								String sInstrumentID, int SessionID, int FrontID); 			// ����
	
	public abstract void 		QueryTrade();												// ��ѯ�ɽ�
	public abstract CThostFtdcOrderField[] 		QueryEntrust();								// ��ѯί��
	public abstract CThostFtdcTradingAccountField 		QueryAccount();						// ��ѯ�˻���Ϣ
	public abstract CThostFtdcInvestorPositionField[] 		QueryHolding();					// ��ѯ�ֲ� 
	public abstract CThostFtdcInvestorPositionDetailField[] 		QueryHoldingDetails();	// ��ѯ�ֲ� 
}

