// Last updated: 8/7/2026, 11:17:06 AM
class Solution {
    public int maxAscendingSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(nums[j-1]>=nums[j]){
                    break;
                }
                sum+=nums[j];
            }
            max=Math.max(max,sum);
        }
        if(max==Integer.MIN_VALUE){
            
        }
        return max;
    }
}