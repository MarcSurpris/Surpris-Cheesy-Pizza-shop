package com.pluralsight.capstone.app;

import com.pluralsight.capstone.model.*;
import com.pluralsight.capstone.util.CrustType;
import com.pluralsight.capstone.util.DrinkSize;
import com.pluralsight.capstone.util.PizzaSize;

import java.util.Scanner;

// Main Application
public class PizzaShopApp {
    private static Scanner = new Scanner(System.in);
    private static Order currentOrder;

    public static void main(String[] args) {
        // Ensure receipts folder exists, assume it does or create.

        boolean running = true;
        while (running) {
            displayHomeScreen();
            int choice = getIntInput();
            switch (choice) {
                case 1:
                    currentOrder  = new Order();
                    handleOrderScreen();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        System.out.println("Exiting application");
    }

    private static void displayHomeScreen() {
        System.out.println("Home Screen");
        System.out.print("1) New Order");
        System.out.println("0) Exit");
    }

    private static void handleOrderScreen() {
        boolean ordering = true;
        while (ordering) {
            displayOrderScreen();
            int choice = getIntInput();
            swtich (choice) {
                case 1:
                    addPizza();
                    break;
                case 2:
                    addDrink();
                    break;
                case 3:
                    addGarlicKnots();
                    break;
                case 4:
                    checkout();
                    ordering = false;
                    break;
                case 0:
                    currentOrder = null;
                    ordering = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void displayOrderScreen() {
        System.out.println("Order Screen");
        System.out.println("1) Add Pizza");
        System.out.println("2) Add Drink");
        System.out.println("3) Add Garlic Knots");
        System.out.println("4) Checkout");
        System.out.println("0) Cancel Order");
    }

    private static void addPizza() {
        System.out.println("Add Pizza");

        // Select size
        System.out.println("Select size: 1) Personal 8\", 2) Medium 12\", 3) Large 16\"");
        int sizeChoice = getIntInput();
        String size = switch (sizeChoice) {
            case 1 -> PizzaSize.PERSONAL_8_INCH;
            case 2 -> PizzaSize.MEDIUM_12_INCH;
            case 3 -> PizzaSize.LARGE_16_INCH;
            default -> PizzaSize.MEDIUM_12_INCH;
        };

        // Select crust
        System.out.println("Select crust: 1) Thin, 2) Regular, 3) Thick, 4) Cauliflower");
        int crustChoice = getIntInput();
        String crust = switch (crustChoice) {
            case 1 -> CrustType.THIN;
            case 2 -> CrustType.REGULAR;
            case 3 -> CrustType.THICK;
            case 4 -> CrustType.CAULIFLOWER;
            default -> CrustType.REGULAR;
        };

        Pizza pizza = new Pizza(size, crust);

        // stuffed crust
        System.out.println("Would you like stuffed crust? (y/n)");
        String stuffed = scanner.nextLine().trim().toLowerCase();
        pizza.setStuffedCrust(stuffed.startsWith("y"));

        // Add toppings
        addToppingsToPizza(pizza);

        currentOrder.addItem(pizza);
    }

    private static void addToppingsToPizza(Pizza pizza) {
        // Meats
        System.out.println("Add meats? (pepperoni, sausage, ham, bacon, chicken, meatball) Enter names separated by comma, or none");
        String meatInput = scanner.nextLine().trim();
        if (!meatsInput.equals("none")) {
            String[] meats = meatsInput.split(",");
            for (String m : meats) {
                pizza.addTopping(new Meat(m.trim()));
            }
        }

        // Extra meats? For simplicity, assume addTopping again for extra.
        // Similar for other categories...

        // Cheeses

        System.out.println("Add cheeses? Enter names separated by comma, or none");
        String cheesesInput = scanner.nextLine().trim();
        if (!cheesesInput.equals("none")) {
            String[] cheeses = cheesesInput.split(",");
            for (String c : cheeses) {
                pizza.addTopping(new Cheese(c.trim()));
            }
        }

        // Regular toppings
        System.out.println("Add regular toppings? Enter names separated by comma, or none");
        String regularsInput = scanner.nextLine().trim();
        if (!regularsInput.equals("none")) {
            String[] regulars = regularsInput.split(",");
            for (String r : regulars) {
                pizza.addTopping(new RegularTopping(r.trim()));
            }
        }

        // Sauces
        System.out.println("Add sauces? Enter names separated by comma, or none");
        String saucesInput = scanner.nextLine().trim();
        if  (!saucesInput.equals("none")) {
            String[] sauces = saucesInput.split(",");
            for (String s : sauces) {
                pizza.addTopping(new Sauce(s.trim()));
            }
        }

        // Sides
        System.out.println("Add sides? (red pepper, parmesan) Enter names separated by coma, or none");
        String sideInput = scanner.nextLine().trim();
        if (!sidesInput.equals("none")) {
            String[] sides = sidesInput.split("");
            for (String si : sides) {
                pizza.addTopping(new Side(si.trim()));
            }
        }

        // For extras, since addTopping checks for same name and adds extra if duplicate.
    }

    private static void addDrink() {
        System.out.println("Add Drink");

        System.out.println("Select size: 1) Small,2) Medium, 3) Large");
        int sizeChoice = getIntInput();
        String dSize = switch(sizeChoice) {
            case 1 -> DrinkSize.SMALL;
            case 2 -> DrinkSize.MEDIUM;
            case 3 -> DrinkSize.LARGE;
            default -> DrinkSize.MEDIUM;
        };

}
}
