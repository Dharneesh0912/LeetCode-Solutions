// Last updated: 7/14/2026, 2:11:49 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int cost=0;
        int oddcount=0;
        int evencount=0;
        for(int i=0;i<position.length;i++){
            if(position[i]%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        if(evencount>oddcount){
            cost=oddcount;
        }
        else{
            cost=evencount;
        }
        return cost;
    }
}