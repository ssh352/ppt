

package com.dp.tactic.cta.trend;

import com.explosion.tactic.util.Portfolio;
import com.explosion.tactic.util.Tactic;
import com.explosion.trade.ctp.type.DPCThostFtdcDepthMarketDataField;
import com.explosion.trade.util.Entrust;
import net.jctp.JctpConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.rosuda.JRI.REXP;
import org.rosuda.JRI.RVector;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.explosion.base.helper;
import com.explosion.quote.util.LastQuoteMap;
import com.explosion.tactic.cta.pairarb.util.TacticAttr;
import com.explosion.tactic.cta.trend.util.CTATrendInstr;

import com.explosion.trade.ctp.COMMODITYCONSTANT;

public class LastPriceVsMaxMin extends Tactic{
	private String 					 m_sScopeFile;
	private String 					 m_sStrategyName;
	private String 					 m_sRfunc;
	private String 					 m_sGetPosSQL 	= "select * from v_position where tactictype = '%s' and userid = '%s' and abs(openVol) > abs(closeVol)";
	private String 					 m_sGetAssetSQL = "select * from asset where userid = '%s'";
	private int 					 m_OpenBackDays;
	private int 					 m_CloseBackDays;
	
	private double 					 m_PctChangeLimit = 0.0;
	private double					 m_Asset 		  = 0.0;
	private double					 m_Margin 		  = 30000; 
	
	private ConcurrentHashMap<String, CTATrendInstr> m_InstrMap;
	private ConcurrentHashMap<String, DPCThostFtdcDepthMarketDataField> m_LastQuoteMap;
	private ConcurrentHashMap<String, instrclass> m_InstrClassMap;
	private ConcurrentHashMap<String, String> m_NeedTradeIDMap;
	private LastQuoteMap 			 m_cQuoteMap;
	private boolean 				 m_InitSuccess = false;
	

	
	public LastPriceVsMaxMin(ConcurrentLinkedQueue<Portfolio> q){
		m_ArithTradeLastOrderQueue 		= q;
		m_sStrategyName 				= "LastPriceVsMaxMin";
		
		InitConfig();	
		InitFuture();
		ConnectDB();
		m_tacticattr 		 			= new TacticAttr(m_sStrategyName);
		m_LastQuoteMap 					= new ConcurrentHashMap<String, DPCThostFtdcDepthMarketDataField>();
		m_InstrMap						= new ConcurrentHashMap<String, CTATrendInstr>();
		m_InstrClassMap					= new ConcurrentHashMap<String, instrclass>();
		m_NeedTradeIDMap				= new ConcurrentHashMap<String, String>();
		m_InitSuccess 					= InitInstrMap();
		
		if(m_InitSuccess){
			InitHolding();
			InitAsset();
			StartQuoteMap();
		}
	}
	
	private void StartQuoteMap(){
		m_cQuoteMap 			= new LastQuoteMap(m_LastQuoteMap);
		Thread QuoteMapThread 	= new Thread(m_cQuoteMap);
		QuoteMapThread.start();
		QuoteMapThread.setName("QUOTEMAPTHREAD");
	}
	
