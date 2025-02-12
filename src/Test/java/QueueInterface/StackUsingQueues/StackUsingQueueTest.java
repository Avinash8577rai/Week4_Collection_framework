package QueueInterface.StackUsingQueues;
import Day2.QueueInterface.StackUsingQueues.StackUsingQueue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class StackUsingQueueTest {

        @Test
        void testPushAndPop() {
            StackUsingQueue stack = new StackUsingQueue();
            stack.push(1);
            stack.push(2);
            stack.push(3);

            assertEquals(3, stack.pop());
            assertEquals(2, stack.top());
            assertEquals(2, stack.pop());
            assertEquals(1, stack.pop());
            assertTrue(stack.isEmpty());
        }

        @Test
        void testEmptyStack() {
            StackUsingQueue stack = new StackUsingQueue();
            assertTrue(stack.isEmpty());
            stack.push(10);
            assertFalse(stack.isEmpty());
            stack.pop();
            assertTrue(stack.isEmpty());
        }


    }


