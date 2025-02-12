package Day2.QueueInterface.CircularBufferSimulation;

import java.util.Arrays;

public class CircularBuffer {
    private int[] buffer;
    private int size, front, rear, capacity;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.size = 0;
        this.front = 0;
        this.rear = -1;
    }


    public void enqueue(int value) {
        rear = (rear + 1) % capacity;
        buffer[rear] = value;
        if (size < capacity) {
            size++;
        } else {
            front = (front + 1) % capacity; // Overwrite oldest element
        }
    }


    public int dequeue() {
        if (size == 0) throw new IllegalStateException("Buffer is empty!");
        int removed = buffer[front];
        front = (front + 1) % capacity; // Move front forward circularly
        size--;
        return removed;
    }


    public int peek() {
        if (size == 0) throw new IllegalStateException("Buffer is empty!");
        return buffer[front];
    }


    public void display() {
        System.out.print("Buffer: ");
        for (int i = 0; i < size; i++) {
            System.out.print(buffer[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.enqueue(1);
        cb.enqueue(2);
        cb.enqueue(3);
        cb.display();

        cb.enqueue(4);
        cb.display();

        System.out.println("Dequeued: " + cb.dequeue());
        cb.display();

        System.out.println("Peek: " + cb.peek());
    }
}

