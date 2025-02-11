package Day1Generics.DynamicOnlineMarketplace;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MarketplaceTest {






        @Test
        public void testApplyDiscount() {
            Product<Book> book = new Product<>("Java Programming", 50.0, new Book("Technology"));
            DiscountManager.applyDiscount(book, 10);
            assertEquals(45.0, book.getPrice(), 0.01);
        }

        @Test
        public void testInvalidDiscount() {
            Product<Clothing> shirt = new Product<>("T-Shirt", 30.0, new Clothing("Casual"));
            Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                DiscountManager.applyDiscount(shirt, -5);
            });
            assertEquals("Invalid discount percentage!", exception.getMessage());
        }
    }

