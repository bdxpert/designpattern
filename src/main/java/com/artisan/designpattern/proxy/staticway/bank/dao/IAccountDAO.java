package com.artisan.designpattern.proxy.staticway.bank.dao;

import com.artisan.designpattern.proxy.staticway.bank.domain.Account;

import java.util.Collection;

public interface IAccountDAO {
	void saveAccount(Account account);
	void updateAccount(Account account);
	Account loadAccount(long accountnumber);
	Collection<Account> getAccounts();
}
