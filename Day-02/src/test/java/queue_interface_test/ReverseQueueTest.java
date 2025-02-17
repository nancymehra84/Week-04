package queue_interface_test;

import org.junit.jupiter.api.Test;
import queue_interface.reverse_queue.ReverseQueue;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueueTest {
    Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 30));

    @Test
    void QueueReverseTest(){
        Queue<Integer> expected = new LinkedList<>(Arrays.asList(30,20,10));
        ReverseQueue.reverseQueue(queue);
        assertEquals(queue,expected);
    }
}

