package Day2.ImplementShoppingCart;

import java.util.*;

public class ShoppingCart {
    private Map<String, Integer> cartItems;

    public ShoppingCart() {
        cartItems = new LinkedHashMap<>();
    }

    public void addItem(String productName, int quantity) {
        cartItems.put(productName, cartItems.getOrDefault(productName, 0) + quantity);
    }

    public void removeItem(String productName) {
        cartItems.remove(productName);
    }

    public Map<String, Integer> getCartItems() {
        return cartItems;
    }
}
