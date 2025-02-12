package Day2.QueueInterface.GenerateBinaryNumbers;

import java.util.*;

public class BinaryNumber {


    public static String[] generateBinaryNumbers(int N) {
        String[] result = new String[N];
        Queue<String> queue = new LinkedList<>();

        queue.add("1");

        for (int i = 0; i < N; i++) {
            String current = queue.remove();
            result[i] = current;

            queue.add(current + "0");
            queue.add(current + "1");
        }
        return result;
    }

    public static void main(String[] args) {
        int N = 5;
        String[] binaryNumbers = generateBinaryNumbers(N);

        System.out.print("Binary Numbers: ");
        for (String num : binaryNumbers) {
            System.out.print(num + " ");
        }

    }
}
