// Last updated: 7/14/2026, 2:15:03 PM
class Solution {
    public void sortColors(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    nums[i]=nums[i];
                }
                else if(nums[i]<nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        for(int i:nums){
            System.out.print(i);
        }
        
    }
}