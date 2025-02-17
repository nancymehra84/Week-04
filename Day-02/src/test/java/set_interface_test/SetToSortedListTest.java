package set_interface_test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import set_interface.set_to_sorted_list.*;

import java.util.*;

public class SetToSortedListTest {
    Set<Integer> numbers = new HashSet<>(Arrays.asList(5, 3, 9, 1));
    @Test
    void SortedListtest(){
        List<Integer> sortedList = new ArrayList<>(Arrays.asList(1,3,5,9));
        assertEquals(SetToSortedList.convertToSortedList(numbers),sortedList);
    }
}

