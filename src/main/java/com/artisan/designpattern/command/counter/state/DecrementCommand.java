package com.artisan.designpattern.command.counter.state;

public class DecrementCommand implements CounterCommand {
    private CounterService counterService;
    private CounterState digitState;
    public DecrementCommand(CounterService counterService) {
        this.counterService = counterService;
        digitState = new SingleDigitState(this.counterService);
        counterService.setCounterState(digitState);
    }

    @Override
    public Boolean execute() {
        counterService.decrement();
        return Boolean.TRUE;
    }

    @Override
    public Boolean unExecute() {
        counterService.increment();
        return Boolean.TRUE;
    }
}
