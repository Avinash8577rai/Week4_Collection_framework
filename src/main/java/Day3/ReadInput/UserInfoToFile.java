package Day3.ReadInput;
import java.io.*;
public class UserInfoToFile {
    public static void main(String[] args) {
        String fileName = "C:/Users/AVINASH KUMAR RAI/Desktop/capgemini training/Destination.txt";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter(fileName, true)) {
            System.out.println("Enterr the Name: ");
            String name = reader.readLine();

            System.out.println("Enter the age: ");
            int age = Integer.parseInt(reader.readLine());

            System.out.println("Enter the favorite programming language: ");
            String langugaue = reader.readLine();

            writer.write("Name: " + name +"\n");
            writer.write("Age: " + age+ "\n");
            writer.write("Favorite programming lanuage : " + langugaue +"\n");

            System.out.println("User data saved to files : " + fileName);

        } catch (IOException e) {
            System.out.println("An error occurred" + e.getMessage());


        }
    }
    }