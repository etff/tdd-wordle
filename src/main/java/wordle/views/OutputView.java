package wordle.views;

import wordle.domain.Matching;

import java.util.List;

public class OutputView {

    public void printResult(List<Matching> matches) {
        for (Matching matching : matches) {
            System.out.print(matching.getValue());
        }
        System.out.println(System.lineSeparator());
    }

    public void initMessage() {
        System.out.println("WORDLE을 6번 만에 맞춰 보세요.");
        System.out.println("시도의 결과는 타일의 색 변화로 나타납니다.");
    }

    public void printWinner() {
        System.out.println("축하합니다! 모든 단어를 맞췄습니다.");
    }
}
