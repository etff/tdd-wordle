package wordle.ui;

import wordle.domain.Matching;
import wordle.domain.Word;
import wordle.utils.FileReader;
import wordle.views.InputView;
import wordle.views.OutputView;

import java.util.Collections;
import java.util.List;

public class Game {
    private static final int GAME_END_COUNT = 5;
    private final InputView inputView;
    private final OutputView outputView;

    public Game(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void start() {
        final Word word = new Word(getRandomWord());
        int count = 6;
        outputView.initMessage();
        while (count > 0) {
            final Word compareWord = new Word(inputView.inputCompareWord());
            final List<Matching> match = word.match(compareWord);
            if (checkGameEnd(match)) {
                outputView.printWinner();
                break;
            }
            outputView.printResult(match);
            count--;
        }
    }

    private String getRandomWord() {
        List<String> words = FileReader.readWords();
        Collections.shuffle(words);
        return words.stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }

    private boolean checkGameEnd(List<Matching> matches) {
        long matchCount = matches.stream()
                .filter(it -> it == Matching.GREEN)
                .count();
        return GAME_END_COUNT == matchCount;
    }

}
