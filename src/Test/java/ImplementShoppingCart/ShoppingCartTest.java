package ImplementShoppingCart;
import Day2.ImplementShoppingCart.ProductCatalog;
import Day2.ImplementShoppingCart.CartManager;
import Day2.ImplementShoppingCart.ShoppingCart;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {

    @Test
    void testProductCatalog() {
        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct("Apple", 1.5);
        assertEquals(1.5, catalog.getPrice("Apple"));
    }

    @Test
    void testShoppingCartOperations() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple", 2);
        cart.addItem("Banana", 1);

        assertEquals(2, cart.getCartItems().get("Apple"));
        assertEquals(1, cart.getCartItems().get("Banana"));

        cart.removeItem("Banana");
        assertFalse(cart.getCartItems().containsKey("Banana"));
    }

    @Test
    void testCartManagerSorting() {
        Map<String, Integer> cartItems = new HashMap<>();
        cartItems.put("Apple", 2);
        cartItems.put("Banana", 3);

        Map<String, Double> productPrices = new HashMap<>();
        productPrices.put("Apple", 1.5);
        productPrices.put("Banana", 0.8);

        Map<String, Double> sortedItems = CartManager.sortItemsByPrice(cartItems, productPrices);
        List<String> sortedKeys = new ArrayList<>(sortedItems.keySet());

        assertEquals("Banana", sortedKeys.get(0));
        assertEquals("Apple", sortedKeys.get(1));
    }
}

