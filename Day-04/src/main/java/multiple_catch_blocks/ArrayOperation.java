package multiple_catch_blocks;

import java.util.Scanner;

public class ArrayOperation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] array = initializeArray();
        int index = getIndex(scanner);

        try {
            int value = getValueAtIndex(array, index);
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        } finally {
            scanner.close();
        }
    }

    public static Integer[] initializeArray() {
        return new Integer[]{10, 20, 30, 40, 50};
    }

    public static int getIndex(Scanner scanner) {
        System.out.print("Enter an index: ");
        return scanner.nextInt();
    }

    public static int getValueAtIndex(Integer[] array, int index) {
        return array[index];
    }
}
