// Last updated: 7/14/2026, 2:13:20 PM
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> lst=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i:map.keySet()){
            if(map.get(i)>1){
                lst.add(i);
            }
        }
        return lst;
        
    }
}