package CallableTask;

// import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexManipulation {
   public static void main(String[] args) {
    // Pattern p = Pattern.compile("ca");
    // Matcher m = p.matcher("rca");
    System.out.println(Pattern.matches("[a-z/A-Z]", "Java"));
  } 
}
