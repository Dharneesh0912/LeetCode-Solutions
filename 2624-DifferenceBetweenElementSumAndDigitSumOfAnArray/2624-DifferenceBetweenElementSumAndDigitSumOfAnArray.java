// Last updated: 7/14/2026, 1:53:35 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int digitsum=0;
        int singledsum=0;
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            while(a!=0){
               digitsum+=a%10;
               a=a/10;
            }
        }
        int total=digitsum;
        return sum-total;
        
    }
}