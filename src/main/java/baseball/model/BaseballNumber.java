package baseball.model;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class BaseballNumber {
    private final List<Integer> baseballNumber;

    public BaseballNumber(List<Integer> numbers) {
        validUnique(numbers);
        validRange(numbers);
        baseballNumber = numbers;
    }

    private void validUnique(List<Integer> numbers) {
        if (new HashSet<>(numbers).size() != NumberRule.LENGTH.getValue()) {
            throw new IllegalArgumentException("서로 다른 수로 이루어지지 않았습니다.");
        }
    }

    private void validRange(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number < NumberRule.START.getValue() || NumberRule.END.getValue() < number) {
                throw new IllegalArgumentException(
                        String.format("%d와 %d의 사이값을 입력해 주세요",
                                NumberRule.START.getValue(), NumberRule.END.getValue()));
            }
        }
    }

    public List<Integer> getNumbers() {
        return Collections.unmodifiableList(baseballNumber);
    }
}
