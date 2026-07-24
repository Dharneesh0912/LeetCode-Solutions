// Last updated: 7/24/2026, 1:32:22 PM
class Solution {
    public String reverseOnlyLetters(String s) {
        char ch[]=s.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<j){
            while(i<j && !Character.isLetter(ch[i])){
                i++;
            }
            while(i<j && !Character.isLetter(ch[j])){
                j--;
            }
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        return new String(ch);

    }
}