package com.explosion.trade.cats;

import java.util.concurrent.ConcurrentLinkedQueue;

import org.apache.log4j.Logger;

import com.explosion.base.base;
import com.explosion.file.WatchFile;


public class catstradesync extends base implements Runnable{
	private  String 						m_Path; 
	private  String 						m_OrderUpdateDBF 			= "";
	private  WatchFile 						m_watchfile;
	private  ConcurrentLinkedQueue<String>  m_FileCreateList;
	
	public catstradesync(){
		m_log  							= Logger.getLogger(catstradesync.class);
		m_Path 							= m_configProps.getProperty("com.explosion.trade.cats.catstrade.scanpath");
		m_OrderUpdateDBF				= m_configProps.getProperty("com.explosion.trade.cats.catstrade.orderupdatesdbf");
		
		m_FileCreateList 				= new ConcurrentLinkedQueue<String>();
		m_watchfile 					= new WatchFile(m_FileCreateList);
		Thread watchFileThread 			= new Thread(m_watchfile);
		watchFileThread.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			if(m_FileCreateList.size() > 0){
				String fileName = m_FileCreateList.poll();
				m_log.info(fileName);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		catstradesync catssync = new catstradesync();
		Thread catsSyncThread = new Thread(catssync);
		catsSyncThread.start();
	}


	
}
