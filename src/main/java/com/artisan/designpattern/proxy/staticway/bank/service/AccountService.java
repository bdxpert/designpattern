package com.artisan.designpattern.proxy.staticway.bank.service;

import com.artisan.designpattern.proxy.staticway.bank.dao.AccountDAO;
import com.artisan.designpattern.proxy.staticway.bank.dao.IAccountDAO;
import com.artisan.designpattern.proxy.staticway.bank.dao.LoggingProxy;
import com.artisan.designpattern.proxy.staticway.bank.dao.TimingDAOProxy;
import com.artisan.designpattern.proxy.staticway.bank.domain.Account;
import com.artisan.designpattern.proxy.staticway.bank.domain.AccountDTO;
import com.artisan.designpattern.proxy.staticway.bank.domain.Customer;

import java.util.Collection;


public class AccountService implements IAccountService {
	private IAccountDAO accountDAO;
	private IAccountDAO loggingProxy = new LoggingProxy(accountDAO);
	private IAccountDAO timingDAOProxy = new TimingDAOProxy(loggingProxy);
	private AccountAdapter accountAdapter;
	public AccountService() {
		accountDAO=new AccountDAO();
		loggingProxy = new LoggingProxy(accountDAO);
		timingDAOProxy = new TimingDAOProxy(loggingProxy);
		accountAdapter = new AccountAdapterImpl();
	}

	public Account createAccount(long accountNumber, String customerName) {
		Account account = new Account(accountNumber);
		Customer customer = new Customer(customerName);
		account.setCustomer(customer);
//		accountDAO.saveAccount(account);
		timingDAOProxy.saveAccount(account);
		return account;
	}

	public void deposit(long accountNumber, double amount) {
		Account account = timingDAOProxy.loadAccount(accountNumber);
		account.deposit(amount);

		timingDAOProxy.updateAccount(account);
	}

	public AccountDTO getAccount(long accountNumber) {
		Account account = timingDAOProxy.loadAccount(accountNumber);
		return accountAdapter.getAccountDto(account);
	}

	public Collection<AccountDTO> getAllAccounts() {
		return accountAdapter.getAccounts(timingDAOProxy.getAccounts());
	}

	public void withdraw(long accountNumber, double amount) {
		Account account = timingDAOProxy.loadAccount(accountNumber);
		account.withdraw(amount);
		timingDAOProxy.updateAccount(account);
	}



	public void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description) {
		Account fromAccount = timingDAOProxy.loadAccount(fromAccountNumber);
		Account toAccount = timingDAOProxy.loadAccount(toAccountNumber);
		fromAccount.transferFunds(toAccount, amount, description);
		timingDAOProxy.updateAccount(fromAccount);
		timingDAOProxy.updateAccount(toAccount);
	}
}
