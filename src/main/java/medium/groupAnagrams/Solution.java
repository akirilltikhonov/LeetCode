package medium.groupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> dict = new HashMap<>();
        for (String word : strs) {
            String sortWord = findKeyAsSortedChars(word);
            if (!dict.containsKey(sortWord)) {
                dict.put(sortWord, new ArrayList<>(List.of(word)));
            } else {
                dict.get(sortWord).add(word);
            }
        }
        return new ArrayList<>(dict.values());
    }

    private String findKeyAsSortedChars(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return Arrays.toString(chars);
    }
}