// Last updated: 7/14/2026, 2:15:12 PM
class Solution {
    public int lengthOfLastWord(String s) {
        StringBuffer str=new StringBuffer(s);
        String[] arr=s.split(" ");
        int length=0;
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                length=arr[i].length();
            }
        }
        return length;
        
    }
}