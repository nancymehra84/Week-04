package list_interface_test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import list_interface.reverse_a_string.ReverseList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReverseListTest {
    List<Integer> arrayList=Arrays.asList(1,2,3,4,5);
    List<Integer> result=Arrays.asList(5,4,3,2,1);
    @Test
    void ReverselistTest(){
        ReverseList.reverseArrayList(arrayList);
        assertEquals(arrayList,result);
    }
    LinkedList<Integer> linkedList=new LinkedList<>(Arrays.asList(1,2,3,4,5));
    LinkedList<Integer> expected=new LinkedList<>(Arrays.asList(5,4,3,2,1));
    @Test
    void reverseLinkedListTest(){
        ReverseList.reverseLinkedList(linkedList);
        assertEquals(linkedList,expected);
    }

}
