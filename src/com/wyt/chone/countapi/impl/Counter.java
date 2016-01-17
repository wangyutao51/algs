package com.wyt.chone.countapi.impl;

import com.wyt.chone.countapi.ICounter;

/**
 * Counter 计数器的
 * 
 * @author wang
 *
 */
public class Counter implements ICounter {

	public static int count = 0;

	@Override
	public void increment() {
		count++;
	}

	@Override
	public int tally() {
		return this.count;
	}

	@Override
	public String toString(){
		return "当前计数器调用了 "+this.count + " 次"; 	
	}

}
