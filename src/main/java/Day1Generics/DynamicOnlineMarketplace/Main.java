package Day1Generics.DynamicOnlineMarketplace;

public class Main {

        public static void main(String[] args) {
            // Creating products of different categories
            Product<Book> book = new Product<>("Java Programming", 500.0, new Book("Technology"));
            Product<Clothing> tshirt = new Product<>("Casual T-Shirt", 300.0, new Clothing("Casual Wear"));
            Product<Gadget> smartphone = new Product<>("Smartphone", 5000.0, new Gadget("Electronics"));

            // Displaying products before discount
            System.out.println("Before Discount:");
            System.out.println(book);
            System.out.println(tshirt);
            System.out.println(smartphone);

            // Applying discounts
            DiscountManager.applyDiscount(book, 10);
            DiscountManager.applyDiscount(tshirt, 20);
            DiscountManager.applyDiscount(smartphone, 15);

            // Displaying products after discount
            System.out.println("\nAfter Discount:");
            System.out.println(book);
            System.out.println(tshirt);
            System.out.println(smartphone);
        }
}
