package com.artisan.designpattern.combinedpattern.counter.v2.withpattern;

public class CounterService extends CounterSubject {
    private Counter counter;
    private CounterState counterState;
    private CounterLogHandler counterLogHandler;
    private BlueLog blueLog;
    private OrangeLog orangeLog;
    private GreenLog greenLog;
    private RedLog redLog;
    public CounterService(Counter counter) {
        this.orangeLog = new OrangeLog(null);
        this.blueLog = new BlueLog(orangeLog);
        this.greenLog = new GreenLog(blueLog);
        this.redLog = new RedLog(greenLog);

        this.counter = counter;
    }

    public void increment() {
//        int count = counter.getCount();
//        count++;
//        counter.setCount(count);
        counterState.increment();
        notifyObs(counter.getCount());
        redLog.handleLog(counter.getCount());

    }

    public void decrement() {
        counterState.decrement();
//        int count = counter.getCount();
//        count--;
//        counter.setCount(count);
        notifyObs(counter.getCount());
        redLog.handleLog(counter.getCount());
    }

    public Counter getCounter() {
        return counter;
    }

    public void setCounter(Counter counter) {
        this.counter = counter;
    }

    public CounterState getCounterState() {
        return counterState;
    }

    public void setCounterState(CounterState counterState) {
        this.counterState = counterState;
    }
}
