package QueueInterface.ReverseQueue;
import Day2.QueueInterface.ReverseQueue.ReverseQueue;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

    public class ReverseQueueTest {

        @Test
        void testReverseQueue() {
            Queue<Integer> queue = new LinkedList<>(List.of(10, 20, 30));
            Queue<Integer> expected = new LinkedList<>(List.of(30, 20, 10));

            ReverseQueue.reverseQueue(queue);
            assertEquals(expected, queue);
    }

}
