package Day4ExceptionHandeling.BankTransactionSystem;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message){
        super(message);
    }
}
