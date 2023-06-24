package com.artisan.designpattern.combinedpattern.counter.v2.withpattern;

public abstract class CounterLogHandler {
    protected CounterLogHandler counterLogHandler;

    public CounterLogHandler(CounterLogHandler counterLogHandler) {
        this.counterLogHandler = counterLogHandler;
    }
    public CounterLogHandler getCounterLogHandler()
    {
        return this.counterLogHandler;
    }
    abstract void handleLog(int count);
}
