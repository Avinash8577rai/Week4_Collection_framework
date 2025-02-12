package SetInterface.FindSubsets;
import Day2.SetInterface.FindSubsets.SubsetCheck;
import org.junit.jupiter.api.Test;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

public class SubsetCheckTest {

    @Test
    void testSubset() {
        Set<Integer> set1 = Set.of(2, 3);
        Set<Integer> set2 = Set.of(1, 2, 3, 4);
        assertTrue(SubsetCheck.isSubset(set1, set2));
    }

}

