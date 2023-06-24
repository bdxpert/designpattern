package com.artisan.designpattern.templatemethod.withtemplate;

public class PaypalPayment extends PaymentProcessor {
    private String paypalAddress;
    private Customer customer;
    public PaypalPayment(String paypalAddress, Customer customer) {
        super();
        this.paypalAddress = paypalAddress;
        this.customer = customer;
    }

    @Override
    protected void payment(double dollarAmount) {
        // logic to perform paypal payment
        System.out.println("Perform payment with paypal address " + paypalAddress + " and amount $" + dollarAmount);
    }


    @Override
    protected boolean validatePayment() {
        // logic to validate paypal address
        System.out.println("Validate paypal address " + paypalAddress);
        return true;
    }

    @Override
    protected void notifyCustomer() {
        // logic to notify customer
        System.out.println("Notify customer " + customer.getName() + " with email " + customer.getEmail() + " about paypal payment to address " + paypalAddress);
    }

}
