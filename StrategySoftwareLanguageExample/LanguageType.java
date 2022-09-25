package StrategySoftwareLanguageExample;

public enum LanguageType {

    HTML("H"),

    CSS("C"),

    JAVA("J"),

    JAVASCRIPT("JS"),

    PYTHON("PY"),

    PHP("P"),

    SWIFT("S"),

    OBJECTIVEC("O"),

    KOTLIN("K");

    private String language;

    LanguageType(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return language;
    }
}
