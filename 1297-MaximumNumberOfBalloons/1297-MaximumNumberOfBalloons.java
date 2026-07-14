// Last updated: 7/14/2026, 2:11:52 PM
class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : text.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int ans = 0;
        while (map.getOrDefault('b', 0) >= 1 &&
               map.getOrDefault('a', 0) >= 1 &&
               map.getOrDefault('l', 0) >= 2 &&
               map.getOrDefault('o', 0) >= 2 &&
               map.getOrDefault('n', 0) >= 1) {

            map.put('b', map.get('b') - 1);
            map.put('a', map.get('a') - 1);
            map.put('l', map.get('l') - 2);
            map.put('o', map.get('o') - 2);
            map.put('n', map.get('n') - 1);

            ans++;
        }
        return ans;
    }
}