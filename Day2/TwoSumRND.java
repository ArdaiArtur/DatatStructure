package Day2;

import java.util.HashMap;
import java.util.Map;



/**
 * TwoSumRND
 */
public class TwoSumRND {

    

    
    public static void main(String[] args) {
        
    }

    public static int[] twoSum(int[] nums, int target) {
       
      
       Map<Integer,Integer>mp=new HashMap<Integer,Integer>();
       for (int i = 0; i < nums.length; i++) {
           if(!mp.containsKey(nums[i]))
           {
               mp.put(target-nums[i], i);
           }
           else
           {
                return new int[]{mp.get(nums[i]),i};
           }
       }
       return new int []{0,0};
        
    }
}
