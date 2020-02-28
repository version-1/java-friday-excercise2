package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WhereItIs {
  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) {
      nums.add((int) (Math.random() * 50 + 1));
    }

    System.out.println("ArrayList : " + nums);
    System.out.print("Value to find: ");
    Scanner scan = new Scanner(System.in);
    Integer num = scan.nextInt();
    scan.close();

    boolean isFound = false;
    for (int i = 0; i < nums.size(); i++) {
      if (nums.get(i) == num) {
        System.out.println(num + " is in slot " + i);
        isFound = true;
      }
    }

    if (!isFound) {
      System.out.println(num + " is not in the ArrayList");
    }
  }
}