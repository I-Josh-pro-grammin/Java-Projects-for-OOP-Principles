package Enums;
import java.util.Scanner;

public class EnumsMain{
  public EnumsMain() {
    System.out.println("This is the constructor giving somethin");
  }
 public static void main(String[] args) {
  EnumsMain enumsthin = new EnumsMain();
  System.out.println("Choose your gender (FAMELE or MALE): ");
  String genValue = new Scanner(System.in).nextLine().toUpperCase().trim();
  Gender gender = Gender.valueOf(genValue);

  if(gender == Gender.FEMALE) {
    System.out.println("You are a girl ");
  }else if(gender == Gender.MALE) {
    System.out.println("You are a guy");
  }

 } 
}