package baseball.model;

public enum ContinueType {
    CONTINUE(1, true),
    QUIT(2, false);

    private final int inputValue;

    private final boolean isWantMore;

    ContinueType(int inputValue, boolean isWantMore) {
        this.inputValue = inputValue;
        this.isWantMore = isWantMore;
    }

    public int getInputValue() {
        return inputValue;
    }

    public boolean isWantMore() {
        return isWantMore;
    }
}
