package com.dp.hq.util;

//import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.GregorianCalendar;
import java.util.Calendar;

import org.apache.log4j.Logger;

//import com.dp.hq.HqModule;

import cn.com.wind.td.tdf.TDFClient;
import cn.com.wind.td.tdf.TDF_CODE;
import cn.com.wind.td.tdf.TDF_CODE_RESULT;
import cn.com.wind.td.tdf.TDF_CONNECT_RESULT;
import cn.com.wind.td.tdf.TDF_FUTURE_DATA;
import cn.com.wind.td.tdf.TDF_INDEX_DATA;
import cn.com.wind.td.tdf.TDF_LOGIN_RESULT;
import cn.com.wind.td.tdf.TDF_MARKET_CLOSE;
import cn.com.wind.td.tdf.TDF_MARKET_DATA;
import cn.com.wind.td.tdf.TDF_MSG_DATA;
import cn.com.wind.td.tdf.TDF_MSG_ID;
import cn.com.wind.td.tdf.TDF_OPTION_CODE;
import cn.com.wind.td.tdf.TDF_ORDER;
import cn.com.wind.td.tdf.TDF_ORDER_QUEUE;
import cn.com.wind.td.tdf.TDF_QUOTATIONDATE_CHANGE;
import cn.com.wind.td.tdf.TDF_TRANSACTION;


public class PrintHelper {
	private static Logger m_log 					= Logger.getLogger(PrintHelper.class);
	public static final HashMap<Integer, String> typeMap;
	
	public static String CurrrentDate; //ֻȡһ��

	
	static {
		typeMap = new HashMap<Integer, String>();
		typeMap.put(TDF_MSG_ID.MSG_SYS_DISCONNECT_NETWORK   , "MSG_SYS_DISCONNECT_NETWORK");
		typeMap.put(TDF_MSG_ID.MSG_SYS_CONNECT_RESULT       , "MSG_SYS_CONNECT_RESULT");
		typeMap.put(TDF_MSG_ID.MSG_SYS_LOGIN_RESULT         , "MSG_SYS_LOGIN_RESULT");
		typeMap.put(TDF_MSG_ID.MSG_SYS_CODETABLE_RESULT     , "MSG_SYS_CODETABLE_RESULT");
		typeMap.put(TDF_MSG_ID.MSG_SYS_QUOTATIONDATE_CHANGE , "MSG_SYS_QUOTATIONDATE_CHANGE");
		typeMap.put(TDF_MSG_ID.MSG_SYS_MARKET_CLOSE         , "MSG_SYS_MARKET_CLOSE");
		typeMap.put(TDF_MSG_ID.MSG_SYS_HEART_BEAT           , "MSG_SYS_HEART_BEAT");
		typeMap.put(TDF_MSG_ID.MSG_DATA_INDEX               , "MSG_DATA_INDEX");
		typeMap.put(TDF_MSG_ID.MSG_DATA_MARKET              , "MSG_DATA_MARKET");
		typeMap.put(TDF_MSG_ID.MSG_DATA_FUTURE              , "MSG_DATA_FUTURE");
		typeMap.put(TDF_MSG_ID.MSG_DATA_TRANSACTION         , "MSG_DATA_TRANSACTION");
		typeMap.put(TDF_MSG_ID.MSG_DATA_ORDERQUEUE          , "MSG_DATA_ORDERQUEUE");
		typeMap.put(TDF_MSG_ID.MSG_DATA_ORDER               , "MSG_DATA_ORDER" );	
		
		Calendar todaysDate = new GregorianCalendar();    
		int year = todaysDate.get(Calendar.YEAR);   
		int month = todaysDate.get(Calendar.MONTH)   +   1;     
		int day = todaysDate.get(Calendar.DAY_OF_MONTH);
		CurrrentDate = String.valueOf(year*10000+month*100+day);

	
	};
	public static String GetCurrentTime(){		
		Calendar todaysDate = new GregorianCalendar();    
		return  String.valueOf(  todaysDate.get(Calendar.HOUR_OF_DAY)*10000000 + 
				                 todaysDate.get(Calendar.MINUTE)*100000 + 
				                 todaysDate.get(Calendar.SECOND)*1000 + 
				                 todaysDate.get(Calendar.MILLISECOND) );
	}
	public static String getDataTypeString(int type) {
		if (typeMap.containsKey(type))
			return typeMap.get(type);
		else
			return "Unknown data type [" + type + "]";
	}

