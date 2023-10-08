package hard.q30SubstringWithConcatenationOfAllWords;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    static Stream<Arguments> findSubstring() {
        return Stream.of(
                Arguments.of("barfoothefoobarman", new String[]{"foo", "bar"}, List.of(0, 9))
                , Arguments.of("wordgoodgoodgoodbestword", new String[]{"word", "good", "best", "word"}, List.of())
                , Arguments.of("barfoofoobarthefoobarman", new String[]{"bar", "foo", "the"}, List.of(6, 9, 12))
                , Arguments.of("wordgoodgoodgoodbestword", new String[]{"word","good","best","good"}, List.of(8))
                , Arguments.of("a", new String[]{"a"}, List.of(0))
        );
    }

    @ParameterizedTest
    @MethodSource("findSubstring")
    void findSubstring(String s, String[] words, List<Integer> subs) {
        assertThat(solution.findSubstring(s, words)).isEqualTo(new ArrayList<>(subs));
    }
}