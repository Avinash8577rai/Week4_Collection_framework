package Day2.ImplementBankingSystem;

import java.util.*;

public class BalanceSorter {
    public static Map<Integer, Double> sortAccountsByBalance(Map<Integer, Double> accounts) {
        TreeMap<Double, Integer> sortedMap = new TreeMap<>(Collections.reverseOrder());
        for (Map.Entry<Integer, Double> entry : accounts.entrySet()) {
            sortedMap.put(entry.getValue(), entry.getKey());
        }

        Map<Integer, Double> sortedAccounts = new LinkedHashMap<>();
        for (Map.Entry<Double, Integer> entry : sortedMap.entrySet()) {
            sortedAccounts.put(entry.getValue(), entry.getKey());
        }
        return sortedAccounts;
    }
}

