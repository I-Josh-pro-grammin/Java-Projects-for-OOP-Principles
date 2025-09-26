//Printing numbers from 1 to 10 using a for loop

//public class Loops {
//    public static void main(String[] arguments) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//    }
//}


//Printing even numbers from 1 to 20 using a while loop

//public class Loops {
//    public static void main(String[] args) {
//        int i = 1;
//        while (i <= 20) {
//            if(i % 2 == 0) {
//                System.out.println(i);
//            }
//            i++;
//        }
//    }
//}


//Function to calculate the sum of all the natural numbers between 1 and 10

//public class Loops {
//    public static void naturalSum(){
//        int sum = 0;
//        for(int i = 1; i <= 10; i++) {
//            sum += i;
//        }
//
//        System.out.println(sum);
//    }
//
//    public static void main(String[] args) {
//        naturalSum();
//    }
//}


// A program that reverses an array of integers

//public class Loops {
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        for(int i = numbers.length -1 ; i > 0 ; i--) {
//          System.out.print(numbers[i] + ", ");
//        }
//    }
//}


// program to find maximum in an array

import java.util.Arrays;
import java.util.Scanner;

//public class Loops {
//    public static void main(String[] args) {
//        int[]  numbers = {4, 2, 5, 6, 7, 5, 3, 10};
//        for (int i = 0; i < numbers.length - 1; i++) {
//            for (int j = 0; j < numbers.length - 1 - i; j++) {
//                if(numbers[j] > numbers[j+1]){
//                    int temp = numbers[j];
//                    numbers[j] = numbers[j+1];
//                    numbers[j+1] = temp;
//                }
//            }
//        }
//
//            System.out.println(numbers[numbers.length - 1]);
//
//    }
//}

//count number of even and odd numbers

//public class Loops {
//    public static void main(String[] args) {
//        int[] numbers = {2, 4, 5, 6, 7, 2, 6, 10};
//        int evenCount = 0;
//        int oddCount = 0;
//        for(int number : numbers){
//            if(number % 2 == 0) {
//                evenCount++;
//            }
//            if(number % 2 == 1) {
//                oddCount++;
//            }
//        }
//
//        System.out.println("Even numbers are: " + evenCount);
//        System.out.println("Odd numbers are: " + oddCount);
//    }
//}

//A search program

//public class Loops {
//    public static void main(String[] args) {
//        System.out.println("Enter the number you want to search: ");
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        int[] numbers = {3, 4, 5, 2, 6, 1, 9, 10};
//        for(int i = 0; i < numbers.length; i++) {
//            if(numbers[i] == number ) {
//                System.out.println("The number " + number + "is at index: " + i);
//            }
//        }
//
//
//    }
//}

//a Java program to print a multiplication table of 5 using a loop.

//public class Loops {
//    public static void main(String[] args) {
//        for(int i = 1; i < 12; i++) {
//            System.out.println(i + " * 5 = " + i*5);
//        }
//    }
//}


//a Java program to find the factorial of a number using a for loop.

//public class Loops {
//    public static void main(String[] args) {
//        System.out.println("Enter the number to get factorial: ");
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        int factorial = 1;
//        for(int i = 1; i <= number; i++) {
//            factorial *= i;
//        }
//        System.out.println("The factorial is: " + factorial);
//    }
//}

//a Java program to check if a number is prime using a loop.
//
//public class Loops {
//    public static void main(String[] args) {
//        System.out.println("Enter the number you want to check: ");
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//
//        for(int i = 1; i <= Math.sqrt(number); i++) {
//            if(number <= 1) {
//                System.out.println(number + " is not a prime number");
//            }else if(number % i == 0) {
//                System.out.println(number + " is a prime number");
//            }else {
//                System.out.println(number + " is not a prime number");
//            }
//        }
//
//
//
//    }
//}


import java.util.Scanner;

// a program that prints day of the week
//public class Loops {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number (1-7) to display the day of the week: ");
//        int day = scanner.nextInt();
//
//        switch(day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Invalid input! Please enter a number between 1 and 7.");
//        }
//    }
//}

//Java Program to Check if a Character is a Vowel or Consonant Using Switch

//public class Loops {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a character: ");
//        char ch = scanner.next().charAt(0);
//
//        switch(Character.toLowerCase(ch)) {
//            case 'a':
//            case 'e':
//            case 'i':
//            case 'o':
//            case 'u':
//                System.out.println(ch + " is a vowel.");
//                break;
//            default:
//                System.out.println(ch + " is a consonant.");
//        }
//    }
//}

//a program for fibonacci series

public class Loops {
    public static void main(String[] args) {
        int n = 10;
        int firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            // Calculate the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}

//program to calculate the average of array

//public class Loops {
//    public static void main(String[] args) {
//        int[] numbers = {10, 20, 30, 40, 50};
//        int sum = 0;
//
//        for (int num : numbers) {
//            sum += num;
//        }
//
//        double average = sum / (double) numbers.length;
//
//        System.out.println("The average is: " + average);
//    }
//}

//To Sort an array

//public class Loops {
//    public static void main(String[] args) {
//        int[] numbers = {5, 3, 8, 1, 2, 7, 4, 6};
//
//        Arrays.sort(numbers);
//
//        System.out.println("Sorted array in ascending order:");
//        for (int num : numbers) {
//            System.out.print(num + " ");
//        }
//    }
//}



