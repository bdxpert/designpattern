package com.artisan.designpattern.command.bank;

import java.util.Collection;



public class Application {
	public static void main(String[] args) {
		HistoryList historyList = new HistoryList();
		IAccountService accountService = new AccountService();
		long accountNo1 = 1263862;
		long accountNo2 = 4253892;
		// create 2 accounts;
		accountService.createAccount(accountNo1, "Frank Brown");
		accountService.createAccount(accountNo2, "John Doe");
		//use account 1;
		DepositCommand depositCommand = new DepositCommand(accountService, accountNo1, 240);
		depositCommand.execute();
		historyList.addCommand(depositCommand);

		//accountService.deposit(1263862, 240);
//		accountService.deposit(1263862, 529);
		WithdrawCommand withdrawCommand = new WithdrawCommand(accountService, accountNo1, 230);
		withdrawCommand.execute();
		historyList.addCommand(withdrawCommand);
//		accountService.withdraw(1263862, 230);

		historyList.undo();
		//use account 2;
//		accountService.deposit(4253892, 12450);
//		accountService.transferFunds(4253892, 1263862, 100, "payment of invoice 10232");
		// show balances
		
		Collection<Account> accountlist = accountService.getAllAccounts();
		Customer customer = null;
		for (Account account : accountlist) {
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


