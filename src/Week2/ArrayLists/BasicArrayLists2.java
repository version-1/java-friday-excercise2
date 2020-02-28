package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class BasicArrayLists2 {
  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) {
      nums.add((int) (Math.random() * 100 + 1));
    }

    System.out.println("ArrayList : " + nums);
  }
}