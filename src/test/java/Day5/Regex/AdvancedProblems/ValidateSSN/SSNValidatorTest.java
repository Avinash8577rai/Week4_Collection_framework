package Day5.Regex.AdvancedProblems.ValidateSSN;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SSNValidatorTest {
    @Test
    void testValidSSNs() {
        assertTrue(SSNValidator.isValidSSN("123-45-6789"));
        assertTrue(SSNValidator.isValidSSN("987-65-4321"));
    }

    @Test
    void testInvalidSSNs() {
        assertFalse(SSNValidator.isValidSSN("123456789"));
        assertFalse(SSNValidator.isValidSSN("123-456-789"));

    }
}

