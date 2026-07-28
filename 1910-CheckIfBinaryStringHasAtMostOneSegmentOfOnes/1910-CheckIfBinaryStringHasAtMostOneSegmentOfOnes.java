// Last updated: 7/28/2026, 1:48:53 PM
class Solution {
    public boolean checkOnesSegment(String s) {
        ArrayList<Character> arr=new ArrayList<>();
        int end=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                end=i;
            }
        }
        if(end==0){
            return true;
        }
        for(int i=end;i>=0;i--){
            if(s.charAt(i)=='0'){
                return false;
            }
        }
        return true;
    }
}