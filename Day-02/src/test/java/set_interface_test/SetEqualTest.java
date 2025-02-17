package set_interface_test;

import org.junit.jupiter.api.Test;
import set_interface.find_subset.FindSubset;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetEqualTest {
    Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
    Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));

    @Test
    void EqualSetsTest(){
        assertEquals(FindSubset.isSubset(set1,set2),true);
    }
}

