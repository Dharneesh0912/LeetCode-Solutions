// Last updated: 8/7/2026, 11:17:02 AM
class Solution {
    public int arraySign(int[] nums) {
        int pos=0;
        int neg=0;
        int o=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                return 0;
            }
            if(nums[i]<0){
                neg++;
            }
            if(nums[i]>0){
                pos++;
            }
        }
        if(neg%2!=0){
            return -1;
        }
        return 1;
    }
}