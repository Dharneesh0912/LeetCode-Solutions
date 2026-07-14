// Last updated: 7/14/2026, 2:14:33 PM
class Solution {
    public String reverseWords(String s) {
        String[] str=s.split("\\s+");
        String rev="";
        for(int i=str.length-1;i>=0;i--){
            rev=rev+str[i]+" ";
        }
        return rev.trim();
        
    }
}