package com.explosion.trade.util;

import com.explosion.tactic.util.ProdInfo;

public class Entrust {
	
	public String 	m_sSecurityID;				// ֤ȯID
	public double 	m_dEntrustPrice;			// ί�м۸�
	public String 	m_sOpenClose;				// ��ƽ		1:��	   2:ƽ 
	public char 	m_cEntrustBS;				// ί�з���	0:��	   1:��
	public int 		m_iVolume;					// ί������
	
	private boolean  m_LimitPrice;
	private boolean  m_BidAsk;
	private boolean  m_LastPrice;
	public boolean   m_Cancel = false;

	public String 	 m_remark = " ";

	
	public String 	m_sOrderref;
	public int 		m_Sessionid;
	public int 		m_Frontid;
 	
	// 20160311 add by xujun ���������Ϣ, ��Чʱ�� 
	public ProdInfo m_PortInfo;
	public int 		m_ValidInvertal;
	
	public Entrust(String sSecurityID, double dEntrustPrice, String sOpenClose, char cEntrustBS, int vol){
		m_sSecurityID   = sSecurityID;
		m_dEntrustPrice = dEntrustPrice;
		m_sOpenClose 	= sOpenClose;
		m_cEntrustBS	= cEntrustBS;
		m_iVolume		= vol;
		m_LimitPrice	= true;				// �޼�
		m_BidAsk		= false;
		m_LastPrice		= false;
		m_PortInfo = new ProdInfo();
	}
	
	public Entrust(String sSecurityID,  String sOpenClose, char cEntrustBS, int vol){
		m_sSecurityID   = sSecurityID;
		m_sOpenClose 	= sOpenClose;
		m_cEntrustBS	= cEntrustBS;
		m_iVolume		= vol;
		m_LimitPrice	= false;
		m_BidAsk		= false;
		m_LastPrice		= true;				// LastPriceί��
		m_PortInfo = new ProdInfo();
	}
	
	// ���¼�
	public void SetLastPrice(){
		m_LimitPrice	= false;
		m_BidAsk		= false;
		m_LastPrice		= true;				
	}
	
	public boolean LastPrice(){
		return m_LastPrice;
	}
	
	// ���ּ�
	public void SetBidAsk(){
		m_LimitPrice	= false;
		m_BidAsk		= true;
		m_LastPrice		= false;			
	}
	
	public boolean BidAsk(){
		return m_BidAsk;
	}
	
	// �޼�
	public void SetLimitPrice(){
		m_LimitPrice	= true;
		m_BidAsk		= false;
		m_LastPrice		= false;			
	}
	
	public boolean LimitPrice(){
		return m_LimitPrice;
	}
	
	
	public String toString() {
		StringBuilder localStringBuilder = new StringBuilder(128);
		localStringBuilder
				.append("Entrust[")
				.append("m_sSecurityID=")
				.append(this.m_sSecurityID)
				.append(",m_dEntrustPrice=")
				.append(this.m_dEntrustPrice)
				.append(",m_sOpenClose=")
				.append(this.m_sOpenClose)
				.append(",m_cEntrustBS=")
				.append(this.m_cEntrustBS)
				.append(",m_iVolume=")
				.append(this.m_iVolume)
				.append(",m_LimitPrice=")
				.append(this.m_LimitPrice)
				.append(",m_BidAsk=")
				.append(this.m_BidAsk)
				.append(",m_LastPrice")
				.append(this.m_LastPrice)
				.append(",m_Cancel=")
				.append(this.m_Cancel)
				.append(",m_remark=")
				.append(this.m_remark)
				.append(",m_sOrderref=")
				.append(this.m_sOrderref)
				.append(",m_Sessionid=")
				.append(this.m_Sessionid)
				.append(",m_Frontid=")
				.append(this.m_Frontid);
		return localStringBuilder.toString();
	}
}

