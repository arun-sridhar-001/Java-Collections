package arrayList.service;

import arrayList.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee add(Employee employee);

    List<Employee> findAll();

    Employee updateEmployee(int id, Employee employee);

    Employee remove(int id);

    Employee findByName(String name);

    String findSecondLargestSalary();
}
