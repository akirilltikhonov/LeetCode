package medium.q71SimplifyPath;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    static Stream<Arguments> simplifyPath() {
        return Stream.of(
                Arguments.of("/home/", "/home")
                , Arguments.of("/../", "/")
                , Arguments.of("/home//foo/", "/home/foo")
                , Arguments.of("/home/foo/../", "/home")
        );
    }

    @ParameterizedTest
    @MethodSource("simplifyPath")
    void simplifyPath(String path, String simplifiedPath) {
        assertThat(solution.simplifyPath(path)).isEqualTo(simplifiedPath);
    }
}