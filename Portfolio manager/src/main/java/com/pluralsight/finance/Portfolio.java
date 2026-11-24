package com.pluralsight.finance;
import java.util.ArrayList;
public class Portfolio {
    private String name;
    private String owner;
    private ArrayList<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }

    public void add(Asset asset) {
        // TODO: Add asset to ArrayList
    }

    public double getValue() {
        // TODO: Calculate total value of all assets
        return 0;
    }
}
