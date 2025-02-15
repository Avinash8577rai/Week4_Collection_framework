package Day5.Regex.AdvancedProblems.ExtractCurrencyValues;

import java.util.*;
import java.util.regex.*;

public class CurrencyExtractor {
    private static final Pattern curreny = Pattern.compile("\\$?\\d+(\\.\\d{2})?");

    public static List<String> extractCurrencyValues(String text) {
        List<String> currencyValues = new ArrayList<>();
        if (text == null) return currencyValues; // Null check

        Matcher matcher = curreny.matcher(text);
        while (matcher.find()) {
            currencyValues.add(matcher.group());
        }
        return currencyValues;
    }
}

