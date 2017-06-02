package com.dp.trade.oms;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import com.dp.trade.ems.EMSModule;
import com.explosion.base.helper;
import com.explosion.db.DBMysql;
import com.explosion.db.DataBaseCfg;
import com.explosion.trade.ctp.CTPInfo;
import com.explosion.trade.ctp.TradeCtp;

import net.jctp.CThostFtdcOrderField;


public class SyncAcc extends Thread{

	private List<CTPInfo> 					m_ctpinfoList;
	private int 							m_accnum;
	private Logger 							m_log;
	private String 							m_sConfigFile = System.getProperty("user.dir") + File.separator + "conf" + File.separator + "config.properties";
	private Properties 						m_configProps = new Properties();
	private DBMysql 						m_DB;
	private ConcurrentLinkedQueue<String> 	m_SQLQueue;
	private String 							m_sDpOrderInsertSql = 	"insert into dporder( " +
																	"brokerid,investorid,userid,clientid,combhedgeflag,comboffsetflag,exchangeid, " +
																	"exchangeinstid,direction,insertdate,inserttime,canceltime,instrumentid, " +
																	"brokerorderseq,ordersysid,limitprice,orderpricetype,orderref,	orderstatus, " +			
																	"ordersubmitstatus,ordertype,requestid,statusmsg,stopprice,suspendtime, " +
																	"timecondition,tradingday,updatetime,volumecondition,volumetotal, " +
																	"volumetotaloriginal,volumetraded,forceclosereason,userforceclose, " +
																	"sessionid,frontid, " +
																	"unixtime,remark) " + 
																	"values('%s','%s','%s','%s','%s','%s','%s','%s','%s'," +
																	"'%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s'," +
																	"'%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s'," +
																	"'%s','%s','%s','%s','%s') " + 
																	"ON DUPLICATE KEY UPDATE " +
																	"canceltime			= '%s', " +
																	"orderref			= '%s', " +
																	"ordersubmitstatus	= '%s', " +
																	"orderstatus 		= '%s', " +		
																	"statusmsg			= '%s', " +
																	"suspendtime		= '%s', " +
																	"updatetime			= '%s', " +
																	"volumetotal		= '%s', " +
																	"volumetotaloriginal= '%s', " +
																	"volumetraded		= '%s', " + 
																	"userforceclose		= '%s'";
																	
	
	public SyncAcc(){
		m_SQLQueue 		= new ConcurrentLinkedQueue<String>();
		m_ctpinfoList 	= new ArrayList<CTPInfo>();
		m_configProps 	= helper.loadConfig(m_sConfigFile);
		m_log 			= Logger.getLogger(SyncAcc.class);
		DataBaseCfg Cfg = new DataBaseCfg();
		
		Cfg.dbUser 		= m_configProps.getProperty("db.user");
		Cfg.dbPwd  		= m_configProps.getProperty("db.pwd");
		Cfg.dbName 		= m_configProps.getProperty("db.name");
		Cfg.dbHost 		= m_configProps.getProperty("db.host");
		Cfg.dbPort 		= m_configProps.getProperty("db.port");
		
		m_DB 			= new DBMysql(m_SQLQueue, Cfg, this.getName());
		Thread DBThread = new Thread(m_DB);
		DBThread.start();
		DBThread.setName("TSYNCACCTHREADB");
		
		
		m_accnum = Integer.parseInt(m_configProps.getProperty("dpquant.oms.syncacc.num"));
		for(int i=0; i<m_accnum; i++){
			CTPInfo m_ctpinfo = new CTPInfo();
			m_ctpinfo.setStraderFrontUrl(m_configProps.getProperty(String.format("dpquant.oms.syncacc.traderfronturl%d", 	i+1)));
			m_ctpinfo.setSbrokerId(m_configProps.getProperty(String.format("dpquant.oms.syncacc.brokerid%d", 				i+1)));
			m_ctpinfo.setSuserId(m_configProps.getProperty(String.format("dpquant.oms.syncacc.userid%d", 					i+1)));
			m_ctpinfo.setSinvestorId(m_configProps.getProperty(String.format("dpquant.oms.syncacc.userid%d", 				i+1)));
			m_ctpinfo.setSpassword(m_configProps.getProperty(String.format("dpquant.oms.syncacc.password%d", 				i+1)));
			m_ctpinfoList.add(m_ctpinfo);
			RegisterTradeCtp(i, m_ctpinfo);
		}
	}
	
	private void RegisterTradeCtp(int index, CTPInfo info){
		EMSModule.RegisterFutureInfo(String.format("SYNCACC%d", index), info);
	}
	
	
	@Override
	public void run(){
		while(true){
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int i=0; i<m_accnum; i++){
				TradeCtp ctp = EMSModule.getTradeCtp(String.format("SYNCACC%d", i));
				CThostFtdcOrderField[] r = ctp.SyncAllReqQryOrder();
				if(r == null){
					continue;
				}
				m_log.info(String.format("%s Query Entrust. Length: %d", m_ctpinfoList.get(i).getSuserId(), r.length));
				for(int j=0; j < r.length; j++){
					String sql =  String.format(m_sDpOrderInsertSql,    r[j].BrokerID,  	  r[j].InvestorID,		 r[j].UserID,				r[j].ClientID,
																		r[j].CombHedgeFlag,	  r[j].CombOffsetFlag,	 r[j].ExchangeID,			r[j].ExchangeInstID,
																		r[j].Direction,		  r[j].InsertDate,		 r[j].InsertTime,			r[j].CancelTime,		r[j].InstrumentID,
																		r[j].BrokerOrderSeq,  r[j].OrderSysID, 		 r[j].LimitPrice,			r[j].OrderPriceType,	r[j].OrderRef,
																		r[j].OrderStatus,	  r[j].OrderSubmitStatus,r[j].OrderType,			r[j].RequestID,			r[j].StatusMsg,
																		r[j].StopPrice,		  r[j].SuspendTime,		 r[j].TimeCondition,		r[j].TradingDay,		r[j].UpdateTime,
																		r[j].VolumeCondition, r[j].VolumeTotal,		 r[j].VolumeTotalOriginal,	r[j].VolumeTraded,
																		r[j].ForceCloseReason,r[j].UserForceClose,	 r[j].SessionID,			r[j].FrontID,
																		System.currentTimeMillis(),					 "Sync Account", 
																		r[j].CancelTime, 	  r[j].OrderRef,		 r[j].OrderSubmitStatus,	r[j].OrderStatus, 		r[j].StatusMsg,
																		r[j].SuspendTime,	  r[j].UpdateTime,		 r[j].VolumeTotal,			r[j].VolumeTotalOriginal,
																		r[j].VolumeTraded,	  r[j].UserForceClose);
					m_SQLQueue.add(sql);
				}
			}

		}
	}
}
