package filter_streams;

import java.io.*;

public class UppercaseToLowercase {
    public static void main(String[] args) {
        String inputFile = "src/main/java/Input.txt";
        String outputFile = "output.txt";

        try (
                FileReader fileReader = new FileReader(inputFile);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                FileWriter fileWriter = new FileWriter(outputFile);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line.toLowerCase());
                bufferedWriter.newLine();
            }
            System.out.println("File conversion completed successfully.");
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }
}

