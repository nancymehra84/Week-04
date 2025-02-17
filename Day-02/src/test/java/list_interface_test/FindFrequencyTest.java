package list_interface_test;

import list_interface.find_frequency_of_elements.FindFrequencyOfElements;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class FindFrequencyTest {
    List<String> words = Arrays.asList("apple","banana","apple","orange");

    @Test
    void countFrequencyTest(){
        Map<String,Integer> actual= FindFrequencyOfElements.countFrequency(words);
        Map<String, Integer> expected=new HashMap<>();
        expected.put("banana",1);
        expected.put("orange",1);
        expected.put("apple",2);
        assertEquals(actual,expected);
    }
}