	public static void printCodeTable(TDF_CODE[] codes) {
		
		for ( TDF_CODE code : codes ) {

			StringBuffer sb = new StringBuffer();
			sb.append("TDF_CODE: ")
			  .append(code.getWindCode()).append(" ")
			  .append(code.getMarket()).append(" ")
			  .append(code.getCode()).append(" ")
			  .append(code.getENName()).append(" ")
			  .append(code.getCNName()).append(" ")
		      .append(code.getType());
			m_log.info(sb.toString());
		}		
	}
	

	public static String arrayToStr(long[] array) {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for(long v: array) {
			sb.append(v).append(",");
		}
		sb.append("]");
		return sb.toString();
	}

	public static String arrayToStr(int[] array, int count) {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (int i = 0; i<count; i++) {
			int v = array[i];
			sb.append(v).append(",");
		}
		sb.append("]");
		return sb.toString();
	}

	public static String arrayToStr(String[] array, int count) {
		if (array==null)
			return "[]";
		
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (int i=0; i<count; i++) {
			String v = array[i];
			if (v!=null && v.length()>0)
				sb.append(v).append(",");
		}		
		sb.append("]");
		return sb.toString();
	}

	
	/*************************************Market Data***************************************/
	public static void OutputDataMarket(TDF_MARKET_DATA data, int serverTime, String localCurrentTime){            
/*

 		     String[] header ={"����", "����ʱ��", "������ʱ��", "������ʱ��", "��ô���", "ԭʼ����", 
		    	"ҵ������(��Ȼ��)", "������","״̬","ǰ��","���̼�","��߼�","��ͼ�","���¼�","������",
		    "������","�����","������","�ɽ�����","	�ɽ�����","�ɽ��ܽ��","ί����������","ί����������",
		    	"��Ȩƽ��ί��۸�","��Ȩƽ��ί���۸�","IOPV��ֵ��ֵ","����������","��ͣ��","��ͣ��",
		    	"֤ȯ��Ϣǰ׺","��ӯ��1","��ӯ��2","����2���Ա���һ�ʣ�"};

* */
		
        String[] contents = {CurrrentDate,
        		             localCurrentTime,
    			             String.valueOf(serverTime),
    			             String.valueOf(data.getTime()),
    			             data.getWindCode(),
    			             data.getCode(),
    			             String.valueOf(data.getActionDay()),
    			             String.valueOf(data.getTradingDay()),        			             
    			             String.valueOf(data.getStatus()),
    			             String.valueOf(data.getPreClose()),
    			             String.valueOf(data.getOpen()),
    			             String.valueOf(data.getHigh()),
    			             String.valueOf(data.getLow()),
    			             String.valueOf(data.getMatch()),
    			             arrayToStr(data.getAskPrice()),
    			             arrayToStr(data.getAskVol()),
    			             arrayToStr(data.getBidPrice()),
    			             arrayToStr(data.getBidVol()),
    			             String.valueOf(data.getNumTrades()),
    			             String.valueOf(data.getVolume()),
    			             String.valueOf(data.getTurnover()),
    			             String.valueOf(data.getTotalBidVol()),
    			             String.valueOf(data.getTotalAskVol()),
    			             String.valueOf(data.getWeightedAvgBidPrice()),
    			             String.valueOf(data.getWeightedAvgAskPrice()),
    			             String.valueOf(data.getIOPV()),
    			             String.valueOf(data.getYieldToMaturity()),
    			             String.valueOf(data.getHighLimited()),
    			             String.valueOf(data.getLowLimited()),
    			             data.getPrefix(),
    			             String.valueOf(data.getSyl1()),
    			             String.valueOf(data.getSyl2()),
    			             String.valueOf(data.getSD2())
		                         
        };        
	}
	public static void printDataMarket(TDF_MARKET_DATA data){
		System.out.println("TDF_MARKET_DATA");
		StringBuilder sb = new StringBuilder();
		sb.append("          SzWindCode = " + data.getWindCode() + "\n")
		  .append("          nActionDay = " + data.getActionDay() + "\n")
		  .append("         nTradingDay = " + data.getTradingDay() + "\n")
		  .append("               nTime = " + data.getTime() + "\n")
		  .append("             nStatus = " + data.getStatus() + "\n")
		  .append("           nPreClose = " + data.getPreClose() + "\n")
		  .append("               nOpen = " + data.getOpen() + "\n")
		  .append("               nHigh = " + data.getHigh() + "\n")
		  .append("                nLow = " + data.getLow() + "\n")
		  .append("              nMatch = " + data.getMatch() + "\n")
		  .append("           nAskPrice = " + arrayToStr(data.getAskPrice()) + "\n")
		  .append("            nAskVol] = " + arrayToStr(data.getAskVol()) + "\n")
		  .append("           nBidPrice = " + arrayToStr(data.getBidPrice()) + "\n")
		  .append("            nBidVol] = " + arrayToStr(data.getBidVol()) + "\n")
		  .append("          nNumTrades = " + data.getNumTrades() + "\n")
		  .append("             iVolume = " + data.getVolume() + "\n")
		  .append("           iTurnover = " + data.getTurnover() + "\n")
		  .append("        nTotalBidVol = " + data.getTotalBidVol() + "\n")
		  .append("        nTotalAskVol = " + data.getTotalAskVol() + "\n")
		  .append("nWeightedAvgBidPrice = " + data.getWeightedAvgBidPrice() + "\n")
		  .append("nWeightedAvgAskPrice = " + data.getWeightedAvgAskPrice() + "\n")
		  .append("               nIOPV = " + data.getIOPV() + "\n")
		  .append("    nYieldToMaturity = " + data.getYieldToMaturity() + "\n")
		  .append("        nHighLimited = " + data.getHighLimited() + "\n")
		  .append("         nLowLimited = " + data.getLowLimited() + "\n")
		  .append("            chPrefix = " + data.getPrefix() + "\n")
		  .append("               nSyl1 = " + data.getSyl1() + "\n")
		  .append("               nSyl2 = " + data.getSyl2() + "\n")
		  .append("                nSD2 = " + data.getSD2() + "\n");
		
		System.out.println(sb.toString());
	}
	
