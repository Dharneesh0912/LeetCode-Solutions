// Last updated: 7/14/2026, 2:12:08 PM
class Solution {
    public int bitwiseComplement(int n) {
        String str=Integer.toBinaryString(n);
        String rev="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                rev=rev+"0";
            
            }
            else{
                rev=rev+"1";
            }
        }
        return Integer.parseInt(rev,2);
    }
}