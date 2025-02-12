package InsurancePolicyManagementSystem.UsingLIstAndSet;
import Day2.InsurancePolicyManagementSystem.UsingListAndSet.PolicyManager;
import Day2.InsurancePolicyManagementSystem.UsingListAndSet.InsurancePolicy;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class InsuranceSystenTest {

    @Test
    void testPolicyAddition() {
        PolicyManager manager = new PolicyManager();
        InsurancePolicy policy = new InsurancePolicy("P001", "Alice", LocalDate.now().plusDays(10), "Health", 5000);

        manager.addPolicy(policy);
        assertEquals(1, manager.getAllPolicies().size());
    }

    @Test
    void testPoliciesExpiringSoon() {
        PolicyManager manager = new PolicyManager();
        manager.addPolicy(new InsurancePolicy("P002", "Bob", LocalDate.now().plusDays(5), "Auto", 7000));

        List<InsurancePolicy> expiring = manager.getPoliciesExpiringSoon();
        assertEquals(1, expiring.size());
    }
}

