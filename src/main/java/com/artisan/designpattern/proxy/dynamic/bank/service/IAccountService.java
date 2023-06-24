package com.artisan.designpattern.proxy.dynamic.bank.service;

import java.util.Collection;
import com.artisan.designpattern.proxy.dynamic.bank.domain.Account;
import com.artisan.designpattern.proxy.dynamic.bank.service.dto.AccountDTO;

public interface IAccountService {
	AccountDTO createAccount(long accountNumber, String customerName);
    AccountDTO getAccount(long accountNumber);
    Collection<AccountDTO> getAllAccounts();
    void deposit (long accountNumber, double amount);
    void withdraw (long accountNumber, double amount);
    void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description);
}
