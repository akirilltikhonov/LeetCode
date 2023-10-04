package medium.q3LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<>();

        int l = 0;
        int max = 0;
        for (int r = 0; r < chars.length; r++) {
            if (!set.contains(chars[r])) {
                set.add(chars[r]);
                max = Math.max(max, r - l + 1);
            } else {
                while (set.contains(chars[r])) {
                    set.remove(chars[l]);
                    l++;
                }
                set.add(chars[r]);
            }
        }
        return max;
    }
}