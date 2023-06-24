package com.artisan.designpattern.command.counter.state;

public abstract class CounterState {
    protected final CounterService counterService;
    public CounterState(CounterService counterService) {
        this.counterService = counterService;
    }
    public abstract void increment();
    public abstract void decrement();
}
