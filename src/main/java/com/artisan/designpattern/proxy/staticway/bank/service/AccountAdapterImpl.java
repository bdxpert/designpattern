package com.artisan.designpattern.proxy.staticway.bank.service;

import com.artisan.designpattern.proxy.staticway.bank.domain.Account;
import com.artisan.designpattern.proxy.staticway.bank.domain.AccountDTO;

import java.util.ArrayList;
import java.util.Collection;

public class AccountAdapterImpl implements AccountAdapter {
    private IAccountService accountService;

    @Override
    public AccountDTO getAccountDto(Account account) {
        return mapAccountDTO(account);
    }
    private AccountDTO mapAccountDTO(Account account)
    {
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setAccountnumber(account.getAccountnumber());
        accountDTO.setEntryList(account.getEntryList());
        accountDTO.setCustomer(account.getCustomer());
        accountDTO.setBalance(account.getBalance());
        return accountDTO;
    }

    @Override
    public Collection<AccountDTO> getAccounts(Collection<Account> accounts) {
        Collection<AccountDTO> accountDTOS = new ArrayList<>();
        if(!accounts.isEmpty()) {
            accounts.stream().forEach(acc->{
                accountDTOS.add(mapAccountDTO(acc));
            });
        }
        return accountDTOS;
    }

    @Override
    public void setAccountService(IAccountService accountService) {
        this.accountService = accountService;
    }
}
