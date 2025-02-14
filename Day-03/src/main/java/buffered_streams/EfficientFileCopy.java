package buffered_streams;

import java.io.*;

public class EfficientFileCopy {
    public static void copyFileWithBuffer(String sourcePath, String destinationPath) {
        File sourceFile = new File(sourcePath);
        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        long startTime = System.currentTimeMillis();

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationPath))) {

            byte[] buffer = new byte[8192];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            long endTime = System.currentTimeMillis();
            System.out.println("File copied successfully using Buffered Streams in " + (endTime - startTime) + " ms");

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String sourceFile = "src/main/java/Input.txt";
        String destinationFile = "src/main/java/destination.txt";

        copyFileWithBuffer(sourceFile, destinationFile);
    }
}

