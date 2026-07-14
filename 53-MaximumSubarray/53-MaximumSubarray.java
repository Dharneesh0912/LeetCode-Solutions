// Last updated: 7/14/2026, 2:15:13 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int currentelement=nums[0];
        int maxelement=nums[0];
        for(int i=1;i<nums.length;i++){
            currentelement=Math.max(nums[i],currentelement+nums[i]);
            maxelement=Math.max(maxelement,currentelement);
        }
        return maxelement;
        
    }
}