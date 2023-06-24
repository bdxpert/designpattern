package com.artisan.designpattern.strategy.account.service;

import com.artisan.designpattern.strategy.account.domain.Account;

import java.util.Collection;

public interface IAccountService {
    Account createAccount(String accountType, long accountNumber, String customerName);
    Account getAccount(long accountNumber);
    Collection<Account> getAllAccounts();
    void deposit (long accountNumber, double amount);
    void withdraw (long accountNumber, double amount);
    void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description);
    public void addInterest();
}
