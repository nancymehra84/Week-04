package common_problem_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;
import common_problem.shopping_cart.*;
class ShoppingCartTest {

    @BeforeEach
    void setUp() {
        ShoppingCart.setProductPrice("Apple", 1.50);
        ShoppingCart.setProductPrice("Banana", 0.80);
        ShoppingCart.setProductPrice("Milk", 2.00);
        ShoppingCart.setProductPrice("Butter", 3.00);

        ShoppingCart.addToCart("Apple", 2);
        ShoppingCart.addToCart("Banana", 3);
        ShoppingCart.addToCart("Milk", 1);
        ShoppingCart.addToCart("Butter", 1);
    }

    @Test
    void testAddToCart() {
        ShoppingCart.addToCart("Apple", 3);
        ShoppingCart.addToCart("Milk", 2);

        Map<String, Integer> cart = ShoppingCart.getCart();
        assertEquals(7, cart.get("Apple"));
        assertEquals(4, cart.get("Milk"));
    }

    @Test
    void testRemoveFromCart() {
        ShoppingCart.removeFromCart("Banana");

        Map<String, Integer> cart = ShoppingCart.getCart();
        assertNull(cart.get("Banana"));
    }

    @Test
    void testDisplaySortedByPrice() {
        ShoppingCart.displaySortedByPrice();
    }


}

