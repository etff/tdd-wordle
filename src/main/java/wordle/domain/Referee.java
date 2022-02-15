package wordle.domain;

public class Referee {
    private final Word answer;
    private final Word user;
    private int white;
    private int green;

    public Referee(Word answer, Word user) {
        this.answer = answer;
        this.user = user;
        white = 1;
    }

    public int getWhite() {
        return white;
    }

    public int getGreen() {
        answer.getAnswer().toCharArray()

        return green;
    }
}
