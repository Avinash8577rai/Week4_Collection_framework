package Day5.Regex.ExtractionProblems.ReplaceSpace;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class ReplaceSpaceTest {

        @Test
        void testMultipleSpaces() {
            assertEquals("This is an example with multiple spaces.",
                    ReplaceSpace.normalizeSpaces("This    is  an  example   with   multiple    spaces."));
        }

        @Test
        void testLeadingTrailingSpaces() {
            assertEquals("Hello world!", ReplaceSpace.normalizeSpaces("   Hello    world!   "));
        }

        @Test
        void testSingleWord() {
            assertEquals("Java", ReplaceSpace.normalizeSpaces("    Java    "));
        }

        @Test
        void testNoExtraSpaces() {
            assertEquals("No extra spaces here", ReplaceSpace.normalizeSpaces("No extra spaces here"));
        }



    }


