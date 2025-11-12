package com.pluralsight.capstone.model;
// Pizza class

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
}
