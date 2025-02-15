package Day5.Regex.AdvancedProblems.ValidateIPAddress;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IpAddressTest {

        @Test
        void testValidIPv4() {
            assertTrue(IpAddress.isValidIPv4("192.168.1.1"));
            assertTrue(IpAddress.isValidIPv4("255.255.255.255"));
            assertTrue(IpAddress.isValidIPv4("0.0.0.0"));
        }

        @Test
        void testInvalidIPv4() {
            assertFalse(IpAddress.isValidIPv4("256.100.100.100"));
            assertFalse(IpAddress.isValidIPv4("192.168.1"));

        }

        @Test
        void testNullAndEmpty() {
            assertFalse(IpAddress.isValidIPv4(null));
            assertFalse(IpAddress.isValidIPv4(""));
        }
    }


