package Day5.Regex.ExtractionProblems.ExtractEmailAddresses;
import java.util.regex.*;
import java.util.*;
public class EmailExtract {
    private static final Pattern emailExtracted= Pattern.compile("[a-z0-9_]+@[a-z0-9]+\\.[a-z0-9]{2,}");
    public List<String>extractedEmail(String text){
        List<String>emails= new ArrayList<>();
        if(text==null)return emails;
        Matcher matcher= emailExtracted.matcher(text);
        while (matcher.find()){
            emails.add(matcher.group());
        }
        return emails;

    }

}
