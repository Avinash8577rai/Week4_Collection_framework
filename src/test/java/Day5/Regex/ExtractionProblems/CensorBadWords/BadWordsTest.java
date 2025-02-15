package Day5.Regex.ExtractionProblems.CensorBadWords;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class BadWordsTest {



        @Test
        void testCensorBadWords() {
            assertEquals("This is a **** bad example with some **** words.",
                    BadWords.censorBadWords("This is a damn bad example with some stupid words."));
        }


        @Test
        void testNoBadWords() {
            assertEquals("This is a clean sentence.", BadWords.censorBadWords("This is a clean sentence."));
        }



        @Test
        void testNullInput() {
            assertNull(BadWords.censorBadWords(null));
        }
    }

