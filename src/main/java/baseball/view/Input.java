package baseball.view;

import baseball.model.NumberRule;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class Input {
    public List<Integer> baseballNumber() {
        String input = Console.readLine();
        return validBaseballNumber(input);
    }

    public int wantMoreGame() {
        String input = Console.readLine();
        return validNumber(input);
    }

    private List<Integer> validBaseballNumber(String input) {
        List<Integer> baseballNumberList = new ArrayList<>();

        validLength(input);

        for (String number : input.split("")) {
            baseballNumberList.add(validNumber(number));
        }

        return baseballNumberList;
    }

    private void validLength(String baseballNumber) {
        if (NumberRule.LENGTH.getValue() != baseballNumber.length()) {
            throw new IllegalArgumentException(
                    String.format("%d자리의 값을 입력해주세요.", NumberRule.LENGTH.getValue()));
        }
    }

    private int validNumber(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자로 변환할 수 없는 값입니다.");
        }
    }
}
