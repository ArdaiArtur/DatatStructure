public class MaxSubAry {
    public static void main(String[] args) {
        int []nums=new int []{1,2,-3,4,5,6,7,-89,9,-1,22};  
        System.out.println( maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        if(nums.length==1)
        return nums[0];
        int s=0;
        int max=-10000;
        for (int i = 0; i < nums.length; i++) {
            s=s+nums[i];
                max=Math.max(max, s);
            if(s<0)
            {
                s=0;
            }         
        }
        
        return max;
    }
    }