	private boolean InitInstrMap(){
		String sCmd 				= String.format("%s('%s', %s, %s, %s, %s)", 
														m_sRfunc, 
														m_sScopeFile, 
														m_OpenBackDays,
														m_CloseBackDays,
														m_ctpinfo.getSuserId(),
														m_PctChangeLimit/100);
		REXP value					= m_tacticattr.ExecRCmd(sCmd);
		
		if(value == null){
			m_log.info(String.format("R cmd '%s' got nothing return.", sCmd));
			return false;
		}else{
			RVector r 				= value.asVector();
			String[] ids 			= r.at("id").asStringArray();
			String[] wincodes 		= r.at("s_info_windcode").asStringArray();
			String[] ctpid  		= r.at("ctpid").asStringArray();
			String[] strids  		= r.at("strid").asStringArray();
			String[] types  		= r.at("type").asStringArray();
			double[] weights 		= r.at("weight").asDoubleArray();
			double[] openpremins 	= r.at("openpremin").asDoubleArray();
			double[] closepremins 	= r.at("closepremin").asDoubleArray();
			double[] openpremaxs 	= r.at("openpremax").asDoubleArray();
			double[] closepremaxs 	= r.at("closepremax").asDoubleArray();
			double[] appends 		= r.at("appendnum").asDoubleArray();
			double[] nums 			= r.at("num").asDoubleArray();
			double[] dates 			= r.at("date").asDoubleArray();
			double[] atrs 			= r.at("ATRPCT").asDoubleArray();
			int[] times 			= r.at("times").asIntArray();
			
			m_SubCodes 				= StringUtils.join(ctpid, ",");
			
			for(int i=0; i<dates.length; i++){
				CTATrendInstr instr = new CTATrendInstr(m_OpenBackDays, 
														(int) Math.round(appends[i]), 
														openpremaxs[i], 
														openpremins[i],
														weights[i],
														String.format("%s",dates[i]),
														wincodes[i],
														strids[i],
														ctpid[i],
														(int) Math.round(nums[i])); 
				instr.closepremax 	= closepremaxs[i];
				instr.closepremin 	= closepremins[i];
				instr.m_Times 		= times[i];
				instr.m_sType 		= types[i];
				instr.m_ATRPCT 		= atrs[i];
				
				m_InstrMap.put(ctpid[i], instr);
				m_LastQuoteMap.put(ctpid[i], new DPCThostFtdcDepthMarketDataField());
				if(!COMMODITYCONSTANT.COMMODITYZHULI.containsKey(ids[i])){
					COMMODITYCONSTANT.COMMODITYZHULI.put(ids[i], ctpid[i]);
				}
			}
		}
		
		// record class available cash
		value						= m_tacticattr.ExecRCmd("classcash");
		if(value == null){
			m_log.info(String.format("R cmd '%s' got nothing return.", "classcash"));
			return false;
		}else{
			RVector r 				= value.asVector();
			String[] types  		= r.at("type").asStringArray();			
			double[] classwts 		= r.at("classwt").asDoubleArray();
			double[] cashs 			= r.at("cash").asDoubleArray();
			double[] longused 		= r.at("longused").asDoubleArray();
			double[] longavailable 	= r.at("longavailable").asDoubleArray();
			double[] shortused 		= r.at("shortused").asDoubleArray();
			double[] shortavailable = r.at("shortavailable").asDoubleArray();
			
			
			for(int i=0; i<types.length; i++){
				instrclass CInstr = new instrclass(classwts[i], cashs[i], longused[i], longavailable[i], shortused[i], shortavailable[i]);
				m_InstrClassMap.put(types[i], CInstr);
			}
		}
		
		
		return true;
	}
	
	public void UnSubscribeHq(String sCtpTradeID){
		m_log.info("Remove " + sCtpTradeID + " Hq data");
		m_LastQuoteMap.remove(sCtpTradeID);
	}
	
	public void TradeNextInstr(String ID){
		Portfolio Port 			= new Portfolio();
		Port.m_ListFuture.clear();
		Port.m_ListSecurity.clear();
		Port.m_PortInfo			= m_ProdInfo;
		m_TacticID 				= helper.GenerateGuid();
		Port.m_TacticID 		= m_TacticID;

		String ctpid  			= "";
		if(COMMODITYCONSTANT.COMMODITYZHULI.containsKey(ID)){
			ctpid  			= COMMODITYCONSTANT.COMMODITYZHULI.get(ID);
		}else{
			m_log.error(String.format("There is no %s major info", ID));
			return;
		}		
		CTATrendInstr instr 	= m_InstrMap.get(ctpid);
		
		if(instr == null){
			m_log.error(String.format("There is no %s data, so can't be traded.", ctpid));
			m_NeedTradeIDMap.remove(ID);
			return;
		}
		
		if(instr.m_Pos != 0){
			m_log.error(String.format("There is %s open postion.", ctpid));
			m_NeedTradeIDMap.remove(ID);
			return;
		}
		
		double lastprice 		= 0;
		Entrust NextE 			= null; 
		if(m_LastQuoteMap.containsKey(instr.m_sCtpTradeID)){
			lastprice 	= m_LastQuoteMap.get(instr.m_sCtpTradeID).LastPrice;
		}
		if(lastprice == 0 ){
			return;
		}
		
		String sBS = m_NeedTradeIDMap.get(ID);
		String 	Remark 		= String.format("Instr Change: portsname %s, instr: %s, openpremax:%f, openpremin:%f, last price: %f, closepremin: %f, closepremax: %f",
											m_ProdInfo.getProdName(),instr.m_sCtpTradeID, instr.m_max, instr.m_min, lastprice, instr.closepremin, instr.closepremax);
		m_log.info(Remark);
		if(sBS.equals("LONG")){
			double price 	= calcPrice(JctpConstants.THOST_FTDC_D_Buy, instr.m_sCtpTradeID, lastprice, instr.m_AppendNum);
			int num = calcNum(instr, lastprice, sBS);
			if(num > 0 ){
				NextE = new Entrust(instr.m_sCtpTradeID, price, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Buy, num);
				ModifyAvailable(instr, price, true, sBS);
			}
			UnSubscribeHq(ctpid);
		}else if(sBS.equals("SHORT")){
			double price 	= calcPrice(JctpConstants.THOST_FTDC_D_Sell, instr.m_sCtpTradeID, lastprice, instr.m_AppendNum);
			int num = calcNum(instr, lastprice, sBS);
			if(num > 0){
				NextE = new Entrust(instr.m_sCtpTradeID, price, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Sell, num);
				ModifyAvailable(instr, price, true, sBS);
			}
			UnSubscribeHq(ctpid);
		}
		if(NextE != null){
			instr.m_traded 		= 1;
			NextE.m_PortInfo 		= m_ProdInfo;
			NextE.m_remark			= Remark;
			m_log.info(NextE.m_remark);
			m_log.info(NextE.toString());
			Port.m_ListFuture.add(NextE);
			m_ArithTradeLastOrderQueue.add(Port);
		}	
		
		m_NeedTradeIDMap.remove(ID);
	}
	
