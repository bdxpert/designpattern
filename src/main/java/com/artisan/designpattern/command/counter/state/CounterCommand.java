package com.artisan.designpattern.command.counter.state;

public interface CounterCommand {
    public Boolean execute();
    public Boolean unExecute();
}
