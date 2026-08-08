// Last updated: 8/8/2026, 3:05:45 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[]=new int[nums.length+nums.length];
        int j=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            ans[j]=nums[i];
            if(i==nums.length-1 && count<1){
                i=-1;
                count++;
            }
            j++;
        }
        return ans;
    }
}