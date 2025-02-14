package Day4ExceptionHandeling.CheckedException;
import java.io.*;
public class CheckedException {
    public static String readfiles(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("");

            }
        } catch (IOException e) {
            System.out.println(" Error file not found " + e);
        }
        return content.toString().trim();
    }

    public static void main(String[] args) {
        String result = readfiles("");
        System.out.println(result);
    }
}