	/*************************************Index Data***************************************/
	public static void OutputIndexData(TDF_INDEX_DATA data, int serverTime, String localCurrentTime){  
/*
 "����","����ʱ��","������ʱ��","������ʱ��","��ô���","ԭʼ����","ҵ������(��Ȼ��)",
 "������","����ָ��","���ָ��","���ָ��","����ָ��","�ɽ�����","�ɽ��ܽ��","ǰ��ָ��"
 * */	
        String[] contents = {CurrrentDate,
	             localCurrentTime,
	             String.valueOf(serverTime),
	             String.valueOf(data.getTime()),
	             data.getWindCode(),
	             data.getCode(),
	             String.valueOf(data.getActionDay()),
	             String.valueOf(data.getTradingDay()),        			             
	             String.valueOf(data.getOpenIndex()),
	             String.valueOf(data.getHighIndex()),
	             String.valueOf(data.getLowIndex()),
	             String.valueOf(data.getLastIndex()),
	             String.valueOf(data.getTotalVolume()),
	             String.valueOf(data.getTurnover()),
	             String.valueOf(data.getPreCloseIndex())	                                 
        };         
	}
	
	public static void printIndexData(TDF_INDEX_DATA data){
		System.out.println("TDF_INDEX_DATA");
		StringBuilder sb = new StringBuilder();
		sb.append("          SzWindCode = " + data.getWindCode() + "\n")
		  .append("              szCode = " + data.getCode() + "\n")
		  .append("          nActionDay = " + data.getActionDay() + "\n")
		  .append("         nTradingDay = " + data.getTradingDay() + "\n")
		  .append("               nTime = " + data.getTime() + "\n")
		  .append("          nOpenIndex = " + data.getOpenIndex() + "\n")
		  .append("          nHighIndex = " + data.getHighIndex() + "\n")
		  .append("           nLowIndex = " + data.getLowIndex() + "\n")
		  .append("          nLastIndex = " + data.getLastIndex() + "\n")
		  .append("        iTotalVolume = " + data.getTotalVolume() + "\n")
		  
		  .append("      nPreCloseIndex = " + data.getPreCloseIndex() + "\n");
		System.out.println(sb.toString());
	}
	
