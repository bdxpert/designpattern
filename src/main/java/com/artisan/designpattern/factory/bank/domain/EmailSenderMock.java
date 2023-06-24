package com.artisan.designpattern.factory.bank.domain;

public class EmailSenderMock implements IEmailSender{
    @Override
    public Boolean sendEmail() {
        System.out.println("Mock email sender");
        return Boolean.TRUE;
    }
}
