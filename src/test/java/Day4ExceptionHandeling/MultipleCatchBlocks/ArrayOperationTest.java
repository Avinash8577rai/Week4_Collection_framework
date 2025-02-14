package Day4ExceptionHandeling.MultipleCatchBlocks;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ArrayOperationTest {

    @Test
    void testValidIndex(){
        int[] arr= {10,20,30,40,50};
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ArrayOperation.getValueIndex(arr, 3);
        assertEquals("Value at index:3 : 40", outContent.toString().trim());

    }
    @Test
    void testInvalidIndex(){
        int[] arr ={ 10,20,30,40,50};
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ArrayOperation.getValueIndex(arr , 10);
        assertEquals("Index invalid!", outContent.toString().trim());
    }

}
