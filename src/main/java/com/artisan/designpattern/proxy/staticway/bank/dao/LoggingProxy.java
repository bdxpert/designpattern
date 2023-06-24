package com.artisan.designpattern.proxy.staticway.bank.dao;

import com.artisan.designpattern.proxy.staticway.bank.domain.Account;

import java.util.Collection;
import java.util.logging.Logger;

public class LoggingProxy implements IAccountDAO {
    private IAccountDAO accountDAO;
    Logger log = Logger.getLogger("LoggingProxy.class");//new Logger();// new Logger("LoggingProxy.class");

    public LoggingProxy(IAccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public void saveAccount(Account account) {
        accountDAO.saveAccount(account);
        log.info("Account information saved: "+ account.getAccountnumber());
    }

    @Override
    public void updateAccount(Account account) {
        accountDAO.updateAccount(account);
        log.info("Account information updated: "+ account.getAccountnumber());
    }

    @Override
    public Account loadAccount(long accountnumber) {
        Account account = accountDAO.loadAccount(accountnumber);
        log.info("Account information loaded: "+ accountnumber);
        return account;
    }

    @Override
    public Collection<Account> getAccounts() {
        log.info("get all Account information");
        return accountDAO.getAccounts();
    }
}
