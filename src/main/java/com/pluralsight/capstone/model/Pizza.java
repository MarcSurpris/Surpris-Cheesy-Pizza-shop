package com.pluralsight.capstone.model;
// Pizza class

import com.pluralsight.capstone.util.PizzaSize;

import java.util.ArrayList;
import java.util.List;

public class Pizza implements Item {
    private String size;
    private String crust;
    private boolean stuffedCrust = false;
    private List<Topping> toppings = new ArrayList<>();

    public Pizza(String size, String crust) {
        this.size = size;
        this.crust = crust;
    }

    public void setStuffedCrust(boolean stuffed) {
        this.stuffedCrust = stuffed;
    }

    public void addTopping(Topping topping) {
        // check if same topping already exists, add extra
        for (Topping t : toppings) {
            if (t.getName().equals(topping.getName())) {
                t.addExtra(1);
                return;
            }
        }
        toppings.add(topping);
    }

    public double getPrice() {
        double crustPrice = PizzaSize.getBasePrice(size); // Base includes crust?
        // crust price is the base for the pizza
        // Stuffed crust is additional.
        double stuffedPrice = stuffedCrust ? 2.00 : 0.0;

        double toppingsPrice = 0.0;
        for (Topping t : toppings) {
            toppingsPrice += t.getPrice(size);
        }

        return crustPrice + stuffedPrice + toppingsPrice;

    }
}
