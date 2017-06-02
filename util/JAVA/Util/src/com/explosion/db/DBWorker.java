package com.explosion.db;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.concurrent.ConcurrentLinkedQueue;

import com.alibaba.fastjson.JSONArray;
import com.explosion.base.helper;

import org.apache.log4j.Logger;
	
public class DBWorker extends Thread{
	  public Connection m_Connection = null;
	  public static Logger m_log = Logger.getLogger(DBWorker.class);
	  private String m_Driver 	= "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	  private String m_Url;
	  private String m_User;
	  private String m_Pwd;
	  private ConcurrentLinkedQueue<String> m_SQLQueue;
	  
	  public DBWorker(ConcurrentLinkedQueue<String> Q, DataBaseCfg cfg) 
	  {
		m_SQLQueue = Q;
	    try {
	      Class.forName(m_Driver);
	      Connect(cfg);
	    }
	    catch (ClassNotFoundException ex) {
	      ex.printStackTrace();
	    } 
	  }
	  
	  public void close()
	  {
		  try {
		  	if (m_Connection != null)
		  	{
		  		m_Connection.close();
		  	}
		  } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  }
	  
	  public void Connect(DataBaseCfg cfg)
	  {
		m_Url  = "jdbc:sqlserver://" + cfg.dbHost + ":" + cfg.dbPort + ";DatabaseName="+ cfg.dbName;
		m_User = cfg.dbUser;
		m_Pwd  = cfg.dbPwd;
		
		// Create connection object
		try {
			m_Connection = DriverManager.getConnection(m_Url, m_User, m_Pwd);
			m_log.info("Connect to: " + m_Url);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			m_log.error(e.toString());
		}
	  }
	  
	  public JSONArray Query(String query){
		  // create the java statement
	      Statement st;
	      try {
	    	  st = m_Connection.createStatement();
	    	  ResultSet rs = st.executeQuery(query);
	    	  JSONArray sRet = helper.resultSetToJsonArry(rs);
	    	  return sRet;
	      } catch (SQLException e) {
	    	  // TODO Auto-generated catch block
	    	  m_log.error("SQL ERROR: " + query);
	    	  m_log.error(e.toString());
	      }
		   
	      return null;
	  }

	  @Override
	  public void run(){
		  String sql = "";
		  while(true){
			 try {
				 if(m_SQLQueue.size()>0)
				 {
					 sql = m_SQLQueue.poll();
					 if(sql != null)
					 {
						 Statement stat = m_Connection.createStatement();
						 stat.executeUpdate(sql);
						 stat.close();
					 }
				 }
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e.toString());
				m_log.error(e.toString());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				m_log.error(sql);
				m_log.error(e.toString());
			} 
		  }
	  }

}
