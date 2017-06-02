package demo.tdfapi;

import cn.com.wind.td.tdf.DATA_TYPE_FLAG;
import cn.com.wind.td.tdf.TDFClient;
import cn.com.wind.td.tdf.TDF_CODE;
import cn.com.wind.td.tdf.TDF_ERR;
import cn.com.wind.td.tdf.TDF_MSG;
import cn.com.wind.td.tdf.TDF_MSG_DATA;
import cn.com.wind.td.tdf.TDF_MSG_ID;
import cn.com.wind.td.tdf.TDF_OPEN_SETTING;
import cn.com.wind.td.tdf.TDF_OPTION_CODE;
import cn.com.wind.td.tdf.TDF_PROXY_SETTING;
import cn.com.wind.td.tdf.TDF_PROXY_TYPE;

public class Demo {
	private final  boolean outputToScreen = false;  
	/***********************configuration***************************************/
	private final String openMarket = "SZ"; 
	private final int openData = 0;
	private final int openTime = 0;
	private final String subscription = "000001.SZ;000002.SZ";
	private final int openTypeFlags = DATA_TYPE_FLAG.DATA_TYPE_INDEX;
	/***********************configuration***************************************/
	TDFClient client = new TDFClient();
	Demo(String ip, int port, String username, String password) {
		this.quitFlag = false;
		this.LastPrintTime = System.currentTimeMillis();
		//�������ò���
		TDF_OPEN_SETTING setting = new TDF_OPEN_SETTING();
		setting.setIp(ip);                                       //������IP
		setting.setPort( Integer.toString(port));                //�������˿�
		setting.setUser(username);                               //��¼�û���
		setting.setPwd(password);                                //��¼����
		//��ʼ��������
		setting.setMarkets(openMarket);                 //�г��б��������ִ�Сд����Ӣ���ַ� ; �ָ���Ϊ�գ�����ȫ���г���sh;sz;cf;shf;czc;dce;
		setting.setSubScriptions(subscription);         //���Ĵ����б�.��ʽΪ����.�г���ƣ���д��������000001.SZ;600000.SH. ����֮����Ӣ���ַ� ; �ָ���Ϊ�գ�����ȫ������
		setting.setTypeFlags(openTypeFlags);		        //���ĵ��������ͣ�Ĭ��ȫ�����ģ��μ�DATA_TYPE_FLAG
		setting.setDate(openData);                      //0 ��ʾ��������
		setting.setTime(openTime);	                    //-1��ʾ��ͷ���䣬0��ʾ�������飨Ĭ��0��
		//�������޸�����
		setting.setReconnectCount(99999999);      
		setting.setReconnectGap(10);
		setting.setProtocol(0);
		setting.setConnectionID(0);
		
		int err = client.open(setting);                //����������ӣ���¼����ȡ����������ȫ����ɺ󷵻أ��˺���������һ��ʱ�䣩
		if (err!=TDF_ERR.TDF_ERR_SUCCESS) {
			System.out.printf("Can't connect to %s:%d. �����˳���\n", ip, port);
			System.exit(err);
		}
	}	
	//����ģʽ
	Demo(String ip, int port, String username, String password,
			String proxy_ip, int proxy_port, String proxy_user, String proxy_pwd) {
		
		this.quitFlag = false;
		this.LastPrintTime = System.currentTimeMillis();
		TDF_OPEN_SETTING setting = new TDF_OPEN_SETTING();
		setting.setIp(ip);
		setting.setPort( Integer.toString(port));
		setting.setUser(username);
		setting.setPwd(password);

		setting.setReconnectCount(99999999);
		setting.setReconnectGap(10);
		setting.setProtocol(0);
		setting.setMarkets(openMarket);
		setting.setDate(openData);
		setting.setTime(openTime);
		setting.setSubScriptions(subscription);
		setting.setTypeFlags(openTypeFlags);
		setting.setConnectionID(0);
		
		TDF_PROXY_SETTING proxySetting = new TDF_PROXY_SETTING();
		proxySetting.setProxyHostIp(proxy_ip);
		proxySetting.setProxyPort(Integer.toString(proxy_port));
		proxySetting.setProxyUser(proxy_user);
		proxySetting.setProxyPwd(proxy_pwd);
		proxySetting.setProxyType(TDF_PROXY_TYPE.TDF_PROXY_HTTP11);		

		int err = client.openProxy(setting, proxySetting);
		if (err!=TDF_ERR.TDF_ERR_SUCCESS) {
			System.out.printf("Can't connect to %s:%d. �����˳���\n", ip, port);
			System.exit(err);
		}		
	}
	
	protected Boolean quitFlag;
	private long LastPrintTime;
	
	public void setQuitFlag(Boolean para){
		this.quitFlag = para;
	}
	public TDF_OPTION_CODE getOptionCodeInfo(String szWindCode)
	{
		return client.getOptionCodeInfo(szWindCode);
	}
	void printCodeTable() {		
		TDF_CODE[] codes = client.getCodeTable("SH");		
		PrintHelper.printCodeTable(codes);		
	}
	
