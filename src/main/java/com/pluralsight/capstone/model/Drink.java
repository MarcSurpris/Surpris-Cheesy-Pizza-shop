package com.pluralsight.capstone.model;

import com.pluralsight.capstone.util.DrinkSize;

// Drink
public class Drink implements Item {
    private String drinkSize;
    private String flavor;

    public Drink(String drinkSize, String flavor){
        this.drinkSize = drinkSize;
        this.flavor = flavor;
    }

    @Override
    public double getPrice() {
        return DrinkSize.getPrice(drinkSize);
    }

    @Override
    public String getDescription() {
        return drinkSize + " " + flavor + " drink";
    }
}
