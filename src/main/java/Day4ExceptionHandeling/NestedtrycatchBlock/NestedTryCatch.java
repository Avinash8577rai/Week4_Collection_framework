package Day4ExceptionHandeling.NestedtrycatchBlock;
import java.util.*;
public class NestedTryCatch {
    public static void divideArray(int[] arr, int index, int divisor) {
        try {
            int element = arr[index];

            try {
                int result = element / divisor;
                System.out.println("Result:" + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot devide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid! array index");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Enter the index");
        int index = sc.nextInt();
        System.out.println("Enter divior");
        int divisor = sc.nextInt();

        divideArray(numbers, index, divisor);
        sc.close();
    }

}
