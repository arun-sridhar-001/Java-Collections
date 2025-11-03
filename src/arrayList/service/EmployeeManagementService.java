package arrayList.service;

import arrayList.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagementService {

    EmployeeService service;

    public EmployeeManagementService() {
        this.service = new EmployeeServiceImpl();
    }

    public void process() {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Arun");
        employee.setAge(24);
        employee.setSalary(5000.99);
        employee.setActive(true);
        employee.setRole("Dev");

        Employee employee1 = new Employee();
        employee1.setId(2);
        employee1.setName("Aruna");
        employee1.setAge(28);
        employee1.setSalary(50000.99);
        employee1.setActive(true);
        employee1.setRole("Dev-Ops");

        List<Employee> inputList = new ArrayList<>();
        inputList.add(employee);
        inputList.add(employee1);

        System.out.println("Employee Details Confirmation, Press Y for store the data");
        System.out.println(employee);
        System.out.println(employee1);

        System.out.println("Y/N: ");
        Scanner addScanner = new Scanner(System.in);
        String confirmation = addScanner.next();


        switch (confirmation) {
            case "Y" :
                for(Employee emp : inputList) {
                    service.add(emp);
                    System.out.println("Employee Added, ID: "+ emp.getId());
                }
                break;

            case "N":
                System.exit(0);
        }


        System.out.print("You Want Update, Y/N: ");
        Scanner updateScanner = new Scanner(System.in);
        String update = updateScanner.next();

        switch(update) {
            case "Y":
                Employee employee2 = new Employee();
                employee2.setId(2);
                employee2.setName("Bala");
                employee2.setAge(28);
                employee2.setSalary(50000.99);
                employee2.setActive(true);
                employee2.setRole("Dev-Ops");
                Employee updatedEmployee = service.updateEmployee(employee2.getId(), employee2);

                break;


            case "N":
                break;
        }



        List<Employee> employeeList = service.findAll();

        for(Employee e : employeeList) {
            System.out.println(e);
        }

        System.out.println("Find By Name:");
        Employee serachedEmployee = service.findByName("Arun");
        System.out.println(serachedEmployee);

        System.out.println("Removed Employee: ");
        Employee removedEmployee = service.remove(2);
        System.out.println(removedEmployee);


        System.out.println("Final EmployeeList: ");
        for(Employee e : employeeList) {
            System.out.println(e);
        }
    }

//    private static Employee showMenu() {
//        System.out.print("Enter Id: ");
//        Scanner idScanner = new Scanner(System.in);
//        int id = idScanner.nextInt();
//
//        System.out.print("Enter Name: ");
//        Scanner namerScanner = new Scanner(System.in);
//        String name = namerScanner.next();
//
//
//        System.out.print("Enter Age: ");
//        Scanner ageScanner = new Scanner(System.in);
//        int age = ageScanner.nextInt();
//
//        System.out.print("Enter Salary: ");
//        Scanner salaryScanner = new Scanner(System.in);
//        double salary = salaryScanner.nextDouble();
//
//        System.out.print("Enter Active status: ");
//        Scanner activeScanner = new Scanner(System.in);
//        boolean isactive = activeScanner.nextBoolean();
//
//        System.out.print("Enter Role: ");
//        Scanner roleScanner = new Scanner(System.in);
//        String role = roleScanner.next();
//
//        Employee employee = new Employee();
//        employee.setId(id);
//        employee.setName(name);
//        employee.setAge(age);
//        employee.setSalary(salary);
//        employee.setActive(isactive);
//        employee.setRole(role);
//
//        return employee;
//
//    }
}
