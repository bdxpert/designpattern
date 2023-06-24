package com.artisan.designpattern.proxy.dynamic.bank.service.adapter;

import com.artisan.designpattern.proxy.dynamic.bank.domain.Account;
import com.artisan.designpattern.proxy.dynamic.bank.domain.AccountEntry;
import com.artisan.designpattern.proxy.dynamic.bank.service.dto.AccountDTO;
import com.artisan.designpattern.proxy.dynamic.bank.service.dto.AccountEntryDTO;
import com.artisan.designpattern.proxy.dynamic.bank.service.dto.CustomerDTO;

public class AccountAdapter {
	public static AccountDTO getAccountDto(Account account) {
		AccountDTO accountDTO = new AccountDTO(account.getAccountnumber(), account.getBalance());
		CustomerDTO customerDTO = CustomerAdapter.getCustomerDto(account.getCustomer());
		accountDTO.setCustomer(customerDTO);
		for (AccountEntry accountEntry : account.getEntryList()) {
			AccountEntryDTO accountEntryDTO = AccountEntryAdapter.getAccountEntryDto(accountEntry);
			accountDTO.addEntry(accountEntryDTO);
		}
		return accountDTO;
	}
}
