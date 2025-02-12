package MapInterface.InvertMap;
import Day2.MapInterface.InvertMap.InvertMap;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

    public class InvertMapTest {

        @Test
        void testInvertMap() {
            Map<String, Integer> inputMap = new HashMap<>();
            inputMap.put("A", 1);
            inputMap.put("B", 2);
            inputMap.put("C", 1);

            Map<Integer, List<String>> expectedOutput = new HashMap<>();
            expectedOutput.put(1, Arrays.asList("A", "C"));
            expectedOutput.put(2, Arrays.asList("B"));

            assertEquals(expectedOutput, InvertMap.invertMap(inputMap));
        }

}
