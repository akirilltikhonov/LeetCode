package easy.maximumNumberOfWordsYouCanType;

import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> set = brokenLetters.chars()
                .mapToObj(ch -> (char) ch).collect(Collectors.toSet());

        String[] strings = text.split(" ");
        int amount = strings.length;
        for (String string : strings) {
            for (int j = 0; j < string.length(); j++) {
                if (set.contains(string.charAt(j))) {
                    amount--;
                    break;
                }
            }
        }
        return amount;
    }
}
