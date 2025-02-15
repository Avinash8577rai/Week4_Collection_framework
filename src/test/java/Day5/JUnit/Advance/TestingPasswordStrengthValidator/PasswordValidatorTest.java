package Day5.JUnit.Advance.TestingPasswordStrengthValidator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class PasswordValidatorTest {
    private final PasswordValidator passwordValidator= new PasswordValidator();

    @Test
    void testPasswordIsValid(){
        assertTrue(passwordValidator.isValid("StrongPass1"));
        assertTrue(passwordValidator.isValid("Hello123"));
    }
    @Test
    void testInvaildPassword(){
        assertFalse(passwordValidator.isValid(null));
        assertFalse(passwordValidator.isValid("ahsbjbcc"));
        assertFalse(passwordValidator.isValid("bvsah"));

    }

}
