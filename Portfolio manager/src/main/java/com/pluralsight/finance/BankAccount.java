package com.pluralsight.finance;

import com.pluralsight.finance.Valuable;

import java.math.BigDecimal;

public class BankAccount implements Valuable {

    private String name;
    private String accountNumber;
    private BigDecimal balance;

    public BankAccount(String accountNumber, String name, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        // TODO
    }

    public void withdraw(double amount) {
        // TODO
    }

    @Override
    public double getValue() {
        // TODO
        return 0;
    }
}