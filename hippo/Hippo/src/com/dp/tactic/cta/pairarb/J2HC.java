package com.dp.tactic.cta.pairarb;

import java.util.concurrent.ConcurrentLinkedQueue;

import com.explosion.tactic.cta.pairarb.util.PairArbTactic;
import com.explosion.tactic.util.Portfolio;

public class J2HC extends PairArbTactic{
	
	public J2HC(ConcurrentLinkedQueue<Portfolio> q){
		super(q, "CS9Z01", "J2HC" );		
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
