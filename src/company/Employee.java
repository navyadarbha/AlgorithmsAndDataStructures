package company;

public class Employee {
    private String name;
    private String pos;
    private int age;
    private Department department;

    public Employee(String name, String pos, int age, Department department) {
        this.name = name;
        this.pos = pos;
        this.age = age;
        this.department = department;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