	/*************************************Future Data***************************************/
//	public static void OutputFutureData(TDF_FUTURE_DATA data, int serverTime, String localCurrentTime, HqModule demo){  
///*
//    //�ڻ�����		    
//   {"����","����ʱ��","������ʱ��","������ʱ��","��ô���","ԭʼ����","ҵ������(��Ȼ��)",
//    		            "������","״̬","��ֲ�","�����̼�","�����","���̼�","��߼�","��ͼ�","���¼�",
//    		            "�ɽ�����","�ɽ��ܽ��","�ֲ�����","������","�����","��ͣ��","��ͣ��","����ʵ��",
//    		            "����ʵ��","������","������","�����","������"};
//    //��Ȩ		    
//    {"����","����ʱ��","������ʱ��","������ʱ��","��ô���","ԭʼ����","ҵ������(��Ȼ��)",
//    		            "������","״̬","��ֲ�","�����̼�","�����","���̼�","��߼�","��ͼ�","���¼�",
//    		            "�ɽ�����","�ɽ��ܽ��","�ֲ�����","������","�����","��ͣ��","��ͣ��","����ʵ��",
//    		            "����ʵ��","������","������","�����","������","��Ȩ��Լ����","���֤ȯ����",
//    		            "�Ϲ��Ϲ�","��Ȩ��"};
// * */	
//		TDF_OPTION_CODE toc = demo.getOptionCodeInfo(data.getWindCode());
//		if (toc != null && (toc.getBasicCode().getType()&0xf0) == 0x90 ){ //��Ȩ	 
//	        String[] contents = {CurrrentDate,
//		             localCurrentTime,
//		             String.valueOf(serverTime),
//		             String.valueOf(data.getTime()),
//		             data.getWindCode(),
//		             data.getCode(),
//		             String.valueOf(data.getActionDay()),
//		             String.valueOf(data.getTradingDay()),        			             
//		             String.valueOf(data.getStatus()),
//		             String.valueOf(data.getPreOpenInterest()),
//		             String.valueOf(data.getPreClose()),
//		             String.valueOf(data.getPreSettlePrice()),
//		             String.valueOf(data.getOpen()),
//		             String.valueOf(data.getHigh()),
//		             String.valueOf(data.getLow()),
//		             String.valueOf(data.getMatch()),
//		             String.valueOf(data.getVolume()),
//		             String.valueOf(data.getTurnover()),
//		             String.valueOf(data.getOpenInterest()),
//		             String.valueOf(data.getClose()),
//		             String.valueOf(data.getSettlePrice()),
//		             String.valueOf(data.getHighLimited()),
//		             String.valueOf(data.getLowLimited()),
//		             String.valueOf(data.getPreDelta()),
//		             String.valueOf(data.getCurrDelta()),	             
//		             arrayToStr(data.getAskPrice()),
//		             arrayToStr(data.getAskVol()),
//		             arrayToStr(data.getBidPrice()),
//		             arrayToStr(data.getBidVol()),
//		             toc.getContractID(),
//		             toc.getUnderlyingSecurityID(),
//	                 String.valueOf(toc.getCallOrPut()),
//	                 String.valueOf(toc.getExerciseDate())
//	        };
//			contents[29] = 
//			contents[30] = toc.getUnderlyingSecurityID();
//			contents[31] = String.valueOf(toc.getCallOrPut());
//			contents[32] = String.valueOf(toc.getExerciseDate());
//		}else{ //�ڻ�
//	        String[] contents = {CurrrentDate,
//		             localCurrentTime,
//		             String.valueOf(serverTime),
//		             String.valueOf(data.getTime()),
//		             data.getWindCode(),
//		             data.getCode(),
//		             String.valueOf(data.getActionDay()),
//		             String.valueOf(data.getTradingDay()),        			             
//		             String.valueOf(data.getStatus()),
//		             String.valueOf(data.getPreOpenInterest()),
//		             String.valueOf(data.getPreClose()),
//		             String.valueOf(data.getPreSettlePrice()),
//		             String.valueOf(data.getOpen()),
//		             String.valueOf(data.getHigh()),
//		             String.valueOf(data.getLow()),
//		             String.valueOf(data.getMatch()),
//		             String.valueOf(data.getVolume()),
//		             String.valueOf(data.getTurnover()),
//		             String.valueOf(data.getOpenInterest()),
//		             String.valueOf(data.getClose()),
//		             String.valueOf(data.getSettlePrice()),
//		             String.valueOf(data.getHighLimited()),
//		             String.valueOf(data.getLowLimited()),
//		             String.valueOf(data.getPreDelta()),
//		             String.valueOf(data.getCurrDelta()),	             
//		             arrayToStr(data.getAskPrice()),
//		             arrayToStr(data.getAskVol()),
//		             arrayToStr(data.getBidPrice()),
//		             arrayToStr(data.getBidVol())                    
//	        };	        
//		}
//	
//	}	
	
