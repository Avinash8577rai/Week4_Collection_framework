package Day3.FileHandling;
import Day3.FileHandling.FileHandler;
import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

public class FileHandlerTest {
    private static final String TEST_SOURCE_FILE = "test_source.txt";
    private static final String TEST_DEST_FILE = "test_destination.txt";

    @BeforeEach
    void setUp() throws IOException {

        try (FileWriter writer = new FileWriter(TEST_SOURCE_FILE)) {
            writer.write("Hello, this is a test file.");
        }
    }

    @AfterEach
    void tearDown() {

        new File(TEST_SOURCE_FILE).delete();
        new File(TEST_DEST_FILE).delete();
    }

    @Test
    void testCopyFile_Success() throws IOException {

        FileHandler.copyFile(TEST_SOURCE_FILE, TEST_DEST_FILE);


        File destFile = new File(TEST_DEST_FILE);
        assertTrue(destFile.exists());


        try (BufferedReader reader = new BufferedReader(new FileReader(destFile))) {
            String content = reader.readLine();
            assertEquals("Hello, this is a test file.", content);
        }
    }

    @Test
    void testCopyFile_SourceFileNotFound() {

        Exception exception = assertThrows(FileNotFoundException.class, () -> {
            FileHandler.copyFile("non_existent.txt", TEST_DEST_FILE);
        });

        assertTrue(exception.getMessage().contains("Source file does not exist"));
    }
}
