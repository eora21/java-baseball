package baseball.view;

public class Output {
    public void printGameStart() {
        print("숫자 야구 게임을 시작합니다.");
    }

    public void printRequireBaseballNumber() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    private void print(String text) {
        System.out.println(text);
    }
}
