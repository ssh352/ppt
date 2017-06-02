
package com.explosion.file;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.*;    
import java.util.HashMap;
import java.util.concurrent.*;

import org.apache.log4j.Logger;

import com.explosion.base.base;
import com.explosion.base.helper;

import org.apache.commons.codec.digest.DigestUtils; 

public class WatchFile extends base implements Runnable{  
	
	private String 							m_sDictionary;
	private String							m_sSuffix				= "";
	private String 							m_sModifedFileName 		= "";
	private String 							m_sNewFileMD5 			= "";
	private String 							m_sOldFileMD5 			= "";
	private ConcurrentLinkedQueue<String> 	m_ModifyFileNameQueue 	= null;
	private HashMap<String, Boolean> 		m_Suffixmap 			= new HashMap<String, Boolean>();
	private WatchService 					m_watchService 			= null;
	

	
	public WatchFile(String sDict, ConcurrentLinkedQueue<String> q, String sConfigFile){
		m_sDictionary 				= sDict;
		m_ModifyFileNameQueue 		= q;
		m_sConfigFile 				= sConfigFile;
		
		m_log  						= Logger.getLogger(WatchFile.class);
		m_configProps 				= helper.loadConfig(m_sConfigFile);
		
		initconfig();
		// start file watch server
		startWatchServer();
	}
	
	
	public WatchFile(ConcurrentLinkedQueue<String> q){
		m_ModifyFileNameQueue 		= q;
		m_log  						= Logger.getLogger(WatchFile.class);
		m_sDictionary 				= m_configProps.getProperty("monitorpath");
		
		// initialize configure
		initconfig();
		// start file watch server
		startWatchServer();
	}

	private void initconfig(){
		m_sSuffix 				= m_configProps.getProperty("suffix");
		if(!m_sSuffix.isEmpty())
		{
			String[]  arrSuffix = m_sSuffix.split(";");
			for(int i=0; i<arrSuffix.length; i++)
			{
				m_Suffixmap.put(arrSuffix[i], true);
			}
		}
	}
	
	private void startWatchServer(){
		try {
			m_watchService = FileSystems.getDefault().newWatchService();
			Paths.get(m_sDictionary).register(m_watchService,   
	                StandardWatchEventKinds.ENTRY_CREATE,  
	                StandardWatchEventKinds.ENTRY_DELETE,  
	                StandardWatchEventKinds.ENTRY_MODIFY);  
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			m_log.error(e1.getMessage());
		} 
	}
	
	private void addModifyFileName(WatchEvent<?> event){
		String sFileName 		= "" + event.context();
		String[] arr 			= sFileName.split("\\.");
		if(arr.length == 1){
			return;
		}
		
		if(m_Suffixmap.containsKey(arr[1])){
			m_sModifedFileName 			= m_sDictionary + "/" + event.context();
			File newFile 				= new File(m_sModifedFileName);
			if(!newFile.isFile()){
				return;
			}

			FileInputStream fileinput;
			try {
				fileinput 				= new FileInputStream(newFile);
				m_sNewFileMD5 			= DigestUtils.md5Hex(fileinput);
				fileinput.close();
				if(!m_sNewFileMD5.equals(m_sOldFileMD5)){
					// insert into queue
					m_ModifyFileNameQueue.offer(m_sModifedFileName);
					m_sOldFileMD5 = m_sNewFileMD5;
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				m_log.error(e.getMessage());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				m_log.error(e.getMessage());
			}
		}
	}
	
	@Override
	public void run() {
    	// wait for file change
        while(true){  
            WatchKey key;
			try {
				key = m_watchService.take();
				Thread.sleep(5);
				for(WatchEvent<?> event : key.pollEvents()){  
					// ²»¼à¿ØCreateÊÂ¼þ
//					m_log.info(String.format("%s %s", event.kind(), event.context()));
					if(event.kind() == StandardWatchEventKinds.ENTRY_CREATE){ 
						// filter file by suffix
						addModifyFileName(event);
					}else if(event.kind() == StandardWatchEventKinds.ENTRY_MODIFY){
						addModifyFileName(event);
					}else if(event.kind() == StandardWatchEventKinds.ENTRY_DELETE){
						addModifyFileName(event);
					}
				}  
				if(!key.reset()){  
					break;  
				} 
			} catch (InterruptedException e) {
				m_log.error(e.getMessage());
			} 
        }  		
	}
    
}  