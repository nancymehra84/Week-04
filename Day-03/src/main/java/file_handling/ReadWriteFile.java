package file_handling;

import java.io.*;

public class ReadWriteFile {
    public static void copyFile(String sourcePath, String destinationPath) {
        File sourceFile = new File(sourcePath);
        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationPath)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String sourceFile = "src/main/java/Input.txt";
        String destinationFile = "destination.txt";
        copyFile(sourceFile, destinationFile);
    }
}

