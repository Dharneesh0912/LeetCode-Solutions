// Last updated: 7/15/2026, 1:57:00 PM
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumodd=0;
        int sumeven=0;
        for(int i=1;i<=n*2;i++){
            if(i%2!=0){
                sumodd+=i;
            }
            else{
                sumeven+=i;
            }
        }
        int min=Math.min(sumodd,sumeven);
        for(int i=min;i>=1;i--){
            if(sumodd%i==0 && sumeven%i==0){
                return i;
            }
        }
        return 0;
    }
}