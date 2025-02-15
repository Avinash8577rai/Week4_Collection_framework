package Day5.Regex.ExtractionProblems.ExtractCapitalizedWords;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CaptialWordExtractTest {
    private final CaptialWordExtract extractor = new CaptialWordExtract();

    @Test
    void testExtractCapitalizedWords() {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        List<String> words = extractor.list(text);

        assertEquals(7, words.size());
        assertTrue(words.contains("Eiffel"));
        assertTrue(words.contains("Tower"));
        assertTrue(words.contains("Paris"));
        assertTrue(words.contains("Statue"));
        assertTrue(words.contains("Liberty"));
        assertTrue(words.contains("New"));
        assertTrue(words.contains("York"));
    }

    @Test
    void testNoCapitalizedWords() {
        String text = "this is a simple sentence with no capital letters.";
        List<String> words = extractor.list(text);
        assertTrue(words.isEmpty());
    }

    @Test
    void testMixedCaseWords() {
        String text = "hello World from OpenAI in San Francisco!";
        List<String> words = extractor.list(text);

        assertEquals(3, words.size());
        assertTrue(words.contains("World"));
        assertTrue(words.contains("OpenAI"));
        assertTrue(words.contains("San"));
        assertTrue(words.contains("Francisco"));
    }
}
