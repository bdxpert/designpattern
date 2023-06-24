package com.artisan.designpattern.factory.bank.service;

import com.artisan.designpattern.factory.bank.dao.AccountDAO;
import com.artisan.designpattern.factory.bank.dao.AccountLoggerDAO;
import com.artisan.designpattern.factory.bank.domain.EmailSender;

public class ProductionFactory implements AccountFactoryInterface {
    @Override
    public AccountDAO getAccountDAO(AccountDAO accountDAO) {
        return new AccountLoggerDAO();
    }

    @Override
    public EmailSender getEmailSender() {
        return new EmailSender();
    }
}
