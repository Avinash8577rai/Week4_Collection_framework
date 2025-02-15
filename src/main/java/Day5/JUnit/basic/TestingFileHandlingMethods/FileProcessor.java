package Day5.JUnit.basic.TestingFileHandlingMethods;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileProcessor {
    public void writefiles(String filename, String content) throws IOException{
        Files.write(Path.of(filename),content.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

    }
    public String readFromFiles(String filename) throws IOException{
        return Files.readString(Path.of(filename));
    }
}
