package Day5.Regex.AdvancedProblems.ValidateCard;
import java.util.regex.Pattern;
public class CreditCard {

        private static final String VISA_PATTERN = "^4\\d{15}$";      // Visa: Starts with 4, 16 digits
        private static final String MASTERCARD_PATTERN = "^5\\d{15}$"; // MasterCard: Starts with 5, 16 digits

        private static final Pattern visaPattern = Pattern.compile(VISA_PATTERN);
        private static final Pattern masterCardPattern = Pattern.compile(MASTERCARD_PATTERN);

        public static boolean isValidVisa(String cardNumber) {
            if (cardNumber == null) return false; // Null check
            return visaPattern.matcher(cardNumber).matches();
        }

        public static boolean isValidMasterCard(String cardNumber) {
            if (cardNumber == null) return false; // Null check
            return masterCardPattern.matcher(cardNumber).matches();
        }
    }
