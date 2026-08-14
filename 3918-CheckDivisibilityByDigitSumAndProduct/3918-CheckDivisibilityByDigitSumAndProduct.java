// Last updated: 8/14/2026, 11:37:38 AM
class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int temp=n;
        int prd=1;
        while(temp!=0){
            sum+=temp%10;
            prd*=temp%10;
            temp=temp/10;
        }
        int total=sum+prd;
        if(n%total==0){
            return true;
        }
        return false;
    
    }
}