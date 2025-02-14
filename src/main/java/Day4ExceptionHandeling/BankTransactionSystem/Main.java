package Day4ExceptionHandeling.BankTransactionSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BankAccount account= new BankAccount(5000);
        System.out.println(" Enter the amount to Withdraw:");
        double amount=sc.nextDouble();

        try{
            account.withdraw(amount);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());

        }
        finally {
            System.out.println("Transaction Complete!");
        }
        sc.close();
    }
}
