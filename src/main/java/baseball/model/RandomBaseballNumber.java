package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RandomBaseballNumber {
    private final BaseballNumber baseballNumber;

    public RandomBaseballNumber() {
        this.baseballNumber = new BaseballNumber(createRandomBaseballNumber());
    }

    private List<Integer> createRandomBaseballNumber() {
        List<Integer> numbers = new ArrayList<>();

        while (numbers.size() < NumberRule.LENGTH.getValue()) {
            int randomNumber = Randoms.pickNumberInRange(NumberRule.START.getValue(), NumberRule.END.getValue());
            addUniqueNumber(numbers, randomNumber);
        }

        return numbers;
    }

    private void addUniqueNumber(List<Integer> numbers, int randomNumber) {
        if (!numbers.contains(randomNumber)) {
            numbers.add(randomNumber);
        }
    }
}
