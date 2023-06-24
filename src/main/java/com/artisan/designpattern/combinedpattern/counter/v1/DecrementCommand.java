package com.artisan.designpattern.combinedpattern.counter.v1;


public class DecrementCommand implements ICommand{
	private Counter counter;
	
	
	public DecrementCommand(Counter counter) {
		this.counter = counter;
	}

	public void execute() {
		counter.decrement();		
	}

	public void unExecute() {
		counter.increment();		
	}

}
