package baseball.view;

public class Output {
    public void printGameStart() {
        notice("숫자 야구 게임을 시작합니다.");
    }

    public void printRequireBaseballNumber() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    private void notice(String text) {
        System.out.println(text);
    }
}
