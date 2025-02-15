package checked_exception;

import java.io.*;

public class CompileTimeException {
    public static void main(String[] args) {
        String fileName = "data.txt";

        String result = readFile(fileName);
        System.out.println(result);
    }

    public static String readFile(String fileName) {
        StringBuilder content = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (FileNotFoundException e) {
            return "File not found";
        } catch (IOException e) {
            return "An error occurred while reading the file.";
        }

        return content.toString().trim();
    }
}
