// Last updated: 7/14/2026, 2:14:20 PM
import java.util.*;

class Solution {
    public String largestNumber(int[] nums) {

        ArrayList<String> arr = new ArrayList<>();

        for (int num : nums) {
            arr.add(String.valueOf(num));
        }

        arr.sort((a, b) -> (b + a).compareTo(a + b));
        if (arr.get(0).equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        for (String s : arr) {
            sb.append(s);
        }

        return sb.toString();
    }
}