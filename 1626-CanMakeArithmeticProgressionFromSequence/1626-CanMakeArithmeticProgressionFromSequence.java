// Last updated: 8/11/2026, 12:28:08 PM
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        Set<Integer> set=new HashSet<>();
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(count==0){
                count++;
                set.add(Math.abs(arr[i]-arr[i+1]));
            }
            if(!set.contains(Math.abs(arr[i]-arr[i+1]))){
                return false;
            } 
        }
        return true;
    }
}