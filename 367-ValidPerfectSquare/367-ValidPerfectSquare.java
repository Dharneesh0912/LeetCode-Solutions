// Last updated: 7/14/2026, 2:13:33 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        double ans=Math.sqrt(num);
        int check=(int)ans;
        double val=ans-check;
        if(val>0){
            return false;
        }
        return true;
        
    }
}