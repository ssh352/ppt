package com.explosion.trade.cats;


public class catstradeconstant {
	
	public final static String INST_TYPE_INSERTORDER 			= "O";  // 下单委托
	public final static String INST_TYPE_CANCELORDER 			= "C";  // 撤单委托
	
	public final static String TRADESIDE_BUY 					= "1";	// 买入
	public final static String TRADESIDE_SELL 					= "2";	// 卖出
	public final static String TRADESIDE_FINANCE_BUY 			= "A";	// 融资买入
	public final static String TRADESIDE_BORROW_SELL 			= "B";	// 融券卖出
	public final static String TRADESIDE_BUY_SECURITY_PAYBACK 	= "C";	// 买券还券
	public final static String TRADESIDE_SELL_SECURITY_PAYBACK 	= "D";	// 卖券还款
	public final static String TRADESIDE_BUY_SECURITY_PAYBACK2 	= "E";	// 先买券还券，再担保品买入
	public final static String TRADESIDE_ETF_PURCHASE 			= "F";	// ETF申购
	public final static String TRADESIDE_ETF_REDEEM 			= "G";	// ETF赎回
	public final static String TRADESIDE_FUTURE_OPEN_LONG 		= "FA";	// 开多仓（开仓买入）
	public final static String TRADESIDE_FUTURE_OPEN_SHORT 		= "FB";	// 开空仓（开仓卖出）
	public final static String TRADESIDE_FUTURE_CLOSE_LONG 		= "FC";	// 平空仓（平仓买入）
	public final static String TRADESIDE_FUTURE_CLOSE_SHORT 	= "FD";	// 平多仓（平仓卖出）

	public final static String ORDER_STATUS_YIBAO 				= "0";	// 已报
	public final static String ORDER_STATUS_BUFENCHENGJIAO 		= "1";	// 部分成交
	public final static String ORDER_STATUS_QUANBUCHENGJIAO 	= "2";	// 全部成交
	public final static String ORDER_STATUS_BUFENCHEDAN 		= "3";	// 部分撤单
	public final static String ORDER_STATUS_QUANBUCHEDAN 		= "4";	// 全部撤单
	public final static String ORDER_STATUS_JIAOYISUOJUDAN 		= "5";	// 交易所拒单
	public final static String ORDER_STATUS_GUITAIWEIJIESHOU 	= "6";	// 柜台未接受
	
	
	public final static String CURRENCY_RMB 					= "0";	// 人民币
	public final static String CURRENCY_USD 					= "1";	// 美元
	public final static String CURRENCY_HKD 					= "2";	// 港币
	
	


	public final static String ACCT_TYPE_JIZHONGJIAOYI 						= "0";	// 股票集中交易
	public final static String ACCT_TYPE_GUPIAOMONI 						= "S0";	// 股票模拟
	public final static String ACCT_TYPE_GUPIAOSHENZHENKUAISUJIAOYI 		= "F0";	// 股票深圳快速交易
	public final static String ACCT_TYPE_GUPIAOSHANGHAIKUAISUJIAOYI 		= "SHF0";	// 股票上海快速交易
	public final static String ACCT_TYPE_XINYONGJIZHONG 					= "C";	// 信用集中交易
	public final static String ACCT_TYPE_XINYONGSHENZHENKUAISU 				= "FC";	// 信用深圳快速交易
	public final static String ACCT_TYPE_XINYONGSHANGHAIKUAISU 				= "SHFC";	// 信用上海快速交易
	public final static String ACCT_TYPE_ZHONGXINQIHUO 						= "A";	// 中信期货
	public final static String ACCT_TYPE_QIHUOMONI 							= "SA";	// 期货模拟

	
	public final static String ORD_TYPE_STOCK_LIMIT 						= "0";	// 限价单
	public final static String ORD_TYPE_STOCK_MARKET 						= "Q";	// 市价单（对手方最优价格）
	public final static String ORD_TYPE_FUTURE_ANY 							= "1";	// 任意价


}
