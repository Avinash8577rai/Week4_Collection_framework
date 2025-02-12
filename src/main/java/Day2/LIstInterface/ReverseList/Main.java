package Day2.LIstInterface.ReverseList;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original ArrayList: " + arrayList);
        ReverseList.reverseList(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);


        List<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original LinkedList: " + linkedList);
        ReverseList.reverseList(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }
}

