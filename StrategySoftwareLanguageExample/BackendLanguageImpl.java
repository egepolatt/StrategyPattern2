package StrategySoftwareLanguageExample;

public class BackendLanguageImpl implements SoftwareStrategy {
    @Override
    public LanguageType getFirst() {

        return LanguageType.JAVA;
    }

    @Override
    public LanguageType getSecond() {

        return LanguageType.PYTHON;
    }

    @Override
    public LanguageType getThird() {

        return LanguageType.PHP;
    }
}
