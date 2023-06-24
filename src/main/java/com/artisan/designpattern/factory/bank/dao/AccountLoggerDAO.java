package com.artisan.designpattern.factory.bank.dao;

import com.artisan.designpattern.factory.bank.domain.Account;

public class AccountLoggerDAO extends AccountDAO {
    public void updateAccount(Account account) {
        System.out.println("Account updated:"+ account);
        super.updateAccount(account);
    }

    public Account loadAccount(long accountnumber) {

        Account account = super.loadAccount(accountnumber);
        if(account != null) {
            System.out.println("Found account no:"+ accountnumber);
        } else {
            System.out.println("No account found");
        }

        return account;
    }
}