	void run() {                                   //�����ѭ��ȡ����! ĿǰJavaAPI�Ļ�������ȡ�����ݴ��ڶ����У��ȴ��û���ȡ������û���ȡ���������ܻ��ѹ���߶�ʧ���ݣ��������ﴦ��Ҫ��
		while (!quitFlag) {
			TDF_MSG msg = client.getMessage(10);       //getMessage��ȡ���ݺ��������������ǣ��ȴ�����ms��û���ݿɶ��ͷ��ء� �������ʱ�������ݿɶ������̷���
			if (msg==null)
				continue;
			
			switch(msg.getDataType()) {                           //��Ϣ��2�ࣺϵͳ��Ϣ������������Ͽ����������ӽ�����յ���½��Ӧ���յ�������յ����У��յ���������
																														//������Ϣ�����飬ָ�����ڻ�����ʳɽ������ί�У�ί�ж��У��� ʹ��getDataType��ȡ��Ϣ����
			//ϵͳ��Ϣ
			case TDF_MSG_ID.MSG_SYS_HEART_BEAT :	
				System.out.println("�յ�������Ϣ��");
				break;
			case TDF_MSG_ID.MSG_SYS_DISCONNECT_NETWORK:
				System.out.println("����Ͽ���");
				quitFlag = true;
				break;
			case TDF_MSG_ID.MSG_SYS_CONNECT_RESULT:{
				TDF_MSG_DATA data = TDFClient.getMessageData(msg, 0);                  //getMessageData: TDF_MSG���ܰ���������Ӧ���͵���Ϣ��ʹ�ô˺���ȡ��N��
				System.out.println("�������ӽ����");
				PrintHelper.printConnectResult(data.getConnectResult());               //��ʹ�ö�Ӧ����ȡ��������
				break;
			}
			case TDF_MSG_ID.MSG_SYS_LOGIN_RESULT:{
				TDF_MSG_DATA data = TDFClient.getMessageData(msg, 0);
				PrintHelper.printLoginResult(data.getLoginResult());				
				break;
			}
			case TDF_MSG_ID.MSG_SYS_CODETABLE_RESULT:{
				System.out.println("�յ������");
				//TDF_MSG_DATA data = TDFClient.getMessageData(msg, 0);
				//PrintHelper.printCodeTableResult(data.getCodeTableResult());
				//printCodeTable();
				break;
			}
			case TDF_MSG_ID.MSG_SYS_MARKET_CLOSE:{
				TDF_MSG_DATA data = TDFClient.getMessageData(msg, 0);
				PrintHelper.printMarketClose(data.getMarketClose());				
				break;
			}
			case TDF_MSG_ID.MSG_SYS_QUOTATIONDATE_CHANGE: {				
				TDF_MSG_DATA data = TDFClient.getMessageData(msg, 0);
				PrintHelper.printDateChange(data.getDateChange());
				break;
			}
			//������Ϣ
			case TDF_MSG_ID.MSG_DATA_MARKET:
				if (outputToScreen){					
					for (int i=0; i<msg.getAppHead().getItemCount(); i++) {
						TDF_MSG_DATA data = TDFClient.getMessageData(msg, i); 
						PrintHelper.printDataMarket(data.getMarketData());				
					}				
				}
				if(System.currentTimeMillis() - LastPrintTime  > 10 * 1000 && msg.getAppHead().getItemCount()>0){
					PrintHelper.printDataMarket(TDFClient.getMessageData(msg, 0).getMarketData());
					System.gc();
					LastPrintTime = System.currentTimeMillis();
				}
				PrintHelper.SaveData( new DataInfo(msg,PrintHelper.GetCurrentTime()) );						
								
				break;
			case TDF_MSG_ID.MSG_DATA_INDEX:
				if (outputToScreen){					
					for (int i=0; i<msg.getAppHead().getItemCount(); i++) {
						TDF_MSG_DATA data = TDFClient.getMessageData(msg, i);
						PrintHelper.printIndexData(data.getIndexData());					
					}					
				}
				if(System.currentTimeMillis() - LastPrintTime  > 10 * 1000 && msg.getAppHead().getItemCount()>0){
					PrintHelper.printIndexData(TDFClient.getMessageData(msg, 0).getIndexData());
					System.gc();
					LastPrintTime = System.currentTimeMillis();
				}
				PrintHelper.SaveData( new DataInfo(msg,PrintHelper.GetCurrentTime()) );				
				break;
			case TDF_MSG_ID.MSG_DATA_FUTURE:
				if (outputToScreen){					
					for (int i=0; i<msg.getAppHead().getItemCount(); i++) {
						TDF_MSG_DATA data = TDFClient.getMessageData(msg, i);
						PrintHelper.printFutureData(data.getFutureData());
					}					
				}
				if(System.currentTimeMillis() - LastPrintTime  > 10 * 1000 && msg.getAppHead().getItemCount()>0){
					PrintHelper.printFutureData(TDFClient.getMessageData(msg, 0).getFutureData());
					System.gc();
					LastPrintTime = System.currentTimeMillis();
				}
				PrintHelper.SaveData( new DataInfo(msg,PrintHelper.GetCurrentTime()));				
				break;
			case TDF_MSG_ID.MSG_DATA_TRANSACTION:
				if (outputToScreen){					
					for (int i=0; i<msg.getAppHead().getItemCount(); i++) {
						TDF_MSG_DATA data = TDFClient.getMessageData(msg, i);
						PrintHelper.printTransaction(data.getTransaction());
					}					
				}
				if(System.currentTimeMillis() - LastPrintTime  > 10 * 1000 && msg.getAppHead().getItemCount()>0){
					PrintHelper.printTransaction(TDFClient.getMessageData(msg, 0).getTransaction());
					System.gc();
					LastPrintTime = System.currentTimeMillis();
				}
				PrintHelper.SaveData( new DataInfo(msg,PrintHelper.GetCurrentTime()) );				
				break;
			case TDF_MSG_ID.MSG_DATA_ORDERQUEUE:
				if (outputToScreen){					
					for (int i=0; i<msg.getAppHead().getItemCount(); i++) {
						TDF_MSG_DATA data = TDFClient.getMessageData(msg, i);
						PrintHelper.printOrderQueue(data.getOrderQueue());
					}					
				}
				if(System.currentTimeMillis() - LastPrintTime  > 10 * 1000 && msg.getAppHead().getItemCount()>0){
					PrintHelper.printOrderQueue(TDFClient.getMessageData(msg, 0).getOrderQueue());
					System.gc();
					LastPrintTime = System.currentTimeMillis();
				}
				PrintHelper.SaveData( new DataInfo(msg,PrintHelper.GetCurrentTime()) );				
				break;
			case TDF_MSG_ID.MSG_DATA_ORDER:
				if (outputToScreen){					
					for (int i=0; i<msg.getAppHead().getItemCount(); i++) {
						TDF_MSG_DATA data = TDFClient.getMessageData(msg, i);
						PrintHelper.printOrder(data.getOrder());
					}				
				}
				if(System.currentTimeMillis() - LastPrintTime  > 10 * 1000 && msg.getAppHead().getItemCount()>0){
					PrintHelper.printOrder(TDFClient.getMessageData(msg, 0).getOrder());
					System.gc();
					LastPrintTime = System.currentTimeMillis();
				}
				PrintHelper.SaveData( new DataInfo(msg,PrintHelper.GetCurrentTime()) );				
				break;
			default:
				break;
			}
		}
		client.close();
	}
			
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		if (args.length!=4 ) {
//			System.out.println("usage:  Demo ip port user password");
//			System.exit(1);
//		}
		// Proxy Mode
		//Demo d = new Demo("10.100.7.18", 10001, "dev_test", "dev_test", 
		//			"10.100.6.125", 3128, "", "");
		Demo demo = new Demo("58.251.16.172", 10000, "szgw029049", "117516");  //�����򿪵�Server�����ӡ����忴ʵ�ִ���
		DataHandler dh = new DataHandler (demo);
		Thread t1 = new Thread(dh);
		t1.start();	                                                                //����̻߳������ȡ���ݣ�����getMessage������
		DataWrite dw = new DataWrite (demo);
		Thread t2 = new Thread ( dw );
		t2.start();
		System.out.println("press anything to quit the program.");
		try {
			System.in.read();	
			demo.setQuitFlag(true);
			dw.setQuitFlag(true);	
			t1.join();
			System.out.println("Thread1 Quit!");
			t2.join();
			System.out.println("Thread2 Quit!");
		} catch (Exception e) {
			e.printStackTrace();
		}		
		System.out.println("Quit the program!");
		System.exit(0);
	}
}





