package QueueInterface.CircularBufferSimulation;
import Day2.QueueInterface.CircularBufferSimulation.CircularBuffer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
    public class CircularBufferTest {

        @Test
        void testBufferInsertionAndOverwrite() {
            CircularBuffer cb = new CircularBuffer(3);
            cb.enqueue(1);
            cb.enqueue(2);
            cb.enqueue(3);

            cb.enqueue(4); // Overwrites 1
            assertEquals(2, cb.peek()); // Oldest element should now be 2
        }

        @Test
        void testDequeueAndPeek() {
            CircularBuffer cb = new CircularBuffer(3);
            cb.enqueue(5);
            cb.enqueue(6);
            cb.enqueue(7);

            assertEquals(5, cb.dequeue());
            assertEquals(6, cb.peek());
        }

    }

