// Last updated: 7/14/2026, 2:11:15 PM
class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int minDist = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                minDist = Math.min(minDist, Math.abs(i - start));
            }
        }

        return minDist;
    }
}