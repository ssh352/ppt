package com.explosion.base;

import java.io.File;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class base {
	
	// configure setting
	protected static String 		m_sConfigFile;
	protected static Properties 	m_configProps 				= new Properties();
	
	// Log 
	protected static Logger    		m_log;
	
	// order reference
	protected static int 	   		m_orderref = 0;
	
	
	static {  
        PropertyConfigurator.configure(System.getProperty("user.dir") + File.separator + 
        								"conf" + File.separator + "log4j.properties");
        
        m_orderref = helper.Seconds();
        m_sConfigFile		= String.format("%s%sconf%s%s.properties",System.getProperty("user.dir"), File.separator, File.separator , "config");
        m_configProps 		= helper.loadConfig(m_sConfigFile);
    }  
	
}
