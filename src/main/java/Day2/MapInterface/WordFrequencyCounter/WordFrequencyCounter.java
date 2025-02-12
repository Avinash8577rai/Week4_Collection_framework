package Day2.MapInterface.WordFrequencyCounter;

import java.io.*;
import java.util.*;

public class WordFrequencyCounter {

    public static Map<String, Integer> countWordFrequency(String filePath) {
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {

                line = line.toLowerCase().replaceAll("[^a-z\\s]", "");


                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return wordCount;
    }

    public static void main(String[] args) {
        String filePath = "\"C:\\Users\\AVINASH KUMAR RAI\\Desktop\\capgemini training\\Gunjan sir's session ;.txt\"";
        Map<String, Integer> wordFrequency = countWordFrequency(filePath);

        System.out.println("Word Frequency Count:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

