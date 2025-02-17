package map_interface_test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;
import map_interface.highest_value_key.*;
class HighestValueKeyTest {

    @Test
    void testFindMaxKey() {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 10);
        inputMap.put("B", 20);
        inputMap.put("C", 15);

        String maxKey = HighestValueKey.findMaxKey(inputMap);

        assertEquals("B", maxKey);
    }


}

