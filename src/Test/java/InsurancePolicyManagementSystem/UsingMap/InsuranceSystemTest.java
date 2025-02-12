package InsurancePolicyManagementSystem.UsingMap;;
import Day2.InsurancePolicyManagementSystem.UsingMap.PolicyManager;
import Day2.InsurancePolicyManagementSystem.UsingMap.InsurancePolicy;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
public class InsuranceSystemTest {

    @Test
    void testPolicyAddition() {
        PolicyManager manager = new PolicyManager();
        InsurancePolicy policy = new InsurancePolicy("P001", "Alice", LocalDate.now().plusDays(10), "Health", 5000);

        manager.addPolicy(policy);
        assertEquals(policy, manager.getPolicyByNumber("P001"));
    }

    @Test
    void testPoliciesExpiringSoon() {
        PolicyManager manager = new PolicyManager();
        manager.addPolicy(new InsurancePolicy("P002", "Bob", LocalDate.now().plusDays(5), "Auto", 7000));

        List<InsurancePolicy> expiring = manager.getPoliciesExpiringSoon();
        assertEquals(1, expiring.size());
    }

    @Test
    void testRemoveExpiredPolicies() {
        PolicyManager manager = new PolicyManager();
        manager.addPolicy(new InsurancePolicy("P003", "Charlie", LocalDate.now().minusDays(5), "Home", 8000));
        manager.removeExpiredPolicies();

        assertNull(manager.getPolicyByNumber("P003"));
    }
}


