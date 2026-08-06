// Last updated: 8/6/2026, 12:02:55 PM
class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        return sum==num;
    }
}