package StrategySoftwareLanguageExample;

public class Developer {

    private DepartmentType department;
    private SoftwareStrategy softwareStrategy;

    public Developer(DepartmentType department) {
        this.department = department;

        switch (department){
            case WEB:
                softwareStrategy = new WebLanguageImpl();
                break;
            case MOBILE:
                softwareStrategy = new MobileLanguageImpl();
                break;
            case BACKEND:
                softwareStrategy = new BackendLanguageImpl();
                break;

            default:
                break;
        }
    }

    public String getDeveloperLanguage() {
        System.out.println("Developers of " + department + ":");

        String list = softwareStrategy.getFirst() + "\n" + softwareStrategy.getSecond() +"\n" + softwareStrategy.getThird();


        return list;
    }

}
