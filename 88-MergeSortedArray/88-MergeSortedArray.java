// Last updated: 7/14/2026, 2:14:56 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=0;
        for(int i=m;i<nums1.length;i++){
            for(int j=k;j<nums2.length;){
                nums1[i]=nums2[j];
                k++;
                break;
            }
        }
        int temp;
       for(int i=0;i<nums1.length-1;i++){
            for(int j=i+1;j<nums1.length;j++){
                if(nums1[i]>nums1[j]){
                    temp=nums1[i];
                    nums1[i]=nums1[j];
                    nums1[j]=temp;
                }
            }
        }
        for(int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]);
        }
        
    }
}