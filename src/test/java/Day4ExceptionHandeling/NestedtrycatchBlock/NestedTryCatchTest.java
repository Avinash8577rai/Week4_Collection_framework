package Day4ExceptionHandeling.NestedtrycatchBlock;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class NestedTryCatchTest {

    @Test
    void testValidDivison(){
        ByteArrayOutputStream outContent= new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        int[] arr={10,20,30,40,50};
        NestedTryCatch.divideArray(arr,2,5);
        String  expectedoutput="Result:6";
        assertEquals(expectedoutput, outContent.toString().trim());

    }
    @Test
    void testInvaildIndex(){
        ByteArrayOutputStream outContent= new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        int[] arr={10,20,30,40,50};
        NestedTryCatch.divideArray(arr,10,5);
        String expectedoutput="Invalid! array index";
        assertEquals(expectedoutput, outContent.toString().trim());
    }
    @Test
    void testInvalidDivison(){
        ByteArrayOutputStream outContent= new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        int[] arr={10,20,30,40,50};
        NestedTryCatch.divideArray(arr, 2,0);
        String expectedoutput="Cannot devide by zero!";
        assertEquals(expectedoutput,outContent.toString().trim());
    }
}
