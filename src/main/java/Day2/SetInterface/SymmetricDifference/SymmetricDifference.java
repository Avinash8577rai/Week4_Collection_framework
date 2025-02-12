package Day2.SetInterface.SymmetricDifference;

import java.util.Set;
import java.util.HashSet;

public class SymmetricDifference {

    // Method to compute the symmetric difference of two sets
    public static <T> Set<T> symmetricDifference(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        Set<T> intersection = new HashSet<>(set1);

        result.addAll(set2);  // Union of both sets
        intersection.retainAll(set2); // Intersection of both sets

        result.removeAll(intersection); // Remove common elements
        return result;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(3, 4, 5);

        System.out.println("Symmetric Difference: " + symmetricDifference(set1, set2)); // Output: [1, 2, 4, 5]
    }
}

