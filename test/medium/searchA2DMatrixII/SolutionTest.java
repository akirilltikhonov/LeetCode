package medium.searchA2DMatrixII;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    static Stream<Arguments> searchMatrix() {
        int[][] matrix1 = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        return Stream.of(
                Arguments.of(matrix1, 1, true)
                , Arguments.of(matrix1, 4, true)
                , Arguments.of(matrix1, 5, true)
                , Arguments.of(matrix1, 2, true)
                , Arguments.of(matrix1, 12, true)
                , Arguments.of(matrix1, 10, true)
                , Arguments.of(matrix1, 23, true)
                , Arguments.of(matrix1, 30, true)

                , Arguments.of(matrix1, 20, false)
                , Arguments.of(matrix1, 25, false)
                , Arguments.of(matrix1, 27, false)
                , Arguments.of(matrix1, 28, false)
                , Arguments.of(matrix1, 29, false)
                , Arguments.of(matrix1, 31, false)
        );
    }

    @ParameterizedTest
    @MethodSource("searchMatrix")
    void searchMatrix(int[][] matrix, int target, boolean isFound) {
        assertThat(solution.searchMatrix(matrix, target)).isEqualTo(isFound);
    }
}