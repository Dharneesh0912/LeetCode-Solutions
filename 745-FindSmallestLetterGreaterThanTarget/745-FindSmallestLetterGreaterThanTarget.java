// Last updated: 7/14/2026, 2:12:36 PM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char max=target;
        Arrays.sort(letters);
        for(int i=0;i<letters.length;i++){
            if(letters[i]>max){
                max=letters[i];
                return max;
            }
        }
        return letters[0];
        
    }
}