

package com.dp.tactic.cta.trend;

import com.explosion.base.helper;
import com.explosion.tactic.util.Portfolio;

import java.io.File;
import java.util.concurrent.ConcurrentLinkedQueue;



public class LastPriceVsMaxMin2 extends LastPriceVsMaxMin{
	
	
	public LastPriceVsMaxMin2(ConcurrentLinkedQueue<Portfolio> q){
		super(q);
	}
	
	@Override
	public void InitConfigFile(){
		m_sConfigFile					= String.format("%s%sconf%ss_%s.properties",System.getProperty("user.dir"), File.separator, File.separator, 
																	 "LastPriceVsMaxMin2");
		m_configProps 					= helper.loadConfig(m_sConfigFile);
	}
}
