package Day5.Regex.AdvancedProblems.ExtractCurrencyValues;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class CurrencyExtractorTest {
    @Test
    void testExtractCurrencyValues() {
        String text = "The price is $45.99, and the discount is 10.50.";
        List<String> currencyValues = CurrencyExtractor.extractCurrencyValues(text);

        assertEquals(2, currencyValues.size());
        assertTrue(currencyValues.contains("$45.99"));
        assertTrue(currencyValues.contains("10.50"));
    }

    @Test
    void testNoCurrencyFound() {
        String text = "There are no prices mentioned here.";
        List<String> currencyValues = CurrencyExtractor.extractCurrencyValues(text);

        assertTrue(currencyValues.isEmpty());
    }

    @Test
    void testDifferentCurrencyFormats() {
        String text = "$100 200.00 $5.5 0.99 3";
        List<String> currencyValues = CurrencyExtractor.extractCurrencyValues(text);

        assertEquals(6, currencyValues.size());
        assertTrue(currencyValues.contains("$100"));
        assertTrue(currencyValues.contains("200.00"));
    }

    @Test
    void testNullAndEmptyString() {
        assertTrue(CurrencyExtractor.extractCurrencyValues(null).isEmpty());
        assertTrue(CurrencyExtractor.extractCurrencyValues("").isEmpty());
    }
}

