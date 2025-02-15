package Day5.Regex.ExtractionProblems.ExtractLink;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class ExtractLinkTest {
    private final ExtractLink extractor = new ExtractLink();

    @Test
    void testExtractLinks() {
        String text = "Visit https://www.google.com and http://example.org for more info.";
        List<String> links = extractor.extractLinks(text);

        assertEquals(2, links.size());
        assertTrue(links.contains("https://www.google.com"));
        assertTrue(links.contains("http://example.org"));
    }

    @Test
    void testNoLinks() {
        String text = "There are no links in this sentence.";
        List<String> links = extractor.extractLinks(text);
        assertTrue(links.isEmpty());
    }

    @Test
    void testLinksWithPaths() {
        String text = "Check https://github.com/user/repo and https://openai.com/research for details.";
        List<String> links = extractor.extractLinks(text);

        assertEquals(2, links.size());
        assertTrue(links.contains("https://github.com/user/repo"));
        assertTrue(links.contains("https://openai.com/research"));
    }
}
