package Day3.ReadInput;
import Day3.ReadInput.UserInfoToFile;
import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserInfoToFileTest {
    private static final String TEST_FILE = "C:/Users/AVINASH KUMAR RAI/Desktop/capgemini training/Destination.txt";

    @AfterEach
    void cleanUp() {
        new File(TEST_FILE).delete();
    }

    @Test
    void testFileWrite() throws IOException {

        String simulatedInput = "avinash\n22\njava\n";

        InputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        UserInfoToFile.main(new String[]{});

        File file = new File(TEST_FILE);
        assertTrue(file.exists());

        try (BufferedReader reader = new BufferedReader(new FileReader(TEST_FILE))) {
            assertEquals("Name: avinash", reader.readLine());
            assertEquals("Age: 22", reader.readLine());
            assertEquals("Favorite programming lanuage : java", reader.readLine());
        }
    }
}

