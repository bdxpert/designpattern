package com.artisan.designpattern.command.bank;

public class DepositCommand implements AccountCommand {
    private IAccountService accountService;
    private long accountNo;
    private double amount;

    public DepositCommand(IAccountService accountService, long accountNo ,double amount) {
        this.accountService = accountService;
        this.amount = amount;
        this.accountNo = accountNo;
    }

    @Override
    public void execute() {
        accountService.deposit(this.accountNo, this.amount);
    }

    @Override
    public void unExecute() {
        accountService.withdraw(this.accountNo, this.amount);
    }
}
