package com.artisan.designpattern.factory.bank.service;

import com.artisan.designpattern.factory.bank.dao.AccountDAO;
import com.artisan.designpattern.factory.bank.dao.AccountDAOMock;
import com.artisan.designpattern.factory.bank.domain.EmailSenderMock;
import com.artisan.designpattern.factory.bank.domain.IEmailSender;

public class MockFactory implements AccountFactoryInterface {
    @Override
    public AccountDAO getAccountDAO(AccountDAO accountDAO) {
        System.out.println("This is mock Account DAO");
        return new AccountDAOMock();
    }

    @Override
    public IEmailSender getEmailSender() {
        System.out.println("This is mock email sender");
        return new EmailSenderMock();
    }
}
