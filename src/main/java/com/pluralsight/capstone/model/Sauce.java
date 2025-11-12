package com.pluralsight.capstone.model;

import com.pluralsight.capstone.util.ToppingCategory;

// Sauce
public class Sauce extends Topping {
    public Sauce(String name) {
        super(name, ToppingCategory.SAUCE);
    }

    @Override
    public double getBasePrice(String size) {
        return 0.0;
    }

    @Override
    public double getExtraPrice(String size) {
        return 0.0;
    }
}
