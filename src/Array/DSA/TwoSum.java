package src.Array.DSA;
import java.util.HashMap;
import java.util.Map;
public class TwoSum {
    public static  void main(String[] args){
        int[] nums = { 2, 7, 11,15 };
        int target = 9;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< nums.length; i++){
            int num =  target - nums[i];


            if(map.containsKey(num)){
                System.out.println(map);
                System.out.println(map.get(num) + "---" + i );

            }
            map.put(nums[i], i);
        }
    }
}
