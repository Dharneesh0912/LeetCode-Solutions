// Last updated: 7/14/2026, 2:13:55 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] ch=s.toCharArray();
        char[] ch1=t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        if(Arrays.equals(ch1,ch)){
            return true;
        }
        return false;

    }
}