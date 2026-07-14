// Last updated: 7/14/2026, 2:14:03 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> arr=new ArrayList<>();
        int max=nums.length/3;
        for(int val:map.keySet()){
            if(map.get(val)>max){
                arr.add(val);
            }

        }
        return arr;
    }
}