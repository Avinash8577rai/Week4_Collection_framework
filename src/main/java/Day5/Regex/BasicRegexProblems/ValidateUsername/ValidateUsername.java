package Day5.Regex.BasicRegexProblems.ValidateUsername;

import java.util.regex.Pattern;

public class ValidateUsername {
    private static final Pattern username= Pattern.compile("^[a-zA-Z0-9_]{4,14}$");
    public boolean isValidUsername(String usernames){
        return usernames!= null && username.matcher(usernames).matches();
    }
}
