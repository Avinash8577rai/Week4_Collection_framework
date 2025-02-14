package Day4ExceptionHandeling.CustomException;


import static org.junit.jupiter.api.Assertions.*;

import Day4ExceptionHandeling.CustomException.AgeValid;
import Day4ExceptionHandeling.CustomException.InvalidAgeException;
import org.junit.jupiter.api.Test;
public class AgeValidTest {

    @Test
    void testValidAge(){
        assertDoesNotThrow(()-> AgeValid.validAge(18));
    }
    @Test
    void testValidOlderAge(){
        assertDoesNotThrow(()-> AgeValid.validAge(25));
    }
    @Test
    void testInvalidAge(){
        Exception exception = assertThrows(InvalidAgeException.class, () -> {
            AgeValid.validAge(16);
        });
        assertTrue(exception.getMessage().contains("Age must be 18 or above"));
    }
}
