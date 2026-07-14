// Last updated: 7/14/2026, 1:53:19 PM
class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int index=i;
            int move=Math.abs(nums[i]);
            if(nums[i]>0){
                for(int k=i;k<i+move;k++){
                    if(index==nums.length-1){
                        index=0;
                    }
                    else{
                        index++;
                    }
                    
                }
                ans[i]=nums[index];
            }
            else{
                for(int k=i;k<i+move;k++){
                    if(index==0){
                        index=nums.length-1;
                    }else{
                        index--;
                    }
                    
                }
                ans[i]=nums[index];
            }
        }
        return ans;
    }
}