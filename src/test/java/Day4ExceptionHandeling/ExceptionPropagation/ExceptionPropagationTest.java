package Day4ExceptionHandeling.ExceptionPropagation;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ExceptionPropagationTest {
    @Test
    void testExceptionPropagation(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        ExceptionPropagation.main(new String[]{});
        String expectedOutput = "Handeled the exception in main";
        assertEquals(expectedOutput, outContent.toString().trim());
    }
}
