package wordle;

import wordle.ui.Game;
import wordle.views.InputView;
import wordle.views.OutputView;

public class Application {
    public static void main(String[] args) {
        Game game = new Game(new InputView(), new OutputView());
        game.start();
    }
}
