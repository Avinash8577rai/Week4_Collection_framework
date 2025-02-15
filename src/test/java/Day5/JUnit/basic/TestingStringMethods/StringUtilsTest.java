package Day5.JUnit.basic.TestingStringMethods;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class StringUtilsTest {
    public final StringUtils stringUtils= new StringUtils();
    @Test
    void testReverse(){
        assertEquals("edcba", stringUtils.reverse("abcde"));
        assertNull(stringUtils.reverse(null));
    }
    @Test
    void testPalindrom(){
        assertTrue(stringUtils.isPalindrom("racecar"));
        assertFalse(stringUtils.isPalindrom("hello"));
        assertTrue(stringUtils.isPalindrom("A"));
        assertFalse(stringUtils.isPalindrom(null));
    }
    @Test
    void testToUpperCase(){
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));
        assertEquals(" ",stringUtils.toUpperCase(" "));
        assertNull(stringUtils.toUpperCase(null));
    }

}
