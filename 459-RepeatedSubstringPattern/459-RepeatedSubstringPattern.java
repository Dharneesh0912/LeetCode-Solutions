// Last updated: 7/14/2026, 2:13:17 PM
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int len = 1; len <= n / 2; len++) {
            if (n % len != 0)
                continue;
            String ans = s.substring(0, len);
            boolean flag = true;
            for (int i = 0; i < n; i += len) {
                if (!s.substring(i, i + len).equals(ans)) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                return true;
            }
        return false;
    }
}