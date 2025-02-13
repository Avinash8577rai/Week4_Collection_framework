package Day3.BufferedFileCopy;

import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

public class BufferedFileCopyTest {
    private static final String TEST_SOURCE_FILE = "test_largeFile.txt";
    private static final String TEST_DEST_BUFFERED = "test_bufferedCopy.txt";
    private static final String TEST_DEST_UNBUFFERED = "test_unbufferedCopy.txt";

    @BeforeEach
    void setUp() throws IOException {

        try (FileOutputStream fos = new FileOutputStream(TEST_SOURCE_FILE)) {
            byte[] dummyData = new byte[5 * 1024 * 1024]; // 5MB file
            fos.write(dummyData);
        }
    }

    @AfterEach
    void tearDown() {

        new File(TEST_SOURCE_FILE).delete();
        new File(TEST_DEST_BUFFERED).delete();
        new File(TEST_DEST_UNBUFFERED).delete();
    }

    @Test
    void testCopyFileWithBuffer() throws IOException {
        BufferedFileCopy.copyFileWithBuffer(TEST_SOURCE_FILE, TEST_DEST_BUFFERED);
        assertTrue(new File(TEST_DEST_BUFFERED).exists());
    }

    @Test
    void testCopyFileWithoutBuffer() throws IOException {
        BufferedFileCopy.copyFileWithoutBuffer(TEST_SOURCE_FILE, TEST_DEST_UNBUFFERED);
        assertTrue(new File(TEST_DEST_UNBUFFERED).exists());
    }

    @Test
    void testCopyFile_SourceFileNotFound() {
        Exception exception = assertThrows(FileNotFoundException.class, () -> {
            BufferedFileCopy.copyFileWithBuffer("non_existent.txt", TEST_DEST_BUFFERED);
        });

        assertTrue(exception.getMessage().contains("non_existent.txt"));
    }
}
