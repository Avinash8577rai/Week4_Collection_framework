package MapInterface.MergeTwoMaps;
import Day2.MapInterface.MergeTwoMap.MergeMap;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class MergeMapTest {

    @Test
    void testMergeTwoMaps() {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        Map<String, Integer> expectedOutput = new HashMap<>();
        expectedOutput.put("A", 1);
        expectedOutput.put("B", 5);
        expectedOutput.put("C", 4);

        assertEquals(expectedOutput, MergeMap.mergeTwoMaps(map1, map2));
    }



    @Test
    void testMergeTwoEmptyMaps() {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        assertTrue(MergeMap.mergeTwoMaps(map1, map2).isEmpty());
    }

}
