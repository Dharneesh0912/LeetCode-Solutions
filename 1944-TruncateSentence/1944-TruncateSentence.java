// Last updated: 8/7/2026, 11:17:04 AM
class Solution {
    public String truncateSentence(String s, int k) {
        String str[]=s.split(" ");
        String ans="";
        for(int i=0;i<k;i++){
            if(i!=k-1){
                ans+=str[i]+" ";
                continue;
            }
            ans+=str[i];
        }
        return ans;
    }
}