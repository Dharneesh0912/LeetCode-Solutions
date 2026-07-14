// Last updated: 7/14/2026, 2:14:09 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hash=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(hash.contains(nums[i])){
                return true;
            }
            else{
                hash.add(nums[i]);
            }
        }
        return false;
    }
}