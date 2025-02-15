package Day5.JUnit.Advance.TestingTemperatureConverter;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class TemperatureConverterTest {
    private TemperatureConverter temperatureConverter = new TemperatureConverter();

    @Test
    void testCelsiusConverter(){
        assertEquals(32.0, temperatureConverter.celsiusToFreinheit(0),0.01);
        assertEquals(98.6, temperatureConverter.celsiusToFreinheit(37), 0.01);
    }
    @Test
    void testFreinheitConverter(){
        assertEquals(37, temperatureConverter.freinheitToCelsius(98.6),0.01);
        assertEquals(100.0, temperatureConverter.freinheitToCelsius(212), 0.01);
    }

}
