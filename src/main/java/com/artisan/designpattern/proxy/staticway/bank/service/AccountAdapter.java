package com.artisan.designpattern.proxy.staticway.bank.service;

import com.artisan.designpattern.proxy.staticway.bank.domain.Account;
import com.artisan.designpattern.proxy.staticway.bank.domain.AccountDTO;

import java.util.Collection;

public interface AccountAdapter {
    public AccountDTO getAccountDto(Account account);
    public Collection<AccountDTO> getAccounts(Collection<Account> accounts);
    void setAccountService(IAccountService accountService);
}
