package SetInterface.UnionandIntersectionofTwoSets;
import Day2.SetInterface.UnionandIntersectionofTwoSets.SetOperation;
import org.junit.jupiter.api.Test;
import java.util.Set;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.*;

    public class SetOperationTest {

        @Test
        void testUnion() {
            Set<Integer> set1 = Set.of(1, 2, 3);
            Set<Integer> set2 = Set.of(3, 4, 5);
            Set<Integer> expectedUnion = Set.of(1, 2, 3, 4, 5);
            assertEquals(expectedUnion, SetOperation.union(set1, set2));
        }

        @Test
        void testIntersection() {
            Set<Integer> set1 = Set.of(1, 2, 3);
            Set<Integer> set2 = Set.of(3, 4, 5);
            Set<Integer> expectedIntersection = Set.of(3);
            assertEquals(expectedIntersection, SetOperation.intersection(set1, set2));
        }

        @Test
        void testDisjointSets() {
            Set<Integer> set1 = Set.of(1, 2);
            Set<Integer> set2 = Set.of(3, 4);
            assertTrue(SetOperation.intersection(set1, set2).isEmpty());
        }



    }
