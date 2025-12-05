//package Collections;
//
//import java.util.ArrayList;
//import java.util.*;
//import java.util.Collections;
//
//public class EmployeeMain {
//
//    public static void main(String[] args) {
//        List<Employee> employees = new ArrayList<>();
//        employees.add(new Employee("John", "Smith", 18, 150));
//        employees.add(new Employee("Karangwa", "Smith", 24, 500));
//        employees.add(new Employee("Kabanda", "Smith", 25, 1000));
//        employees.add(new Employee("Jordan", "Smith", 20, 1200));
//
//        Collections.sort(employees);
//
////        Comparator<Employee> com = new Comparator<Employee>() {
////            @Override
////            public int compare(Employee emp1, Employee emp2) {
////                if(emp1.getSalary() > emp2.getSalary()) {
////                    return 1;
////                }else {
////                    return -1;
////                }
////            }
////        };
//
////        java.util.Collections.sort(employees, com);
//        System.out.println(employees);
//
//    }
//}


// import java.util.ArrayList;
import java.util.*;
// import java.util.Collections;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee emp1 = new Employee("John", "Smith", 18, 150);
        Employee emp2 = new Employee("John", "Smith", 18, 150);



        Map<Employee, String> map = new HashMap<>();
        map.put(emp1, "John");
        map.put(emp2, "Duplicate value");

//        Set<Employee> set = new HashSet<>();
//
//        set.add(emp1);
//        set.add(emp2);

        boolean var = emp1.equals(emp2);

        System.out.println(var);
        System.out.println(map.size());

        System.out.println();

    }
}

