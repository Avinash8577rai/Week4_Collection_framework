package Day5.Regex.ExtractionProblems.ExtractLink;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLink {
    private static final Pattern linkextract = Pattern.compile("\\bhttps?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}\\S*");

    public List<String> extractLinks(String text) {
        List<String> links = new ArrayList<>();
        if (text == null || text.isEmpty()) return links; // Return empty list for null/empty input

        Matcher matcher = linkextract.matcher(text);
        while (matcher.find()) {
            links.add(matcher.group());
        }
        return links;
    }
}
