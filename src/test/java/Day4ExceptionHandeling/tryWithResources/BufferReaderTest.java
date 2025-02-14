package Day4ExceptionHandeling.tryWithResources;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class BufferReaderTest {
    @Test
    void testFileRead() throws IOException {
        String result = BufferReader.readFiles("non_existent_file.txt");
        assertNull(result);
    }

    }

