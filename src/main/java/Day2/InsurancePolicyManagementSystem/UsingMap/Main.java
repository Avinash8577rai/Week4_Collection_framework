package Day2.InsurancePolicyManagementSystem.UsingMap;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();

        // Adding sample policies
        manager.addPolicy(new InsurancePolicy("P001", "Alice", LocalDate.now().plusDays(10), "Health", 5000));
        manager.addPolicy(new InsurancePolicy("P002", "Bob", LocalDate.now().plusDays(40), "Auto", 7000));
        manager.addPolicy(new InsurancePolicy("P003", "Charlie", LocalDate.now().plusDays(5), "Home", 8000));
        manager.addPolicy(new InsurancePolicy("P004", "Alice", LocalDate.now().minusDays(1), "Health", 6000)); // Expired

        // Retrieve a policy by number
        System.out.println("Policy P001: " + manager.getPolicyByNumber("P001"));

        // Retrieve policies expiring soon
        System.out.println("\nPolicies Expiring Soon:");
        for (InsurancePolicy policy : manager.getPoliciesExpiringSoon()) {
            System.out.println(policy);
        }

        // Retrieve policies by policyholder
        System.out.println("\nPolicies for Alice:");
        for (InsurancePolicy policy : manager.getPoliciesByHolder("Alice")) {
            System.out.println(policy);
        }

        // Remove expired policies
        System.out.println("\nRemoving expired policies...");
        manager.removeExpiredPolicies();

        // Display all remaining policies
        System.out.println("\nAll Active Policies:");
        manager.displayAllPolicies();
    }
}
