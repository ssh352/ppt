package com.explosion.tactic.cta.trend.util;

public class CTATrendInstr {
	
	public int 		m_OpenBackDays 	= 0;		// Look back days
	public int 		m_CloseBackDays = 0;		// Look back days
	public int 		m_AppendNum 	= 5;		// Append unit
	public int 		m_Times 		= 5;		// Append unit
	public double 	m_max 			= 0;		// Max of look back days close price
	public double 	m_min			= 0;		// Min of look back days close price
	public double 	closepremin		= 0;
	public double 	closepremax		= 0;
	public double 	m_Weight 		= 0.01;		// Weight of instrument
	public double 	m_ATRPCT 		= 1;			
	public String 	m_date;						// Trade date 
	public String 	m_sInfo_Wind_Code;			// Major Instr Code in wind code. Like "AU.SHF"
	public String 	m_sInstr;					// Identified instr code. Like "AU1706.SHF"
	public String 	m_sCtpTradeID;
	public String 	m_sType;
	public int		m_Num; 
	public int 		m_traded;					// 0:no traded; 1: traded;
	public int 		m_Pos			= 0;
	public String 	m_TacticID		= null;
	public Boolean 	m_InstrChange 	= false;
	
	
	public CTATrendInstr(String sTacticID, String instrumentid, int openVol, int AppendNum, Boolean instrChange){
		this.m_TacticID 		= sTacticID;
		this.m_Pos 				= openVol;
		this.m_sCtpTradeID 		= instrumentid;
		this.m_AppendNum 		= AppendNum;
		this.m_InstrChange 		= instrChange;
	}
	
	public CTATrendInstr(int m_BackDays, int m_AppendNum, double m_max, double m_min, double m_Weight, String m_date,
			String m_sInfo_Wind_Code, String m_sInstr, String m_sCtpTradeID, int m_Num) {
		super();
		this.m_OpenBackDays	 	= m_BackDays;
		this.m_AppendNum 		= m_AppendNum;
		this.m_max 				= m_max;
		this.m_min 				= m_min;
		this.m_Weight 			= m_Weight;
		this.m_date 			= m_date;
		this.m_sInfo_Wind_Code 	= m_sInfo_Wind_Code;
		this.m_sInstr 			= m_sInstr;
		this.m_sCtpTradeID 		= m_sCtpTradeID;	
		this.m_Num 				= m_Num;
	}
	
	public int getM_BackDays() {
		return m_OpenBackDays;
	}
	public void setM_BackDays(int m_BackDays) {
		this.m_OpenBackDays = m_BackDays;
	}
	public int getM_AppendNum() {
		return m_AppendNum;
	}
	public void setM_AppendNum(int m_AppendNum) {
		this.m_AppendNum = m_AppendNum;
	}
	public double getM_max() {
		return m_max;
	}
	public void setM_max(double m_max) {
		this.m_max = m_max;
	}
	public double getM_min() {
		return m_min;
	}
	public void setM_min(double m_min) {
		this.m_min = m_min;
	}
	public double getM_Weight() {
		return m_Weight;
	}
	public void setM_Weight(double m_Weight) {
		this.m_Weight = m_Weight;
	}
	public String getM_date() {
		return m_date;
	}
	public void setM_date(String m_date) {
		this.m_date = m_date;
	}
	public String getM_sInfo_Wind_Code() {
		return m_sInfo_Wind_Code;
	}
	public void setM_sInfo_Wind_Code(String m_sInfo_Wind_Code) {
		this.m_sInfo_Wind_Code = m_sInfo_Wind_Code;
	}
	public String getM_sInstr() {
		return m_sInstr;
	}
	public void setM_sInstr(String m_sInstr) {
		this.m_sInstr = m_sInstr;
	}
	public void setM_sType(String m_sType){
		this.m_sType = m_sType;
	}
	
	@Override
	public String toString() {
		return "CTATrendInstr [m_BackDays=" + m_OpenBackDays + ", m_AppendNum=" + m_AppendNum + ", m_max=" + m_max
				+ ", m_min=" + m_min + ", m_Weight=" + m_Weight + ", m_date=" + m_date + ", m_sInfo_Wind_Code="
				+ m_sInfo_Wind_Code + ", m_sInstr=" + m_sInstr + "]";
	}
	
}