	public static void printFutureData(TDF_FUTURE_DATA data) {
		System.out.println("TDF_FUTURE_DATA");
		StringBuilder sb = new StringBuilder();
		sb.append("      szWindCode = " +  data.getWindCode() + "\n")
		  .append("          szCode = " +  data.getCode() + "\n")
		  .append("      nActionDay = " +  data.getActionDay() + "\n")
		  .append("     nTradingDay = " +  data.getTradingDay() + "\n")
		  .append("           nTime = " +  data.getTime() + "\n")
		  .append("         nStatus = " +  data.getStatus() + "\n")
		  .append("iPreOpenInterest = " +  data.getPreOpenInterest() + "\n")
		  .append("       nPreClose = " +  data.getPreClose() + "\n")
		  .append(" nPreSettlePrice = " +  data.getPreSettlePrice() + "\n")
		  .append("           nOpen = " +  data.getOpen() + "\n")
		  .append("           nHigh = " +  data.getHigh() + "\n")
		  .append("            nLow = " +  data.getLow() + "\n")
		  .append("          nMatch = " +  data.getMatch() + "\n")
		  .append("         iVolume = " +  data.getVolume() + "\n")
		  .append("       iTurnover = " +  data.getTurnover() + "\n")
		  .append("   iOpenInterest = " +  data.getOpenInterest() + "\n")
		  .append("          nClose = " +  data.getClose() + "\n")
		  .append("    nSettlePrice = " +  data.getSettlePrice() + "\n")
		  .append("    nHighLimited = " +  data.getHighLimited() + "\n")
		  .append("     nLowLimited = " +  data.getLowLimited() + "\n")
		  .append("       nPreDelta = " +  data.getPreDelta() + "\n")
		  .append("      nCurrDelta = " +  data.getCurrDelta() + "\n")
		  .append("       nAskPrice = " +  arrayToStr(data.getAskPrice()) + "\n")
		  .append("         nAskVol = " +  arrayToStr(data.getAskVol()) + "\n")
		  .append("       nBidPrice = " +  arrayToStr(data.getBidPrice()) + "\n")
		  .append("         nBidVol = " +  arrayToStr(data.getBidVol()) + "\n");
		
		System.out.println(sb.toString());	
	}
	
	/*************************************Transaction Data***************************************/
	public static void OutputTransaction(TDF_TRANSACTION data, int serverTime, String localCurrentTime){  
/*
 * "����","����ʱ��","������ʱ��","������ʱ��","��ô���","ԭʼ����","ҵ������(��Ȼ��)",
		    		           "�ɽ����","�ɽ��۸�","�ɽ�����","�ɽ����","��������","�ɽ����","�ɽ�����",
		    		           "����ί�����","��ί�����"		
 */
        String[] contents = {CurrrentDate,
	             localCurrentTime,
	             String.valueOf(serverTime),
	             String.valueOf(data.getTime()),
	             data.getWindCode(),
	             data.getCode(),
	             String.valueOf(data.getActionDay()),
	             String.valueOf(data.getIndex()),        			             
	             String.valueOf(data.getPrice()),
	             String.valueOf(data.getVolume()),
	             String.valueOf(data.getTurnover()),
	             String.valueOf(data.getBSFlag()),
	             String.valueOf(data.getOrderKind()),
	             String.valueOf(data.getFunctionCode()),
	             String.valueOf(data.getAskOrder()),
	             String.valueOf(data.getBidOrder())                    
        };         
	}		
	public static void printTransaction(TDF_TRANSACTION data ){
		System.out.println("TDF_TRANSACTION");
		StringBuilder sb = new StringBuilder();
		sb.append("    szWindCode = " +  data.getWindCode() + "\n")
		  .append("        szCode = " +  data.getCode() + "\n")
		  .append("    nActionDay = " +  data.getActionDay() + "\n")
		  .append("         nTime = " +  data.getTime() + "\n")
		  .append("        nIndex = " +  data.getIndex() + "\n")
		  .append("        nPrice = " +  data.getPrice() + "\n")
		  .append("       nVolume = " +  data.getVolume() + "\n")
		  .append("     nTurnover = " +  data.getTurnover() + "\n")
		  .append("       nBSFlag = " +  data.getBSFlag() + "\n")
		  .append("   chOrderKind = " +  data.getOrderKind() + "\n")
		  .append("chFunctionCode = " +  data.getFunctionCode() + "\n")
		  .append("     nAskOrder = " +  data.getAskOrder() + "\n")
		  .append("     nBidOrder = " +  data.getBidOrder() + "\n");
		
		System.out.println(sb.toString());
	}
	
