package com.port.details;

import com.port.utils.Port;

public class CS2B02Port extends Port{
	
	public CS2B02Port(){
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
		m_FilePath  		= "CS2B02SourceBaseDict";
		m_PortID   	 		= "CS2B02";
		m_PortSName 		= "��������02";
		m_MoneyType 		= "�����";
		return 0;
	}

}
