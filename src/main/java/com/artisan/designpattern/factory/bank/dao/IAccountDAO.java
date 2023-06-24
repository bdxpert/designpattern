package com.artisan.designpattern.factory.bank.dao;

import com.artisan.designpattern.factory.bank.domain.Account;

import java.util.Collection;

public interface IAccountDAO {
	void saveAccount(Account account);
	void updateAccount(Account account);
	Account loadAccount(long accountnumber);
	Collection<Account> getAccounts();
}
