package src.Array;

public class intro {
  public static void main(String[] args){
    int[] arr = new int[5];             // Creates [0, 0, 0, 0, 0]
    String[] names = new String[3];     // Creates [null, null, null]
       int[] nums = {1, 2, 3, 4};       // Direct initialization
      System.out.println(nums[2]);      // Access  -> prints 3
      nums[2] = 10;                     // Modify -> changes nums[2] from 3 to 10
  }
}
