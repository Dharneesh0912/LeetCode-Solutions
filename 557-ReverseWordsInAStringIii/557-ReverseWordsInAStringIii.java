// Last updated: 7/14/2026, 2:13:02 PM
class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        String ans="";
        for(int i=0;i<arr.length;i++){
            StringBuffer str=new StringBuffer(arr[i]);
            str.reverse();
            ans+=str.toString();
            if(i!=arr.length-1){
                ans+=" ";
            }
        }
        return ans;
    }
}