package Day5.Regex.AdvancedProblems.ExtractProgrammingLanguageName;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;


public class ProgrammingLanguageExtractorTest {
    @Test
    void testExtractLanguages() {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        List<String> languages = ProgrammingLanguageExtractor.extractLanguages(text);

        assertEquals(4, languages.size());
        assertTrue(languages.contains("Java"));
        assertTrue(languages.contains("Python"));
        assertTrue(languages.contains("JavaScript"));
        assertTrue(languages.contains("Go"));
    }

    @Test
    void testNullAndEmptyString() {
        assertTrue(ProgrammingLanguageExtractor.extractLanguages(null).isEmpty());
        assertTrue(ProgrammingLanguageExtractor.extractLanguages("").isEmpty());
    }
}

