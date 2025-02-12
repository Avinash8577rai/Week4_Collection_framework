package SetInterface.SymmetricDifference;

import Day2.SetInterface.SymmetricDifference.SymmetricDifference;
import org.junit.jupiter.api.Test;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

public class SymmetricDifferenceTest {

    @Test
    void testSymmetricDifference() {
        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(3, 4, 5);
        Set<Integer> expectedResult = Set.of(1, 2, 4, 5);
        assertEquals(expectedResult, SymmetricDifference.symmetricDifference(set1, set2));
    }

}

