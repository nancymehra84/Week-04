package map_interface.group_objects;

import java.util.*;
import java.util.stream.Collectors;

public class GroupEmployee {
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(emp -> emp.department));
    }

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Nancy", "HR"),
                new Employee("Muskan", "IT"),
                new Employee("Rishika", "HR")
        );

        Map<String, List<Employee>> grouped = groupByDepartment(employees);

        grouped.forEach((dept, empList) -> System.out.println(dept + ": " + empList));
    }
}
