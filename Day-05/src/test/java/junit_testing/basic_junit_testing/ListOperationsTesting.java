package junit_testing.basic_junit_testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import junit.basic_junit_test.testing_list_operations.ListOperations;
public class ListOperationsTesting {
    private ListOperations listOp;
    private List<Integer> list;

    @BeforeEach
    void setUp() {
        listOp= new ListOperations();
        list = new ArrayList<>();
    }

    @Test
    void testAddElement() {
        listOp.addElement(list, 10);
        assertEquals(1, list.size());
        assertTrue(list.contains(10));
    }

    @Test
    void testRemoveElement() {
        listOp.addElement(list, 20);
        listOp.addElement(list, 30);
        listOp.removeElement(list, 20);
        assertEquals(1, list.size());
        assertFalse(list.contains(20));
    }
    @Test
    void testGetSize() {
        listOp.addElement(list, 5);
        listOp.addElement(list, 15);
        assertEquals(2, listOp.getSize(list));
    }

    @Test
    void testRemoveNonExistentElement() {
        listOp.addElement(list, 50);
        listOp.removeElement(list, 100);
        assertEquals(1, list.size());
    }

    @Test
    void testEmptyList() {
        assertEquals(0, listOp.getSize(list));
    }
}

