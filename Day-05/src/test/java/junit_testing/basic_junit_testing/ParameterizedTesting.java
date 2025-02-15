package junit_testing.basic_junit_testing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertTrue;
import junit.basic_junit_test.testing_parameterized_tests.*;
class ParameterizedTesting {
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    void testEvenNumber(int num) {
        assertTrue(num % 2 == 0 );
    }
}
