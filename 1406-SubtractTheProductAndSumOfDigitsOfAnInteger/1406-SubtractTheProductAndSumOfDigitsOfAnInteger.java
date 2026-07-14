// Last updated: 7/14/2026, 2:11:46 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int prd=1;
        while(n!=0){
            sum+=n%10;
            prd*=n%10;
            n=n/10;
        }
        return prd-sum;
    }
}