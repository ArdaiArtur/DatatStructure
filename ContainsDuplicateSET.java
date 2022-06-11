import java.util.HashSet;

public class ContainsDuplicateSET {
    public static void main(String[] args) {
        int []nums=new int []{1,2,3,4,5,6,7,89,9,1,22};  
        contains(nums);
    }
    public static boolean contains(int []nums)
    {
        HashSet<Integer> h=new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(!h.add(nums[i]))
            {   
                return true;
            }
            else 
            h.add(nums[i]);
        }
        return false;
    }
}
