package Collections;

public class Employee implements Comparable<Employee> {
    private String firstName;
    private String lastName;
    private int age;
    private int salary;

    public Employee(
            String firstName,
    String lastName,
    int age,
    int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.salary, other.salary);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        if(employee.getSalary() != salary) return false;
        if (age != employee.age) return false;
        if(salary != employee.salary) return false;
        if (!firstName.equals(employee.firstName) || !lastName.equals(employee.lastName)) return false;
        return true;
    }

    public String toString() {
        return "Employee " + firstName + " " + lastName + " " + age + " " + salary;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }
}
