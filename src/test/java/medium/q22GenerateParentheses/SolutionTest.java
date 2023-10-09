package medium.q22GenerateParentheses;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    static Stream<Arguments> generateParenthesis() {
        return Stream.of(
                Arguments.of(1, List.of("()"))
                , Arguments.of(2, List.of("(())", "()()"))
                , Arguments.of(3, List.of("((()))", "(()())", "(())()", "()(())", "()()()"))
        );
    }

    @ParameterizedTest
    @MethodSource("generateParenthesis")
    void generateParenthesis(int n, List<String> res) {
        assertThat(solution.generateParenthesis(n)).isEqualTo(res);
    }
}