package com.pluralsight.finance;

public class CreditCard implements Valuable {

    private String name;
    private String accountNumber;
    private double balance;

    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void charge(double amount) {
        // TODO
    }

    public void pay(double amount) {
        // TODO
    }

    @Override
    public double getValue() {
        // TODO
        return 0;
    }
}
