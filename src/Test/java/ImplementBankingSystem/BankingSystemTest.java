package ImplementBankingSystem;

import Day2.ImplementBankingSystem.BankingSystemMain;
import Day2.ImplementBankingSystem.AccountManager;
import Day2.ImplementBankingSystem.BalanceSorter;
import Day2.ImplementBankingSystem.WithdrawalQueue;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class BankingSystemTest {

    @Test
    void testAccountManagerOperations() {
        AccountManager accountManager = new AccountManager();
        accountManager.addAccount(101, 5000.0);
        assertEquals(5000.0, accountManager.getBalance(101));

        boolean success = accountManager.withdraw(101, 1000.0);
        assertTrue(success);
        assertEquals(4000.0, accountManager.getBalance(101));

        boolean fail = accountManager.withdraw(101, 5000.0);
        assertFalse(fail);
    }

    @Test
    void testBalanceSorter() {
        Map<Integer, Double> accounts = new HashMap<>();
        accounts.put(101, 5000.0);
        accounts.put(102, 3000.0);
        accounts.put(103, 7000.0);

        Map<Integer, Double> sorted = BalanceSorter.sortAccountsByBalance(accounts);
        List<Integer> sortedKeys = new ArrayList<>(sorted.keySet());

        assertEquals(103, sortedKeys.get(0));
        assertEquals(101, sortedKeys.get(1));
        assertEquals(102, sortedKeys.get(2));
    }

    @Test
    void testWithdrawalQueue() {
        WithdrawalQueue withdrawalQueue = new WithdrawalQueue();
        withdrawalQueue.addWithdrawalRequest(101);
        withdrawalQueue.addWithdrawalRequest(102);

        assertTrue(withdrawalQueue.hasPendingWithdrawals());
        assertEquals(101, withdrawalQueue.processNextWithdrawal());
        assertEquals(102, withdrawalQueue.processNextWithdrawal());
        assertFalse(withdrawalQueue.hasPendingWithdrawals());
    }
}
