package StrategySoftwareLanguageExample;

public class MobileLanguageImpl implements SoftwareStrategy {
    @Override
    public LanguageType getFirst() {

        return LanguageType.OBJECTIVEC;
    }

    @Override
    public LanguageType getSecond() {

        return LanguageType.SWIFT;
    }

    @Override
    public LanguageType getThird() {

        return LanguageType.KOTLIN;
    }

}