	@Override
	public void run(){
		if(!m_InitSuccess){
			Terminate();
		}
		
		while(m_Start){
			
			if(m_NeedTradeIDMap.size() > 0){
				for(String ID : m_NeedTradeIDMap.keySet()){
					TradeNextInstr(ID);	
				}
			}
			
			for(String ctpid : m_LastQuoteMap.keySet()){
				Portfolio Port 			= new Portfolio();
				Port.m_ListFuture.clear();
				Port.m_ListSecurity.clear();
				Port.m_PortInfo			= m_ProdInfo;
				m_TacticID 				= helper.GenerateGuid();
				Port.m_TacticID 		= m_TacticID;
				CTATrendInstr instr 	= m_InstrMap.get(ctpid);
				double lastprice 		= 0;
				
				if(m_LastQuoteMap.containsKey(instr.m_sCtpTradeID)){
					lastprice 	= m_LastQuoteMap.get(instr.m_sCtpTradeID).LastPrice;
				}else{
					m_log.info("Not subscribe " + instr.m_sCtpTradeID);
					continue;
				}
				
				if(instr.m_traded == 1 || lastprice == 0 ){
					continue;
				}
				
				Entrust e 			= null;
				String 	Remark 		= String.format("portsname %s, instr: %s, openpremax:%f, openpremin:%f, last price: %f, closepremin: %f, closepremax: %f",
										m_ProdInfo.getProdName(),instr.m_sCtpTradeID, instr.m_max, instr.m_min, lastprice, instr.closepremin, instr.closepremax);
				m_log.info(Remark);
				
				if(instr.m_InstrChange && instr.m_Pos != 0){
					String sID 				= helper.filterNumber(instr.m_sCtpTradeID).toUpperCase();
					String sBS 				= instr.m_Pos > 0 ?  "LONG" : "SHORT";
					e 						= Close(lastprice, instr, true);
					m_NeedTradeIDMap.put(sID, sBS);
					Port.m_TacticID 		= instr.m_TacticID;
				}else{
					if(instr.m_Pos != 0){
						// have short pos. Close
						e 				= Close(lastprice, instr);
						Port.m_TacticID = instr.m_TacticID;
					}else{
						e = Open(lastprice, instr);
					}	
				}
				
				if(e != null){
					instr.m_traded 		= 1;
					e.m_PortInfo 		= m_ProdInfo;
					e.m_remark			= Remark;
					m_log.info(e.m_remark);
					m_log.info(e.toString());
					Port.m_ListFuture.add(e);
					m_ArithTradeLastOrderQueue.add(Port);
				}	
			}
			try {
				sleep(INTERVAL);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				m_log.error(e1.toString());
			}
		}
		m_log.warn(String.format("%s Quit!", m_ProdInfo.getStrategyName()));
	}
	
	public int calcNum(CTATrendInstr instr, double price, String sBS){
		int num 			= 0;
		double avaicash 	= 0;
		if(sBS.equals("LONG")){
			avaicash 	= m_InstrClassMap.get(instr.m_sType).m_longavailable;
		}else{
			avaicash 	= m_InstrClassMap.get(instr.m_sType).m_shortavailable;
		}
		
		if(avaicash > 0){
			num = (int) Math.floor((avaicash*instr.m_Weight/instr.m_ATRPCT)/(price * instr.m_Times));
			num = (num > 0 ? num:1);
		}
		
		
		String sID 				= helper.filterNumber(instr.m_sCtpTradeID).toUpperCase();
		if(sID.equals("AG")){
			num = (num > 5 ? 5:num);
		}else if(sID.equals("IH")){
			num = (num > 1 ? 1:num);
		}else if(sID.equals("T")){
			num = (num > 1 ? 1:num);
		}
		
		return num;
	}
	
	
	public Entrust Close(double lastprice, CTATrendInstr instr){
		return Close(lastprice, instr, false);	
	}
	
