package com.explosion.tactic.util;

import java.util.ArrayList;

import com.explosion.trade.util.Entrust;


public class Portfolio {
	
	public ArrayList<Entrust> m_ListSecurity;
	public ArrayList<Entrust> m_ListFuture;
	
	public String 	m_cOpenClose;						// 开平
//	public char 	m_cSecurityEntrustBS;				// 股票委托方向
//	public char 	m_cFutureEntrustBS;					// 期货委托方向
	public boolean  m_FutureFirst;						// 先下单期货
	public String 	m_TacticID;
	public ProdInfo m_PortInfo;
	
	public Portfolio(){
		m_ListSecurity 	= new ArrayList<Entrust>();
		m_ListFuture 	= new ArrayList<Entrust>();
	}
	
	public Portfolio(ArrayList<Entrust> mapSecurity, ArrayList<Entrust> mapFuture , boolean FutureFirst){
		m_ListSecurity 	  	  = mapSecurity;
		m_ListFuture 		  = mapFuture;
		m_FutureFirst		  = FutureFirst;
	}
		
	
}

