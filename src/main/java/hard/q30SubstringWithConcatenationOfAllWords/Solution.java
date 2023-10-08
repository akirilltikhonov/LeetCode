package hard.q30SubstringWithConcatenationOfAllWords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    private Map<String, Integer> map = new HashMap<>();
    private int subSize;
    private int wordSize;

    public List<Integer> findSubstring(String s, String[] words) {
        map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        subSize = words.length;
        wordSize = words[0].length();
        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i <= s.length() - wordSize * subSize; i++) {
            if (containsAllSubs(s, i)) {
                indices.add(i);
            }
        }
        return indices;
    }

    private String findSubString(String s, int startIndex) {
        if (startIndex + wordSize < s.length()) {
            return s.substring(startIndex, startIndex + wordSize);
        } else {
            return s.substring(startIndex);
        }
    }

    private boolean containsAllSubs(String s, int i) {
        Map<String, Integer> forCheck = new HashMap<>();
        for (int j = i; j < i + subSize * wordSize; j += wordSize) {
            String sub = findSubString(s, j);
            if (!map.containsKey(sub)) {
                return false;
            }
            forCheck.put(sub, forCheck.getOrDefault(sub, 0) + 1);
        }
        return map.equals(forCheck);
    }
}
