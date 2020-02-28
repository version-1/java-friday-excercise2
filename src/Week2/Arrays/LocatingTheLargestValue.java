package Week2.Arrays;

public class LocatingTheLargestValue {
  public static void main(String[] args) {
    int[] nums = new int[10];
    int maxIndex = 0;
    System.out.print("Array :");
    for (int i = 0; i < nums.length; i++) {
      nums[i] = (int) (Math.random() * 100 + 1);
      System.out.print(nums[i] + " ");
      if (nums[maxIndex] < nums[i]) {
        maxIndex = i;
      }
    }

    System.out.println("");
    System.out.println("The largest value is " + nums[maxIndex]);
    System.out.println("It is in " + maxIndex);
  }
}