// Last updated: 8/12/2026, 12:03:30 PM
class Solution {
    public int maxVowels(String s, int k) {

        String vow = "AEIOUaeiou";
        int count = 0;
        int max = 0;
        for (int i = 0; i < k; i++) {
            if (vow.contains(Character.toString(s.charAt(i)))) {
                count++;
            }
        }
        max = count;
        for (int i = k; i < s.length(); i++) {
            if (vow.contains(Character.toString(s.charAt(i - k)))) {
                count--;
            }
            if (vow.contains(Character.toString(s.charAt(i)))) {
                count++;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}