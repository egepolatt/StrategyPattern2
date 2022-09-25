package StrategySoftwareLanguageExample;

public class WebLanguageImpl implements SoftwareStrategy {
    @Override
    public LanguageType getFirst() {

        return LanguageType.HTML;
    }

    @Override
    public LanguageType getSecond() {

        return LanguageType.CSS;
    }

    @Override
    public LanguageType getThird() {

        return LanguageType.JAVASCRIPT;
    }
}
