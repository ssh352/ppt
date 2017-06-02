package com.port.details;

import com.port.utils.Port;

public class CS9Z01Port extends Port{
	
	public CS9Z01Port(){
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
		m_FilePath  		= "CS9Z01SourceBaseDict";
		m_PortID   	 		= "CS9Z01";
		m_PortSName 		= "中信自营";
		m_MoneyType 		= "人民币";
		return 0;
	}

}
