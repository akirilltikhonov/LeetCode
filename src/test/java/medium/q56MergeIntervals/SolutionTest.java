package medium.q56MergeIntervals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    static Stream<Arguments> merge() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}, new int[][]{{1, 6}, {8, 10}, {15, 18}})
                , Arguments.of(new int[][]{{1, 4}, {4, 5}}, new int[][]{{1, 5}})
                , Arguments.of(new int[][]{{1, 4}, {0, 4}}, new int[][]{{0, 4}})
                , Arguments.of(new int[][]{{1, 4}, {2, 3}}, new int[][]{{1, 4}})
        );
    }

    @ParameterizedTest
    @MethodSource("merge")
    void merge(int[][] intervals, int[][] merged) {
        assertThat(solution.merge(intervals)).isEqualTo(merged);
    }
}