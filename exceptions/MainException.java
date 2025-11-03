package exceptions;

import java.util.Scanner;

public class MainException {

    static int division(int a, int b)throws ArithmeticException {
        return a / b;
    }
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        x = sc.nextInt();
        System.out.println("Enter the second number: ");
        y = sc.nextInt();

        try{
            System.out.println("Division of " + x + " and " + y + " is: " + division(x, y));
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
