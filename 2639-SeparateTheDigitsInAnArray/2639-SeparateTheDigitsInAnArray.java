// Last updated: 7/14/2026, 1:53:29 PM
class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer>arr1=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int count=0;
            while(num!=0){
                arr.add(num%10);
                num=num/10;
                count++;
            }
            for(int j=arr.size()-1;j>=0;j--){
                arr1.add(arr.get(j));
            }
            arr.clear();
        }
        int results[]=new int[arr1.size()];
        for(int i=0;i<arr1.size();i++){
            results[i]=arr1.get(i);
        }
        return results;  
    }
}