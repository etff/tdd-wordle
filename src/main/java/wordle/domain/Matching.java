package wordle.domain;

public enum Matching {
    WHITE("⬜"), GREEN("\uD83D\uDFE9"), YELLOW("\uD83D\uDFE8");

    private String value;

    Matching(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
