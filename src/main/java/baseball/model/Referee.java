package baseball.model;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class Referee {
    Map<PlayRule, Integer> result;

    public Map<PlayRule, Integer> judge(BaseballNumber randomBaseballNumber, BaseballNumber userBaseballNumber) {
        result = new EnumMap<>(PlayRule.class);
        calculateResult(randomBaseballNumber.getNumbers(), userBaseballNumber.getNumbers());
        return result;
    }

    private void calculateResult(List<Integer> target, List<Integer> userPick) {
        for (int idx = 0; idx < userPick.size(); idx++) {
            Integer userPickNumber = userPick.get(idx);
            checkCorrect(target, idx, userPickNumber);
        }
    }

    private void checkCorrect(List<Integer> target, int idx, Integer userPickNumber) {
        if (target.get(idx).equals(userPickNumber)) {
            increaseCount(PlayRule.STRIKE);
            return;
        }

        if (target.contains(userPickNumber)) {
            increaseCount(PlayRule.BALL);
        }
    }

    private void increaseCount(PlayRule playRule) {
        result.put(playRule, result.get(playRule));
    }
}
