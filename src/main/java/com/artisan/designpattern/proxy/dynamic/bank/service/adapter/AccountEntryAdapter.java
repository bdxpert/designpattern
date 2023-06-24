package com.artisan.designpattern.proxy.dynamic.bank.service.adapter;

import com.artisan.designpattern.proxy.dynamic.bank.domain.AccountEntry;
import com.artisan.designpattern.proxy.dynamic.bank.service.dto.AccountEntryDTO;

public class AccountEntryAdapter {
	public static AccountEntryDTO getAccountEntryDto(AccountEntry accountEntry) {
		AccountEntryDTO accountEntryDTO = new AccountEntryDTO(accountEntry.getDate(), accountEntry.getAmount(),
				accountEntry.getDescription(), accountEntry.getFromAccountNumber(), accountEntry.getFromPersonName());
		return accountEntryDTO;
	}

}
