package Day2.QueueInterface.StackUsingQueues;

import java.util.*;

    public class StackUsingQueue {
        private Queue<Integer> q1 = new LinkedList<>();
        private Queue<Integer> q2 = new LinkedList<>();

         public void push(int x) {
            q1.add(x);
        }


        public int pop() {
            if (q1.isEmpty()) throw new IllegalStateException("Stack is empty!");

            while (q1.size() > 1) {
                q2.add(q1.remove()); // Move all except the last element
            }
            int topElement = q1.remove(); // Last element = Top of stack


            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;

            return topElement;
        }


        public int top() {
            if (q1.isEmpty()) throw new IllegalStateException("Stack is empty!");

            while (q1.size() > 1) {
                q2.add(q1.remove());
            }
            int topElement = q1.peek(); // Get last element
            q2.add(q1.remove()); // Move last element to q2


            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;

            return topElement;
        }


        public boolean isEmpty() {
            return q1.isEmpty();
        }

        public static void main(String[] args) {
            StackUsingQueue stack = new StackUsingQueue();
            stack.push(1);
            stack.push(2);
            stack.push(3);
            System.out.println("Top: " + stack.top()); // Output: 3
            System.out.println("Pop: " + stack.pop()); // Output: 3
            System.out.println("Top: " + stack.top()); // Output: 2
        }
    }

