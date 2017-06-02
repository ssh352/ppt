package com.port.details;

import com.port.utils.Port;

public class CM1H01Port extends Port{
	
	public CM1H01Port(){
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
		m_FilePath  		= "CM1H01SourceBaseDict";
		m_PortID   	 		= "CM1H01";
		m_PortSName 		= "行业精选01";
		m_MoneyType 		= "人民币";
		return 0;
	}
}
