// Last updated: 8/8/2026, 2:57:32 PM
class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        String first="";
        String second="";
        String target="";
        for(int i=0;i<firstWord.length();i++){
            int ch=firstWord.charAt(i)-'a';
            int val=97-ch;
            if(val==0){
                continue;
            }
            first+=Integer.toString(ch);
        }
        for(int i=0;i<secondWord.length();i++){
            int ch=secondWord.charAt(i)-'a';
            int val=97-ch;
            if(val==0){
                continue;
            }
            second+=Integer.toString(ch);
        }
        for(int i=0;i<targetWord.length();i++){
            int ch=targetWord.charAt(i)-'a';
            int val=97-ch;
            if(val==0){
                continue;
            }
            target+=Integer.toString(ch);
        }
        return (Integer.parseInt(first)+Integer.parseInt(second))==Integer.parseInt(target);
    }
}