package com.pluralsight.capstone.model;

import com.pluralsight.capstone.util.ToppingCategory;

// RegularTopping
public class RegularTopping extends Topping {
    public RegularTopping(String name) {
        super(name, ToppingCategory.REGULAR);
    }

    @Override
    public double getBasePrice(String size) {
        return 0.0;
    }
}
