package easy.q125ValidPalindrome;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    static Stream<Arguments> isPalindrome() {
        return Stream.of(
                Arguments.of("A man, a plan, a canal: Panama")
                , Arguments.of("a")
                , Arguments.of("aA")
                , Arguments.of("aaA")
        );
    }

    @ParameterizedTest
    @MethodSource("isPalindrome")
    void isPalindrome(String palindrome) {
        assertThat(solution.isPalindrome(palindrome)).isTrue();
    }

    static Stream<Arguments> isNotPalindrome() {
        return Stream.of(
                Arguments.of("AbB")
                , Arguments.of("race a car")
                , Arguments.of("0P")
        );
    }

    @ParameterizedTest
    @MethodSource("isNotPalindrome")
    void isNotPalindrome(String notPalindrome) {
        assertThat(solution.isPalindrome(notPalindrome)).isFalse();
    }
}