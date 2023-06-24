package com.artisan.designpattern.combinedpattern.counter.v2.withpattern;

public class BlueLog extends CounterLogHandler{

    public BlueLog(CounterLogHandler counterLogHandler) {
        super(counterLogHandler);
    }

    @Override
    void handleLog(int count) {
        if((count%2 ==1 && count <15) || (count%2 ==1 && (count == 17 || count == 19))){
            System.out.println("Blue");
        } else {
            getCounterLogHandler().handleLog(count);
        }
    }
}
