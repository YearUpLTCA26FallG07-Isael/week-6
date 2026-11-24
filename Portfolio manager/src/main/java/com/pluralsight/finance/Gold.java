package com.pluralsight.finance;

public class Gold extends Asset {

    private double weight;

    public Gold(double weight) {
        super("Gold", 0);
        this.weight = weight;
    }

    @Override
    public double getValue() {
        // TODO: Calculate gold value
        return 0;
    }
}
