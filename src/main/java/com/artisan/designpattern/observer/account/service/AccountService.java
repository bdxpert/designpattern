package com.artisan.designpattern.observer.account.service;

import com.artisan.designpattern.observer.account.dao.AccountDAO;
import com.artisan.designpattern.observer.account.dao.IAccountDAO;
import com.artisan.designpattern.observer.account.domain.Account;
import com.artisan.designpattern.observer.account.domain.AccountSubject;
import com.artisan.designpattern.observer.account.domain.Customer;

import java.util.Collection;


public class AccountService extends AccountSubject implements IAccountService {
	private IAccountDAO accountDAO;

	
	public AccountService(){
		accountDAO=new AccountDAO();
	}



	public Account createAccount(long accountNumber, String customerName) {
		Account account = new Account(accountNumber);
		Customer customer = new Customer(customerName);
		account.setCustomer(customer);
		accountDAO.saveAccount(account);
		return account;
	}

	public void deposit(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.deposit(amount);
		accountDAO.updateAccount(account);
		notifyObs(accountNumber);
	}

	public Account getAccount(long accountNumber) {
		Account account = accountDAO.loadAccount(accountNumber);
		return account;
	}

	public Collection<Account> getAllAccounts() {
		return accountDAO.getAccounts();
	}

	public void withdraw(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.withdraw(amount);
		accountDAO.updateAccount(account);
		notifyObs(accountNumber);
	}



	public void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description) {
		Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
		Account toAccount = accountDAO.loadAccount(toAccountNumber);
		fromAccount.transferFunds(toAccount, amount, description);
		accountDAO.updateAccount(fromAccount);
		notifyObs(fromAccount.getAccountnumber());
		accountDAO.updateAccount(toAccount);
		notifyObs(toAccount.getAccountnumber());
	}
}
