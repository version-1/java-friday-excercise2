package Week2.Arrays;

public class CopyingArrays {
  public static void main(String[] args) {
    int[] nums = new int[10];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = (int) (Math.random() * 100 + 1);
    }

    int[] nums2 = new int[10];
    for (int i = 0; i < nums2.length; i++) {
      nums2[i] = nums[i];
    }
    nums[9] = -7;

    System.out.print("Array 1: ");
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
    System.out.println();

    System.out.print("Array 2: ");
    for (int i = 0; i < nums2.length; i++) {
      System.out.print(nums2[i] + " ");
    }
    System.out.println();
  }
}