package wordle.domain;

public class Word {
    private String answer;

    public Word(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }
}
