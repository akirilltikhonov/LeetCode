package medium.searchA2DMatrix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    static Stream<Arguments> searchMatrix() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        return Stream.of(
                Arguments.of(matrix, 1, true)
                , Arguments.of(matrix, 3, true)
                , Arguments.of(matrix, 5, true)
                , Arguments.of(matrix, 7, true)
                , Arguments.of(matrix, 11, true)
                , Arguments.of(matrix, 16, true)
                , Arguments.of(matrix, 23, true)
                , Arguments.of(matrix, 60, true)

                , Arguments.of(matrix, 2, false)
                , Arguments.of(matrix, 9, false)
                , Arguments.of(matrix, 17, false)
                , Arguments.of(matrix, 24, false)
                , Arguments.of(matrix, 61, false)
        );
    }

    @ParameterizedTest
    @MethodSource("searchMatrix")
    void searchMatrix(int[][] matrix, int target, boolean isFound) {
        assertThat(solution.searchMatrix(matrix, target)).isEqualTo(isFound);
    }
}