package com.pluralsight.finance;

public class House extends Asset {

    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    public House(int year, int squareFeet, int bedrooms) {
        super("House", 0);
        this.yearBuilt = year;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    @Override
    public double getValue() {
        // TODO: Calculate house value
        return 0;
    }
}
