package Day4ExceptionHandeling.finallyBlockExecution;
import static org.junit.jupiter.api.Assertions.*;

import Day4ExceptionHandeling.UncheckedException.DivisionClass;
import org.junit.jupiter.api.Test;
public class DivisionClassTest {

    @Test
    void testValidDivision(){
        assertEquals(5.0, Day4ExceptionHandeling.UncheckedException.DivisionClass.divisbleNumber(10,2));
    }
    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            DivisionClass.divisbleNumber( 0, 0);
        });
        assertTrue(exception.getMessage().contains("Cannot divide by zero"));
    }
}
