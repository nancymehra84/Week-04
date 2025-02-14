package read_file_line_by_line;

import java.io.*;

public class LargeFileReader {
    public static void main(String[] args) {
        String filePath = "src/main/java/largefile.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }
}
