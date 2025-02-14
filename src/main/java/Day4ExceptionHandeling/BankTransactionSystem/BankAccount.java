package Day4ExceptionHandeling.BankTransactionSystem;
import java.util.*;
public class BankAccount {
    private double balance;

    public BankAccount(double balance){
        this.balance=balance;
    }
    public void withdraw(double amount) throws InsufficientBalanceException{
        if(amount<0){
            throw new IllegalArgumentException("Invalid! amount");
        }
        if(amount>balance){
            throw new InsufficientBalanceException("Insufficient Balance in account");
        }
        balance-=amount;
        System.out.println("Withdrawal successful new balance is: "+ balance);
    }

    public double getBalance() {
        return balance;
    }
}
