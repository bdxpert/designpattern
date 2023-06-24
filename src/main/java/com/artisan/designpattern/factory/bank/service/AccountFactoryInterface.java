package com.artisan.designpattern.factory.bank.service;

import com.artisan.designpattern.factory.bank.dao.AccountDAO;
import com.artisan.designpattern.factory.bank.dao.IAccountDAO;
import com.artisan.designpattern.factory.bank.domain.IEmailSender;

public interface AccountFactoryInterface {
    IAccountDAO getAccountDAO(AccountDAO accountDAO);
    IEmailSender getEmailSender();
}
