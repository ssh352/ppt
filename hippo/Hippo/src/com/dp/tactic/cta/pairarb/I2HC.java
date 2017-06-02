package com.dp.tactic.cta.pairarb;

import java.util.concurrent.ConcurrentLinkedQueue;

import com.explosion.tactic.cta.pairarb.util.PairArbTactic;
import com.explosion.tactic.util.Portfolio;

public class I2HC extends PairArbTactic{
	
	public I2HC(ConcurrentLinkedQueue<Portfolio> q){
		super(q, "CS9Z01", "I2HC");		
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
