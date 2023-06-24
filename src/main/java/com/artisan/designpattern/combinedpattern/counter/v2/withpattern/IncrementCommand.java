package com.artisan.designpattern.combinedpattern.counter.v2.withpattern;

public class IncrementCommand implements CounterCommand {
    private CounterService counterService;
    private CounterState digitState;

    public IncrementCommand(CounterService counterService) {
        this.counterService = counterService;
        digitState = new SingleDigitState(this.counterService);
        counterService.setCounterState(digitState);
    }

    @Override
    public Boolean execute() {
        counterService.increment();
        return Boolean.TRUE;
    }

    @Override
    public Boolean unExecute() {
        counterService.decrement();
        return Boolean.TRUE;
    }
}
