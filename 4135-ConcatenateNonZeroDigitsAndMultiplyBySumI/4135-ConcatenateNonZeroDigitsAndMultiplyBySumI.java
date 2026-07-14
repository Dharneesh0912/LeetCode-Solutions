// Last updated: 7/14/2026, 1:53:14 PM
class Solution {
    public long sumAndMultiply(int n) {
        if(n==0){
            return 0;
        }
        String num=Integer.toString(n);
        String ans="";
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)!='0'){
                ans+=num.charAt(i);
            }
        }
        int sum=0;
        for(int i=0;i<ans.length();i++){
            sum+=Integer.parseInt(Character.toString(ans.charAt(i)));
        }
        long r=Integer.parseInt(ans);

        return r*sum;

        
    }
}