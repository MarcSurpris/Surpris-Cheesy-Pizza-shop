package com.pluralsight.capstone.util;

public class PizzaSize {
    public static final String PERSONAL_8_INCH = "PERSONAL_8_INCH";
    public static final String MEDIUM_12_INCH = "MEDIUM_12_INCH";
    public static final String LARGE_16_INCH = "LARGE_16_INCH";

    public static double getBasePrice(String size) {
        return switch(size) {
            case PERSONAL_8_INCH -> 8.50;
            case MEDIUM_12_INCH -> 12.00;
            case LARGE_16_INCH -> 16.50;
            default -> 0.0;
        };
    }

    public static double getMeatPrice(String size) {
        return switch (size) {
            case PERSONAL_8_INCH -> 1.00;
            case MEDIUM_12_INCH -> 2.00;
            case LARGE_16_INCH -> 3.00;
            default -> 0.0;
        };
    }

    public static double getExtraMeatPrice(String size) {
        return switch (size) {
            case PERSONAL_8_INCH -> 0.50;
            case MEDIUM_12_INCH -> 1.00;
            case LARGE_16_INCH -> 1.50;
            default -> 0.0;
        };
    }


}
