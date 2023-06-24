package com.artisan.designpattern.proxy.staticway.bank.dao;

import com.artisan.designpattern.proxy.staticway.bank.domain.Account;
import com.artisan.designpattern.proxy.staticway.bank.domain.StopWatch;

import java.util.Collection;

public class TimingDAOProxy implements IAccountDAO {
    private StopWatch stopWatch;
    private IAccountDAO accountDAO;

    public TimingDAOProxy(IAccountDAO accountDAO) {
        stopWatch = new StopWatch();
        this.accountDAO = accountDAO;
    }

    @Override
    public void saveAccount(Account account) {

        stopWatch.start();
        accountDAO.saveAccount(account);
        stopWatch.stop();
        System.out.println("The method AccountDAO.saveAccount took"+stopWatch.getMillis()+" ms");
    }

    @Override
    public void updateAccount(Account account) {
        stopWatch.start();
        accountDAO.updateAccount(account);
        stopWatch.stop();
        System.out.println("The method AccountDAO.updateAccount took"+stopWatch.getMillis()+" ms");
    }

    @Override
    public Account loadAccount(long accountnumber) {
        stopWatch.start();
        Account account = accountDAO.loadAccount(accountnumber);
        stopWatch.stop();
        System.out.println("The method AccountDAO.loadAccount took"+stopWatch.getMillis()+" ms");
        return account;
    }

    @Override
    public Collection<Account> getAccounts() {
        stopWatch.start();
        Collection<Account> accounts = accountDAO.getAccounts();
        stopWatch.stop();
        System.out.println("The method AccountDAO.getAccounts took"+stopWatch.getMillis()+" ms");
        return accounts;
    }
}
