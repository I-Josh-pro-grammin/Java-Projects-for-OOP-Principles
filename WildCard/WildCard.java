package WildCard;

import java.util.ArrayList;
import java.util.Scanner;

public class WildCard {
    public static void printWild(ArrayList<? extends Number> arr){
    System.out.println(arr);
    }

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("1");
        arr.add("2");
        arr.add("3");
        arr.add("4");

        System.out.println("The array is: ");
        System.out.println(arr);

    }
}
