package com.explosion.db;
import java.sql.*;   
import java.util.concurrent.ConcurrentLinkedQueue;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSONArray;
import com.explosion.base.helper;

public class DBMysql extends Thread{
	
	  public Connection m_Connection = null;
	  public static Logger m_log = Logger.getLogger(DBMysql.class);	  
	  private String m_Driver 	= "com.mysql.jdbc.Driver";
	  private String m_Url;
	  private String m_User;
	  private String m_Pwd;
	  private String m_App;
	  
	  private ConcurrentLinkedQueue<String> m_SQLQueue;
	  
	  public DBMysql(ConcurrentLinkedQueue<String> Q, DataBaseCfg cfg, String sApp) 
	  {
		m_SQLQueue = Q;
		m_App = sApp;
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
		m_Url  = "jdbc:mysql://" + cfg.dbHost + ":" + cfg.dbPort + "/" + cfg.dbName;
		m_User = cfg.dbUser;
		m_Pwd  = cfg.dbPwd;
		
		// Create connection object
		try {
			m_Connection = DriverManager.getConnection(m_Url, m_User, m_Pwd);
			m_log.info(m_App + " Connect to " + m_Url);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			m_log.error(m_App + "\t" +e.toString());
		}
	  }
	  
	  public JSONArray Query(String query){
		  // create the java statement
	      Statement st;
	      try {
	    	  st = m_Connection.createStatement();
	    	  ResultSet rs = st.executeQuery(query);
	    	  JSONArray sRet = helper.resultSetToJsonArry(rs);
	    	  rs.close();
	    	  st.close();
	    	  return sRet;
	      } catch (SQLException e) {
	    	  // TODO Auto-generated catch block
	    	  m_log.error("SQL ERROR: " + query);
	    	  m_log.error(e.toString());
	      }
	      return null;
	  }

	  
	  public ResultSet QuerySet(String query){
		  // create the java statement
	      Statement st;
	      try {
	    	  st = m_Connection.createStatement();
	    	  ResultSet rs = st.executeQuery(query);
	    	  return rs;
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
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				m_log.error(e.toString());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				m_log.error("SQL ERROR: " + sql);
				m_log.error(e.toString());
			} 
		  }
	  }
	
}
