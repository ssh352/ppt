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
			 // 资金
			new ReadTxT(FileName).ReadTxtData(PD.m_PortFundList);
		}
		else if(FileName.contains(STOCK_POS_FLAG)){
			// 持仓数据
			new ReadTxT(FileName).ReadTxtData(PD.m_PortStockList);
		}
		else if(FileName.contains(STOCK_ENTRUST_FLAG)){
			// 委托数据
			new ReadTxT(FileName).ReadTxtData(PD.m_PortEntrustList);
		}
		else if(FileName.contains(STOCK_TRANS_FLAG)){
			// 成交数据
			new ReadTxT(FileName).ReadTxtData(PD.m_PortTransList);
		}
		else if(FileName.contains(FUTURE_CAPITAL_FLAG)){
			// 期货资金数据
			new ReadTxT(FileName).ReadTxtData(PD.m_portFutureCapital);
		}
		else if(FileName.contains(FUTURE_POS_FLAG)){
			// 期货持仓数据
			new ReadTxT(FileName).ReadTxtData(PD.m_portFuturePos);			
		}
		else if(FileName.contains(FUTURE_TRADE_FLAG)){
			// 期货交易数据
			new ReadTxT(FileName).ReadTxtData(PD.m_portFutureTrade);
		}
		return 0;
	 }	 
}
