package map_interface_test;

import map_interface.invert_a_map.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

class InvertMapTest {

    @Test
    void testInvertMap() {
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 1);

        Map<Integer, List<String>> expected = new HashMap<>();
        expected.put(1, Arrays.asList("A", "C"));
        expected.put(2, Collections.singletonList("B"));

        Map<Integer, List<String>> result = InvertMap.invertMap(originalMap);

        assertEquals(expected.size(), result.size());
        assertTrue(result.containsKey(1) && result.containsKey(2));

        List<String> expectedList1 = expected.get(1);
        List<String> expectedList2 = expected.get(2);
        List<String> resultList1 = result.get(1);
        List<String> resultList2 = result.get(2);

        assertTrue(resultList1.containsAll(expectedList1) && expectedList1.containsAll(resultList1));
        assertTrue(resultList2.containsAll(expectedList2) && expectedList2.containsAll(resultList2));
    }


}