	/*************************************Order Data***************************************/
	public static void OutputOrder(TDF_ORDER data, int serverTime, String localCurrentTime){  
/*
 * "����","����ʱ��","������ʱ��","������ʱ��","��ô���","ԭʼ����","ҵ������(��Ȼ��)",
		    		           "ί�к�", "ί�м۸�", "ί������", "ί�����", "ί�д���"
 * */
        String[] contents = {CurrrentDate,
	             localCurrentTime,
	             String.valueOf(serverTime),
	             String.valueOf(data.getTime()),
	             data.getWindCode(),
	             data.getCode(),
	             String.valueOf(data.getActionDay()),
	             String.valueOf(data.getOrder()),        			             
	             String.valueOf(data.getPrice()),
	             String.valueOf(data.getVolume()),
	             String.valueOf(data.getOrderKind()),
	             String.valueOf(data.getFunctionCode())                    
        };         
	}
	public static void printOrder(TDF_ORDER data ){
		System.out.println("TDF_ORDER");
		StringBuilder sb = new StringBuilder();
		sb.append("    szWindCode = " +  data.getWindCode() + "\n")
		  .append("        szCode = " +  data.getCode() + "\n")
		  .append("    nActionDay = " +  data.getActionDay() + "\n")
		  .append("         nTime = " +  data.getTime() + "\n")
		  .append("        nOrder = " +  data.getOrder() + "\n")
		  .append("        nPrice = " +  data.getPrice() + "\n")
		  .append("       nVolume = " +  data.getVolume() + "\n")
		  .append("   chOrderKind = " +  data.getOrderKind() + "\n")
		  .append("chFunctionCode = " +  data.getFunctionCode() + "\n");

		System.out.println(sb.toString());
	}
	
	/*************************************OrderQueue Data***************************************/
	public static void OutputOrderQueue(TDF_ORDER_QUEUE data, int serverTime, String localCurrentTime){  
		/*
		 * "����","����ʱ��","������ʱ��","������ʱ��","��ô���","ԭʼ����","ҵ������(��Ȼ��)",
		    		           "��������","�ɽ��۸�","��������","��ϸ����","������ϸ"
		 * */
        String[] contents = {CurrrentDate,
	             localCurrentTime,
	             String.valueOf(serverTime),
	             String.valueOf(data.getTime()),
	             data.getWindCode(),
	             data.getCode(),
	             String.valueOf(data.getActionDay()),
	             String.valueOf(data.getSide()),        			             
	             String.valueOf(data.getPrice()),
	             String.valueOf(data.getOrders()),
	             String.valueOf(data.getABItems()),
	             arrayToStr(data.getABVolume(),data.getABItems())                   
        };         
	}
	public static void printOrderQueue(TDF_ORDER_QUEUE data ){
		System.out.println("TDF_ORDER_QUEUE");
		StringBuilder sb = new StringBuilder();
		sb.append("     szWindCode = " +  data.getWindCode() + "\n")
		  .append("         szCode = " +  data.getCode() + "\n")
		  .append("     nActionDay = " +  data.getActionDay() + "\n")
		  .append("          nTime = " +  data.getTime() + "\n")
		  .append("          nSide = " +  data.getSide() + "\n")
		  .append("         nPrice = " +  data.getPrice() + "\n")
		  .append("        nOrders = " +  data.getOrders() + "\n")
		  .append("       nABItems = " +  data.getABItems() + "\n")
		  .append("     nABVolume; = " +  arrayToStr(data.getABVolume(), data.getABItems()) + "\n");

		System.out.println(sb.toString());
	}

	
	/*************************************SYS Data***************************************/
	public static void printConnectResult(TDF_CONNECT_RESULT data ){
		System.out.println("TDF_CONNECT_RESULT");
		StringBuilder sb = new StringBuilder();
		sb.append("            szIp = " +  data.getIp() + "\n")
		  .append("          szPort = " +  data.getPort() + "\n")
		  .append("          szUser = " +  data.getUser() + "\n")
		  .append("           szPwd = " +  data.getPwd() + "\n")
		  .append("   nConnectionID = " +  data.getConnectionID() + "\n")
		  .append("     nConnResult = " +  data.getConnResult() + "\n");

		System.out.println(sb.toString());
	}

