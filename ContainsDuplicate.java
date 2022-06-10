import java.util.Hashtable;

/**
 * ContainsDuplicate
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
     int []nums=new int []{1,2,3,4,5,6,7,89,9,1,22};  
     containsDuplicate(nums); 
    }

    public static boolean containsDuplicate(int[] nums) {
        Hashtable<Integer,Integer> hs=new Hashtable<Integer,Integer>();
        int s=nums.length;
        for (int i = 0; i < s; i++) {
            if(!hs.containsKey(nums[i]))
            {
                hs.put(nums[i], i);
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}