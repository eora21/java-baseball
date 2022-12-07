package baseball.controller;

import baseball.model.BaseballNumber;
import baseball.model.NumberRule;
import baseball.model.PlayRule;
import baseball.model.Referee;
import baseball.view.Input;
import baseball.view.Output;

import java.util.Map;

public class NumberBaseballController {

    private final int DEFAULT_VALUE = 0;

    private final Input input = new Input();

    private final Output output = new Output();

    private final Referee referee = new Referee();

    public void gameStart() {
        output.gameStart();

        do {
            playGame(BaseballNumber.createRandomPick());
            output.gameOver();
        } while (isContinue());
    }

    private void playGame(BaseballNumber randomBaseballNumber) {
        do {
            output.requireBaseballNumber();
            BaseballNumber userBaseballNumber = BaseballNumber.createUserPick(input.baseballNumber());
            Map<PlayRule, Integer> result = referee.judge(randomBaseballNumber, userBaseballNumber);
            output.gameResult(result);

        } while (!referee.isPerfect());
    }

    private boolean isContinue() {
        return true;
    }
}
