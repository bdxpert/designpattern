package com.artisan.designpattern.command.counter.state;

public class CounterService extends CounterSubject {
    private Counter counter;
    private CounterState counterState;
    public CounterService(Counter counter) {
        this.counter = counter;
    }

    public void increment() {
//        int count = counter.getCount();
//        count++;
//        counter.setCount(count);
        counterState.increment();
        notifyObs(counter.getCount());
    }

    public void decrement() {
        counterState.decrement();
//        int count = counter.getCount();
//        count--;
//        counter.setCount(count);
        notifyObs(counter.getCount());
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
