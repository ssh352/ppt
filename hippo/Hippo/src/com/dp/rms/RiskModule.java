package com.dp.rms;

import java.io.File;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.log4j.Logger;

import net.jctp.JctpConstants;

import com.alibaba.fastjson.JSONArray;
import com.dp.rms.util.RiskConst;
import com.dp.rms.util.RiskRule;
import com.explosion.base.helper;
import com.explosion.db.DBMysql;
import com.explosion.db.DataBaseCfg;
import com.explosion.tactic.util.Portfolio;
import com.explosion.trade.util.Entrust;

public class RiskModule{
	
	private ArrayList<RiskRule> ListRiskRule;
	private Logger 	m_log;
	private DBMysql DB;
	private Properties configProps 			= new Properties();
	private String sConfigFile				= System.getProperty("user.dir") + File.separator + "conf" + File.separator + "config.properties";
	
	public RiskModule(){
		ListRiskRule = new ArrayList<RiskRule>();	
		m_log 		 = Logger.getLogger(RiskModule.class);
		
		configProps 	= helper.loadConfig(sConfigFile);
		DataBaseCfg Cfg = new DataBaseCfg();
		Cfg.dbUser = configProps.getProperty("db.user");
		Cfg.dbPwd  = configProps.getProperty("db.pwd");
		Cfg.dbName = configProps.getProperty("db.name");
		Cfg.dbHost = configProps.getProperty("db.host");
		Cfg.dbPort = configProps.getProperty("db.port");
		
		DB = new DBMysql(null, Cfg, "RiskModule");
	
	}
	
	/*
	 *	1. �տ��ֲ���10��
	 *  2. ����400��
	 *  3. �ͻ�������ĳһ��Լ�ϵ��Գɽ�����������5��	 
	 * 	4. ���� ������ĳһ��Լ�ϵĳ�����������100�Σ��������ҵ��ʳ������ﵽ���߳���80��
	 */
	
	
	/*
	 * describe: ��ȡ���պ�Լ������
	 * sDate: ��������  20160308
	 * sCode�� ��Լ����  IH1603
	 * sInvestor�� �ͻ��� 590193894
	 */
	private int GetDailyOpenPos(String sDate, String sCode, String sInvestor){
		int ret = 99999999;
//		try {
// 			CallableStatement cstmt = DB.m_Connection.prepareCall("{call dp.getinstrnum(?, ?, ?, ?)}");
// 			cstmt.setString(1, sDate);
// 			cstmt.setString(2, sCode);
//			cstmt.setString(3, sInvestor);
//			cstmt.registerOutParameter(4, java.sql.Types.INTEGER);
//			cstmt.execute(); 
//			ret = cstmt.getInt(4);
//			cstmt.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
		return 0;
	}
	
	/*
	 * describe: ��ȡ���յ�����Լ������
	 * sDate: ��������  20160308
	 * sCode�� ��Լ����  IH1603
	 * sInvestor�� �ͻ��� 590193894
	 */
	private int GetCancelNum(String sDate, String sCode, String sInvestor){
		int ret = 99999999;
		try {
 			CallableStatement cstmt = DB.m_Connection.prepareCall("{call dp.getcancelnum(?, ?, ?, ?)}");
 			cstmt.setString(1, sDate);
 			cstmt.setString(2, sCode);
			cstmt.setString(3, sInvestor);
			cstmt.registerOutParameter(4, java.sql.Types.INTEGER);
			cstmt.execute(); 
			ret = cstmt.getInt(4);
			cstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return ret;
	}
	
	public void RiskRuleClear(){
		if(ListRiskRule != null)
		{
			ListRiskRule.clear();
		}
	}
	
	public boolean AddRiskRule(RiskRule r){
		return ListRiskRule.add(r);
	}
	
	public boolean CheckPort(Portfolio port){
		boolean ret = false;
		ArrayList<Entrust> arrSecurityEntrust 	= port.m_ListSecurity;
		ArrayList<Entrust> arrFutureEntrust 	= port.m_ListFuture;

		// ���֤ȯ���
		ret = CheckSecurity(arrSecurityEntrust);
		if(!ret)
		{
			return false;
		}
		
		// ����ڻ����
		ret = CheckFuture(arrFutureEntrust);
		return ret;
	}
	
	public boolean CheckSecurity(ArrayList<Entrust> arrSecurityEntrust ){
		return true;
	}
	
	private int GetInstrNum(String sCode, String investorid){
		return GetDailyOpenPos(helper.Today(), sCode, investorid);
	}
	
	
	public boolean CheckFuture(ArrayList<Entrust> arrFutureEntrust){
		
//		for(RiskRule r : ListRiskRule)
//		{
//			if(r.RiskType == RiskConst.RISKTYPE_FUTUREOPENLIMIT)
//			{
//				for(Entrust e : arrFutureEntrust)
//				{
//					// ���ּ�鵱�յ�����Լ�Ƿ񳬹�����
//					if(e.m_sOpenClose == JctpConstants.STRING_THOST_FTDC_OF_Open)
//					{
//						if(GetInstrNum(e.m_sSecurityID, "") + e.m_iVolume > r.LimitValue)
//						{
//							m_log.info("RISK WARN: CheckFuture Failed, RuleID: " + r.RuleID);
//							return false;
//						}
//					}
//				}
//			}
//		}
		
		return true;
	}
	
	private boolean init(){	
		return true;
	};
	
	 
	
}
