package Week2.Arrays;

import java.util.Scanner;

public class WhereIsIt {
  public static void main(String[] args) {
    int[] nums = new int[10];
    System.out.print("Array :");
    for (int i = 0; i < nums.length; i++) {
      nums[i] = (int) (Math.random() * 50 + 1);
      System.out.print(nums[i] + " ");
    }

    System.out.println();
    System.out.print("Value to find: ");
    Scanner scan = new Scanner(System.in);
    int target = scan.nextInt();
    scan.close();

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target) {
        System.out.println(String.format("%s is in slot %s", target, i));
        return;
      }
    }

    System.out.println(target + " is not in the array");
  }
}