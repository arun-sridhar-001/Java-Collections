package comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {
        List<EmployeeComparator> employeeList = Arrays.asList(
                new EmployeeComparator(1, "Arun", 24, 300000, true, "Dev"),
                new EmployeeComparator(2, "Aruna", 28, 50000, true, "Dev"),
                new EmployeeComparator(3, "Bala", 25, 60000, true, "Dev"),
                new EmployeeComparator(4, "Chand", 29, 70000, true, "Dev")
        );

        Comparator<EmployeeComparator> sortBySalary = (e1, e2) ->
                e1.getSalary() < e2.getSalary() ? 1 : -1;

        Comparator<EmployeeComparator> sortByAge = (e1, e2) ->
                e1.getAge() > e2.getAge() ? 1 : -1;


//        ComparatorImpl cd = new ComparatorImpl();

        System.out.println("Sort By Salary");
        Collections.sort(employeeList, sortBySalary);
        System.out.println(employeeList);
        System.out.println(employeeList);

        System.out.println("Sort By Age");
        Collections.sort(employeeList, sortByAge);
        System.out.println(employeeList);


    }
}
