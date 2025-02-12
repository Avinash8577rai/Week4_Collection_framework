package QueueInterface.GenerateBinaryNumbers;
import Day2.QueueInterface.GenerateBinaryNumbers.BinaryNumber;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryNumberTest {

    @Test
    void testGenerateBinaryNumbers() {
        assertArrayEquals(new String[]{"1", "10", "11", "100", "101"}, BinaryNumber.generateBinaryNumbers(5));
    }

}
