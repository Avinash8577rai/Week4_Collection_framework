package Day5.Regex.ExtractionProblems.CensorBadWords;
import java.util.Set;
import java.util.regex.Pattern;

public class BadWords {


        private static final Set<String> BAD_WORDS = Set.of("damn", "stupid");
        private static final Pattern BAD_WORDS_PATTERN = Pattern.compile("\\b(" + String.join("|", BAD_WORDS) + ")\\b", Pattern.CASE_INSENSITIVE);

        public static String censorBadWords(String text) {
            if (text == null) return null;
            return BAD_WORDS_PATTERN.matcher(text).replaceAll("****");
        }


}
