// Last updated: 7/18/2026, 6:49:38 PM
class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return gcd(nums[0],nums[nums.length-1]);
    }
    public int gcd(int val1,int val2){
        for(int i=val1;i>=1;i--){
            if(val1%i==0 && val2%i==0){
                return i;
            }
        }
        return 1;
    }
}