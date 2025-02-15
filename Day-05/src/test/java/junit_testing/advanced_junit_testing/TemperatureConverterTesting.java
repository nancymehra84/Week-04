package junit_testing.advanced_junit_testing;

import static org.junit.jupiter.api.Assertions.*;

import junit.advanced_junit_test.testing_temperature_converter.TemperatureConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTesting {
    private TemperatureConverter converter;

    @BeforeEach
    void setUp() {
        converter = new TemperatureConverter();
    }

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0), 0.01);
        assertEquals(212.0, converter.celsiusToFahrenheit(100), 0.01);
        assertEquals(98.6, converter.celsiusToFahrenheit(37), 0.01);
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0, converter.fahrenheitToCelsius(32), 0.01);
        assertEquals(100.0, converter.fahrenheitToCelsius(212), 0.01);
        assertEquals(37.0, converter.fahrenheitToCelsius(98.6), 0.01);
    }
}
