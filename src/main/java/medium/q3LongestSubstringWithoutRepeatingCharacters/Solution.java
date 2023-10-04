package medium.q3LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        int l = 0;
        int max = 0;
        for (int r = 0; r < chars.length; r++) {
            if (!map.containsKey(chars[r]) || map.get(chars[r]) < l) {
                map.put(chars[r], r);
                max = Math.max(max, r - l + 1);
            } else {
                l = map.get(chars[r]) + 1;
                map.put(chars[r], r);
            }
        }
        return max;
    }
}