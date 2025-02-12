package ListInterface.RotateElementsinList;
import Day2.LIstInterface.RotateElementsinList.RotateElements;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

    public class RotateElementsTest {

        private <T> List<T> getRotatedList(List<T> input, int positions) {
            List<T> copy = new ArrayList<>(input);
            RotateElements.rotateList(copy, positions);
            return copy;
        }

        @Test
        void testRotateByTwo() {
            List<Integer> input = Arrays.asList(10, 20, 30, 40, 50);
            List<Integer> expected = Arrays.asList(30, 40, 50, 10, 20);
            assertEquals(expected, getRotatedList(input, 2));
        }


    }

