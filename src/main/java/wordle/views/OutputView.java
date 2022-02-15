package wordle.views;

import wordle.domain.Matching;

import java.util.List;

public class OutputView {

    public void printResult(List<Matching> matches) {
        for (Matching matching : matches) {
            System.out.print(matching.getValue());
        }
    }
}
