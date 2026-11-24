package com.pluralsight.finance;

public class Jewelry extends Asset {
    private double karat;

    public Jewelry(String name, double karat) {
        super(name, 0);
        this.karat = karat;
    }

    @Override
    public double getValue() {
        // TODO: Calculate jewelry value
        return 0;
    }
}