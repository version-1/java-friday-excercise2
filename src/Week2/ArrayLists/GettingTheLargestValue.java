package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class GettingTheLargestValue {
  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<Integer>();
    int max = 0;
    for (int i = 0; i < 10; i++) {
      int num = (int) (Math.random() * 100 + 1);
      nums.add(num);
      if (max < num) {
        max = num;
      }
    }

    System.out.println("ArrayList : " + nums);
    System.out.println("The largest value is " + max);
  }
}