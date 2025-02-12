package ListInterface.ReverseList;

import Day2.LIstInterface.ReverseList.ReverseList;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseListTest {


    private <T> List<T> getReversedList(List<T> input) {
        List<T> copy = new ArrayList<>(input);
        ReverseList.reverseList(copy);
        return copy;
    }

    @Test
    void testReverseArrayList() {
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> expected = Arrays.asList(5, 4, 3, 2, 1);
        assertEquals(expected, getReversedList(input));
    }

    @Test
    void testReverseLinkedList() {
        List<Integer> input = new LinkedList<>(Arrays.asList(10, 20, 30, 40));
        List<Integer> expected = Arrays.asList(40, 30, 20, 10);
        assertEquals(expected, getReversedList(input));
    }

}

