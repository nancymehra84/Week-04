package junit_testing.basic_junit_testing;
import junit.basic_junit_test.testing_exception_handling.ExceptionHandlingTesting;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionHandlingTest {
    @Test
    public void testDivision() {
        assertEquals(2, ExceptionHandlingTesting.div(10, 5));
    }

    @Test
    public void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> ExceptionHandlingTesting.div(10, 0));
        assertEquals("Cannot divide by zero.", exception.getMessage());
    }
}
