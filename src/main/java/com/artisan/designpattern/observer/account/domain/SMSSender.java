package com.artisan.designpattern.observer.account.domain;

public class SMSSender implements IObserver {
    public void accountChange(long accountNo) {
        System.out.println("SMSsender change to account balance account no:"+accountNo);
    }
}
