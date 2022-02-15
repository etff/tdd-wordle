package wordle.ui;

import wordle.domain.Matching;
import wordle.domain.Word;
import wordle.views.InputView;
import wordle.views.OutputView;

import java.util.List;

public class Game {
    private final InputView inputView;
    private final OutputView outputView;

    public Game(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void start() {
        final Word word = new Word("apple");
        final Word compareWord = new Word(inputView.inputCompareWord());

        final List<Matching> match = word.match(compareWord);
        outputView.printResult(match);
    }
}
