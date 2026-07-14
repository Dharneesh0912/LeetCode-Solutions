// Last updated: 7/14/2026, 2:11:21 PM
class Solution {
    public boolean check(int[] nums) {

        int count = 0;

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] > nums[i + 1]) {
                count++;
            }
        }

        if(nums[nums.length - 1] > nums[0]) {
            count++;
        }

        return count <= 1;
    }
}