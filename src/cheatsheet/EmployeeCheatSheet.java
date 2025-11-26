package cheatsheet;

import java.time.LocalDate;

public class EmployeeCheatSheet {
    int id;
    String name;
    double salary;
    LocalDate joiningDate;
    String department;

    public EmployeeCheatSheet(int id, String name, double salary, LocalDate joiningDate, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.joiningDate = joiningDate;
        this.department = department;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + salary + " - " + joiningDate + " - " + department;
    }
}

