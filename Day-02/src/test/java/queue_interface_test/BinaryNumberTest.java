package queue_interface_test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;
import queue_interface.binary_number_using_queue.*;

class BinaryNumberTest {

    @Test
    void testGenerateBinaryNumbersForSmallN() {
        List<String> expected = Arrays.asList("1", "10", "11", "100", "101");
        assertEquals(expected, BinaryNumberGenerator.generateBinaryNumbers(5));
    }

    @Test
    void testGenerateBinaryNumbersForN1() {
        List<String> expected = Arrays.asList("1");
        assertEquals(expected,BinaryNumberGenerator.generateBinaryNumbers(1));
    }

    @Test
    void testGenerateBinaryNumbersForN10() {
        List<String> expected = Arrays.asList("1", "10", "11", "100", "101", "110", "111", "1000", "1001", "1010");
        assertEquals(expected,BinaryNumberGenerator.generateBinaryNumbers(10));
    }

    @Test
    void testGenerateBinaryNumbersForZero() {
        List<String> expected = Arrays.asList();
        assertEquals(expected, BinaryNumberGenerator.generateBinaryNumbers(0));
    }
}

