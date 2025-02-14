package Day4ExceptionHandeling.BankTransactionSystem;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class BankTransactionSystemTest {
    @Test
    void testValidWithdrwal() throws InsufficientBalanceException {
        BankAccount account=new BankAccount(5000);
        account.withdraw(2000);
        assertEquals(3000, account.getBalance());
    }
    @Test
    void tesInsufficientBalance(){
        BankAccount account=new BankAccount(5000);
        Exception exception= assertThrows(InsufficientBalanceException.class,()->{
            account.withdraw(6000);
        });
        assertEquals("Insufficient Balance in account",exception.getMessage());
    }
    @Test
    void testNegativeAmount(){
        BankAccount account=new BankAccount(6000);
        Exception exception=assertThrows(IllegalArgumentException.class,()->{
            account.withdraw(-500);
        });
        assertEquals("Invalid! amount", exception.getMessage());
    }

}
