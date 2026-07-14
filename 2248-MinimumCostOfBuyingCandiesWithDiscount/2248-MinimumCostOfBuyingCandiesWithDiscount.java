// Last updated: 7/14/2026, 1:53:44 PM
class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum=0;
        if(cost.length==1){
            return cost[0];
        }
        if(cost.length<=3){
            sum=cost[cost.length-1]+cost[cost.length-2];
            return sum;
        }
        int j=1;
        for(int i=cost.length-1;i>=0;i--){
            if(j==3){
                j=1;
                continue;
            }
            else{
                sum+=cost[i];
                j++;
            }
        }
        return sum;
    }
}