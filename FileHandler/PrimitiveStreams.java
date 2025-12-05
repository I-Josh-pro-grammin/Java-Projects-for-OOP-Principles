package FileHandler;//package FileHandler;
//
//import java.io.*;
//
//public class PrimitiveStreams {
//    static public void main(String[] args) {
//        File file = new File("D:\\LECTURES\\MY CODES\\Java\\New\\Teacher's exercises\\FileHandler\\myFile");
//
//        // Writing primitive data to the file
//        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))) {
//            dos.writeInt(42);
//            dos.writeUTF("Hello, World!");
//            dos.writeBoolean(true);
//            System.out.println("Data written successfully.");
//        } catch (FileNotFoundException ex) {
//            throw new RuntimeException("File not found: " + ex.getMessage(), ex);
//        } catch (IOException ex) {
//            throw new RuntimeException("Error writing to file: " + ex.getMessage(), ex);
//        }
//
//        // Reading primitive data from the file
//        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
//            int readInt = dis.readInt();
//            String readUTF = dis.readUTF();
//            boolean readBoolean = dis.readBoolean();
//
//            System.out.println("Read Integer: " + readInt);
//            System.out.println("Read String: " + readUTF);
//            System.out.println("Read Boolean: " + readBoolean);
//        } catch (FileNotFoundException ex) {
//            throw new RuntimeException("File not found: " + ex.getMessage(), ex);
//        } catch (IOException ex) {
//            throw new RuntimeException("Error reading from file: " + ex.getMessage(), ex);
//        }
//    }
//}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrimitiveStreams implements Comparator {
//  public int compare(Comp o1, Comp o2) {
//    return o1.getAge() - o2.getAge();
//  }

  @Override
  public int compare(Object o1, Object o2) {
    return 0;
  }

  public static void main(String[] args) {
    ArrayList<String> arr = new ArrayList();
    arr.add("A");
    arr.add("B");
    arr.add("C");
    arr.add("D");

    Collections.sort(arr);

    System.out.println(arr);
  }
}