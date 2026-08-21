// Last updated: 8/21/2026, 11:50:48 AM
class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        int ans[] = new int[nums.length];
        arr.add(nums[0]);
        arr1.add(nums[1]);
        for (int i = 2; i < nums.length; i++) {

            if (arr1.get(arr1.size() - 1) < arr.get(arr.size() - 1)) {
                arr.add(nums[i]);
            } else {
                arr1.add(nums[i]);
            }
        }
        int index = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans[index] = arr.get(i);
            index++;
        }
        for (int i = 0; i < arr1.size(); i++) {
            ans[index] = arr1.get(i);
            index++;
        }
        return ans;
    }
}