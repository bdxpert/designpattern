package com.artisan.designpattern.combinedpattern.counter.v2.withpattern;

public class RedLog extends CounterLogHandler {

    public RedLog(CounterLogHandler counterLogHandler) {
        super(counterLogHandler);
    }

    @Override
    void handleLog(int count) {
        if((count < 10 & count%2 ==0 ) || (count%2 ==0 && count ==12 || count == 13)){
            System.out.println("Red");
        } else {
            getCounterLogHandler().handleLog(count);
        }
    }
}
