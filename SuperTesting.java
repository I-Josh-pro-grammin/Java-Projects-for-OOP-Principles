class Vehicle {
    public Vehicle() {
        System.out.println("Vehicle created");
    }
}

class Car extends Vehicle {
    public Car() {
        super();
        System.out.println("Car created");
    }
}

class Person {
    public void displayInfo() {
       System.out.println("This is the person");
    }
}

class Student extends Person {
    public Student() {
        super();
        displayInfo();
    }
}

public class SuperTesting {
    public static void main(String[] args) {
       Car car = new Car();
       Student student = new Student();

    }
}


//class Student {
//    private String lastName;
//    private String firstName;
//
//    public String setLastName(String lastName) {
//        return this.lastName = lastName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//}
//class SuperTesting {
//    public static void main(String[] args) {
//        Student student = new Student();
//        student.setLastName("John");
//        System.out.println("The last name is :  " + student.getLastName());
//    }
//}