package Day5.Regex.BasicRegexProblems.ValidateLicensePlateNumber;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class LicensePlateTest {
    private final LicensePlate licensePlate=new LicensePlate();

    @Test
    void testvalidNumberPlate(){
        assertTrue(licensePlate.isNumberPlate("AB8577"));
        assertTrue(licensePlate.isNumberPlate("AK5396"));

    }
    @Test
    void testInvalidNumberPlate(){
        assertFalse(licensePlate.isNumberPlate("AVI4525"));
        assertFalse(licensePlate.isNumberPlate("av8577"));
    }

}
