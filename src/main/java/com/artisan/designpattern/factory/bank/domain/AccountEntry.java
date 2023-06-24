package com.artisan.designpattern.factory.bank.domain;

import java.util.Date;

public class AccountEntry {
	private Date date;
	private double amount;
	private String description;
	private String fromAccountNumber;
	private String fromPersonName;
	
	public AccountEntry() {
	}
	static class EntryBuilder{
		private Date date;
		private double amount;
		private String description;
		private String fromAccountNumber;
		private String fromPersonName;

		public EntryBuilder withDate(Date date){
			this.date = date;
			return this;
		}

		public EntryBuilder withAmount(double amount) {
			this.amount = amount;
			return this;
		}

		public EntryBuilder withDescription(String description) {
			this.description = description;
			return this;
		}

		public EntryBuilder withFromAccountNumber(String fromAccountNumber) {
			this.fromAccountNumber = fromAccountNumber;
			return this;
		}

		public EntryBuilder withFromPersonName(String fromPersonName) {
			this.fromPersonName = fromPersonName;
			return this;
		}
		public AccountEntry build() {
			return new AccountEntry(this);
		}
	}
	public AccountEntry(Date date, double amount, String description, String fromAccountNumber, String fromPersonName) {
		super();
		this.date = date;
		this.amount = amount;
		this.description = description;
		this.fromAccountNumber = fromAccountNumber;
		this.fromPersonName = fromPersonName;
	}
	private AccountEntry(EntryBuilder builder){
		this.date = builder.date;
		this.amount = builder.amount;
		this.description = builder.description;
		this.fromAccountNumber = builder.fromAccountNumber;
		this.fromPersonName = builder.fromPersonName;
	}

	public Date getDate() {
		return date;
	}

	public double getAmount() {
		return amount;
	}

	public String getDescription() {
		return description;
	}

	public String getFromAccountNumber() {
		return fromAccountNumber;
	}

	public String getFromPersonName() {
		return fromPersonName;
	}

	@Override
	public String toString() {
		return "AccountEntry{" +
				"date=" + date +
				", amount=" + amount +
				", description='" + description + '\'' +
				", fromAccountNumber='" + fromAccountNumber + '\'' +
				", fromPersonName='" + fromPersonName + '\'' +
				'}';
	}
}
