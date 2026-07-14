// Last updated: 7/14/2026, 2:14:16 PM
class Solution {
    public boolean isHappy(int n) {
        int num = n;

        while (num != 1 && num != 4) {  // check for unhappy cycle
            int sum = 0;

            while (num != 0) {
                int digit = num % 10;
                sum += digit * digit;
                num /= 10;
            }

            num = sum;
        }

        return num == 1;
    }
}