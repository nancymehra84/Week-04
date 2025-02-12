package queue_interface.circular_buffer_simulation;


import java.util.Arrays;

class CircularBufferSimulation {
    private int[] buffer;
    private int size, head, tail, count;

    public CircularBufferSimulation(int size) {
        this.size = size;
        buffer = new int[size];
        head = 0;
        tail = 0;
        count = 0;
    }

    // Insert element (overwrite if full)
    public void insert(int value) {
        buffer[tail] = value;
        tail = (tail + 1) % size;
        if (count == size) {
            head = (head + 1) % size;
        } else {
            count++;
        }
    }

    // Get buffer as a list
    public int[] getBuffer() {
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = buffer[(head + i) % size];
        }
        return result;
    }

    public static void main(String[] args) {
        CircularBufferSimulation cb = new CircularBufferSimulation(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        System.out.println("Buffer: " + Arrays.toString(cb.getBuffer())); // Output: [1, 2, 3]

        cb.insert(4);
        System.out.println("Buffer: " + Arrays.toString(cb.getBuffer())); // Output: [2, 3, 4]
    }
}
