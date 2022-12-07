package baseball.model;

public enum NumberRule {
    LENGTH(3),
    START(1),
    END(9);

    private final int value;

    NumberRule(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
