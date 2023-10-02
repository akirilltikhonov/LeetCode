package easy.q125ValidPalindrome;

class Solution {
    public boolean isPalindrome(String s) {
        Character[] letters = s.chars().mapToObj(i -> (char) i)
                .filter(Character::isLetterOrDigit)
                .map(Character::toLowerCase)
                .toArray(Character[]::new);

        int begin = 0;
        int end = letters.length - 1;
        while (begin < end) {
            if (letters[end].equals(letters[begin])) {
                begin++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
