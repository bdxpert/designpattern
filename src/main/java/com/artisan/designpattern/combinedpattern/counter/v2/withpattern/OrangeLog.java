package com.artisan.designpattern.combinedpattern.counter.v2.withpattern;

public class OrangeLog extends CounterLogHandler{

    public OrangeLog(CounterLogHandler counterLogHandler) {
        super(counterLogHandler);
    }

    @Override
    void handleLog(int count) {
        if((count%2 ==1 && count >15 && (count != 17 && count != 19))) {
            System.out.println("Orange");
        }
    }
}
