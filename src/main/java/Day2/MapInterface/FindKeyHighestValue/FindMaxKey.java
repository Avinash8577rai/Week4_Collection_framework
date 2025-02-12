package Day2.MapInterface.FindKeyHighestValue;
import java.util.*;
public class FindMaxKey {

        public static String findKeyWithMaxValue(Map<String, Integer> inputMap) {
            if (inputMap == null || inputMap.isEmpty()) {
                return null; // Handle edge cases
            }

            String maxKey = null;
            int maxValue = Integer.MIN_VALUE;

            for (Map.Entry<String, Integer> entry : inputMap.entrySet()) {
                if (entry.getValue() > maxValue) {
                    maxValue = entry.getValue();
                    maxKey = entry.getKey();
                }
            }

            return maxKey;
        }

        public static void main(String[] args) {
            Map<String, Integer> sampleMap = new HashMap<>();
            sampleMap.put("A", 10);
            sampleMap.put("B", 20);
            sampleMap.put("C", 15);

            String maxKey = findKeyWithMaxValue(sampleMap);
            System.out.println("Key with max value: " + maxKey);
        }
    }

