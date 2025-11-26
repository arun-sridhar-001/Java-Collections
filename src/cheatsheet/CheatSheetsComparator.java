package cheatsheet;


import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class CheatSheetsComparator {

    public static void main(String[] args) {
        List<EmployeeCheatSheet> employees = List.of(
                new EmployeeCheatSheet(101, "Alice", 80000, LocalDate.of(2020, 1, 5), "HR"),
                new EmployeeCheatSheet(102, "Bob", 60000, LocalDate.of(2019, 3, 10), "IT"),
                new EmployeeCheatSheet(103, "Charlie", 90000, LocalDate.of(2021, 7, 25), "IT"),
                new EmployeeCheatSheet(104, "David", 75000, LocalDate.of(2018, 11, 30), "Finance"),
                new EmployeeCheatSheet(105, "Eve", 65000, LocalDate.of(2020, 4, 15), "HR")
        );



        // 1. Sort by Salary (Descending)
        Comparator<EmployeeCheatSheet> sortBySalaryDesc =
                (e1, e2) -> Double.compare(e2.salary, e1.salary);

        // 2. Sort by Name (Alphabetical)
        Comparator<EmployeeCheatSheet> sortByName = (e1, e2) -> e1.name.compareTo(e2.name);

        // 3. Sort by Joining Date (Old → New)
        Comparator<EmployeeCheatSheet> sortByJoiningDate =
                (e1, e2) -> e1.joiningDate.compareTo(e2.joiningDate);

        // 4. Sort by Department, then Salary Desc
        Comparator<EmployeeCheatSheet> sortByDeptThenSalary =
                Comparator.comparing((EmployeeCheatSheet e) -> e.department)
                        .thenComparing((EmployeeCheatSheet e) -> -e.salary);

        System.out.println("\n🔹 Sorted by Salary (High → Low)");
        employees.stream().sorted(sortBySalaryDesc).forEach(System.out::println);

        System.out.println("\n🔹 Sorted by Name (A → Z)");
        employees.stream().sorted(sortByName).forEach(System.out::println);

        System.out.println("\n🔹 Sorted by Joining Date (Old → New)");
        employees.stream().sorted(sortByJoiningDate).forEach(System.out::println);

        System.out.println("\n🔹 Sorted by Department → Salary Desc");
        employees.stream().sorted(sortByDeptThenSalary).forEach(System.out::println);
    }
}
