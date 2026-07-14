// Last updated: 7/14/2026, 2:11:16 PM
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int total=0;
        int ice=costs.length;
        int count=0;
        Arrays.sort(costs);
        for(int i=0;i<costs.length;i++){
            total+=costs[i];
            count++;
            if(total>coins){
                return count-1;
            }
        }
        return count;
        
    }
}