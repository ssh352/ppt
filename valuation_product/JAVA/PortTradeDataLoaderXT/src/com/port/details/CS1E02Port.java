package com.port.details;

import com.port.utils.Port;

public class CS1E02Port extends Port{
	
	public CS1E02Port(){
		MonitrPath(m_FilePath);
		InitDB();
	}

	@Override
	public int GenerateFundToHisSQL() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	protected int InitPortParam() {
		m_FilePath  		= "CS1E02SourceBaseDict";
		m_PortID   	 		= "CS1E02";
		m_PortSName 		= "中信增强02";
		m_MoneyType 		= "人民币";
		return 0;
	}
	
}
