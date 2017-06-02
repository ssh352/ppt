package com.dp.tactic.cta.trend;


public class instrclass {
	public double m_classwt;
	public double m_cash;
	public double m_longused;
	public double m_longavailable;
	public double m_shortused;
	public double m_shortavailable;
	
	public instrclass(double m_classwt, double m_cash, double m_used, double m_available, 
					  double m_shortused, double m_shortavailable) {
		super();
		this.m_classwt 			= m_classwt;
		this.m_cash 			= m_cash;
		this.m_longused 		= m_used;
		this.m_longavailable 	= m_available;
		this.m_shortused 		= m_shortused;
		this.m_shortavailable 	= m_shortavailable;
	}
	
}
