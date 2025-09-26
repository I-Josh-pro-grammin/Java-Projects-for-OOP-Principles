//class Student {
//    static int id;
//
//    public Student() {
//        this.id += 1;
//    }
//
//    public void displayCount() {
//        System.out.println("The current count is: " + this.id);
//    }
//}

class  BankAccount{
    static int interestRate;
    static double salary;
    final int time = 2;

    public BankAccount(int interestRate, double salary) {
        this.interestRate = interestRate;
        this.salary = salary;
    }

   public void displayInterest() {
        System.out.println("Interest : " + (salary * interestRate * time)/100);
   }
}

public class StaticKeyWord {
   public static void main(String[] args) {
//       Student student = new Student();
//       System.out.println(student.id);

//       Student student2 = new Student();
//       System.out.println(student2.id);

//       Student student3 = new Student();
//       System.out.println(student3.id);


       BankAccount bankAccount1 = new BankAccount(250000, 21);
       bankAccount1.displayInterest();

       BankAccount bankAccount2 = new BankAccount(250000, 25);
       bankAccount2.displayInterest();

       BankAccount bankAccount3 = new BankAccount(250000, 23);
       bankAccount3.displayInterest();
   }
}

