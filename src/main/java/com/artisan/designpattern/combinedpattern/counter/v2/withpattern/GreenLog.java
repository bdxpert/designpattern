package com.artisan.designpattern.combinedpattern.counter.v2.withpattern;

public class GreenLog extends CounterLogHandler{

    public GreenLog(CounterLogHandler counterLogHandler) {
        super(counterLogHandler);
    }

    @Override
    void handleLog(int count) {
        if((count%2 ==0 && count >=10 && (count != 12 && count != 13))) {
            System.out.println("Green");
        } else {
            getCounterLogHandler().handleLog(count);
        }
    }
}
