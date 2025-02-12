package Day2.ImplementBankingSystem;

import java.util.HashMap;
import java.util.Map;

public class AccountManager {
    private Map<Integer, Double> accounts;

    public AccountManager() {
        this.accounts = new HashMap<>();
    }

    public void addAccount(int accountNumber, double balance) {
        accounts.put(accountNumber, balance);
    }

    public double getBalance(int accountNumber) {
        return accounts.getOrDefault(accountNumber, -1.0);
    }

    public boolean withdraw(int accountNumber, double amount) {
        if (accounts.containsKey(accountNumber) && accounts.get(accountNumber) >= amount) {
            accounts.put(accountNumber, accounts.get(accountNumber) - amount);
            return true;
        }
        return false;
    }

    public Map<Integer, Double> getAllAccounts() {
        return accounts;
    }
}
