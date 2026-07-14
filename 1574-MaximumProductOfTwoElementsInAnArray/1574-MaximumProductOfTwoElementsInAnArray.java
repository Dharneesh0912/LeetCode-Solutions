// Last updated: 7/14/2026, 2:11:32 PM
class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int prd=nums[nums.length-1]-1;
        int prd1=nums[nums.length-2]-1;
        return prd1*prd;
    }
}