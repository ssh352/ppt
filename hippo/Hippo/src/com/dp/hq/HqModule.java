package com.dp.hq;

import java.io.File;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.zeromq.ZMQ;

import com.dp.hq.util.HqDataCenter;
import com.dp.hq.util.HqDataConst;
import com.dp.hq.util.PrintHelper;
import com.explosion.base.helper;

import cn.com.wind.td.tdf.DATA_TYPE_FLAG;
import cn.com.wind.td.tdf.TDFClient;
import cn.com.wind.td.tdf.TDF_CODE;
import cn.com.wind.td.tdf.TDF_ERR;
import cn.com.wind.td.tdf.TDF_MSG;
import cn.com.wind.td.tdf.TDF_MSG_DATA;
import cn.com.wind.td.tdf.TDF_MSG_ID;
import cn.com.wind.td.tdf.TDF_OPEN_SETTING;
import cn.com.wind.td.tdf.TDF_OPTION_CODE;

public class HqModule extends Thread{
	protected Boolean quitFlag;
	private ConcurrentLinkedQueue<TDF_MSG_DATA> dataMsgsQue;
	private Logger m_log 					= Logger.getLogger(HqModule.class);
	private String sConfigFile				= System.getProperty("user.dir") + File.separator + "conf" + File.separator + "config.properties";
	private Properties configProps 			= new Properties();
	private HqDataCenter hqdata;

	
	/***********************configuration***************************************/
	private final String 	openMarket = "sh;sz;cf;shf;czc;dce"; 
	private final int 		openData = 0;
	private final int 		openTime = 0;
//	private final String 	subscription = "";
	private final String 	subscription = "000001.SZ;000002.SZ";
	private final int 		openTypeFlags = DATA_TYPE_FLAG.DATA_TYPE_INDEX;
	private HqDataQuery		HqQuery;
	
	
	/***********************configuration***************************************/
	
	TDFClient client = new TDFClient();
	public HqModule( ) {
		m_log.info("HqModule Start!");
		this.quitFlag = false;
		dataMsgsQue = new ConcurrentLinkedQueue<TDF_MSG_DATA>();
		configProps 	= helper.loadConfig(sConfigFile);
	
		
		StartDataCenter();
		if(configProps.getProperty("hqdatacenter.hqquerymodule").equals("true")){
			StartHqQuery();
		}
	}	

	public void ConnectHHsoft(){
		String ip 		= configProps.getProperty("hqmodule.host");
		String port	 	= configProps.getProperty("hqmodule.port");
		String username = configProps.getProperty("hqmodule.user");
		String password = configProps.getProperty("hqmodule.pwd");
		
		//�������ò���
		TDF_OPEN_SETTING setting = new TDF_OPEN_SETTING();
		setting.setIp(ip);                                       	//������IP
		setting.setPort(port);                						//�������˿�
		setting.setUser(username);                               	//��¼�û���
		setting.setPwd(password);                                	//��¼����
		//��ʼ��������
		setting.setMarkets(openMarket);                 			//�г��б��������ִ�Сд����Ӣ���ַ� ; �ָ���Ϊ�գ�����ȫ���г���sh;sz;cf;shf;czc;dce;
		setting.setSubScriptions(subscription);         			//���Ĵ����б�.��ʽΪ����.�г���ƣ���д��������000001.SZ;600000.SH. ����֮����Ӣ���ַ� ; �ָ���Ϊ�գ�����ȫ������
		setting.setTypeFlags(openTypeFlags);		        		//���ĵ��������ͣ�Ĭ��ȫ�����ģ��μ�DATA_TYPE_FLAG
		setting.setDate(openData);                      			//0 ��ʾ��������
		setting.setTime(openTime);	                    			//-1��ʾ��ͷ���䣬0��ʾ�������飨Ĭ��0��
		//�������޸�����
		setting.setReconnectCount(99999999);      
		setting.setReconnectGap(10);
		setting.setProtocol(0);
		setting.setConnectionID(0);
		
		int err = client.open(setting);                				//����������ӣ���¼����ȡ����������ȫ����ɺ󷵻أ��˺���������һ��ʱ�䣩
		if (err!=TDF_ERR.TDF_ERR_SUCCESS) {
			System.out.printf("Can't connect to %s:%d. �����˳���\n", ip, port);
			System.exit(err);
		}	
	}
	
	
	private void StartDataCenter(){
		hqdata = new HqDataCenter(dataMsgsQue);
		Thread t2 = new Thread(hqdata);
		t2.setName("HqDataCenterThread");
		t2.start();
	}
	
	private void StartHqQuery(){
		HqQuery = new HqDataQuery();
		Thread HqModuleQueryThread = new Thread(HqQuery);
		HqModuleQueryThread.setName("HqModuleQueryThread");
		HqModuleQueryThread.start();
	}
	
