package com.artisan.designpattern.proxy.staticway.bank.service;

import com.artisan.designpattern.proxy.staticway.bank.domain.Account;
import com.artisan.designpattern.proxy.staticway.bank.domain.AccountDTO;

import java.util.Collection;

public interface IAccountService {
    Account createAccount(long accountNumber, String customerName);
    AccountDTO getAccount(long accountNumber);
    Collection<AccountDTO> getAllAccounts();
    void deposit (long accountNumber, double amount);
    void withdraw (long accountNumber, double amount);
    void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description);
}
