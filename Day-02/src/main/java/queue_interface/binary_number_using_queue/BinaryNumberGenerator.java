package queue_interface.binary_number_using_queue;

import java.util.*;

public class BinaryNumberGenerator {
    public static List<String> generateBinaryNumbers(int N) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.add("1");

        for (int i = 0; i < N; i++) {
            String current = queue.poll();
            result.add(current);

            queue.add(current + "0");
            queue.add(current + "1");
        }

        return result;
    }

    public static void main(String[] args) {
        int N = 5;
        System.out.println("First " + N + " binary numbers: " + generateBinaryNumbers(N));
    }
}

