package com.pluralsight.capstone.model;

import com.pluralsight.capstone.util.CrustType;
import com.pluralsight.capstone.util.PizzaSize;

public class Margherita extends Pizza {
    public Margherita() {
        super(PizzaSize.MEDIUM_12_INCH, CrustType.REGULAR);
        addTopping(new Cheese("Mozzarella"));
        addTopping(new RegularTopping("Tomatoes"));
        addTopping(new RegularTopping("Basil"));
        addTopping(new Sauce("Marinara"));
        addTopping(new Sauce("Olive Oil"));
    }
}
