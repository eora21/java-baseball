package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class BaseballNumber {
    private final List<Integer> baseballNumber;

    private BaseballNumber(List<Integer> numbers) {
        baseballNumber = numbers;
    }

    public static BaseballNumber createRandomPick() {
        List<Integer> numbers = new ArrayList<>();
        addUniqueNumber(numbers);
        return new BaseballNumber(numbers);
    }

    public static BaseballNumber createUserPick(List<Integer> numbers) {
        validUnique(numbers);
        validRange(numbers);
        return new BaseballNumber(numbers);
    }

    public List<Integer> getNumbers() {
        return Collections.unmodifiableList(baseballNumber);
    }

    private static void addUniqueNumber(List<Integer> numbers) {
        while (numbers.size() < NumberRule.LENGTH.getValue()) {
            int randomNumber = Randoms.pickNumberInRange(NumberRule.START.getValue(), NumberRule.END.getValue());

            if (!numbers.contains(randomNumber)) {
                numbers.add(randomNumber);
            }
        }
    }

    private static void validUnique(List<Integer> numbers) {
        if (new HashSet<>(numbers).size() != NumberRule.LENGTH.getValue()) {
            throw new IllegalArgumentException("서로 다른 수로 이루어지지 않았습니다.");
        }
    }

    private static void validRange(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number < NumberRule.START.getValue() || NumberRule.END.getValue() < number) {
                throw new IllegalArgumentException(
                        String.format("%d와 %d의 사이값을 입력해 주세요",
                                NumberRule.START.getValue(), NumberRule.END.getValue()));
            }
        }
    }
}
