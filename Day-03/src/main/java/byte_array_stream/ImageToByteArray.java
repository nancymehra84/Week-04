package byte_array_stream;

import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;

public class ImageToByteArray {
    public static void main(String[] args) {
        String inputImagePath = "src/main/java/image.png";
        String outputImagePath = "output.jpg";

        try {
            // Read image file into byte array
            byte[] imageBytes = readImageToByteArray(inputImagePath);

            writeByteArrayToImage(imageBytes, outputImagePath);

            if (verifyFiles(inputImagePath, outputImagePath)) {
                System.out.println("Success");
            } else {
                System.out.println("Error: The files are different.");
            }
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }

    private static byte[] readImageToByteArray(String imagePath) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(imagePath);
             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                byteArrayOutputStream.write(buffer, 0, bytesRead);
            }
            return byteArrayOutputStream.toByteArray();
        }
    }

    private static void writeByteArrayToImage(byte[] imageBytes, String outputPath) throws IOException {
        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(imageBytes);
             FileOutputStream fileOutputStream = new FileOutputStream(outputPath)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = byteArrayInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);
            }
        }
    }

    private static boolean verifyFiles(String file1, String file2) throws IOException {
        byte[] file1Bytes = Files.readAllBytes(new File(file1).toPath());
        byte[] file2Bytes = Files.readAllBytes(new File(file2).toPath());
        return Arrays.equals(file1Bytes, file2Bytes);
    }
}

