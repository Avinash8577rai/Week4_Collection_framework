package Day5.Regex.BasicRegexProblems.ValidateUsername;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class ValidateUsernameTest {
    private final ValidateUsername validateUsername = new ValidateUsername();

    @Test
    void testValidUsername(){
        assertTrue(validateUsername.isValidUsername("Avinash8577"));
        assertTrue(validateUsername.isValidUsername("raiSaheb_8577"));
    }
    @Test
    void testInvaildUsername(){
        assertFalse(validateUsername.isValidUsername(null));
        assertFalse(validateUsername.isValidUsername("longer_than_15_chars"));
        assertFalse(validateUsername.isValidUsername("use"));
    }
}
