package com.explosion;


import com.explosion.file.ReadTxT;
import com.port.utils.PortDetails;


public class ReadXTFiles {
	
	private String STOCK_CAPITAL_FLAG 	= "stockacc";
	private String STOCK_ENTRUST_FLAG 	= "stockentrust";
	private String STOCK_TRANS_FLAG 	= "stocktrade";
	private String STOCK_POS_FLAG 	 	= "stockpos";
	
	private String FUTURE_CAPITAL_FLAG 	= "futureacc";
	private String FUTURE_POS_FLAG 	 	= "futurepos";
	private String FUTURE_TRADE_FLAG 	= "futuretrade";
	
	public int GetData(String FileName, PortDetails PD)
	{
		if(FileName.contains(STOCK_CAPITAL_FLAG)){
			 // �ʽ�
			new ReadTxT(FileName).ReadTxtData(PD.m_PortFundList);
		}
		else if(FileName.contains(STOCK_POS_FLAG)){
			// �ֲ�����
			new ReadTxT(FileName).ReadTxtData(PD.m_PortStockList);
		}
		else if(FileName.contains(STOCK_ENTRUST_FLAG)){
			// ί������
			new ReadTxT(FileName).ReadTxtData(PD.m_PortEntrustList);
		}
		else if(FileName.contains(STOCK_TRANS_FLAG)){
			// �ɽ�����
			new ReadTxT(FileName).ReadTxtData(PD.m_PortTransList);
		}
		else if(FileName.contains(FUTURE_CAPITAL_FLAG)){
			// �ڻ��ʽ�����
			new ReadTxT(FileName).ReadTxtData(PD.m_portFutureCapital);
		}
		else if(FileName.contains(FUTURE_POS_FLAG)){
			// �ڻ��ֲ�����
			new ReadTxT(FileName).ReadTxtData(PD.m_portFuturePos);			
		}
		else if(FileName.contains(FUTURE_TRADE_FLAG)){
			// �ڻ���������
			new ReadTxT(FileName).ReadTxtData(PD.m_portFutureTrade);
		}
		return 0;
	 }	 
}
