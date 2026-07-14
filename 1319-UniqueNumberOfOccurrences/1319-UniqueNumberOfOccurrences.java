// Last updated: 7/14/2026, 2:11:50 PM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int arr1[]=new int[map.size()];
        int o=0;
        for(int i:map.keySet()){
            arr1[o]=map.get(i);
            o++;
        }
        Arrays.sort(arr1);
        for(int i=0;i<arr1.length-1;i++){
            if(arr1[i]==arr1[i+1]){
                return false;
            }
        }
        return true;

        
    }
}