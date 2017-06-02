package com.explosion.tactic.util;

public class TacticSQL {
	public String 		m_sFormatStockSQL 		= "select * from realtimemarketdata where SzCode = '%s'";
	public String 		m_sFormatIndexSQL 		= "select * from realtimeindex where SzCode = '%s'";
	public String 		m_sFormatFutureSQL 		= "select * from realtimefuturedata where SzCode = '%s'";
	public String 		m_sFormatQueryOrderSQL 	= "select " + 
															"orderref, sessionid, frontid, portsname,  " +
															"tactictype, comboffsetflag, instrumentid,  " +
															"volumetotal, volumetotaloriginal, volumetraded, orderstatus, " +
															"direction, tacticid, tactictype, validinvertal, limitprice," +  
															"unixtime, remark " +  
														"from " +
															"dporder " + 
														"where " +
															"orderref = '%s' and " + 
															"sessionid = '%s' and " +
															"frontid = '%s'  ";
	
	
	public String 		m_sFormatGetPos    		=  	"select " +
															"sum((case when direction = '0' then a.volumetraded else -a.volumetraded end))  as openVol " + 
														"from " +
															"dporder a " + 
														"where " +
															"a.portsname = '%s' and " + 
															"a.tactictype = '%s' and " +
															"a.userid = '%s' and  " +
															"a.InstrumentID = '%s' and " +
															"a.unixtime >= %s";	
	
	public String 		m_sFormatOrderSQL 		= "select " + 
															"orderref, sessionid, frontid, portsname,  " +
															"tactictype, comboffsetflag, instrumentid,  " +
															"volumetotal, volumetotaloriginal, volumetraded, orderstatus, " +
															"direction, tacticid, tactictype, validinvertal, limitprice," +  
															"unixtime, remark " +  
														"from " +
															"dporder " + 
														"where " +
															"tactictype = '%s' and " + 
															"userid = '%s' and " +
															"unixtime >= %s  " +
														"order by unixtime desc LIMIT  %d";

	public String 		m_sFormatTradeSQL 		= "select " + 
															"a.direction, a.insertdate, a.inserttime, a.instrumentid,  " +
															"a.comboffsetflag, a.limitprice, a.statusmsg, a.brokerorderseq,	a.ordersysid, b.Price, b.volume " +
														"from " +
															"dp.dporder a " + 
														"LEFT JOIN " +
															"dp.dptrade b on (a.ordersysid = b.OrderSysID) " + 
														"where " +
															"a.tactictype = '%s' and " +
															"!isNull(b.Price) and " +
															//"a.statusmsg <> 'ÒÑ³·µ¥' and " + 
															"a.userid = '%s' and " +
															"a.insertdate = date(SYSDATE()) and " +
															"UNIX_TIMESTAMP(NOW()) - (a.unixtime)/1000 < %d " +
														"order by a.inserttime desc LIMIT 3";
				

	public String 		m_sFormatGetTacticID		=   "select " +
																"DISTINCT tacticid " +
															"from " +
																"dporder a " + 
															"where " +
																"unixtime >= UNIX_TIMESTAMP(date(SYSDATE()) ) * 1000 and " + 
																"tactictype = '%s' and " +
																"userid = '%s' and " +
																"not EXISTS (select b.tacticid from dporder b where b.tacticid = a.tacticid and b.comboffsetflag = '1' )";
	
	
	public String 		m_sOnLineFormatGetTacticID	=   "select " +
																"DISTINCT tacticid " +
															"from " +
																"dporder a " + 
															"where " +
																"a.unixtime >= %s and " + 
																"a.tactictype = '%s' and " +
																"a.userid = '%s' and " +
																"a.orderstatus = '0' and " + 
																"not EXISTS (select b.tacticid from dporder b where b.tacticid = a.tacticid and b.comboffsetflag = '3' )";
	
	
}
