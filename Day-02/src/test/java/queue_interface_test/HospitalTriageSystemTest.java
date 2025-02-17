package queue_interface_test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.PriorityQueue;
import queue_interface.hospital_triage_system.*;

class HospitalTriageSystemTest {
    private PriorityQueue<Patient> queue;

    @BeforeEach
    void setUp() {
        queue = new PriorityQueue<>();
        queue.add(new Patient("Nancy", 3));
        queue.add(new Patient("Muskan", 5));
        queue.add(new Patient("Rishika", 2));
    }

    @Test
    void testPatientOrder() {
        assertEquals("Muskan (Severity: 5)", queue.poll().toString());
        assertEquals("Nancy (Severity: 3)", queue.poll().toString());
        assertEquals("Rishika (Severity: 2)", queue.poll().toString());
        assertTrue(queue.isEmpty());
    }

    @Test
    void testEmptyQueueBehavior() {
        queue.poll();
        queue.poll();
        queue.poll();
        assertNull(queue.poll());
    }

    @Test
    void testAddingNewPatients() {
        queue.add(new Patient("Vivek", 4));
        queue.add(new Patient("Mayank", 1));

        assertEquals("Muskan (Severity: 5)", queue.poll().toString());
        assertEquals("Vivek (Severity: 4)", queue.poll().toString());
        assertEquals("Nancy (Severity: 3)", queue.poll().toString());
        assertEquals("Rishika (Severity: 2)", queue.poll().toString());
        assertEquals("Mayank (Severity: 1)", queue.poll().toString());
    }
}
