package wordle.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

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
}
