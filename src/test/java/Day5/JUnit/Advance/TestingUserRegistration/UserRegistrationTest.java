package Day5.JUnit.Advance.TestingUserRegistration;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class UserRegistrationTest {
     private UserRegistration userRegistration= new UserRegistration();

     @Test
    void testValidUser(){
         assertEquals("User Registered Successfully", userRegistration.registerUser("Avinash Kumar Rai", "avinashkumarrai8577@gmail.com","Avinash8577"));
         assertEquals("User Registered Successfully", userRegistration.registerUser("Anand Soni", "anand@gmail.com","Anand8577"));
     }
     @Test
    void testInvaildUser(){
         assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("", "avinashkumarrai8577@gamil.com", "ValidPass1"));
         assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("Raj", "RAJ@GAMIL", "Valid"));

         assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("Raj", "avinashkumarrai8577@gmail.com", "Valid"));
     }
}
