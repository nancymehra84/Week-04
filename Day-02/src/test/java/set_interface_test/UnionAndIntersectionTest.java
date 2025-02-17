package set_interface_test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import set_interface.union_and_intersection.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersectionTest {
    Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
    Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

    @Test
    void UnionTest(){
        Set<Integer> Union = SetOperations.getUnion(set1, set2);
        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 3,4,5));
        assertEquals(Union,expected);
    }

    @Test
    void IntersectionTest(){
        Set<Integer> intersection = SetOperations.getIntersection(set1, set2);
        Set<Integer> expected = new HashSet<>(Arrays.asList(3));
        assertEquals(intersection,expected);
    }
}

