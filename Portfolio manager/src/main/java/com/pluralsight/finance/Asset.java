package com.pluralsight.finance;

public abstract class Asset implements Valuable {
    private String name;
    private double marketValue;

    public Asset(String name, double value) {
        this.name = name;
        this.marketValue = value;
    }

    public abstract double getValue();
}
