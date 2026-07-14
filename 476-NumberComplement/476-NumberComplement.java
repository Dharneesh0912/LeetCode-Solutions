// Last updated: 7/14/2026, 2:13:15 PM
class Solution {
    public int findComplement(int num) {
        String str=Integer.toBinaryString(num);
        String ans="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0'){
                ans+="1";
            }
            else{
                ans+="0";
            }
        }
        int result=Integer.parseInt(ans,2);
        return result;

    }
}