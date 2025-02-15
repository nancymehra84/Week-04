package finally_block_execution;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionWithFinally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int numerator = getNumber(scanner, "Enter numerator: ");
            int denominator = getNumber(scanner, "Enter denominator: ");
            int result = divide(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid numeric value.");
        } finally {
            System.out.println("Operation completed");
            scanner.close();
        }
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

