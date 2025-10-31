package Collections;

public class Employee {
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
