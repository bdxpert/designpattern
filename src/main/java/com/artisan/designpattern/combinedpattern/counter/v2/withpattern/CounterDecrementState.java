package com.artisan.designpattern.combinedpattern.counter.v2.withpattern;

public abstract class CounterDecrementState {
    protected final CounterService counterService;
    public CounterDecrementState(CounterService counterService) {
        this.counterService = counterService;
    }

    public abstract void decrement();
}
