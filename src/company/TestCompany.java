package company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestCompany {
    public static void main(String[] args) {
       
        Department it = new Department("IT", 100);
        Department tqa = new Department("tqa", 400);
        Department robotics = new Department("Robotics", 300);
        Department business = new Department("Business", 200);

        Employee balaji = new Employee("Balaji", "SE-II", 28, it);
        Employee amit = new Employee("Amit", "PO-II", 38, business);
        Employee navya = new Employee("Navya", "ASE", 26, robotics);
        Employee anisha = new Employee("Anisha", "TE-I", 29, tqa);
        Employee deekshith = new Employee("Deekshith", "SE-I", 30, it);
        Employee shyam = new Employee("Shyam", "SE-III", 44, it);
        Employee prashanth = new Employee("Prashanth", "SE-II", 42, it);
        Employee vittali = new Employee("Vittali", "ASE", 32, robotics);

        List<Employee> employees = new ArrayList(){{
            add(balaji);
            add(amit);
            add(navya);
            add(anisha);
            add(deekshith);
            add(shyam);
            add(prashanth);
            add(vittali);
        }};
        getByDept("IT", employees)
                .stream()
                .map(x -> x.getName())
                .forEach(System.out::println);
    }

    public static List<Employee> getByDept(String dept, List<Employee> employees){
        return employees
                .stream()
                .filter(x -> x.getDepartment().getName().equalsIgnoreCase(dept))
                .collect(Collectors.toList());
    }
}
