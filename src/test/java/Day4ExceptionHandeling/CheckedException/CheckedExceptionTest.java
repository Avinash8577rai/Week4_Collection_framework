package Day4ExceptionHandeling.CheckedException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.FileWriter;
import java.io.IOException;
public class CheckedExceptionTest {




        @Test
        void testFileExists() throws IOException {
            String testFileName = "test_data.txt";
            try (FileWriter writer = new FileWriter(testFileName)) {
                writer.write("Hello, world!");
            }

            assertEquals("Hello, world!", CheckedException.readfiles(testFileName));
        }

        @Test
        void testFileNotFound() {
            assertEquals("Error file not found", CheckedException.readfiles ("nonexistent.txt"));
        }
    }

