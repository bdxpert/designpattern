package com.artisan.designpattern.combinedpattern.counter.v2.withpattern;

public abstract class CounterState {
    protected final CounterService counterService;
    public CounterState(CounterService counterService) {
        this.counterService = counterService;
    }
    public abstract void increment();
    public abstract void decrement();
}
