package Collections;

import java.util.ArrayList;
import java.util.*;
import java.util.Collections;

public class EmployeeMain {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", "Smith", 18, 1500));
        employees.add(new Employee("Karangwa", "Smith", 24, 1500));
        employees.add(new Employee("Kabanda", "Smith", 25, 1500));
        employees.add(new Employee("Jordan", "Smith", 20, 1500));

        Collections.sort(employees, new SortAge());

        Comparator<Employee> com = new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                if(emp1.getSalary() > emp2.getSalary()) {
                    return 1;
                }else {
                    return -1;
                }
            }
        };

        java.util.Collections.sort(employees, com);
        System.out.println(employees);

    }
}
