package ListInterface.FindtheNthElement;

import Day2.LIstInterface.FindtheNthElement.NthElement;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;

public class NthElementTest {

    @Test
    void testFindNthFromEnd() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        assertEquals("D", NthElement.findNthFromEnd(list, 2));
        assertEquals("E", NthElement.findNthFromEnd(list, 1));
        assertEquals("A", NthElement.findNthFromEnd(list, 5));
    }


    @Test
    void testInvalidN() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");

        assertThrows(IllegalArgumentException.class, () -> NthElement.findNthFromEnd(list, 3));
        assertThrows(IllegalArgumentException.class, () -> NthElement.findNthFromEnd(list, 0));
        assertThrows(IllegalArgumentException.class, () -> NthElement.findNthFromEnd(list, -1));
    }


}

