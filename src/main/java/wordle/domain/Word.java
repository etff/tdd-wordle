package wordle.domain;

import java.util.Objects;

public class Word {
    private static final String EMPTY_NOT_ALLOWED = "빈값이 입력될 수 없습니다.";
    private static final String WORD_LENGTH_REQUIRED = "단어는 5글자여야합니다.";
    private static final int WORD_LENGTH = 5;
    private final String value;
    public Word(String value) {
        validate(value);
        this.value = value;
    }

    private void validate(String value) {
        if (Objects.isNull(value) || value.isBlank()) {
            throw new IllegalArgumentException(EMPTY_NOT_ALLOWED);
        }
        if (value.length() != WORD_LENGTH) {
            throw new IllegalArgumentException(EMPTY_NOT_ALLOWED);
        }
    }
}
