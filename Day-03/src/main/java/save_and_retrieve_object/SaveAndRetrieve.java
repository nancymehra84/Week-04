package save_and_retrieve_object;

import java.io.*;
import java.util.*;


public class SaveAndRetrieve {
    private static final String FILE_NAME = "employees.dat";

    public static void saveEmployees(List<Employee> employees) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(employees);
            System.out.println("Employees saved successfully!");
        } catch (IOException e) {
            System.out.println("Error while saving employees: " + e.getMessage());
        }
    }

    public static List<Employee> loadEmployees() {
        List<Employee> employees = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            employees = (List<Employee>) ois.readObject();
            System.out.println("Employees loaded successfully!");
        } catch (IOException e) {
            System.out.println("Error while loading employees: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
        return employees;
    }

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(101, "Nancy", "HR", 50000),
                new Employee(102, "Rishika", "IT", 70000),
                new Employee(103, "Muskan", "Finance", 60000)
        );

        saveEmployees(employeeList);

        List<Employee> loadedEmployees = loadEmployees();
        System.out.println("Employee List:");
        loadedEmployees.forEach(System.out::println);
    }
}

