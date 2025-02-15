package Day5.Regex.AdvancedProblems.ExtractProgrammingLanguageName;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class ProgrammingLangugae {
    @Test
    void testExtractLanguages() {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        List<String> languages = ProgrammingLangugae.extractLanguages(text);

        assertEquals(4, languages.size());
        assertTrue(languages.contains("Java"));

    }


    @Test
    void testNullAndEmptyString() {
        assertTrue(ProgrammingLangugae.extractLanguages(null).isEmpty());
        assertTrue(ProgrammingLangugae.extractLanguages("").isEmpty());
    }
}

