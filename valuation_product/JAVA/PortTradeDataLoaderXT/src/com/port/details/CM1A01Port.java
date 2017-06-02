package com.port.details;

import com.port.utils.Port;

public class CM1A01Port extends Port{
	
	public CM1A01Port(){
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
		m_FilePath  		= "CM1A01SourceBaseDict";
		m_PortID   	 		= "CM1A01";
		m_PortSName 		= "招商对冲01";
		m_MoneyType 		= "人民币";
		return 0;
	}
	
}
