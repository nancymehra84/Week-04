package piped_streams;

import java.io.*;

class WriterThread extends Thread {
    private PipedOutputStream pos;

    public WriterThread(PipedOutputStream pos) {
        this.pos = pos;
    }

    public void run() {
        try {
            String message = "Hello from WriterThread!";
            pos.write(message.getBytes());
            pos.close();
        } catch (IOException e) {
            System.err.println("IOException in WriterThread: " + e.getMessage());
        }
    }
}
