package list_interface_test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import list_interface.remove_duplicates_while_preserving_order.RemoveDuplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesTest {
    List<Integer> numbers= Arrays.asList(3,1,2,3,4);
    List<Integer> expected=Arrays.asList(3,1,2,4);
    @Test
    void DuplicatesTest(){
        assertEquals(RemoveDuplicates.removeDuplicatesManual(numbers),expected);
    }
}
