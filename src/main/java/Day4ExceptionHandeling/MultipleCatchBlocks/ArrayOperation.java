package Day4ExceptionHandeling.MultipleCatchBlocks;
import java.util.*;
public class ArrayOperation {
    public static void getValueIndex(int[] arr, int index){
        try{
            System.out.println("Value at index:" +index + " : " + arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index invalid!");
        }
        catch(NullPointerException e){
            System.out.println("Array is not initialized!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the size of the array is:");
            int size = sc.nextInt();

            int []  arr =new int[size];
            System.out.println("Enter " + size + " Elements of array");
            for(int i=0; i<size; i++){
                arr[i]= sc.nextInt();
            }
            System.out.println("Enter the index to retrive the value:");
            int index= sc.nextInt();

            getValueIndex(arr, index);
        }
        catch(Exception e){
            System.out.println("Invalid input! please enter the valid input");

        }
        sc.close();
    }
}
