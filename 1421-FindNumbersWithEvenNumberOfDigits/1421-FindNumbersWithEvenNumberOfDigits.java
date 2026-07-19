// Last updated: 7/19/2026, 7:36:58 PM
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int ec=0;
            while(nums[i]!=0){
                nums[i]=nums[i]/10;
                ec++;
            }
            if(ec%2==0){
                count++;
            }
        }
        return count;
    }
}