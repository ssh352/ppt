package com.port.details;

import com.port.utils.Port;

public class CS1D01Port extends Port{
	
	public CS1D01Port(){
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
		m_FilePath  		= "CS1D01SourceBaseDict";
		m_PortID   	 		= "CS1D01";
		m_PortSName 		= "���ž�ѡ01";
		m_MoneyType 		= "�����";
		return 0;
	}
	
}
