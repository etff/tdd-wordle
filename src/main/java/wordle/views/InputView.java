package wordle.views;

import java.util.Scanner;

public class InputView {
    private Scanner scanner = new Scanner(System.in);

    public String inputCompareWord() {
        System.out.println("비교할 단어를 입력하세요");
        return scanner.nextLine();
    }
}
