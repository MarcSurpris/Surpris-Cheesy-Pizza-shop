package com.pluralsight.capstone.model;

// Abstract Topping

public abstract class Topping {
    private String name;
    private String category;
    private int extraAmount = 0;
    
    public Topping(String name, String category) {
        this.name = name;
        this.category = category;
    }
}
