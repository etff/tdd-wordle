package wordle.views;

import java.util.Scanner;

public class InputView {
    private Scanner scanner = new Scanner(System.in);

    public String inputCompareWord() {
        return scanner.nextLine();
    }
}
