package com.artisan.designpattern.command.bank;

public class WithdrawCommand implements AccountCommand {
    private IAccountService accountService;
    private double amount;
    private long accountNo;

    public WithdrawCommand(IAccountService accountService, long accountNo, double amount) {
        this.accountService = accountService;
        this.amount = amount;
        this.accountNo = accountNo;
    }

    @Override
    public void execute() {
        accountService.withdraw(this.accountNo, this.amount);
    }

    @Override
    public void unExecute() {
        accountService.deposit(this.accountNo, this.amount);
    }
}
