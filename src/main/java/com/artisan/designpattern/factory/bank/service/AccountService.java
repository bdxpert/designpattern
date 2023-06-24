package com.artisan.designpattern.factory.bank.service;

import com.artisan.designpattern.factory.bank.dao.IAccountDAO;
import com.artisan.designpattern.factory.bank.domain.Account;
import com.artisan.designpattern.factory.bank.domain.Customer;
import com.artisan.designpattern.factory.bank.domain.IEmailSender;

import java.util.Collection;


public class AccountService implements IAccountService {
	private IAccountDAO accountDAO;
	private IEmailSender emailSender;

	
	public AccountService(IAccountDAO accountDAO, IEmailSender emailSender){
		this.accountDAO=accountDAO;
		this.emailSender = emailSender;
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
		emailSender.sendEmail();
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
		emailSender.sendEmail();
	}



	public void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description) {
		Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
		Account toAccount = accountDAO.loadAccount(toAccountNumber);
		fromAccount.transferFunds(toAccount, amount, description);
		accountDAO.updateAccount(fromAccount);
		accountDAO.updateAccount(toAccount);
	}
}
