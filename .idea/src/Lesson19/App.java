package Task1;

import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Employee employee = new Employee("Tor", 777, 300000);
        employee.serialize(employee);
        employee.deserealize(employee);
        List<Employee> employees = new LinkedList<>();

        employees.add(new Employee("G1", 888, 30000));
        employees.add(new Employee("G2", 667, 40000));
        employees.add(new Employee("G3", 555, 50000));
        employees.add(new Employee("G4", 255, 60000));
        employees.add(new Employee("G5", 155, 70000));


        employee.serialize((Employee) employees);
        employee.deserealize((Employee) employees);
        System.out.println(employees);
    }
}
