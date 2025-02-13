package Day3.BufferedFileCopy;
import java.io.*;

public class BufferedFileCopy {
    private static final int BUFFER_SIZE = 4096;

    public static void copyFileWithBuffer(String sourceFile, String destinationFile) throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationFile))) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        }
    }


    public static void copyFileWithoutBuffer(String sourceFile, String destinationFile) throws IOException {
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
        }
    }

    public static void main(String[] args) {
        String sourcePath = "C:/Users/AVINASH KUMAR RAI/Desktop/capgemini training/100mb-examplefile-com.txt";
        String destBuffered = "bufferedCopy.txt";
        String destUnbuffered = "unbufferedCopy.txt";

        try {

            long startTime = System.nanoTime();
            copyFileWithBuffer(sourcePath, destBuffered);
            long endTime = System.nanoTime();
            System.out.println("Buffered Stream Copy Time: " + (endTime - startTime) / 1_000_000 + " ms");


            startTime = System.nanoTime();
            copyFileWithoutBuffer(sourcePath, destUnbuffered);
            endTime = System.nanoTime();
            System.out.println("Unbuffered Stream Copy Time: " + (endTime - startTime) / 1_000_000 + " ms");

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

