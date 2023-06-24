package com.artisan.designpattern.command.counter.state;

public abstract class CounterDecrementState {
    protected final CounterService counterService;
    public CounterDecrementState(CounterService counterService) {
        this.counterService = counterService;
    }

    public abstract void decrement();
}
