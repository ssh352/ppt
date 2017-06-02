package com.explosion.trade.ctp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class COMMODITYCONSTANT{
	public final static Map<String, Double> COMMODITYUNITMAP 				= new HashMap<String, Double>();
	public final static Map<String, String> COMMODITYTYPE 					= new HashMap<String, String>();
	public final static Map<String, ArrayList<String>> COMMODITYTYPELIST 	= new HashMap<String, ArrayList<String>>();
	public final static Map<String, String> COMMODITYZHULI 					= new HashMap<String, String>();
	static {
		COMMODITYUNITMAP.put("A", 1.0);
		COMMODITYUNITMAP.put("B", 1.0);
		COMMODITYUNITMAP.put("BB", 0.05);
		COMMODITYUNITMAP.put("C", 1.0);
		COMMODITYUNITMAP.put("CS", 1.0);
		COMMODITYUNITMAP.put("FB", 0.05);
		COMMODITYUNITMAP.put("I", 0.5);
		COMMODITYUNITMAP.put("J", 0.5);
		COMMODITYUNITMAP.put("JD", 1.0);
		COMMODITYUNITMAP.put("JM", 0.5);
		COMMODITYUNITMAP.put("L", 5.0);
		COMMODITYUNITMAP.put("M", 1.0);
		COMMODITYUNITMAP.put("P", 2.0);
		COMMODITYUNITMAP.put("PP", 1.0);
		COMMODITYUNITMAP.put("V", 5.0);
		COMMODITYUNITMAP.put("Y", 2.0);
		COMMODITYUNITMAP.put("CF", 5.0);
		COMMODITYUNITMAP.put("FG", 1.0);
		COMMODITYUNITMAP.put("JR", 1.0);
		COMMODITYUNITMAP.put("LR", 1.0);
		COMMODITYUNITMAP.put("MA", 1.0);
		COMMODITYUNITMAP.put("OI", 2.0);
		COMMODITYUNITMAP.put("PM", 1.0);
		COMMODITYUNITMAP.put("RI", 1.0);
		COMMODITYUNITMAP.put("RM", 1.0);
		COMMODITYUNITMAP.put("RS", 1.0);
		COMMODITYUNITMAP.put("SF", 2.0);
		COMMODITYUNITMAP.put("SM", 2.0);
		COMMODITYUNITMAP.put("SR", 1.0);
		COMMODITYUNITMAP.put("TA", 2.0);
		COMMODITYUNITMAP.put("WH", 1.0);
		COMMODITYUNITMAP.put("ZC", 0.2);
		COMMODITYUNITMAP.put("AG", 1.0);
		COMMODITYUNITMAP.put("AL", 5.0);
		COMMODITYUNITMAP.put("AU", 0.05);
		COMMODITYUNITMAP.put("BU", 2.0);
		COMMODITYUNITMAP.put("CU", 10.0);
		COMMODITYUNITMAP.put("FU", 1.0);
		COMMODITYUNITMAP.put("HC", 1.0);
		COMMODITYUNITMAP.put("NI", 10.0);
		COMMODITYUNITMAP.put("PB", 5.0);
		COMMODITYUNITMAP.put("RB", 1.0);
		COMMODITYUNITMAP.put("RU", 5.0);
		COMMODITYUNITMAP.put("SN", 10.0);
		COMMODITYUNITMAP.put("WR", 1.0);
		COMMODITYUNITMAP.put("ZN", 5.0);
		COMMODITYUNITMAP.put("IF", 0.2);
		COMMODITYUNITMAP.put("IC", 0.2);
		COMMODITYUNITMAP.put("IH", 0.2);
		COMMODITYUNITMAP.put("T", 0.005);
		
		COMMODITYTYPE.put("A",  "nongchanpin");
		COMMODITYTYPE.put("AG", "guijinshu");
		COMMODITYTYPE.put("AL", "youse");
		COMMODITYTYPE.put("BU", "huagong");
		COMMODITYTYPE.put("C",  "qita");
		COMMODITYTYPE.put("CF", "qita");
		COMMODITYTYPE.put("CS", "qita");
		COMMODITYTYPE.put("CU", "youse");
		COMMODITYTYPE.put("FG", "qita");
		COMMODITYTYPE.put("HC", "heise");
		COMMODITYTYPE.put("I",  "heise");
		COMMODITYTYPE.put("J",  "heise");
		COMMODITYTYPE.put("JD", "qita");
		COMMODITYTYPE.put("JM", "heise");
		COMMODITYTYPE.put("L",  "huagong");
		COMMODITYTYPE.put("M",  "nongchanpin");
		COMMODITYTYPE.put("MA", "huagong");
		COMMODITYTYPE.put("NI", "youse");
		COMMODITYTYPE.put("OI", "nongchanpin");
		COMMODITYTYPE.put("P",  "nongchanpin");
		COMMODITYTYPE.put("PB", "youse");
		COMMODITYTYPE.put("PP", "huagong");
		COMMODITYTYPE.put("RB", "heise");
		COMMODITYTYPE.put("RM", "nongchanpin");
		COMMODITYTYPE.put("RU", "huagong");
		COMMODITYTYPE.put("SN", "youse");
		COMMODITYTYPE.put("SR", "qita");
		COMMODITYTYPE.put("TA", "huagong");
		COMMODITYTYPE.put("V",  "huagong");
		COMMODITYTYPE.put("Y",  "nongchanpin");
		COMMODITYTYPE.put("ZC", "heise");
		COMMODITYTYPE.put("ZN", "youse");
		
		COMMODITYTYPE.put("IH", "guzhi");
		COMMODITYTYPE.put("T", "guozhai");
		
		
		ArrayList e = new ArrayList<String>();
		e.add("AG");
		COMMODITYTYPELIST.put("guijinshu", e);
		
		e = new ArrayList<String>();
		e.add("I");
		e.add("J");
		e.add("HC");
		e.add("JM");
		e.add("RB");
		e.add("ZC");
		COMMODITYTYPELIST.put("heise", e);
		
		e = new ArrayList<String>();
		e.add("L");	
		e.add("V");	
		e.add("BU");	
		e.add("MA");	
		e.add("PP");	
		e.add("RU");	
		e.add("TA");	
		COMMODITYTYPELIST.put("huagong", e);
		
		e = new ArrayList<String>();
		e.add("A");	
		e.add("M");	
		e.add("P");	
		e.add("Y");	
		e.add("OI");	
		e.add("RM");	
		COMMODITYTYPELIST.put("nongchanpin", e);
		
		e = new ArrayList<String>();
		e.add("C");
		e.add("CF");
		e.add("CS");
		e.add("FG");
		e.add("JD");
		e.add("SR");
		COMMODITYTYPELIST.put("qita", e);
		
		e = new ArrayList<String>();
		e.add("AL");
		e.add("CU");
		e.add("NI");
		e.add("PB");
		e.add("SN");
		e.add("ZN");
		COMMODITYTYPELIST.put("youse", e);
		
	}

}
