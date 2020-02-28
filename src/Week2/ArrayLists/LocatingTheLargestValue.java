package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class LocatingTheLargestValue {
  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<Integer>();
    int maxIndex = 0;
    for (int i = 0; i < 10; i++) {
      int num = (int) (Math.random() * 100 + 1);
      nums.add(num);
      if (nums.get(maxIndex) < num) {
        maxIndex = i;
      }
    }

    System.out.println("ArrayList : " + nums);
    System.out.println("The largest value is " + nums.get(maxIndex) + ", which is in slot " + maxIndex);
  }
}