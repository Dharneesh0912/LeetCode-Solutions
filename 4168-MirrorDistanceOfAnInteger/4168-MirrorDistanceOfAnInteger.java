// Last updated: 7/14/2026, 1:53:15 PM
class Solution {
    public int mirrorDistance(int n) {
        int num=n;
        int sum=0;
        int rev=0;
        while(num!=0){
            sum=num%10;
            rev=rev*10+sum;
            num=num/10;        
        }
        if(rev>n){
            return rev-n;
        }
        return n-rev;
        
    }
}