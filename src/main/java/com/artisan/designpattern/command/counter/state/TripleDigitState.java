package com.artisan.designpattern.command.counter.state;

public class TripleDigitState extends CounterState {
    public TripleDigitState(CounterService counterService) {
        super(counterService);
    }

    @Override
    public void increment() {
        int count = counterService.getCounter().getCount()+3;
        counterService.getCounter().setCount(count);
    }

    @Override
    public void decrement() {
        int count = counterService.getCounter().getCount()-3;
        counterService.getCounter().setCount(count);
        downGrade();
    }
    public void downGrade()
    {
        if(counterService.getCounter().getCount() < 100) {
            DoubleDigitState doubleDigitState = new DoubleDigitState(counterService);
            counterService.setCounterState(doubleDigitState);
            counterService.decrement();
        }
    }
}
