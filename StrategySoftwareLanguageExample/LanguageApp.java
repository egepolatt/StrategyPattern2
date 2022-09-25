package StrategySoftwareLanguageExample;

public class LanguageApp {

    public static void main(String[] args) {

        developerLanguageList(DepartmentType.BACKEND);
        developerLanguageList(DepartmentType.MOBILE);
        developerLanguageList(DepartmentType.WEB);

    }
    private static void developerLanguageList(DepartmentType department) {
        Developer developer = new Developer(department);
        String developerLanguage = developer.getDeveloperLanguage();
        System.out.println(developerLanguage);
    }
}
