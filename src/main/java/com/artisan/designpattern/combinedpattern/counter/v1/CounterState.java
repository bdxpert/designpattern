package com.artisan.designpattern.combinedpattern.counter.v1;

public abstract class CounterState {
    protected Counter counter;
    	
	public CounterState(Counter counter) {
		this.counter = counter;
	}
	public abstract int increment();	
	public abstract int decrement();

}
