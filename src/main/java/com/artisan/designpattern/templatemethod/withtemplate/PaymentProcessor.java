package com.artisan.designpattern.templatemethod.withtemplate;

public abstract class PaymentProcessor {
	CurrencyConverter currencyConverter = new CurrencyConverter();

	protected void proccessPayment(double amount, String currency) {
		double dollarAmount = currencyConverter.convertToDollars(amount, currency);
		boolean validationResult = validatePayment();
		if (validationResult) {
			payment(dollarAmount);
			notifyCustomer();
		}
	}
	abstract protected void payment(double amount);
	protected abstract boolean validatePayment();
	protected abstract void notifyCustomer();
}