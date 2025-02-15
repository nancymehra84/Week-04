package unchecked_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RuntimeException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = getNumber(scanner, "Enter numerator: ");
        int denominator = getNumber(scanner, "Enter denominator: ");

        try {
            int result = divide(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        scanner.close();
    }

    public static int getNumber(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid numeric value.");
                scanner.next();
            }
        }
    }

    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}


