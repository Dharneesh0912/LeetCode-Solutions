// Last updated: 7/14/2026, 2:15:18 PM
class Solution {
    public int firstMissingPositive(int[] nums) {
        TreeSet<Integer> arr=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                arr.add(nums[i]);
            }
        }
        int k=1;
        for(int i:arr){
            if(i!=k){
                break;
            }
            k++;
        }
        return k;
        
    }
}