// Last updated: 7/14/2026, 2:13:52 PM
class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int arr[]=new int[2];
        int m=0;
        for(int i:map.keySet()){
            if(map.get(i)==1){
                arr[m]=i;
                m++;
            }
        }
        return arr; 
    }
}