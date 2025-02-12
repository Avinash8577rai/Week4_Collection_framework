package Day2.ImplementShoppingCart;

import java.util.*;

    public class ProductCatalog {
        private Map<String, Double> productPrices;

        public ProductCatalog() {
            productPrices = new HashMap<>();
        }

        public void addProduct(String name, double price) {
            productPrices.put(name, price);
        }

        public double getPrice(String name) {
            return productPrices.getOrDefault(name, -1.0);
        }

        public Map<String, Double> getAllProducts() {
            return productPrices;
        }
    }

