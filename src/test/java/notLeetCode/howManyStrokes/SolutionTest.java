package notLeetCode.howManyStrokes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution2 = new Solution();

    @Test
    void solution() {
        assertThat(solution2.solution(new int[]{1, 3, 2, 1, 2, 1, 5, 3, 3, 4, 2})).isEqualTo(9);
    }
}