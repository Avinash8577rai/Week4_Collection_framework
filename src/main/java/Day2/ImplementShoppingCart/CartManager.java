package Day2.ImplementShoppingCart;

import java.util.*;

public class CartManager {
    public static Map<String, Double> sortItemsByPrice(Map<String, Integer> cartItems, Map<String, Double> productPrices) {
        TreeMap<Double, String> sortedItems = new TreeMap<>();
        for (String product : cartItems.keySet()) {
            if (productPrices.containsKey(product)) {
                sortedItems.put(productPrices.get(product), product);
            }
        }

        Map<String, Double> sortedCart = new LinkedHashMap<>();
        for (Map.Entry<Double, String> entry : sortedItems.entrySet()) {
            sortedCart.put(entry.getValue(), entry.getKey());
        }
        return sortedCart;
    }
}
