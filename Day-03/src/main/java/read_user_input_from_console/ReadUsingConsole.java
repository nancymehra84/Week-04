package read_user_input_from_console;

import java.io.*;

public class ReadUsingConsole {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = "src/main/java/user_info.txt";

        try (FileWriter writer = new FileWriter(filePath, true)) {
            // Read user input
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(reader.readLine());

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            String userData = "Name: " + name + ", Age: " + age + ", Language: " + language + "\n";
            writer.write(userData);

            System.out.println("User information saved to " + filePath);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for age. Please enter a valid number.");
        }
    }
}
