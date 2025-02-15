package junit.basic_junit_test.testing_exception_handling;

public class ExceptionHandlingTesting {
    public static int div(int a, int b){
        if(b==0){
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a/b;
    }
}