	public static void printLoginResult(TDF_LOGIN_RESULT data ){
		System.out.println("��½�����");
		StringBuilder sb = new StringBuilder();
		sb.append("    nLoginResult = " +  data.getLoginResult() + "\n")
		  .append("          szInfo = " +  data.getInfo() + "\n")
		  .append("        nMarkets = " +  data.getMarkets() + "\n")
		  .append("        szMarket = " +  arrayToStr(data.getMarket(), data.getMarkets()) + "\n")
		  .append("        nDynDate = " +  arrayToStr(data.getDynDate(), data.getMarkets()) + "\n");

		System.out.println(sb.toString());
	}

	public static void printCodeTableResult(TDF_CODE_RESULT data ){
		System.out.println("TDF_CODE_RESULT");
		StringBuilder sb = new StringBuilder();
		sb.append("          szInfo = " +  data.getInfo() + "\n")
		  .append("        nMarkets = " +  data.getMarkets() + "\n")
		  .append("        szMarket = " +  arrayToStr(data.getMarket(), data.getMarkets()) + "\n")
		  .append("      nCodeCount = " +  arrayToStr(data.getCodeCount(), data.getMarkets()) + "\n")
		  .append("       nCodeDate = " +  arrayToStr(data.getCodeDate(), data.getMarkets()) + "\n");

		System.out.println(sb.toString());
	}

	public static void printMarketClose(TDF_MARKET_CLOSE data ){
		System.out.println("TDF_MARKET_CLOSE");
		StringBuilder sb = new StringBuilder();
		sb.append("        szMarket = " +  data.getMarket() + "\n")
		  .append("           nTime = " +  data.getTime() + "\n")
		  .append("          chInfo = " +  data.getInfo() + "\n");

		System.out.println(sb.toString());
	}
	
	public static void printDateChange(TDF_QUOTATIONDATE_CHANGE data) {
		System.out.println("TDF_QUOTATIONDATE_CHANGE");
		StringBuilder sb = new StringBuilder();
		sb.append("        szMarket = " +  data.getMarket() + "\n")
		  .append("        nOldDate = " +  data.getOldDate() + "\n")
		  .append("        nNewDate = " +  data.getNewDate() + "\n");

		System.out.println(sb.toString());
	}
	
	public static void printOptionCode(TDF_OPTION_CODE data)
	{
		System.out.println("TDF_OPTION_CODE");
		StringBuilder sb = new StringBuilder();
		sb.append("        szContractID = " +  data.getContractID() + "\n")
		  .append("        szUnderlyingSecurityID = " +  data.getUnderlyingSecurityID() + "\n")
		  .append("        chCallOrPut = " +  data.getCallOrPut() + "\n")
			.append("        szWindCode = " +  data.getBasicCode().getWindCode() + "\n")
			.append("        szMarket = " +  data.getBasicCode().getMarket() + "\n")
			.append("        szCNName = " +  data.getBasicCode().getCNName() + "\n")
			.append("        ContractID = " +  data.getContractID() + "\n")
			.append("        UnderlyingSecurityID = " +  data.getUnderlyingSecurityID() + "\n")
			.append("        CallOrPut = " +  data.getCallOrPut() + "\n")
			.append("        ExerciseDate = " +  data.getExerciseDate() + "\n")
			.append("        OptionType = " +  data.getOptionType() + "\n");

		System.out.println(sb.toString());
	}
}
