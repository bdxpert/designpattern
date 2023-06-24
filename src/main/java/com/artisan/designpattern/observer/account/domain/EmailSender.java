package com.artisan.designpattern.observer.account.domain;

public class EmailSender implements IObserver{
    public void accountChange(long accountNo){
        System.out.println("EmailSender: changes to balance account no:"+accountNo);
    }
}
