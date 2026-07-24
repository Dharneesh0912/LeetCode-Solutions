// Last updated: 7/24/2026, 1:32:24 PM
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        Deque<Integer>arr=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr.addFirst(nums[i]);
            }
            else{
                arr.addLast(nums[i]);
            }
        }
        int ans[]=new int[arr.size()];
        int i=0;
        for(int d:arr){
            ans[i++]=d;
        }
        return ans;
        
    }
}