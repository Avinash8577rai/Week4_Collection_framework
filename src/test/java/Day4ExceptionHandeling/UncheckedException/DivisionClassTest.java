package Day4ExceptionHandeling.UncheckedException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DivisionClassTest {
    @Test
    void testValidDivision(){
        assertEquals(5.0, DivisionClass.divisbleNumber(10,2));
    }
    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            DivisionClass.divisbleNumber( 0, 0);
        });
        assertTrue(exception.getMessage().contains("Cannot divide by zero"));
    }
}
