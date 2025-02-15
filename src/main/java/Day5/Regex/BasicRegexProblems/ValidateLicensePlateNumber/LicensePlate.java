package Day5.Regex.BasicRegexProblems.ValidateLicensePlateNumber;
import java.util.regex.*;
public class LicensePlate {
    public static final Pattern numberplate=Pattern.compile("^[A-Z]{2}[0-9]{4}");
    public boolean isNumberPlate(String number){
        return number!=null && numberplate.matcher(number).matches();
    }
}
