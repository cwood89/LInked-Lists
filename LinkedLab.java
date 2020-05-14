import java.util.LinkedList;
import java.util.Collections;

public class LinkedLab {

  public static boolean isEmpty(LinkedList<String> x) {
    return x.isEmpty();
  }

  public static void add(LinkedList<String> x, String item) {
    x.add(item);
  }

  public static void makeEmpty(LinkedList<String> x) {
    if (x.size() == 0) {
      System.out.println("The list is empty.");
    } else {
      x.clear();
      System.out.println("The list has been emptied.");
    }
  }

  public static void printItems(LinkedList<String> x) {
    for (String item : x) {
      System.out.println(item);
    }
  }

  public static void remove(LinkedList<String> x, int index) {
    x.remove(index);
  }

  public static void removeAll(LinkedList<String> x, String item) {
    while (x.contains(item)) {
      x.remove(item);
    }
  }

  public static void prepend(LinkedList<String> x, String item) {
    x.addFirst(item);
  }

  public static void insert(LinkedList<String> x, String item, int index) {
    x.add(index + 1, item);
  }

  public static void addList(LinkedList<String> x, LinkedList<String> y) {
    x.addAll(y);
  }

  public static void printReverse(LinkedList<String> x) {
    Collections.reverse(x);
    for (String item : x) {
      System.out.println(item);
    }
  }

}