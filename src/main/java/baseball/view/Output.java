package baseball.view;

import baseball.model.ContinueType;
import baseball.model.NumberRule;
import baseball.model.PlayRule;

import java.util.Map;
import java.util.StringJoiner;

public class Output {
    public void gameStart() {
        notice("숫자 야구 게임을 시작합니다.");
    }

    public void requireBaseballNumber() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    private void notice(String text) {
        System.out.println(text);
    }

    public void gameResult(Map<PlayRule, Integer> result) {
        StringJoiner stringJoiner = new StringJoiner(" ");

        result.forEach((playRule, count) -> {
            stringJoiner.add(String.format("%d%s", count, playRule.getDescription()));
        });

        notice(stringJoiner.toString());
    }

    public void gameOver() {
        notice(String.format("%d개의 숫자를 모두 맞히셨습니다! 게임 종료", NumberRule.LENGTH.getValue()));
    }

    public void wantMore() {
        notice(String.format("게임을 새로 시작하려면 %d, 종료하려면 %d를 입력하세요.",
                ContinueType.CONTINUE.getInputValue(), ContinueType.QUIT.getInputValue()));
    }
}