	public void setQuitFlag(Boolean para){
		this.quitFlag = para;
	}
	
	public TDF_OPTION_CODE getOptionCodeInfo(String szWindCode)
	{
		return client.getOptionCodeInfo(szWindCode);
	}
	
	private void SetSubCodeTable() {		
		ArrayList<String> CodeList = new ArrayList<String>();
		
		TDF_CODE[] codes = client.getCodeTable("SH");	
		for ( TDF_CODE code : codes ) {
			if(code.getType() == HqDataConst.ID_BT_INDEX ||
					code.getType() == HqDataConst.ID_BT_SHARES_A ||
					code.getType() == HqDataConst.ID_BT_SHARES_S ||
					code.getType() == HqDataConst.ID_BT_SHARES_G ||
					code.getType() == HqDataConst.ID_BT_FUTURES_IDX)
			{
				CodeList.add(code.getWindCode());
			}
		}		
		
		codes = client.getCodeTable("SZ");		
		for ( TDF_CODE code : codes ) {
			if(code.getType() == HqDataConst.ID_BT_INDEX ||
					code.getType() == HqDataConst.ID_BT_SHARES_A ||
					code.getType() == HqDataConst.ID_BT_SHARES_S ||
					code.getType() == HqDataConst.ID_BT_SHARES_G ||
					code.getType() == HqDataConst.ID_BT_FUTURES_IDX)
			{
				CodeList.add(code.getWindCode());
			}
		}	
		
		codes = client.getCodeTable("CF");		
		for ( TDF_CODE code : codes ) {
			if(code.getType() == HqDataConst.ID_BT_INDEX ||
					code.getType() == HqDataConst.ID_BT_SHARES_A ||
					code.getType() == HqDataConst.ID_BT_SHARES_S ||
					code.getType() == HqDataConst.ID_BT_SHARES_G ||
					code.getType() == HqDataConst.ID_BT_FUTURES_IDX)
			{
				CodeList.add(code.getWindCode());
			}
		}
		
		codes = client.getCodeTable("SHF");		
		for ( TDF_CODE code : codes ) {
			if(code.getType() == HqDataConst.ID_BT_INDEX ||
					code.getType() == HqDataConst.ID_BT_SHARES_A ||
					code.getType() == HqDataConst.ID_BT_SHARES_S ||
					code.getType() == HqDataConst.ID_BT_SHARES_G ||
					code.getType() == HqDataConst.ID_BT_FUTURES_IDX)
			{
				CodeList.add(code.getWindCode());
			}
		}	
		
		codes = client.getCodeTable("CZC");		
		for ( TDF_CODE code : codes ) {
			if(code.getType() == HqDataConst.ID_BT_INDEX ||
					code.getType() == HqDataConst.ID_BT_SHARES_A ||
					code.getType() == HqDataConst.ID_BT_SHARES_S ||
					code.getType() == HqDataConst.ID_BT_SHARES_G ||
					code.getType() == HqDataConst.ID_BT_FUTURES_IDX)
			{
				CodeList.add(code.getWindCode());
			}
		}	
		
		codes = client.getCodeTable("DCE");		
		for ( TDF_CODE code : codes ) {
			if(code.getType() == HqDataConst.ID_BT_INDEX ||
					code.getType() == HqDataConst.ID_BT_SHARES_A ||
					code.getType() == HqDataConst.ID_BT_SHARES_S ||
					code.getType() == HqDataConst.ID_BT_SHARES_G ||
					code.getType() == HqDataConst.ID_BT_FUTURES_IDX)
			{
				CodeList.add(code.getWindCode());
			}
		}	
		m_log.info(StringUtils.join(CodeList, ";"));
		client.setSubscription(StringUtils.join(CodeList, ";"), 0);
	}
	
	@Override
	public void run() {                                   					 //�����ѭ��ȡ����! ĿǰJavaAPI�Ļ�������ȡ�����ݴ��ڶ����У��ȴ��û���ȡ������û���ȡ���������ܻ��ѹ���߶�ʧ���ݣ��������ﴦ��Ҫ��
		while (!quitFlag) {
			TDF_MSG msg = client.getMessage(10);       						 //getMessage��ȡ���ݺ��������������ǣ��ȴ�����ms��û���ݿɶ��ͷ��ء� �������ʱ�������ݿɶ������̷���
			if (msg==null)
				continue;
			
			TDF_MSG_DATA data = TDFClient.getMessageData(msg, 0);
			if(data == null || data.equals(null)){
				m_log.info("data is null");
				continue;
			}			
			dataMsgsQue.add(data);
			
			if(msg.getDataType() == TDF_MSG_ID.MSG_SYS_CODETABLE_RESULT){
				System.out.println("�յ������");
				PrintHelper.printCodeTableResult(data.getCodeTableResult());
				SetSubCodeTable();
			}
		}
		client.close();
	}
			

}





