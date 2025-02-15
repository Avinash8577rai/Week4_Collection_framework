package Day5.Regex.BasicRegexProblems.ValidateHexColorCode;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class HexColorCodeTest {
    private final HexColorCode hexColorCode= new HexColorCode();

    void testvalidHexColorCode(){
        assertTrue(hexColorCode.isHexCode("#AB8577"));
        assertTrue(hexColorCode.isHexCode("#BH5396"));

    }
    @Test
    void testInvalidHexColorCode(){
        assertFalse(hexColorCode.isHexCode("AVI4525"));
        assertFalse(hexColorCode.isHexCode("av8577"));
    }
}
