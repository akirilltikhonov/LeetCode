package medium.maximumNumberOfEventsThatCanBeAttended;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    static Stream<Arguments> maxEvents() {
        return Stream.of(
                Arguments.of(new int[][]{{2, 3}, {1, 2}}, 2)
                , Arguments.of(new int[][]{{2, 3}, {1, 3}}, 2)
                , Arguments.of(new int[][]{{1, 10}, {2, 2}, {2, 2}, {2, 2}, {2, 2}}, 2)
                , Arguments.of(new int[][]{{2, 2}, {1, 3}, {1, 3}}, 3)
                , Arguments.of(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 2}}, 4)
                , Arguments.of(new int[][]{{1, 4}, {4, 4}, {2, 2}, {3, 4}, {1, 1}}, 4)
                , Arguments.of(new int[][]{{1, 5}, {1, 5}, {1, 5}, {2, 3}, {2, 3}}, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("maxEvents")
    void searchMatrix(int[][] matrix, int maxEvents) {
        assertThat(solution.maxEvents(matrix)).isEqualTo(maxEvents);
    }
}