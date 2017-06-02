package com.dp.rms.util;

public class RiskRule {

	
	public String Name;
	public int	  RuleID;
	public double UpLimit;
	public double DownLimit;
	public double EqualValue;
	public double CompareType;		// 0:相等  1:大于  2:小于
	
	public int RiskType;			// 见RiskConst
	public double LimitValue;			
	
}
