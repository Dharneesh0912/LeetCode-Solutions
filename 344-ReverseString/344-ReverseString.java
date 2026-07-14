// Last updated: 7/14/2026, 2:13:37 PM
class Solution {
    public void reverseString(char[] s) {
        char arr[]=new char[s.length];
        int j=0;
        for(int i=0;i<s.length;i++){
            arr[i]=s[i];
        }
        for(int i=s.length-1;i>=0;i--){
            s[j]=arr[i];
            j++;
    
        }
        
    }
}