class DataHandler  implements Runnable {
	protected Demo demo;
	public DataHandler ( Demo  d) {
	    this.demo = d;
	}
	public void run ( ) {
		demo.run();
	}
}
class DataWrite  implements Runnable { //д����������ʱ����>WRITE_GAP && ������>LIST_LEN
	private static final int WRITE_GAP = 5;
	private static final int LIST_LEN = 20000;
	public DataWrite ( Demo  d) {
		quitFlag = false;
		lastWriteTime = System.currentTimeMillis();
		this.demo = d;
	}
	private  Demo demo;
	protected Boolean quitFlag;	
	private long lastWriteTime;
	public void setQuitFlag(Boolean para){
		this.quitFlag = para;
		
	}
	public void run ( ) {
		while(!quitFlag ){
			if (System.currentTimeMillis() - lastWriteTime < WRITE_GAP * 1000){
				try{
				    Thread.sleep(2*1000);//�л�������˳��ź�
				    continue;
				}catch(Exception e){
					e.printStackTrace();
					System.exit(0);
				}
			}
			if (PrintHelper.IsListFull(LIST_LEN)){
			    PrintHelper.WriteData(demo);
			}
			lastWriteTime = System.currentTimeMillis();
		}
		PrintHelper.WriteData(demo);
		PrintHelper.CloseDataFiles();
	}
}