// Last updated: 7/14/2026, 2:13:36 PM
class Solution {
    public String reverseVowels(String s) {
        char ch[]=s.toCharArray();
        ArrayList<Character> arr= new ArrayList<>();
        String vowels="AEIOUaeiou";
        for(int i=0;i<ch.length;i++){
            if(vowels.contains(Character.toString(ch[i]))){
                arr.add(ch[i]);
            }
        }
        int p=arr.size()-1;
        for(int i=0;i<ch.length;i++){
            if(vowels.contains(Character.toString(ch[i]))){
                ch[i]=arr.get(p);
                p--;
            }
        }
        String ans="";
        for(char h:ch){
            ans+=Character.toString(h);
        }
        return ans;

                                                 
    }
}