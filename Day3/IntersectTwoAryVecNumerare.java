package Day3;

import java.util.Arrays;

import javax.naming.spi.DirStateFactory.Result;

public class IntersectTwoAryVecNumerare {
    
    public static void main(String[] args) {
        int []nums1=new int []{4,9,5};
        int []nums2=new int []{4,9,9,8,4};
        int []fin=intersect(nums1, nums2);
        for (int i : fin) {
            System.out.print(i+" ");
        }
        
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
    int []vnum=new int[1001];
        for (int i : nums1) {
            vnum[i]++;
        }
        int size=0;
        int []rnum= new int[1001];
        for (int i : nums2) {
            if(vnum[i]>0)
            {
                vnum[i]--;
                rnum[size++]=i;
            }
        }
        return Arrays.copyOf(rnum, size);
        
    }
}
