package Day3.FileHandling;

import java.io.*;

public class FileHandler {

    public static void copyFile(String sourceFile, String destinationFile) throws IOException {
        File src = new File(sourceFile);
        File dest = new File(destinationFile);


        if (!src.exists()) {
            throw new FileNotFoundException("Source file does not exist: " + sourceFile);
        }

        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest)) {

            byte[] buffer = new byte[1024];
            int bytesRead;


            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }

    public static void main(String[] args) {
        String sourcePath = "C:/Users/AVINASH KUMAR RAI/Desktop/capgemini training/Gunjan sir's session ;.txt";
        String destinationPath =  "C:/Users/AVINASH KUMAR RAI/Desktop/capgemini training/Destination.txt";

        try {
            copyFile(sourcePath, destinationPath);
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
