// Last updated: 7/27/2026, 11:09:54 AM
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            ArrayList<Integer> arr=new ArrayList<>();
            arr.add(nums[i]);
            for(int j=i+1;j<nums.length;j++){
                if(arr.get(arr.size()-1)<nums[j]){
                    arr.add(nums[j]);
                }
                else{
                    break;
                }
            }
            max=Math.max(max,arr.size());
        }
        if(max==Integer.MIN_VALUE){
            return 1;
        }
        return max;
    }
}