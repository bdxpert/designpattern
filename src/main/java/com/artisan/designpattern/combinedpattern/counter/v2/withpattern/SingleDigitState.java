package com.artisan.designpattern.combinedpattern.counter.v2.withpattern;

public class SingleDigitState extends CounterState {
    public SingleDigitState(CounterService counterService) {
        super(counterService);
    }

    @Override
    public void increment() {
        if(counterService.getCounter().getCount() >9) {
        upgrade();
        } else {
            int count = counterService.getCounter().getCount()+1;
            counterService.getCounter().setCount(count);
        }
    }

    @Override
    public void decrement() {
        if(counterService.getCounter().getCount() >9) {
            downGrade();
        } else {
            int count = counterService.getCounter().getCount() - 1;
            counterService.getCounter().setCount(count);
        }
    }
    public void upgrade()
    {
        DoubleDigitState doubleDigitState = new DoubleDigitState(counterService);
        counterService.setCounterState(doubleDigitState);
        counterService.increment();
    }
    public void downGrade()
    {
        if(counterService.getCounter().getCount() >9) {
            DoubleDigitState doubleDigitState = new DoubleDigitState(counterService);
            counterService.setCounterState(doubleDigitState);
            counterService.decrement();
        }
    }
}
