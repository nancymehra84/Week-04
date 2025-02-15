package junit.basic_junit_test.performace_testing;

public class PerformanceTesting {
    public String longRunningTask() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Task Completed";
    }
}

