package Day5.Regex.AdvancedProblems.ValidateCard;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class CreditCardTest {

        @Test
        void testValidVisa() {
            assertTrue(CreditCard.isValidVisa("4111111111111111"));
            assertTrue(CreditCard.isValidVisa("4000123412341234"));
        }

        @Test
        void testValidMasterCard() {
            assertTrue(CreditCard.isValidMasterCard("5111111111111111"));
            assertTrue(CreditCard.isValidMasterCard("5200123412341234"));

        }

        @Test
        void testInvalidVisa() {
            assertFalse(CreditCard.isValidVisa("5111111111111111"));
            assertFalse(CreditCard.isValidVisa("41111111111111"));
            assertFalse(CreditCard.isValidVisa("4111abcd11111111"));
        }

        @Test
        void testInvalidMasterCard() {
            assertFalse(CreditCard.isValidMasterCard("4111111111111111"));
            assertFalse(CreditCard.isValidMasterCard("51111111111111"));
            assertFalse(CreditCard.isValidMasterCard("5111abcd11111111"));
        }


    }

