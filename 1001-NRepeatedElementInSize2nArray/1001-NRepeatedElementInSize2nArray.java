// Last updated: 7/24/2026, 1:32:20 PM
class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i:map.keySet()){
            if(map.get(i)>1 && nums.length==2*map.get(i)){
                return i;
            }
        }
        return 0;
    }
}