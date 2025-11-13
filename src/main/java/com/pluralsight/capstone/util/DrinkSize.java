package com.pluralsight.capstone.util;

// DrinkSize class with constants

public class DrinkSize {
    public static final String SMALL = "SMALL";
    public static final String MEDIUM = "MEDIUM";
    public static final String LARGE = "LARGE";

    public static double getPrice(String dSize) {
        return switch (dSize) { // Switch case
            case SMALL -> 2.00;
            case MEDIUM -> 2.50;
            case LARGE -> 3.00;
            default -> 0.0;
        };
    }
}
