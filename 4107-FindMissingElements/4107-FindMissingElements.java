// Last updated: 8/6/2026, 11:58:36 AM
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> arr = new ArrayList<>();
        int min=nums[0];
        int max=nums[nums.length-1];
        for(int j=min;j<=max;j++){
            boolean b=false;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==j){
                    b=true;
                }
            }
            if(!b){
                arr.add(j);
            }
        }
        return arr;
    }
}