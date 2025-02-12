package Day2.InsurancePolicyManagementSystem.UsingListAndSet;

import java.time.LocalDate;
import java.util.*;

public class PolicyManager {
    private Set<InsurancePolicy> hashSetPolicies = new HashSet<>();
    private Set<InsurancePolicy> linkedHashSetPolicies = new LinkedHashSet<>();
    private Set<InsurancePolicy> treeSetPolicies = new TreeSet<>();

    public void addPolicy(InsurancePolicy policy) {
        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }

    public Set<InsurancePolicy> getAllPolicies() {
        return new HashSet<>(hashSetPolicies);
    }

    public List<InsurancePolicy> getPoliciesExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate threshold = today.plusDays(30);
        List<InsurancePolicy> expiringSoon = new ArrayList<>();

        for (InsurancePolicy policy : treeSetPolicies) {
            if (!policy.getExpiryDate().isAfter(threshold)) {
                expiringSoon.add(policy);
            }
        }
        return expiringSoon;
    }

    public List<InsurancePolicy> getPoliciesByCoverage(String coverageType) {
        List<InsurancePolicy> filteredPolicies = new ArrayList<>();
        for (InsurancePolicy policy : hashSetPolicies) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                filteredPolicies.add(policy);
            }
        }
        return filteredPolicies;
    }

    public Set<String> findDuplicatePolicies() {
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (InsurancePolicy policy : hashSetPolicies) {
            if (!seen.add(policy.getPolicyNumber())) {
                duplicates.add(policy.getPolicyNumber());
            }
        }
        return duplicates;
    }

    public void comparePerformance() {
        int size = 100000;
        Set<InsurancePolicy> hashSet = new HashSet<>();
        Set<InsurancePolicy> linkedHashSet = new LinkedHashSet<>();
        Set<InsurancePolicy> treeSet = new TreeSet<>();

        System.out.println("Performance Comparison:");

        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            hashSet.add(new InsurancePolicy("P" + i, "Holder" + i, LocalDate.now(), "Health", 1000));
        }
        System.out.println("HashSet Add: " + (System.nanoTime() - start) / 1e6 + " ms");

        start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedHashSet.add(new InsurancePolicy("P" + i, "Holder" + i, LocalDate.now(), "Health", 1000));
        }
        System.out.println("LinkedHashSet Add: " + (System.nanoTime() - start) / 1e6 + " ms");

        start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            treeSet.add(new InsurancePolicy("P" + i, "Holder" + i, LocalDate.now(), "Health", 1000));
        }
        System.out.println("TreeSet Add: " + (System.nanoTime() - start) / 1e6 + " ms");
    }
}
