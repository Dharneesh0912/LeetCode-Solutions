// Last updated: 7/14/2026, 2:14:46 PM
class Solution {
    public boolean isPalindrome(String s) {
        String ss = s.trim();

        // remove all non-alphanumeric characters INCLUDING spaces
        String m = ss.replaceAll("[^a-zA-Z0-9]", "");
        m = m.toLowerCase();

        int j = m.length() - 1;

        // stop at the middle only
        for (int i = 0; i < j; i++) { 
            if (m.charAt(i) == m.charAt(j)) {
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}