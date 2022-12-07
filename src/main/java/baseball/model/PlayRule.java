package baseball.model;

public enum PlayRule {
    STRIKE("스트라이크"),
    BALL("볼"),
    NOTHING("낫싱");

    private final String description;

    PlayRule(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
