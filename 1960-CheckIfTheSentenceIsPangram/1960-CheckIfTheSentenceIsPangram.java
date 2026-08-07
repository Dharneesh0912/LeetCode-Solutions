// Last updated: 8/7/2026, 11:16:58 AM
class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean b[]=new boolean[26];
        for(int i=0;i<sentence.length();i++){
            int c=sentence.charAt(i);
            if(b[c-97]==false){
                b[c-97]=true;
            }
        }
        for(int i=0;i<b.length;i++){
            if(b[i]==false){
                return false;
            }
        }
        return true;
    }
}