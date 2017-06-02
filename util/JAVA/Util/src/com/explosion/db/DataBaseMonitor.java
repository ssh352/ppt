package com.explosion.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;


import org.apache.commons.lang.StringUtils;

import com.explosion.base.helper;
import com.explosion.db.*;
import com.explosion.mail.MailUtil;


public class DataBaseMonitor {
	private ConcurrentHashMap<String, String> 	 m_DBUpdateCheckSQLmap;
	private ConcurrentHashMap<String, String> 	 m_DBUpdateChecksRetmap;
	private DBWorker 						  	 m_DB;
	private DataBaseCfg						  	 m_DBCfg;
	public  MailUtil						  	 m_Mail;
	private String							  	 m_FormatRet = "数据库：%s, 检验结果：%s";
	private ArrayList<String> 			      	 toList;
	private String sSubject;
	
	public DataBaseMonitor(){
		m_DBUpdateCheckSQLmap = new ConcurrentHashMap<String, String>();
		m_DBUpdateChecksRetmap = new ConcurrentHashMap<String, String>();
		
		m_DBCfg        = new DataBaseCfg();
		m_DBCfg.dbHost = "X.X.X.X";
		m_DBCfg.dbPort = "1433";
		m_DBCfg.dbName = "jydb_all";
		m_DBCfg.dbUser = "admin";
		m_DBCfg.dbPwd  = "admin";
		m_DB		   = new DBWorker(null, m_DBCfg);
		m_Mail 		   = new MailUtil();
		
		toList = new ArrayList<String>();
		
		sSubject = "DP dataBase update monitor";
	}
	
	public void SetSubject(String s){
		sSubject = s;
	}
	
	public void PutCheckRule(String key, String Rule){
		m_DBUpdateCheckSQLmap.put(key, Rule);
	}
	 
	public void AddWarnMail(String sMail){
		toList.add(sMail);
	}
	
	

	public String GetDataBaseUpdateStatus()
	{
		for(Entry<String, String> entry : m_DBUpdateCheckSQLmap.entrySet())
		{
			String sTableName     = entry.getKey();
			String sSQL 		  = entry.getValue();

			try {
				Statement stat = m_DB.m_Connection.createStatement();
				ResultSet Rt = stat.executeQuery(sSQL);
				m_DBUpdateChecksRetmap.put(sTableName, helper.resultSetToHtml(Rt));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return GenerateDBUpdateInto();
	}
	
	private String GenerateDBUpdateInto(){
		ArrayList<String> RetArr = new ArrayList<String>();
		for(Entry<String, String> entry : m_DBUpdateChecksRetmap.entrySet()){
			RetArr.add(String.format(m_FormatRet, entry.getKey(), entry.getValue()));
		}
		m_Mail.sendHtml(StringUtils.join(RetArr, "<br><br>"), sSubject, toList);
		return StringUtils.join(RetArr, "\n");
		
	}
	
}

