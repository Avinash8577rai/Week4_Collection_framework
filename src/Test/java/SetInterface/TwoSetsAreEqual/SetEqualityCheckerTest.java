package SetInterface.TwoSetsAreEqual;
import Day2.SetInterface.TwoSetsAreEqual.SetEqualityChecker;
import org.junit.jupiter.api.Test;
import java.util.Set;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.*;

public class SetEqualityCheckerTest {

    @Test
    void testEqualSets() {
        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(3, 2, 1);
        assertTrue(SetEqualityChecker.areSetsEqual(set1, set2));
    }


    @Test
    void testDifferentSizes() {
        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(1, 2);
        assertFalse(SetEqualityChecker.areSetsEqual(set1, set2));
    }



}

