package Day5.Regex.BasicRegexProblems.ValidateHexColorCode;
import java.util.regex.*;
public class HexColorCode {

    public static final Pattern hexcolorcode= Pattern.compile("^#{1}[0-9A-Fa-f]{6}");
    public boolean isHexCode(String code){
        return code!=null&&  hexcolorcode.matcher(code).matches();
    }
}
