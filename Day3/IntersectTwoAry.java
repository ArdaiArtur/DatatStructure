package Day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class IntersectTwoAry {
    public static void main(String[] args) {
        int []nums1=new int []{4,9,5};
        int []nums2=new int []{4,9,9,8,4};
        int []fin=intersect(nums1, nums2);
        for (int i : fin) {
            System.out.print(i+" ");
        }
        
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
     HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
    List<Integer>lis=new ArrayList<Integer>();
     for (var num : nums1) {
     if(!hm.containsKey(num))
     {
        hm.put(num, 1);
     }   
     else
     {
        hm.put(num, hm.get(num)+1);
     }
     }
     for (var num : nums2) {
        if(hm.containsKey(num))
        {
                hm.put(num, hm.get(num)-1);
                lis.add(num);
                if(hm.get(num)<=0)
                {
                    hm.remove(num);
                }
        }  
     }
     int []fin=lis.stream().mapToInt(Integer::intValue).toArray();
     return lis.stream().mapToInt(Integer::intValue).toArray();
    }
}
