package com.artisan.designpattern.combinedpattern.counter.v2.withpattern;

import java.util.ArrayList;
import java.util.List;

public class CounterSubject {
    private List<Observer> observerList = new ArrayList<>();
    public void addObserverList(Observer observer)
    {
        observerList.add(observer);
    }
    public void notifyObs(int cnt) {
        for (Observer obser : observerList)
            obser.setCount(cnt);
    }
}
