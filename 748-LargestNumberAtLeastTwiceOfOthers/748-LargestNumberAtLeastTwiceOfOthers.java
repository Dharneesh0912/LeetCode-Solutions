// Last updated: 7/14/2026, 2:12:32 PM
class Solution {
    public int dominantIndex(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        if(nums.length<=1){
            return 0;
        }
        boolean b=true;
        if(nums[nums.length-2]*2>max){
            b=false;
        }
        if(!b){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                return i;
            }
        }
        return -1;
        
    }
}