package com.artisan.designpattern.observer.account.domain;

public class Logger implements IObserver{
    public void accountChange(long accountNo){
        System.out.println("Logger:  changes balance account no:"+ accountNo);
    }
}
