
package com.port.utils;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;



public class PortDetails {

	public String m_PortSName;
	public String m_PortID;
	public List<String>  m_PortFundList;
	public List<String>  m_PortStockList;
	public List<String>  m_PortEntrustList;
	public List<String>  m_PortTransList;
	public List<String>  m_portFutureCapital;
	public List<String>  m_portFuturePos;
	public List<String>  m_portFutureTrade;
	
	
	public PortDetails(){
		
		m_PortFundList 		= new ArrayList<String>();
		m_PortStockList 	= new ArrayList<String>();
		m_PortEntrustList 	= new ArrayList<String>();
		m_PortTransList   	= new ArrayList<String>();
		m_portFutureCapital = new ArrayList<String>();
		m_portFuturePos		= new ArrayList<String>();
		m_portFutureTrade   = new ArrayList<String>();
	}
	
}

