package MapInterface.FindKeyHighestValue;
import Day2.MapInterface.FindKeyHighestValue.FindMaxKey;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class FindMaxKeyTest {

    @Test
    void testFindMaxKey() {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 10);
        inputMap.put("B", 20);
        inputMap.put("C", 15);

        assertEquals("B", FindMaxKey.findKeyWithMaxValue(inputMap));
    }
}
