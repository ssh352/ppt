package com.dp.tactic.cta.pairarb;

import java.util.concurrent.ConcurrentLinkedQueue;

import com.explosion.tactic.cta.pairarb.util.PairArbTactic;
import com.explosion.tactic.util.Portfolio;

public class Y2P extends PairArbTactic{
	
	public Y2P(ConcurrentLinkedQueue<Portfolio> q){
		super(q, "CS9Z01", "Y2P" );		
	}
	
	@Override
	public boolean PrepareData() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean InitSecurity() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
