package arrayList.service;

import arrayList.model.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

    List<Employee> employeeList = new ArrayList<>();

    public Employee add(Employee employee) {
        employeeList.add(employee);
        return  employee;
    }

    public List<Employee> findAll() {
        return employeeList;
    }

    public Employee updateEmployee(int id, Employee employee) {
        for(Employee employee1 : employeeList) {
            if(employee1.getId() == id) {
                employee1.setId(employee.getId());
                employee1.setName(employee.getName());
                employee1.setAge(employee.getAge());
                employee1.setActive(employee.isActive());
                employee1.setRole(employee.getRole());
                return employee;
            }
        }

        throw new RuntimeException("Id Not Found ID: "+ id);

    }

    public Employee remove(int id) {
        for(Employee employee1 : employeeList) {
            if(employee1.getId() == id) {
                 employeeList.remove(employee1);
                 return employee1;
            }
        }
        throw new RuntimeException("Id Not Found ID: "+ id);
    }

    public Employee findByName(String name) {
        for(Employee employee1 : employeeList) {
            if(employee1.getName().equals(name)) {
                return employee1;
            }
        }
        throw new RuntimeException("Name Not Found name: "+ name);
    }

//  Second-larget salary
    public String findSecondLargestSalary() {
        return  employeeList
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(1)
                .map(Employee::getName)
                .findFirst()
                .orElseThrow( () -> new RuntimeException("Employee Not Found"));
    }
}
