package com.artisan.designpattern.proxy.staticway.bank.service;

import com.artisan.designpattern.proxy.staticway.bank.domain.Account;
import com.artisan.designpattern.proxy.staticway.bank.domain.AccountDTO;
import com.artisan.designpattern.proxy.staticway.bank.domain.StopWatch;

import java.util.Collection;

public class TimingAccountServiceProxy implements IAccountService {
    private IAccountService accountService;
    private StopWatch stopWatch;

    public TimingAccountServiceProxy(IAccountService accountService) {
        stopWatch = new StopWatch();
        this.accountService = accountService;
    }

    @Override
    public Account createAccount(long accountNumber, String customerName) {
        stopWatch.start();
        Account account = accountService.createAccount(accountNumber, customerName);
        stopWatch.stop();
        System.out.println("The method AccountService.createAccount took"+stopWatch.getMillis()+" ms");
        return account;
    }

    @Override
    public AccountDTO getAccount(long accountNumber) {
        stopWatch.start();
        AccountDTO account = accountService.getAccount(accountNumber);
        stopWatch.stop();
        System.out.println("The method AccountService.getAccount took"+stopWatch.getMillis()+" ms");
        return account;
    }

    @Override
    public Collection<AccountDTO> getAllAccounts() {
        stopWatch.start();
        Collection<AccountDTO> accounts = accountService.getAllAccounts();
        stopWatch.stop();
        System.out.println("The method AccountService.getAllAccounts took"+stopWatch.getMillis()+" ms");
        return accounts;
    }

    @Override
    public void deposit(long accountNumber, double amount) {
        stopWatch.start();
        accountService.deposit(accountNumber, amount);
        stopWatch.stop();
        System.out.println("The method AccountService.deposit took"+stopWatch.getMillis()+" ms");
    }

    @Override
    public void withdraw(long accountNumber, double amount) {
        stopWatch.start();
        accountService.withdraw(accountNumber, amount);
        stopWatch.stop();
        System.out.println("The method AccountService.withdraw took"+stopWatch.getMillis()+" ms");
    }

    @Override
    public void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description) {
        stopWatch.start();
        accountService.transferFunds(fromAccountNumber, toAccountNumber, amount, description);
        stopWatch.stop();
        System.out.println("The method AccountService.transferFunds took"+stopWatch.getMillis()+" ms");
    }
}
