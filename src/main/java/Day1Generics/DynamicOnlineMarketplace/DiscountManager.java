package Day1Generics.DynamicOnlineMarketplace;

public class DiscountManager {
        public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
            if (percentage < 0 || percentage > 100) {
                throw new IllegalArgumentException("Invalid discount percentage!");
            }
            double newPrice = product.getPrice() * (1 - percentage / 100);
            product.setPrice(newPrice);
            System.out.println("Discount applied: " + product.getName() + " new price: " + newPrice);
        }
}
