package comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ComparableDemo {

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Arun", 24, 300000, true, Arrays.asList("Backend Dev", "AI")),
                new Employee(2, "Aruna", 28, 50000, true, Arrays.asList("FrontEnd Dev", "UI/UX")),
                new Employee(3, "Bala", 25, 60000, true, Arrays.asList("Devops", "Support")),
                new Employee(4, "Chand", 29, 70000, true, Arrays.asList("Manager", "Architect"))
        );

        Collections.sort(employeeList);

        System.out.println(employeeList);




        List<String> listOfRoles = employeeList.stream()
                .flatMap(r -> r.getRole().stream())
                .toList();

        System.out.println(listOfRoles);

//        for(Employee emp : employeeList) {
//            List<String> roles = emp.getRole();
//            for(String role : roles) {
//                System.out.println(role);
//            }
//        }




    }
}
