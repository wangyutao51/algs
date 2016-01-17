package com.wyt.chone.countapi;

import com.wyt.chone.countapi.impl.Counter;

public class Test {
	
	public static void main(String[] args) {
		
		ICounter counter = new Counter();
		
		counter.increment();
		counter.tally();
		
		System.out.println(counter.toString());
		
	}
}
