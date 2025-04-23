package src.Array;
import java.util.Arrays;
public class intro {
  public static void main(String[] args){
    int[] arr = new int[5];
    System.out.println(arr);// Creates [0, 0, 0, 0, 0]
    String[] names = new String[3];
    System.out.println(names);// Creates [null, null, null]
       int[] nums = {1, 2, 3, 4};       // Direct initialization
      System.out.println(nums);      // Access  -> prints 3
      nums[2] = 10;                     // Modify -> changes nums[2] from 3 to 10


    int[] rolls = new int[5];
    System.out.println(rolls);
    for(int i = 0; i<5; i++){
      System.out.println(i);
      rolls[i] = i+1;
    }
    rolls[2] = 7;
    System.out.println(Arrays.toString(rolls));

   for(int roll: rolls){
     System.out.println(roll);
   }
  }
}
