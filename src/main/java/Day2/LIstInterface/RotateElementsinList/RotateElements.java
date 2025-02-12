package Day2.LIstInterface.RotateElementsinList;
import java.util.*;

public class RotateElements {
        public static <T> void rotateList(List<T> list, int positions) {
            int size = list.size();
            if (size == 0 || positions % size == 0) {
                return;
            }

            positions = positions % size;
            Collections.rotate(list, -positions);
        }

        public static void main(String[] args) {
            List<Integer> inputList = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
            int rotateBy = 2;

            System.out.println("Original List: " + inputList);
            rotateList(inputList, rotateBy);
            System.out.println("Rotated List: " + inputList);
        }
    }
