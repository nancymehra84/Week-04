package junit_testing.basic_junit_testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;
import junit.basic_junit_test.performace_testing.PerformanceTesting;
public class PerformanceTest {
    private final PerformanceTesting tester = new PerformanceTesting();

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testLongRunningTaskTimeout() {
        tester.longRunningTask();
    }
}

