// Last updated: 7/14/2026, 2:15:41 PM
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            int quantity = Math.min(height[left], height[right]);
            int width = right - left;
            max = Math.max(max, quantity * width);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}