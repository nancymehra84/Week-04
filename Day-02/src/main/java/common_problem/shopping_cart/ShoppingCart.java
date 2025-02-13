package common_problem.shopping_cart;

import java.util.*;

public class ShoppingCart {
    private static Map<String, Double> productPrices = new HashMap<>();
    private static Map<String, Integer> cart = new LinkedHashMap<>();
    private static Map<String, Double> sortedItemsByPrice = new TreeMap<>(Comparator.comparing(productPrices::get));

    public static void addToCart(String product, int quantity) {
        cart.put(product, cart.getOrDefault(product, 0) + quantity);
    }

    public static void setProductPrice(String product, double price) {
        productPrices.put(product, price);
    }

    public static void removeFromCart(String product) {
        cart.remove(product);
    }

    public static Map<String, Integer> getCart() {
        return new LinkedHashMap<>(cart);
    }

    public static void displayCart() {
        System.out.println("Shopping Cart (Order of Items Added):");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " - Quantity: " + entry.getValue() + " - Price per item: " + productPrices.get(entry.getKey()));
        }
    }

    public static void displaySortedByPrice() {
        sortedItemsByPrice.clear();
        sortedItemsByPrice.putAll(productPrices);

        System.out.println("\nShopping Cart (Sorted by Price):");
        for (Map.Entry<String, Double> entry : sortedItemsByPrice.entrySet()) {
            if (cart.containsKey(entry.getKey())) {
                System.out.println(entry.getKey() + " - Quantity: " + cart.get(entry.getKey()) + " - Price per item: " + entry.getValue());
            }
        }
    }

    public static void displayTotalCost() {
        double total = 0;
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            total += entry.getValue() * productPrices.get(entry.getKey());
        }
        System.out.println("\nTotal Cost: " + total);
    }

    public static void main(String[] args) {
        setProductPrice("Apple", 1.50);
        setProductPrice("Banana", 0.80);
        setProductPrice("Milk", 2.00);
        setProductPrice("Butter", 3.00);

        addToCart("Apple", 2);
        addToCart("Banana", 3);
        addToCart("Milk", 1);
        addToCart("Butter", 1);

        displayCart();
        displaySortedByPrice();
        displayTotalCost();
        removeFromCart("Banana");
        System.out.println("\nAfter removing Banana:");
        displayCart();
        displaySortedByPrice();
        displayTotalCost();
    }
}

