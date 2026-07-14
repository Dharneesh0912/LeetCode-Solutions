// Last updated: 7/14/2026, 2:15:49 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size=nums1.length+nums2.length;
        int arr[]=new int[size];
        for(int i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
        }
        int j=0;
        for(int i=nums1.length;i<size;i++){
            arr[i]=nums2[j];
            j++;
        }
        Arrays.sort(arr);
        int elements1=size/2;
        int elements2=elements1+1;
        if(size%2!=0){
            return arr[size/2];
        }
        int size1=(arr[elements1-1]+arr[elements1]);
        return (double)size1/2;


        
    }
}