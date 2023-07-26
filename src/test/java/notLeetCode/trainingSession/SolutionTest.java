package notLeetCode.trainingSession;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution3 = new Solution();

    @Test
    void solution() {
        assertThat(solution3.solution(new String[]{"039", "4", "14", "32", "", "34", "7"})).isEqualTo(5);
        assertThat(solution3.solution(new String[]{"801234567", "180234567", "0", "189234567", "891234567", "98", "9"})).isEqualTo(7);
        assertThat(solution3.solution(new String[]{"5421", "245", "1452", "0345", "53", "354"})).isEqualTo(6);
    }
}