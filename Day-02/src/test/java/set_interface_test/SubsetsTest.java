package set_interface_test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import set_interface.find_subset.*;
import set_interface.set_to_sorted_list.SetToSortedList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SubsetsTest {
    Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
    Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

    @Test
    void isSubsetsTest(){
        assertEquals(FindSubset.isSubset(set1,set2),true);
    }
}

