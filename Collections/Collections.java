//package Collections;//package Collections;
////
////import java.lang.reflect.Array;
////import java.util.*;
////
////public class Collections {
////  public static void main(String[] args) {
////      Collection<Integer> c = new ArrayList<>();
////
////      c.add(2);
////      c.add(4);
////      c.add(5);
////
////      ArrayList<Integer> list = (ArrayList<Integer>) c;
////      list.sort(Comparator.naturalOrder());
//////      list.add(0, 10);
////
//////      Iterator<Integer> newIterator = c.iterator();
////////      while(newIterator.hasNext()) {
////////          Integer num = newIterator.next();
////////          if(num == 5) {
////////              newIterator.remove();
////////          }
////////      }
//////
//////      System.out.println(c);
////
//////      for(Object o: c) {
//////          int num=(Integer)(o);
//////          System.out.println(num);
//////      }
////
////      Map<String, Integer>  marks = new HashMap<>();
////
////      marks.put("Heloise", 50);
////      marks.put("Christella", 20);
////      marks.put("Christella", 10);
////      marks.put("Berard", 10);
////
////      System.out.println(marks);
////      // using iterator
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Iterator;
//
//////      <Integer> iterator = c.iterator();
//////      while (iterator.hasNext()) {
//////          System.out.println(iterator.next());
//////      }
////  }
////}
//
//    //Adding strings in iterator
////public class Collections {
////    public static void main(String[] args) {
////        Collection<String> c = new ArrayList<>();
////        c.add("Joshua");
////        c.add("Bob");
////        c.add("Alice");
////        c.add("Kalisa");
////        c.add("Kevin");
////
////        Iterator iterator = c.iterator();
////        String element = "";
////        while (iterator.hasNext()) {
////            element = element + " " + (String) iterator.next();
////        }
////        System.out.println(element);
////
////    }
////}
//
////public class Collections {
////    public static void main(String[] args) {
////        Collection<Integer> c = new ArrayList<>();
////
////        c.add(1);
////        c.add(10);
////        c.add(5);
////        c.add(4);
////
////        ArrayList<Integer> list = new ArrayList<>();
////        list.add(0, 0);
////        list.remove(2);
////
////        System.out.println(c);
////    }
////}
//
//public class Collections {
//    public static void main(String[] args) {
//
//    }
//}
