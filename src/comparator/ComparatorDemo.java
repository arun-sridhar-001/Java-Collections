package comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Arun", 24, 300000, true, "Dev"),
                new Employee(2, "Aruna", 28, 50000, true, "Dev"),
                new Employee(3, "Bala", 25, 60000, true, "Dev"),
                new Employee(4, "Chand", 29, 70000, true, "Dev")
        );

        List<Double> list = employeeList.stream()
                .map(Employee::getSalary)
                .sorted()
                .toList();

        Collections.sort(employeeList);

        System.out.println(employeeList);


    }
}
