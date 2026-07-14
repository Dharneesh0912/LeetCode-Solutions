// Last updated: 7/14/2026, 1:53:23 PM
class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        HashSet<Character> hash=new HashSet<>();
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch)) {
                if(word.contains("" + Character.toLowerCase(ch))) {
                    hash.add(ch);
                }
            }
        }
        return hash.size();
    }
}