package com.artisan.designpattern.strategy.account.dao;

import com.artisan.designpattern.strategy.account.domain.Account;

import java.util.Collection;

public interface IAccountDAO {
	void saveAccount(Account account);
	void updateAccount(Account account);
	Account loadAccount(long accountnumber);
	Collection<Account> getAccounts();
}
