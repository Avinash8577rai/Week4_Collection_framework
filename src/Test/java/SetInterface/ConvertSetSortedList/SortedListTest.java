package SetInterface.ConvertSetSortedList;
import Day2.SetInterface.ConvertSetSortedList.SortedList;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

        public class SortedListTest {

            @Test
            void testConvertToSortedList() {
                Set<Integer> set = Set.of(5, 3, 9, 1);
                List<Integer> expected = List.of(1, 3, 5, 9);
                assertEquals(expected, SortedList.convertToSortedList(set));
            }
        }






