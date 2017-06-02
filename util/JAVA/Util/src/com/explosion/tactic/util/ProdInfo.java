package com.explosion.tactic.util;

public class ProdInfo {
	
	private String ProdName;
	private String StrategyName;
	
	public String getProdName() {
		return ProdName;
	}
	public void setProdName(String prodName) {
		ProdName = prodName;
	}
	public String getStrategyName() {
		return StrategyName;
	}
	public void setStrategyName(String strategyName) {
		StrategyName = strategyName;
	}
	
	@Override
	public String toString(){
		return String.format("%s_%s", ProdName, StrategyName);
	}
	
}
