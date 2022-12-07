package baseball.model;

public enum PlayRule {
    BALL("볼"),
    STRIKE("스트라이크"),
    NOTHING("낫싱");

    private final String description;

    PlayRule(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
