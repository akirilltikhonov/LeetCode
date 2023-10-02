package medium.q80RemoveDuplicatesFromSortedArrayII;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    static Stream<Arguments> removeDuplicates() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 1, 2, 2, 3}, new int[]{1, 1, 2, 2, 3})
                , Arguments.of(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 3, 3})
                , Arguments.of(new int[]{1, 1, 1, 2}, new int[]{1, 1, 2})
                , Arguments.of(new int[]{1, 2, 2, 2}, new int[]{1, 2, 2})
                , Arguments.of(new int[]{1, 2, 2, 2, 3}, new int[]{1, 2, 2, 3})
                , Arguments.of(new int[]{1, 1, 1, 2, 2, 3}, new int[]{1, 1, 2, 2, 3})
                , Arguments.of(new int[]{1, 1}, new int[]{1, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("removeDuplicates")
    void removeDuplicates(int[] nums, int[] changedNums) {
        assertThat(solution.removeDuplicates(nums)).isEqualTo(changedNums.length);

        int[] dst = Arrays.copyOfRange(nums, 0, changedNums.length);
        assertThat(dst).isEqualTo(changedNums);
    }
}