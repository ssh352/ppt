package com.explosion.trade.cats;


public class catstradeconstant {
	
	public final static String INST_TYPE_INSERTORDER 			= "O";  // �µ�ί��
	public final static String INST_TYPE_CANCELORDER 			= "C";  // ����ί��
	
	public final static String TRADESIDE_BUY 					= "1";	// ����
	public final static String TRADESIDE_SELL 					= "2";	// ����
	public final static String TRADESIDE_FINANCE_BUY 			= "A";	// ��������
	public final static String TRADESIDE_BORROW_SELL 			= "B";	// ��ȯ����
	public final static String TRADESIDE_BUY_SECURITY_PAYBACK 	= "C";	// ��ȯ��ȯ
	public final static String TRADESIDE_SELL_SECURITY_PAYBACK 	= "D";	// ��ȯ����
	public final static String TRADESIDE_BUY_SECURITY_PAYBACK2 	= "E";	// ����ȯ��ȯ���ٵ���Ʒ����
	public final static String TRADESIDE_ETF_PURCHASE 			= "F";	// ETF�깺
	public final static String TRADESIDE_ETF_REDEEM 			= "G";	// ETF���
	public final static String TRADESIDE_FUTURE_OPEN_LONG 		= "FA";	// ����֣��������룩
	public final static String TRADESIDE_FUTURE_OPEN_SHORT 		= "FB";	// ���ղ֣�����������
	public final static String TRADESIDE_FUTURE_CLOSE_LONG 		= "FC";	// ƽ�ղ֣�ƽ�����룩
	public final static String TRADESIDE_FUTURE_CLOSE_SHORT 	= "FD";	// ƽ��֣�ƽ��������

	public final static String ORDER_STATUS_YIBAO 				= "0";	// �ѱ�
	public final static String ORDER_STATUS_BUFENCHENGJIAO 		= "1";	// ���ֳɽ�
	public final static String ORDER_STATUS_QUANBUCHENGJIAO 	= "2";	// ȫ���ɽ�
	public final static String ORDER_STATUS_BUFENCHEDAN 		= "3";	// ���ֳ���
	public final static String ORDER_STATUS_QUANBUCHEDAN 		= "4";	// ȫ������
	public final static String ORDER_STATUS_JIAOYISUOJUDAN 		= "5";	// �������ܵ�
	public final static String ORDER_STATUS_GUITAIWEIJIESHOU 	= "6";	// ��̨δ����
	
	
	public final static String CURRENCY_RMB 					= "0";	// �����
	public final static String CURRENCY_USD 					= "1";	// ��Ԫ
	public final static String CURRENCY_HKD 					= "2";	// �۱�
	
	


	public final static String ACCT_TYPE_JIZHONGJIAOYI 						= "0";	// ��Ʊ���н���
	public final static String ACCT_TYPE_GUPIAOMONI 						= "S0";	// ��Ʊģ��
	public final static String ACCT_TYPE_GUPIAOSHENZHENKUAISUJIAOYI 		= "F0";	// ��Ʊ���ڿ��ٽ���
	public final static String ACCT_TYPE_GUPIAOSHANGHAIKUAISUJIAOYI 		= "SHF0";	// ��Ʊ�Ϻ����ٽ���
	public final static String ACCT_TYPE_XINYONGJIZHONG 					= "C";	// ���ü��н���
	public final static String ACCT_TYPE_XINYONGSHENZHENKUAISU 				= "FC";	// �������ڿ��ٽ���
	public final static String ACCT_TYPE_XINYONGSHANGHAIKUAISU 				= "SHFC";	// �����Ϻ����ٽ���
	public final static String ACCT_TYPE_ZHONGXINQIHUO 						= "A";	// �����ڻ�
	public final static String ACCT_TYPE_QIHUOMONI 							= "SA";	// �ڻ�ģ��

	
	public final static String ORD_TYPE_STOCK_LIMIT 						= "0";	// �޼۵�
	public final static String ORD_TYPE_STOCK_MARKET 						= "Q";	// �м۵������ַ����ż۸�
	public final static String ORD_TYPE_FUTURE_ANY 							= "1";	// �����


}
