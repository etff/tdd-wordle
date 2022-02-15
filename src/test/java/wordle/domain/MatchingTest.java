package wordle.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MatchingTest {

    @DisplayName("비교는 흰, 노란, 초록으로 구성된다")
    @Test
    void contains() {
        assertThat(Matching.values())
                .containsExactly(Matching.WHITE, Matching.GREEN, Matching.YELLOW);
    }
}
