package baseball.model;

public enum ContinueType {
    CONTINUE(1),
    QUIT(2);

    private final int inputValue;

    ContinueType(int inputValue) {
        this.inputValue = inputValue;
    }

    public int getInputValue() {
        return inputValue;
    }
}
