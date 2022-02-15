package wordle.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

    public List<Matching> match(Word compareWord) {
        final char[] originalCharacters = this.value.toCharArray();
        final char[] compareCharacters = compareWord.value.toCharArray();
        final int length = originalCharacters.length;
        List<Matching> result = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            char originalCharacter = originalCharacters[i];
            char compareCharacter = compareCharacters[i];
            if (!this.value.contains(String.valueOf(compareCharacter))) {
                result.add(Matching.WHITE);
            }
            if (originalCharacter == compareCharacter) {
                result.add(Matching.GREEN);
            }
        }
        return Collections.unmodifiableList(result);
    }
}
