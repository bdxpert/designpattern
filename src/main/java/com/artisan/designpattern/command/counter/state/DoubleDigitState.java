package com.artisan.designpattern.command.counter.state;

public class DoubleDigitState extends CounterState {
    public DoubleDigitState(CounterService counterService) {
        super(counterService);
    }

    @Override
    public void increment() {
        if(counterService.getCounter().getCount() >99) {
            upgrade();
        } else {
            int count = counterService.getCounter().getCount() + 2;
            counterService.getCounter().setCount(count);
        }
    }

    @Override
    public void decrement() {
        downGrade();
    }
    public void upgrade()
    {
        TripleDigitState tripleDigitState = new TripleDigitState(counterService);
        counterService.setCounterState(tripleDigitState);
        counterService.increment();
    }
    public void downGrade()
    {
        if(counterService.getCounter().getCount() <10) {
            SingleDigitState singleDigitState = new SingleDigitState(counterService);
            counterService.setCounterState(singleDigitState);
//            counterService.decrement();
        } else if (counterService.getCounter().getCount()>99) {
            TripleDigitState tripleDigitState = new TripleDigitState(counterService);
            counterService.setCounterState(tripleDigitState);
//            counterService.decrement();
        } else {
            int count = counterService.getCounter().getCount()-2;
            counterService.getCounter().setCount(count);
        }
    }
}
