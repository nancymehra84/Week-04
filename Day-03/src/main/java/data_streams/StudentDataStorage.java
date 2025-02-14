package data_streams;

import java.io.*;

public class StudentDataStorage {
    public static void main(String[] args) {
        String fileName = "src/main/java/student.txt";

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeInt(101);
            dos.writeUTF("Nancy");
            dos.writeDouble(3.8);

            dos.writeInt(102);
            dos.writeUTF("Muskan");
            dos.writeDouble(3.5);

            System.out.println("Student details written successfully.");
        } catch (IOException e) {
            System.err.println("IOException during writing: " + e.getMessage());
        }

        // Reading student details from the binary file
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            while (dis.available() > 0) {
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.err.println("IOException during reading: " + e.getMessage());
        }
    }
}

