package Day2.SetInterface.ConvertSetSortedList;

import java.util.*;

public class SortedList {
    public static List<Integer> convertToSortedList(Set<Integer> set) {
        List<Integer> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList); // Sorting in ascending order
        return sortedList;
    }

    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(3);
        hashSet.add(9);
        hashSet.add(1);

        List<Integer> sortedList = convertToSortedList(hashSet);
        System.out.println("Sorted List: " + sortedList); // Output: [1, 3, 5, 9]
    }

}
