package Week2.Arrays;

public class BasicArrays2 {
  public static void main(String[] args) {
    int[] nums = new int[10];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = (int)(Math.random()*100 + 1);
      System.out.println(String.format("Slot %s contains a %s", i, nums[i]));
    }

  }
}