// Last updated: 7/14/2026, 2:15:01 PM
class Solution {
    public boolean search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return true;
            }
        }
        return false;
    }
}