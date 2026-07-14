// Last updated: 7/14/2026, 1:53:16 PM
class Solution {
    public int[] concatWithReverse(int[] nums) {
        int arr[]=new int[nums.length*2];
        int m=0;
        int n=nums.length-1;
        for(int i=0;i<arr.length;i++){
            if(m<nums.length){
             arr[i]=nums[m];
             m++;   
            }
            else{
    
                arr[i]=nums[n];
                n--;
            }
        }
        return arr;

        
    }
}