package wordle.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class WordTest {

    @DisplayName("단어는 5글자로 구성된다.")
    @ParameterizedTest
    @ValueSource(strings = {"apple", "organ", "mouse"})
    void word_with_5_letters(String givenWord) {
        assertThat(new Word(givenWord)).isNotNull();
    }

    @DisplayName("단어가 5글자가 아니면 예외를 던진다.")
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"cow", "dog", "chicken"})
    void word_with_not_5_letters(String givenWord) {

        assertThatThrownBy(() -> {
            new Word(givenWord);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("입력한 단어와 주어진 단어의 영자가 모두 동일하면 모두 초록색 결과를 리턴한다.")
    @Test
    void perfect_match() {
        final String givenWord = "apple";
        final Word word = new Word(givenWord);
        final Word compareWord = new Word(givenWord);

        final List<Matching> actual = word.match(compareWord);

        assertThat(actual).containsExactly(Matching.GREEN, Matching.GREEN, Matching.GREEN, Matching.GREEN, Matching.GREEN);
    }

    @DisplayName("입력한 단어와 주어진 단어의 영자가 일치하는 것이 없으면 흰 결과를 리턴한다.")
    @Test
    void not_match_word() {
        final String givenWord = "apple";
        final String givenCompareWord = "sword";
        final Word word = new Word(givenWord);
        final Word compareWord = new Word(givenCompareWord);

        final List<Matching> actual = word.match(compareWord);

        assertThat(actual).containsExactly(Matching.WHITE, Matching.WHITE, Matching.WHITE, Matching.WHITE, Matching.WHITE);
    }

    @DisplayName("입력한 단어와 주어진 단어의 영자가 동일 위치는 아니지만, 다른 위치에 있으면 노란을 리턴한다.")
    @Test
    void match_different_position_word() {
        final String givenWord = "apple";
        final String givenCompareWord = "korea";
        final Word word = new Word(givenWord);
        final Word compareWord = new Word(givenCompareWord);

        final List<Matching> actual = word.match(compareWord);

        assertThat(actual).containsExactly(Matching.WHITE, Matching.WHITE, Matching.WHITE, Matching.YELLOW, Matching.YELLOW);
    }
}
