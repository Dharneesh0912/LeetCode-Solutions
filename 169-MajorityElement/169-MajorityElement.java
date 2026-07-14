// Last updated: 7/14/2026, 2:14:24 PM
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int size=nums.length-1;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i:map.keySet()){
            if(map.get(i)>size/2){
                return i;

            }
        }
        return 0;
    }
}