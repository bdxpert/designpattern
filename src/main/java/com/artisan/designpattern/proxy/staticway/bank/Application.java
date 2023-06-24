package com.artisan.designpattern.proxy.staticway.bank;

import com.artisan.designpattern.proxy.staticway.bank.domain.AccountDTO;
import com.artisan.designpattern.proxy.staticway.bank.domain.AccountEntry;
import com.artisan.designpattern.proxy.staticway.bank.domain.Customer;
import com.artisan.designpattern.proxy.staticway.bank.service.AccountService;
import com.artisan.designpattern.proxy.staticway.bank.service.IAccountService;
import com.artisan.designpattern.proxy.staticway.bank.service.TimingAccountServiceProxy;

import java.util.Collection;


public class Application {
	public static void main(String[] args) {
		IAccountService accountService = new AccountService();
		IAccountService timingAccountServiceProxy = new TimingAccountServiceProxy(accountService);
		// create 2 accounts;
		timingAccountServiceProxy.createAccount(1263862, "Frank Brown");
		timingAccountServiceProxy.createAccount(4253892, "John Doe");
		//use account 1;
		timingAccountServiceProxy.deposit(1263862, 240);
		timingAccountServiceProxy.deposit(1263862, 529);
		timingAccountServiceProxy.withdraw(1263862, 230);
		//use account 2;
		timingAccountServiceProxy.deposit(4253892, 12450);
		timingAccountServiceProxy.transferFunds(4253892, 1263862, 100, "payment of invoice 10232");
		// show balances
		
		Collection<AccountDTO> accountlist = timingAccountServiceProxy.getAllAccounts();
		Customer customer = null;
		for (AccountDTO account : accountlist) {
			customer = account.getCustomer();
			System.out.println("Statement for Account: " + account.getAccountnumber());
			System.out.println("Account Holder: " + customer.getName());
			System.out.println("-Date-------------------------"
							+ "-Description------------------"
							+ "-Amount-------------");
			for (AccountEntry entry : account.getEntryList()) {
				System.out.printf("%30s%30s%20.2f\n", entry.getDate()
						.toString(), entry.getDescription(), entry.getAmount());
			}
			System.out.println("----------------------------------------"
					+ "----------------------------------------");
			System.out.printf("%30s%30s%20.2f\n\n", "", "Current Balance:",
					account.getBalance());
		}
	}

}


