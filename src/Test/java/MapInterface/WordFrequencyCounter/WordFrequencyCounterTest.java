package MapInterface.WordFrequencyCounter;
import Day2.MapInterface.WordFrequencyCounter.WordFrequencyCounter;
import org.junit.jupiter.api.Test;

import java.io.PrintWriter;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class WordFrequencyCounterTest {

    @Test
    void testWordFrequency() {

        String testFilePath = "test.txt";


        try (PrintWriter writer = new PrintWriter(testFilePath)) {
            writer.println("Hello world, hello Java!");
            writer.println("Java is fun. Hello everyone.");
        } catch (Exception e) {
            fail("Failed to create test file.");
        }


        Map<String, Integer> result = WordFrequencyCounter.countWordFrequency(testFilePath);
        assertEquals(3, result.get("hello"));
        assertEquals(2, result.get("java"));
        assertEquals(1, result.get("world"));
        assertEquals(1, result.get("is"));
        assertEquals(1, result.get("fun"));
        assertEquals(1, result.get("everyone"));
    }
}



