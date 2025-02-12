package Day2.ImplementBankingSystem;

import java.util.Map;

public class BankingSystemMain {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        WithdrawalQueue withdrawalQueue = new WithdrawalQueue();


        accountManager.addAccount(101, 5000.0);
        accountManager.addAccount(102, 3000.0);
        accountManager.addAccount(103, 7000.0);


        System.out.println("Customer Accounts: " + accountManager.getAllAccounts());


        Map<Integer, Double> sortedAccounts = BalanceSorter.sortAccountsByBalance(accountManager.getAllAccounts());
        System.out.println("Accounts sorted by balance: " + sortedAccounts);


        withdrawalQueue.addWithdrawalRequest(102);
        withdrawalQueue.addWithdrawalRequest(101);


        while (withdrawalQueue.hasPendingWithdrawals()) {
            int accNum = withdrawalQueue.processNextWithdrawal();
            boolean success = accountManager.withdraw(accNum, 1000.0);
            System.out.println("Withdrawal from " + accNum + " successful: " + success);
        }

      System.out.println("Final Account Balances: " + accountManager.getAllAccounts());
    }
}

