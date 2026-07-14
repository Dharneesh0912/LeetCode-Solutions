// Last updated: 7/14/2026, 2:13:35 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        // Store nums1 elements
        for (int num : nums1) {
            set1.add(num);
        }

        // Check nums2 elements
        for (int num : nums2) {
            if (set1.contains(num)) {
                result.add(num);  // unique automatically
            }
        }

        // Convert set to array
        int[] arr = new int[result.size()];
        int i = 0;
        for (int num : result) {
            arr[i++] = num;
        }

        return arr;
    }
}