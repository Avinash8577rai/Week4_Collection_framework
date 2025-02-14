package Day4ExceptionHandeling.throwVSthrows;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class IntrestCalculatorTest {
    @Test
    void testValidIntrestCalculator(){
        double interest=IntrestCalculator.intrestCalculator(1000,5,2);
        assertEquals(100,interest, 0.001);
    }
    @Test
    void testNegativeAmmount(){
        Exception exception= assertThrows(IllegalArgumentException.class, ()->{
            IntrestCalculator.intrestCalculator(-1000,5,2);
        });
                assertEquals("Amount and Rate must be in Positive ",exception.getMessage());
    }
    @Test
    void testNegativeRate(){
        Exception exception= assertThrows(IllegalArgumentException.class, ()->{
            IntrestCalculator.intrestCalculator(1000,-5,2);
        });
        assertEquals("Amount and Rate must be in Positive ",exception.getMessage());
    }

}
