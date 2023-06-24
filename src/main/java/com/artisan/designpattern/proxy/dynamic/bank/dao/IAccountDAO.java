package com.artisan.designpattern.proxy.dynamic.bank.dao;

import java.util.Collection;
import com.artisan.designpattern.proxy.dynamic.bank.domain.Account;

public interface IAccountDAO {
	void saveAccount(Account account);
	void updateAccount(Account account);
	Account loadAccount(long accountnumber);
	Collection<Account> getAccounts();
}
