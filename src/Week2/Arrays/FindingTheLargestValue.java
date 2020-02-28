package Week2.Arrays;

public class FindingTheLargestValue {
  public static void main(String[] args) {
    int[] nums = new int[10];
    int max = 0;
    System.out.print("Array :");
    for (int i = 0; i < nums.length; i++) {
      nums[i] = (int) (Math.random() * 100 + 1);
      System.out.print(nums[i] + " ");
      if (max < nums[i]) {
        max = nums[i];
      }
    }

    System.out.println("");
    System.out.println("The largest value is " + max);
  }
}