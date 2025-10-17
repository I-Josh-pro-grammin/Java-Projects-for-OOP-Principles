package FileHandler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

//public class IOStream {
//    public static void main(String[]  args) throws IOException {
//        File file = new File("D:\\LECTURES\\MY CODES\\Java\\New\\Teacher's exercises\\FileHandler\\myFile");
////      try(PrintWriter writer = new PrintWriter(new FileWriter(file, true))) {
////          writer.println("Hello World");
////          writer.println("Still in java...");
////        }catch(IOException e) {
////          System.out.println(e.getMessage());
////        }
//        Scanner input = new Scanner(System.in);
//        System.out.println(("enter the data, type 'exit' to exit"));
//        String line = input.nextLine();
//        while (input.hasNext()) {
//            line = input.nextLine();
//            if(line.equalsIgnoreCase("exit")) {
//                break;
//            }
//            System.out.println("Entered: " + line);
//        }
//        input.close();
//    }
//
//}

//class Delimeter {
//    public static void main(String [] args) {
////        String data = "Honorine turamuha bombo 5";
//        String data2 = "17/10/2025";
//
//        Scanner input = new Scanner(data2);
//        input.useDelimiter("/");
//        int token1 = input.nextInt();
//        int token2 = input.nextInt();
//        int token3 = input.nextInt();
//
//        int sum = token1 + token2 + token3;
//
//        System.out.println("sum is: " + sum);
//    }
//}
//
//class NumberFormating{
//    public static  void main(String[] args){
//        double num = 50000.456;
//        NumberFormat usFormat = NumberFormat.getNumberInstance(Locale.US);
//        NumberFormat frFormat = NumberFormat.getInstance(Locale.FRANCE);
//
//        System.out.println("French format: " + frFormat.format(num));
//        System.out.println("Us format" + usFormat.format(num));
//    }
//}

class Printing{
    public static  void main(String[] args){
        System.out.printf("%b%n", 7<6);
    }
}