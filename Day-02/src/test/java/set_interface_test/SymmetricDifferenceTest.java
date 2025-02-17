package set_interface_test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import set_interface.symmetric_difference.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SymmetricDifferenceTest {
    Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
    Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

    @Test
    void SymmetricDifferencetest(){
        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 4,5));
        assertEquals(SymmetricDifference.getSymmetricDifference(set1,set2),expected);
    }
}

