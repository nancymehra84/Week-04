package exception_propagation_in_method;

public class ExceptionPropagationExample {
    public static void main(String[] args) {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }

    public static void method2() {
        method1();
    }

    public static void method1() {
        throw new ArithmeticException("Division by zero");
    }
}
