package queue_interface_test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import queue_interface.stack_using_queue.*;

class StackUsingQueueTest {
    private StackImplementation stack;

    @BeforeEach
    void setUp() {
        stack = new StackImplementation();
    }

    @Test
    void testPushAndPop() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

    @Test
    void testTopElement() {
        stack.push(10);
        stack.push(20);
        assertEquals(20, stack.top());
        assertEquals(20, stack.pop());
        assertEquals(10, stack.top());
    }

}