	public Entrust Close(double lastprice, CTATrendInstr instr, boolean instrChanged){
		double price		= lastprice;
		Entrust e 			= null;
		
		if(!instrChanged){
			if(instr.m_Pos < 0 && lastprice > instr.closepremax){
				// have short pos. Close
				
				price 				= calcPrice(JctpConstants.THOST_FTDC_D_Buy, instr.m_sCtpTradeID, lastprice, instr.m_AppendNum);
				e 					= new Entrust(instr.m_sCtpTradeID, price, JctpConstants.STRING_THOST_FTDC_OF_Close, JctpConstants.THOST_FTDC_D_Buy, Math.abs(instr.m_Pos));
				instr.m_Pos			= 0;
				ModifyAvailable(instr, price, false, "LONG");
			}else if(instr.m_Pos > 0 && lastprice < instr.closepremin){
				// have long pos.  Close
				price 				= calcPrice(JctpConstants.THOST_FTDC_D_Sell, instr.m_sCtpTradeID, lastprice, instr.m_AppendNum);
				e 					= new Entrust(instr.m_sCtpTradeID, price, JctpConstants.STRING_THOST_FTDC_OF_Close, JctpConstants.THOST_FTDC_D_Sell, Math.abs(instr.m_Pos));
				instr.m_Pos			= 0;
				ModifyAvailable(instr, price, false, "SHORT");
			}
		}else{
			if(instr.m_Pos < 0){
				price 				= calcPrice(JctpConstants.THOST_FTDC_D_Buy, instr.m_sCtpTradeID, lastprice, instr.m_AppendNum);
				e 					= new Entrust(instr.m_sCtpTradeID, price, JctpConstants.STRING_THOST_FTDC_OF_Close, JctpConstants.THOST_FTDC_D_Buy, Math.abs(instr.m_Pos));
				instr.m_Pos			= 0;
				instr.m_InstrChange = false;
				ModifyAvailable(instr, price, false, "LONG");
			}else if(instr.m_Pos > 0){
				// have long pos. Close
				price 				= calcPrice(JctpConstants.THOST_FTDC_D_Sell, instr.m_sCtpTradeID, lastprice, instr.m_AppendNum);
				e 					= new Entrust(instr.m_sCtpTradeID, price, JctpConstants.STRING_THOST_FTDC_OF_Close, JctpConstants.THOST_FTDC_D_Sell, Math.abs(instr.m_Pos));
				instr.m_Pos			= 0;
				instr.m_InstrChange = false;
				ModifyAvailable(instr, price, false, "SHORT");
			}
		}
		return e;
	}
	
	private void ModifyAvailable(CTATrendInstr instr, double price, boolean open, String sBS){
		
		instrclass InstrC 	= m_InstrClassMap.get(instr.m_sType);
		if(open){
			if(sBS.equals("LONG")){
				InstrC.m_longused 	= InstrC.m_longused + instr.m_Num * price * instr.m_Times;
			}else if(sBS.equals("SHORT")){
				InstrC.m_shortused 	= InstrC.m_shortused - instr.m_Num * price * instr.m_Times;	
			}
		}else{
			if(sBS.equals("LONG")){
				InstrC.m_longused 	= InstrC.m_longused - instr.m_Num * price * instr.m_Times;
			}else if(sBS.equals("SHORT")){
				InstrC.m_shortused 	= InstrC.m_shortused + instr.m_Num * price * instr.m_Times;	
			}
		}
		
		if(sBS.equals("LONG")){
			InstrC.m_longavailable	= InstrC.m_cash - InstrC.m_longavailable;
		}else if(sBS.equals("SHORT")){
			InstrC.m_shortavailable	= InstrC.m_cash - InstrC.m_shortavailable;	
		}
		
	}
	
