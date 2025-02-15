package Day5.Regex.AdvancedProblems.FindRepeatingWords;

import java.util.*;
import java.util.regex.*;

public class RepeatingWordsFinder {
    public static Set<String> findRepeatingWords(String text) {
        Set<String> seenWords = new HashSet<>();
        Set<String> repeatedWords = new HashSet<>();

        if (text == null || text.isEmpty()) return repeatedWords;


        Pattern pattern = Pattern.compile("\\b\\w+\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text.toLowerCase());

        while (matcher.find()) {
            String word = matcher.group();
            if (!seenWords.add(word)) {
                repeatedWords.add(word);
            }
        }
        return repeatedWords;
    }
}

