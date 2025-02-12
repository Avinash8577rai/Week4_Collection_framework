package Day2.ImplementShoppingCart;

import java.util.*;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();
        ShoppingCart shoppingCart = new ShoppingCart();


        productCatalog.addProduct("Apple", 1.5);
        productCatalog.addProduct("Banana", 0.8);
        productCatalog.addProduct("Milk", 3.0);
        productCatalog.addProduct("Bread", 2.5);


        shoppingCart.addItem("Apple", 2);
        shoppingCart.addItem("Banana", 3);
        shoppingCart.addItem("Milk", 1);


        System.out.println("Shopping Cart Items: " + shoppingCart.getCartItems());


        Map<String, Double> sortedItems = CartManager.sortItemsByPrice(shoppingCart.getCartItems(), productCatalog.getAllProducts());
        System.out.println("Items sorted by price: " + sortedItems);
    }
}
