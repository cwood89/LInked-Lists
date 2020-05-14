import java.util.*;

public class Main {

  public static void main(String[] args) {

    LinkedList<String> names = new LinkedList<>();
    LinkedList<String> things = new LinkedList<>();

    // 1
    System.out.println("#1");
    System.out.println(LinkedLab.isEmpty(names));
    // 2
    System.out.println("#2");
    LinkedLab.add(names, "Chris");
    LinkedLab.printItems(names);
    // 3
    System.out.println("#3");
    LinkedLab.makeEmpty(names);
    // 4
    System.out.println("#4");
    LinkedLab.add(names, "Kobe");
    LinkedLab.printItems(names);
    // 5
    System.out.println("#5");
    LinkedLab.add(names, "Chris");
    LinkedLab.add(names, "Kobe");
    LinkedLab.add(names, "Kareem");
    LinkedLab.add(names, "Kareem");
    LinkedLab.add(names, "Kareem");
    LinkedLab.add(names, "Kareem");
    LinkedLab.add(names, "Mike");

    LinkedLab.remove(names, 2);
    LinkedLab.printItems(names);
    // 6
    System.out.println("#6");
    LinkedLab.removeAll(names, "Kareem");
    LinkedLab.printItems(names);
    // 7
    System.out.println("#7");
    LinkedLab.prepend(names, "Derrick");
    LinkedLab.printItems(names);
    // 8
    System.out.println("#8");
    LinkedLab.insert(names, "Magic", 2);
    LinkedLab.printItems(names);
    // 9
    System.out.println("#9");
    things.add("ball");
    things.add("hat");
    things.add("shoes");
    LinkedLab.addList(names, things);
    LinkedLab.printItems(names);
    // 10
    System.out.println("#10");
    LinkedLab.printReverse(names);

  }

}