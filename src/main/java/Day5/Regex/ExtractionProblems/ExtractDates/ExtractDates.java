package Day5.Regex.ExtractionProblems.ExtractDates;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;
public class ExtractDates {
    private static final Pattern datesExtract = Pattern.compile("\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\\\d{4}\\b\n");
    public List<String> extractdates(String text) {
        List<String> dates = new ArrayList<>();
        if (text == null || text.isEmpty()) return dates;

        Matcher matcher = datesExtract.matcher(text);
        while (matcher.find()) {
            dates.add(matcher.group());
        }


        return dates;
    }
}
