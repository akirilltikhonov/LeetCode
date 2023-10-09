package easy.q20ValidParentheses;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    private static Stream<Arguments> isValid() {
        return Stream.of(
                Arguments.of("()", true)
                , Arguments.of("()[]{}", true)
                , Arguments.of("[](){}", true)
                , Arguments.of("[](){}", true)
                , Arguments.of("(]", false)
                , Arguments.of(")()", false)
        );
    }

    @ParameterizedTest
    @MethodSource("isValid")
    void isValid(String s, boolean isValid) {
        assertThat(solution.isValid(s)).isEqualTo(isValid);
    }
}