package junit_testing.basic_junit_testing;

import static org.junit.jupiter.api.Assertions.*;

import junit.basic_junit_test.testing_calculator_class.Calculator;
import org.junit.jupiter.api.Test;

public class CalculatorClassTesting {
    Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(1, calculator.sub(5, 4));
    }

    @Test
    public void testMultiplication() {
        assertEquals(10, calculator.mul(2, 5));
    }

    @Test
    public void testDivision() {
        assertEquals(2, calculator.div(10, 5));
    }

    @Test
    public void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.div(10, 0));
        assertEquals("Cannot divide by zero.", exception.getMessage());
    }
}
