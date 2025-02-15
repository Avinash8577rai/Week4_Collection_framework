package Day5.Regex.ExtractionProblems.ExtractCapitalizedWords;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaptialWordExtract {
    private static final Pattern captialWords= Pattern.compile("");

    public List<String>list(String words){
        List<String>captializedWords= new ArrayList<>();
        if(words==null|| words.isEmpty()) return captializedWords;

        Matcher matcher= captialWords.matcher(words);
        while (matcher.find()){
            captializedWords.add(matcher.group());
        }
        return captializedWords;

    }


}
