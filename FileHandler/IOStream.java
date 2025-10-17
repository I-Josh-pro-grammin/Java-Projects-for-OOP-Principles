package FileHandler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IOStream {
    public static void main(String[]  args) throws IOException {
        File file = new File("D:\\LECTURES\\MY CODES\\Java\\New\\Teacher's exercises\\FileHandler\\myFile");
      try(PrintWriter writer = new PrintWriter(new FileWriter(file, true))) {
          writer.println("Hello World");
          writer.println("Still in java...");
        }catch(IOException e) {
          System.out.println(e.getMessage());
        }
    }
}
