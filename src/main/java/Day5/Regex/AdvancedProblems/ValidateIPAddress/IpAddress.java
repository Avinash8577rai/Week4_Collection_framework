package Day5.Regex.AdvancedProblems.ValidateIPAddress;
import java.util.regex.Pattern;
public class IpAddress {

        private static final String IPaddress =
                "^(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\." +
                        "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\." +
                        "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\." +
                        "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";

        private static final Pattern pattern = Pattern.compile(IPaddress);

        public static boolean isValidIPv4(String ip) {
            if (ip == null) return false; // Null check
            return pattern.matcher(ip).matches();
        }
    }

