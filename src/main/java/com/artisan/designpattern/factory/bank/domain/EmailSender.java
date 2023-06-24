package com.artisan.designpattern.factory.bank.domain;

public class EmailSender implements IEmailSender {
    private EmailSender emailSender = null;
    public EmailSender() {
        if(emailSender != null) {
            throw new RuntimeException("Singleton email sender don't allow duplicate object");
        }
    }

    public EmailSender getEmailSender() {
        if(emailSender == null){
            synchronized (EmailSender.class) {
                emailSender = new EmailSender();
            }
        }
        return emailSender;
    }
    public Boolean sendEmail() {
        System.out.println("Send email");
        return Boolean.TRUE;
    }
    protected Object readResolve() {
        return getEmailSender();
    }
}
