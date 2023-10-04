package medium.q3LongestSubstringWithoutRepeatingCharacters;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    static Stream<Arguments> lengthOfLongestSubstring() {
        return Stream.of(
                Arguments.of("abcabcbb", 3)
                , Arguments.of("bbbbb", 1)
                , Arguments.of("pwwkew", 3)
                , Arguments.of("tmmzuxt", 5)
        );
    }

    @ParameterizedTest
    @MethodSource("lengthOfLongestSubstring")
    void lengthOfLongestSubstring(String s, int max) {
        assertThat(solution.lengthOfLongestSubstring(s)).isEqualTo(max);
    }
}