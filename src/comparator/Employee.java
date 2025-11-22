package comparator;

public class Employee implements Comparable{

    private int id;
    private String name;
    private int age;
    private double salary;
    private boolean isActive;
    private String role;

    public Employee(int id, String name, int age, double salary, boolean isActive, String role) {
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


    @Override
    public int compareTo(Object o) {
        Employee that = (Employee) o;
        if(this.age > that.age) {  // 50000 <-> 30000, -> 50000 70000
            return 1;  // It should be Positive Number
        }
        return -1;
    }
}
