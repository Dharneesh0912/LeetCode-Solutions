// Last updated: 7/14/2026, 1:53:34 PM
class Solution {
    public int maximumCount(int[] nums) {
        int Pcount=0;
        int Ncount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                Pcount++;
            }
            if(nums[i]<0){
                Ncount++;
            }
        }
        return Pcount>Ncount?Pcount:Ncount;
        
    }
}