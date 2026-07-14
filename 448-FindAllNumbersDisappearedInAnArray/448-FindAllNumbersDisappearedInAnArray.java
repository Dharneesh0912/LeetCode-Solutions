// Last updated: 7/14/2026, 2:13:18 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int size=nums.length;
        List<Integer> lst=new ArrayList<>();
        HashSet<Integer> map=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            map.add(nums[i]);
        }
        for(int i=1;i<=size;i++){
            if(!map.contains(i)){
                lst.add(i);
            }
        }
        return lst;
        
    }
}