	public Entrust Open(double lastprice, CTATrendInstr instr){
		double price		= lastprice;
		Entrust e 			= null;
		if(lastprice > instr.m_max){
			// LONG
			price 	= calcPrice(JctpConstants.THOST_FTDC_D_Buy, instr.m_sCtpTradeID, lastprice, instr.m_AppendNum);
			int num = calcNum(instr, lastprice, "LONG");
			if(num != 0){
				// no pos. Open
				e = new Entrust(instr.m_sCtpTradeID, price, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Buy, num);
				ModifyAvailable(instr, price, true, "LONG");
			}
			UnSubscribeHq(instr.m_sCtpTradeID);
		}else if(lastprice < instr.m_min){
			// SHORT
			price = calcPrice(JctpConstants.THOST_FTDC_D_Sell, instr.m_sCtpTradeID, lastprice, instr.m_AppendNum);
			// no pos. Open
			int num = calcNum(instr, lastprice, "SHORT");
			if(num != 0){
				e = new Entrust(instr.m_sCtpTradeID, price, JctpConstants.STRING_THOST_FTDC_OF_Open, JctpConstants.THOST_FTDC_D_Sell, num);
				ModifyAvailable(instr, price, true, "SHORT");
			}
			UnSubscribeHq(instr.m_sCtpTradeID);
		}
		return e;
	}
	
	public void InitConfigFile(){
		m_sConfigFile					= String.format("%s%sconf%ss_%s.properties",System.getProperty("user.dir"), File.separator, File.separator, m_sStrategyName.toLowerCase());
		m_configProps 					= helper.loadConfig(m_sConfigFile);	
	}
	
	public void InitConfig(){
		InitConfigFile();
		m_sScopeFile 					= m_configProps.getProperty("tactic.strategy.lastpricevsmaxmin.scopefile");
		m_sRfunc 						= m_configProps.getProperty("tactic.strategy.lastpricevsmaxmin.rfunc");
		m_OpenBackDays					= Integer.parseInt(m_configProps.getProperty("tactic.strategy.lastpricevsmaxmin.openbackdays"));
		m_CloseBackDays					= Integer.parseInt(m_configProps.getProperty("tactic.strategy.lastpricevsmaxmin.closebackdays"));
		m_PctChangeLimit 				= Integer.parseInt(m_configProps.getProperty("tactic.strategy.lastpricevsmaxmin.pctchangeslimit"));
		
		SetPortInfo(m_configProps.getProperty("tactic.strategy.lastpricevsmaxmin.portid"), 				m_sStrategyName);
	}
	
	public void InitAsset(){
		JSONArray asset 			= m_DB.Query(String.format(m_sGetAssetSQL, m_ctpinfo.getSuserId()));
		JSONObject jsonasset 		= asset.getJSONObject(0);
		m_Asset 					= jsonasset.getDoubleValue("available");
	}
	
	@Override
	public int CalcSignal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean PrepareData() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean InitSecurity() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean CheckPort() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void GeneratePortfolio(String direction, String remark) {
		// TODO Auto-generated method stub
	}
	

	@Override
	protected void InitHolding() {
		// TODO Auto-generated method stub
		JSONArray holdling = m_DB.Query(String.format(m_sGetPosSQL, m_sStrategyName, m_ctpinfo.getSuserId()));
		
		if(holdling.size() >= 0){
			for(int i=0; i<holdling.size(); i++){
				JSONObject jsonHolding 		= holdling.getJSONObject(i);
				String sInstrumentid 		= jsonHolding.getString("instrumentid");
				String sID 					= helper.filterNumber(sInstrumentid).toUpperCase();
				
				System.out.println(sInstrumentid);
				
				if(sInstrumentid != null){
					if(m_InstrMap.containsKey(sInstrumentid)){
						CTATrendInstr instr = m_InstrMap.get(sInstrumentid);
						instr.m_TacticID 	= jsonHolding.getString("tacticid");
						instr.m_Pos			= jsonHolding.getInteger("openVol");
						
					}else if(!m_InstrMap.containsKey(sInstrumentid) && COMMODITYCONSTANT.COMMODITYZHULI.containsKey(sID)){
						m_log.warn(String.format("Find instrument: %s not in scope file. Maybe %s is not the major instr", 
													sInstrumentid, 
													sInstrumentid));
						CTATrendInstr instr = new CTATrendInstr(jsonHolding.getString("tacticid"),
																jsonHolding.getString("instrumentid"),
																jsonHolding.getInteger("openVol"),
																20,
																true);
						String sId = helper.filterNumber(jsonHolding.getString("instrumentid")).toUpperCase();
						instr.setM_sType(COMMODITYCONSTANT.COMMODITYTYPE.get(sId));
						m_SubCodes = String.format("%s,%s", m_SubCodes, instr.m_sCtpTradeID);
						m_InstrMap.put(instr.m_sCtpTradeID, instr);
						m_LastQuoteMap.put(instr.m_sCtpTradeID, new DPCThostFtdcDepthMarketDataField());			
						
					}
				}
			}
		}
	}
	
	@Override
	protected void InitTacticID(){
		
	}

}
