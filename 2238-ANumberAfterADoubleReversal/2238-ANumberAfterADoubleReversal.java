// Last updated: 7/14/2026, 2:11:10 PM
class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num==0){
            return true;
        }
        else if(num%10==0){
            return false;
        }
        else{
            return true;
        }
    }
}