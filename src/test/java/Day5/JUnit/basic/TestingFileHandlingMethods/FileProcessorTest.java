package Day5.JUnit.basic.TestingFileHandlingMethods;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class FileProcessorTest {
    private static final String TEST_FILE = "testfile.txt";
    private final FileProcessor fileProcessor = new FileProcessor();

    @AfterEach
    void cleanUp() throws IOException {
        Files.deleteIfExists(Path.of(TEST_FILE)); // Cleanup after each test
    }

    @Test
    void testWriteAndReadFromFile() throws IOException {
        String content = "Hello, World!";
        fileProcessor.writefiles(TEST_FILE, content);

        assertTrue(Files.exists(Path.of(TEST_FILE))); // Verify file exists
        assertEquals(content, fileProcessor.readFromFiles(TEST_FILE)); // Verify content
    }

    @Test
    void testReadFromNonExistentFile() {
        assertThrows(IOException.class, () -> fileProcessor.readFromFiles("nonexistent.txt"));
    }
}
