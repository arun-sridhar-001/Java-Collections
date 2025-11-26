package comparator;

public class EmployeeComparator {

    private int id;
    private String name;
    private int age;
    private double salary;
    private boolean isActive;
    private String role;

    public EmployeeComparator(int id, String name, int age, double salary, boolean isActive, String role) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isActive = isActive;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", isActive=" + isActive +
                ", role='" + role + '\'' +
                '}';
    }
}
