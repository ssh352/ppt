package com.dp.trade.oms;

import java.io.File;
import java.util.Properties;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.apache.log4j.Logger;
import com.explosion.base.helper;
import com.explosion.db.DBMysql;
import com.explosion.db.DataBaseCfg;
import com.explosion.trade.ctp.type.DPCThostFtdcInputOrderField;
import com.explosion.trade.ctp.type.DPCThostFtdcOrderField;
import com.explosion.trade.ctp.type.DPCThostFtdcTradeField;


 public class OMSDataCenter extends Thread{
	private DBMysql DB;
	private ConcurrentLinkedQueue<String> SQLQueue;
	private ConcurrentLinkedQueue<Object> ObjQueue;
	private Logger m_log 							= Logger.getLogger(OMSDataCenter.class);
	private String sConfigFile				= System.getProperty("user.dir") + File.separator + "conf" + File.separator + "config.properties";
	private Properties configProps 			= new Properties();
	
	
	private String FormatDPCThostFtdcInputOrderFieldSQL = "insert into dporder(TacticID, TacticType, BrokerID," +
																			  "InvestorID,InstrumentID,OrderRef," +
																			  "UserID,OrderPriceType,Direction," +
																			  "CombOffsetFlag,CombHedgeFlag,LimitPrice," +
																			  "VolumeTotalOriginal,TimeCondition,VolumeCondition," +
																			  "StopPrice,ForceCloseReason,RequestID," +
																			  "UserForceClose, PortSName, validinvertal, unixtime, remark)" 
															+ "values('%s','%s','%s','%s','%s','%s','%s','%s'," +
															         "'%s','%s','%s','%s','%s','%s','%s','%s'," +
															         "'%s','%s','%s','%s','%s','%s','%s')";
	
	private String FormatDPCThostFtdcOrderFieldSQL = "update dporder set ClientID = '%s'," +
																		"ExchangeID = '%s', InsertDate = '%s'," +
																		"InsertTime = '%s',CancelTime = '%s'," +
																		"BrokerOrderSeq = '%s',OrderSysID = '%s'," +
																		"OrderStatus = '%s',OrderSubmitStatus = '%s'," +
																		"OrderType = '%s',RequestID = '%s'," +
																		"StatusMsg = '%s',SuspendTime = '%s'," +
																		"TradingDay = '%s',UpdateTime = '%s'," +
																		"VolumeTraded = '%s',VolumeTotal = '%s'," +
																		"SessionID = '%s', FrontID = '%s', " +
																		"unixtime = '%s' " + 
																		"where orderref = '%s'";
	
	private String FormatDPCThostFtdcTradeFieldSQL = "insert into dptrade(BrokerID,InvestorID,InstrumentID,OrderRef,UserID,ExchangeID,TradeID,Direction,OrderSysID,ParticipantID,ClientID,TradingRole,ExchangeInstID,OffsetFlag,HedgeFlag,Price,Volume,TradeDate,TradeTime,TradeType,PriceSource,TraderID,OrderLocalID,ClearingPartID,BusinessUnit,SequenceNo,TradingDay,SettlementID,BrokerOrderSeq,TradeSource) " +
													 "values('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s') " + 
													 "ON DUPLICATE KEY UPDATE TradingDay = '%s'";
	
	public OMSDataCenter(ConcurrentLinkedQueue<Object> q){
		SQLQueue = new ConcurrentLinkedQueue<String>();
		ObjQueue = q;
		
		configProps = helper.loadConfig(sConfigFile);
		DataBaseCfg Cfg = new DataBaseCfg();
		Cfg.dbUser = configProps.getProperty("db.user");
		Cfg.dbPwd  = configProps.getProperty("db.pwd");
		Cfg.dbName = configProps.getProperty("db.name");
		Cfg.dbHost = configProps.getProperty("db.host");
		Cfg.dbPort = configProps.getProperty("db.port");
		
		DB = new DBMysql(SQLQueue, Cfg, "OMSDataCenter");
		Thread DBThread = new Thread(DB);
		DBThread.start();
		DBThread.setName("TOMSDATACENTERDB");
	}
	
	private String FormatDPCThostFtdcTradeField(DPCThostFtdcTradeField req){
		return String.format(FormatDPCThostFtdcTradeFieldSQL, req.BrokerID,
				req.InvestorID,
				req.InstrumentID,
				req.OrderRef,
				req.UserID,
				req.ExchangeID,
				req.TradeID,
				req.Direction,
				req.OrderSysID,
				req.ParticipantID,
				req.ClientID,
				req.TradingRole,
				req.ExchangeInstID,
				req.OffsetFlag,
				req.HedgeFlag,
				req.Price,
				req.Volume,
				req.TradeDate,
				req.TradeTime,
				req.TradeType,
				req.PriceSource,
				req.TraderID,
				req.OrderLocalID,
				req.ClearingPartID,
				req.BusinessUnit,
				req.SequenceNo,
				req.TradingDay,
				req.SettlementID,
				req.BrokerOrderSeq,
				req.TradeSource,
				req.TradeDate);
	}
	
	private String  FormatDPCThostFtdcOrderField(DPCThostFtdcOrderField req){
		
		return String.format(FormatDPCThostFtdcOrderFieldSQL, 
				req.ClientID,
				req.ExchangeID,
				req.InsertDate,
				req.InsertTime,
				req.CancelTime,
				req.BrokerOrderSeq,
				req.OrderSysID,
				req.OrderStatus,
				req.OrderSubmitStatus,
				req.OrderType,
				req.RequestID,
				req.StatusMsg,
				req.SuspendTime,
				req.TradingDay,
				req.UpdateTime,
				req.VolumeTraded,
				req.VolumeTotal,  
				// 20160310 add by xujun 增加 SessionID, FrontID
				req.SessionID,
				req.FrontID,
				// 20160613 add by xj 增加 unixtime
				System.currentTimeMillis(),
				req.OrderRef); 
	}
	
	
	private String FormatDPCThostFtdcInputOrderField(DPCThostFtdcInputOrderField req){
		return String.format(FormatDPCThostFtdcInputOrderFieldSQL, 
									req.TacticID,
									req.TacticType,
									req.BrokerID,
									req.InvestorID,
									req.InstrumentID,
									req.OrderRef,
									req.UserID,
									req.OrderPriceType,
									req.Direction,
									req.CombOffsetFlag,
									req.CombHedgeFlag,
									req.LimitPrice,
									req.VolumeTotalOriginal,
									req.TimeCondition,
									req.VolumeCondition,
									req.StopPrice,
									req.ForceCloseReason,
									req.RequestID,
									req.UserForceClose,
									req.PortName,
									req.validinvertal,
									req.unixtime,
									req.sRemark);
	}

	
	@Override
	public void run(){
		while (true) {
			while(ObjQueue.size()>0){
				Object obj = ObjQueue.poll(); 
				String sSQL = null;
				// CTP委托数据处理
	            if(DPCThostFtdcInputOrderField.class.equals(obj.getClass()))
	            {
	            	DPCThostFtdcInputOrderField req = (DPCThostFtdcInputOrderField) obj;
	            	m_log.info("DPCThostFtdcInputOrderField: " + req);
	            	sSQL = FormatDPCThostFtdcInputOrderField(req);
	            }
	            // CTP订单回报数据处理
	            else if(DPCThostFtdcOrderField.class.equals(obj.getClass()))
	            {
	            	DPCThostFtdcOrderField req = (DPCThostFtdcOrderField) obj;
	            	m_log.info("DPCThostFtdcInputOrderField: " + req);
	            	sSQL = FormatDPCThostFtdcOrderField(req);
	            }
	            // CTP成交回报数据处理
	            else if(DPCThostFtdcTradeField.class.equals(obj.getClass()))
	            {
	            	DPCThostFtdcTradeField req = (DPCThostFtdcTradeField) obj;
	            	m_log.info("DPCThostFtdcTradeField: " + req);
	            	sSQL = FormatDPCThostFtdcTradeField(req);
	            }
	            if(sSQL != null){
	            	m_log.info(sSQL);
	            	SQLQueue.add(sSQL);
	            }
			}
            try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				m_log.error(e.toString());
			}
		}
	}
}
 