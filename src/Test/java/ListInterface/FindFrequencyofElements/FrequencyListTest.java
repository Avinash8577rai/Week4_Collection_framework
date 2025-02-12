package ListInterface.FindFrequencyofElements;

import Day2.LIstInterface.FindFrequencyofElements.FrequencyList;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class FrequencyListTest {

    @Test
    void testFrequencyCount() {
        List<String> input = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 2);
        expected.put("banana", 1);
        expected.put("orange", 1);

        assertEquals(expected, FrequencyList.countFrequency(input));
    }

}
