package Day3.FileReading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LargestFile {

        public static void readLargeFile(String filePath) {
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.toLowerCase().contains("error")) {
                        System.out.println(line);
                    }
                }
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        }

        public static void main(String[] args) {
            String filePath = "largefile.txt";  // Change to your file path
            readLargeFile(filePath);
        }
    }

