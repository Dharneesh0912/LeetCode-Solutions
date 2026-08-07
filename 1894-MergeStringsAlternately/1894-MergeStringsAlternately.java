// Last updated: 8/7/2026, 11:17:19 AM
class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans="";
        int min=Math.min(word1.length(),word2.length());
        for(int i=0;i<min;i++){
            ans+=Character.toString(word1.charAt(i))+Character.toString(word2.charAt(i));
        }
        if(min!=word1.length()){
            ans+=word1.substring(min,word1.length());
        }
        if(min!=word2.length()){
            ans+=word2.substring(min,word2.length());
        }
        return ans;
    }
}