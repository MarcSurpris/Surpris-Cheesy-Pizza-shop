package com.pluralsight.capstone.model;
// Drink
public class Drink implements Item {
    private String drinkSize;
    private String flavor;

    public Drink(String drinkSize, String flavor){
        this.drinkSize = drinkSize;
        this.flavor = flavor;
    }
}
