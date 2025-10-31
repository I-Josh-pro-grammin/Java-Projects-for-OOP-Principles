package Collections;

import java.util.Arrays;
import java.util.List;

public class PrinterMain{
    public static void printSum(List<? extends  Number> numbers) {
        System.out.println("the numbers are: " + numbers);
    }

    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(5);
        printer.print();

        List<Double> numbers = Arrays.asList(1.5, 2.4, 3.3, 4.3, 5.2, 6.5, 7.5, 8.6, 9.2, 100.5);
    }
}
