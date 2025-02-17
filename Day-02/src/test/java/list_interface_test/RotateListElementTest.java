package list_interface_test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import list_interface.rotate_element_in_list.RotateListElement;

import java.util.Arrays;
import java.util.List;

public class RotateListElementTest {
    List<Integer> inputList= Arrays.asList(10,20,30,40,50);
    List<Integer> rotated=Arrays.asList(30,40,50,10,20);
    @Test
    void RotateListTest(){
        assertEquals(RotateListElement.RotateElement(inputList,2), rotated);
    }
}
