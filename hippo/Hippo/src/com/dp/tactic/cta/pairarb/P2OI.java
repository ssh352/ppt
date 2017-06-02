package com.dp.tactic.cta.pairarb;

import java.util.concurrent.ConcurrentLinkedQueue;

import com.explosion.tactic.cta.pairarb.util.PairArbTactic;
import com.explosion.tactic.util.Portfolio;

public class P2OI extends PairArbTactic{
	
	public P2OI(ConcurrentLinkedQueue<Portfolio> q){
		super(q, "CS9Z01", "P2OI" );		
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
