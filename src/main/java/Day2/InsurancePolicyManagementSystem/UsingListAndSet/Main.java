package Day2.InsurancePolicyManagementSystem.UsingListAndSet;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();

        // Adding policies
        manager.addPolicy(new InsurancePolicy("P001", "Alice", LocalDate.now().plusDays(10), "Health", 5000));
        manager.addPolicy(new InsurancePolicy("P002", "Bob", LocalDate.now().plusDays(40), "Auto", 7000));
        manager.addPolicy(new InsurancePolicy("P003", "Charlie", LocalDate.now().plusDays(5), "Home", 8000));
        manager.addPolicy(new InsurancePolicy("P004", "Alice", LocalDate.now().plusDays(60), "Health", 6000));

        // Display all policies
        System.out.println("All Policies: " + manager.getAllPolicies());

        // Retrieve policies expiring soon
        System.out.println("Policies Expiring Soon: " + manager.getPoliciesExpiringSoon());

        // Retrieve policies by coverage type
        System.out.println("Health Insurance Policies: " + manager.getPoliciesByCoverage("Health"));

        // Find duplicate policies
        System.out.println("Duplicate Policies: " + manager.findDuplicatePolicies());

        // Compare performance
        manager.comparePerformance();
    }
}

