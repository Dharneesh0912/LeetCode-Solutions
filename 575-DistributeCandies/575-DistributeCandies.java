// Last updated: 7/14/2026, 2:12:59 PM
class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> map=new HashSet<>();
        for(int i=0;i<candyType.length;i++){
            map.add(candyType[i]);
        }
        int n=candyType.length/2;
        if(map.size()>n){
            return n;
        }
        return map.size();
        
    }
}