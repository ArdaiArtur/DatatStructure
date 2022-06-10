

public class MergSortedArray {
    
    public static void main(String[] args) {
        int []nums1={1,2,3,0,0,0};
        int []nums2={2,5,6};
        merge(nums1, 3, nums2, 3);

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int m1=m-1;
        int n1=n-1;
        if(n<=0) return;
        for(int i=m+n-1;i>=0;i--){
            if(m1>=0&&n1>=0&&nums1[m1]>nums2[n1]){
              System.out.print(nums1[m1]+","+nums1[i]+"HereM1/"+i+"loc/");
                nums1[i]=nums1[m1];
                //nums1[m1]=0; 
                m1--;
            }
            else if(n1>=0){System.out.print(nums1[i]+","+nums2[n1]+"HereN1/"+i+"loc/");
                nums1[i]=nums2[n1]; 
                //nums2[n1]=0;
                n1--;
            }
        }
        for(int i=0;i<n1;i++){
            nums1[i]=nums2[i];
        }

       
    }
}
