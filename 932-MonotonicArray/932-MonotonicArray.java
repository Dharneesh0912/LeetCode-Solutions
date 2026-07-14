// Last updated: 7/14/2026, 2:12:15 PM
class Solution {
    public boolean isMonotonic(int[] nums) {
        int start=0;
        if(nums[0]>nums[nums.length-1]){
            start=0;
        }
        else{
            start=nums.length-1;
        }
        if(start==0){
            boolean b=true;
            for(int i=1;i<nums.length;i++){
                if(nums[i-1]<nums[i]){
                    return false;
                }
            }
            return b;
        }
        if(start==nums.length-1){
            boolean b=true;
            for(int i=1;i<nums.length;i++){
                if(nums[i-1]>nums[i]){
                    return false;
                }
            }
            return b;
        }
        return true;
    }
}