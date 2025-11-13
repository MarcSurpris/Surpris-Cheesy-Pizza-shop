package com.pluralsight.capstone.model;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.FileWriter;
import java.io.IOException;

// Order
public class Order {
    private List<Item> items = new ArrayList<>();
    private double totalCost = 0.0;

    public void addItem(Item item) {
        items.add(item);
        totalCost += item.getPrice();
    }

    public void removeItem(Item item) {
        if (items.remove(item)) {
            totalCost -= items.getPrice();
        }
    }

    public double calculateTotal() {
        return totalCost;
    }

    public boolean isValid() {
        boolean hasPizza = items.stream().anyMatch(i -> i instanceof Pizza);
        boolean hasDrinkOrKnots = items.stream().anyMatch(i -> i instanceof Drink || i instanceof GarlicKnot);
        return hasPizza || hasDrinkOrKnots;
    }

    public String generateReceipt() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order Receipt\n");
        sb.append("Date: ").append(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"))).append("\n");
        for (Item item : items) {
            sb.append(item.getDescription()).append(" - $").append(String.format("%.2f", item.getPrice())).append("\n");
        }
        sb.append("Total: $").append(String.format("%.2f", totalCost)).append("\n");
        return sb.toString();
    }

}
