package Day5.JUnit.Advance.TestingBankingTransactions;

import java.io.IOException;
import java.util.*;

public class BankAccount {
        private double balance;

        public BankAccount(double balance){
            this.balance=balance;
        }
        public void withdraw(double amount) throws IOException{
            if(amount<0){
                throw new IllegalArgumentException("Invalid! amount");
            }
            if(amount>balance){
                throw new IOException("Insufficient Balance in account");
            }
            balance-=amount;
            System.out.println("Withdrawal successful new balance is: "+ balance);
        }

        public double getBalance() {
            return balance;
        }
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
        catch (IOException e){
            System.out.println(e.getMessage());

        }
        finally {
            System.out.println("Transaction Complete!");
        }
        sc.close();
    }
}

