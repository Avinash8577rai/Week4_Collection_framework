package ListInterface.RemoveDuplicates;

import Day2.LIstInterface.RemoveDuplicates.RemoveDuplicates;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class RemoveDuplicatesTest {

    private <T> List<T> getUniqueList(List<T> input) {
        return RemoveDuplicates.removeDuplicates(input);
    }

    @Test
    void testRemoveDuplicates() {
        List<Integer> input = Arrays.asList(3, 1, 2, 2, 3, 4);
        List<Integer> expected = Arrays.asList(3, 1, 2, 4);
        assertEquals(expected, getUniqueList(input));
    }

    @Test
    void testNoDuplicates() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected, getUniqueList(input));
    }

}
