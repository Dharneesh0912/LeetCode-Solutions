// Last updated: 8/6/2026, 12:01:30 PM
class Solution {
    public int minFlipsMonoIncr(String s) {
        int n = s.length();
        int[] leftOnes = new int[n + 1];
        int[] rightZeros = new int[n + 1];
        for (int i = 0; i < n; i++) {
            leftOnes[i + 1] = leftOnes[i];
            if (s.charAt(i) == '1') {
                leftOnes[i + 1]++;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            rightZeros[i] = rightZeros[i + 1];
            if (s.charAt(i) == '0') {
                rightZeros[i]++;
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            ans = Math.min(ans, leftOnes[i] + rightZeros[i]);
        }
        return ans;
    }
}