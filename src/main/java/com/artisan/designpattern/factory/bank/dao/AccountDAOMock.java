package com.artisan.designpattern.factory.bank.dao;

import com.artisan.designpattern.factory.bank.domain.Account;

import java.util.ArrayList;
import java.util.Collection;

public class AccountDAOMock extends AccountDAO {
    @Override
    public void saveAccount(Account account) {
        System.out.println("mock account save");
    }

    @Override
    public void updateAccount(Account account) {
        System.out.println("mock account update");
    }

    @Override
    public Account loadAccount(long accountnumber) {
        System.out.println("mock account get");
        return new Account(1111);
    }

    @Override
    public Collection<Account> getAccounts() {
        return new ArrayList<>();
    }
}
