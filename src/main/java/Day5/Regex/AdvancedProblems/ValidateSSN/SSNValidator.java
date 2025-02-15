package Day5.Regex.AdvancedProblems.ValidateSSN;
import java.util.regex.*;
public class SSNValidator {

        private static final Pattern SSN_PATTERN = Pattern.compile("^\\d{3}-\\d{2}-\\d{4}$");

        public static boolean isValidSSN(String ssn) {
            if (ssn == null) return false; // Handle null input
            return SSN_PATTERN.matcher(ssn).matches();
        }
    }


