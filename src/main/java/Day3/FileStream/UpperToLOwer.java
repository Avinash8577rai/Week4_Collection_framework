package Day3.FileStream;
import java.io.*;
public class UpperToLOwer {






        public static void convertFile(String inputFile, String outputFile) {
            try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

                String line;
                while ((line = reader.readLine()) != null) {
                    writer.write(line.toLowerCase());
                    writer.newLine();
                }
                System.out.println("Conversion completed successfully.");

            } catch (IOException e) {
                System.out.println("Error processing the file: " + e.getMessage());
            }
        }

        public static void main(String[] args) {
            String inputFile = "input.txt";  // Replace with your file path
            String outputFile = "output.txt";

            convertFile(inputFile, outputFile);
        }
    }


