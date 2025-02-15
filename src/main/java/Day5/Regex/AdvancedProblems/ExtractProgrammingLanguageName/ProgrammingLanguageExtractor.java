package Day5.Regex.AdvancedProblems.ExtractProgrammingLanguageName;
import java.util.*;
import java.util.regex.*;

public class ProgrammingLangugae {
    private static final Pattern LANGUAGE_PATTERN = Pattern.compile("\\b(JavaScript|Java|Python|C\\+\\+|C#|C|Go|Ruby|Swift|Kotlin|PHP|R|TypeScript|Perl|Scala|Rust)\\b", Pattern.CASE_INSENSITIVE);

    public static List<String> extractLanguages(String text) {
        List<String> languages = new ArrayList<>();
        if (text == null) return languages; // Null check

        Matcher matcher = LANGUAGE_PATTERN.matcher(text);
        while (matcher.find()) {
            languages.add(matcher.group());
        }
        return languages;
    }
}



