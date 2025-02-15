package Day5.Regex.AdvancedProblems.FindRepeatingWords;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Set;

public class RepeatingWordsFinderTest {
    @Test
    void testFindRepeatingWords() {
        String text = "This is is a repeated repeated word test.";
        Set<String> repeatedWords = RepeatingWordsFinder.findRepeatingWords(text);

        assertEquals(2, repeatedWords.size());
        assertTrue(repeatedWords.contains("is"));
        assertTrue(repeatedWords.contains("repeated"));
    }

    @Test
    void testNoRepeatingWords() {
        String text = "Every word is unique here.";
        Set<String> repeatedWords = RepeatingWordsFinder.findRepeatingWords(text);

        assertTrue(repeatedWords.isEmpty());
    }

    @Test
    void testCaseInsensitiveDuplicates() {
        String text = "Hello hello world World WORLD";
        Set<String> repeatedWords = RepeatingWordsFinder.findRepeatingWords(text);

        assertEquals(2, repeatedWords.size());
        assertTrue(repeatedWords.contains("hello"));
        assertTrue(repeatedWords.contains("world"));
    }

    @Test
    void testNullAndEmptyString() {
        assertTrue(RepeatingWordsFinder.findRepeatingWords(null).isEmpty());
        assertTrue(RepeatingWordsFinder.findRepeatingWords("").isEmpty());
    }
}

