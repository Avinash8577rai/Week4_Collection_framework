package Day5.Regex.ExtractionProblems.ExtractDates;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExtractDatesTest {
    private static final ExtractDates extract= new ExtractDates();

    @Test
    void testExtractDates() {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        List<String> words = extract.extractdates(text);

        assertEquals(7, words.size());
        assertTrue(words.contains("12/05/2023"));
        assertTrue(words.contains("15/08/2024"));
        assertTrue(words.contains("29/02/2020"));

    }

    @Test
    void testNoDates() {
        String text = "this is a simple sentence with no capital letters.";
        List<String> words = extract.extractdates(text);
        assertTrue(words.isEmpty());
    }


}
