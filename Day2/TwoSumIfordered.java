

/**
 * TwoSum
 */
/**
 * TwoSumIfordered
 */
package Day2;

/**
 * TwoSumIfordered
 */
public class TwoSumIfordered {

    


    


    public static void main(String[] args) {
        
    }

    public static int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        while(i<=j)
        {
            if(nums[i]+nums[j]==target)
            return new int[]{i,j};
            if(nums[i]+nums[j]>target)
            {
                j--;
            }
            else
            {
                i++;
            }

        }
            return new int []{-1,-1};
    }
}