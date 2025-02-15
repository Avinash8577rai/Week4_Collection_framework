package Day5.Regex.ExtractionProblems.ExtractEmailAddresses;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;

public class EmailExtractTest {
    private final EmailExtract emailExtract = new EmailExtract();

    @Test
    void testExtractedEmails(){
        String  text= "Contact us on avinashkumarrai8577@gmail.com and support@technook.edu";
        List<String>emails=emailExtract.extractedEmail(text);
        assertEquals(2,emails.size());
        assertTrue(emails.contains("avinashkumarrai8577@gmail.com"));
        assertTrue(emails.contains("support@technook.edu"));
    }
    @Test
    void testNoEmails(){
        String text="Anand bnajdbhasfjhdvjbcvhdcghjcg";
        List<String>emails=emailExtract.extractedEmail(text);
        assertTrue(emails.isEmpty());
    }

}
