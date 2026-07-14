// Last updated: 7/14/2026, 2:14:04 PM
class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> arr=new ArrayList<>();
        if(nums.length==0){
            return arr;
        }
        int start=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1==nums[i+1]){
                continue;
            }
            else{
                String s=Integer.toString(nums[start]);
                String e=Integer.toString(nums[i]);
                if(s.equals(e)){
                    arr.add(s);
                }
                else{
                    arr.add(s+"->"+e);
                }
                start=i+1;
            }
        }
        String s = Integer.toString(nums[start]);
        String e = Integer.toString(nums[nums.length-1]);
        if(s.equals(e)){
            arr.add(s);
        }
        else{
            arr.add(s+"->"+e);
        }
        return arr;
    }
}