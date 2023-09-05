package easy.intersectionfTwoArraysII;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    static Stream<Arguments> intersection() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 2, 1}, new int[]{2, 2}, new int[]{2, 2})
                , Arguments.of(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}, new int[]{9, 4})
        );
    }

    @ParameterizedTest
    @MethodSource("intersection")
    void intersection(int[] nums1, int[] nums2, int[] res) {
        assertThat(solution.intersection(nums1, nums2))
                .isEqualTo(res);
    }
}