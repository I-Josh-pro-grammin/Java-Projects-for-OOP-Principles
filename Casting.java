
//    class Employee {
//
//        public void work() {
//            System.out.println("Working.");
//        }
//    }
//
//    class Manager extends Employee {
//        public void conductMeeting() {
//            System.out.println("Conducting meeting");
//        }
//    }

   class Animal {
      void speak() {
          System.out.println("I am animal");
      }
   }

   class Dog extends Animal {
    void bark() {
        System.out.println("I am dog");
    }
   }

    public class Casting {
        static public void main(String[] arguments) {

//            Employee employee2 = new Manager();
//            employee2.work();
//
//            Manager manager = (Manager) employee2;
//            manager.conductMeeting();

            Animal dog = new Dog();
            dog.speak();

            Dog dog2 = (Dog) dog;
            dog2.bark();


        }
    }
