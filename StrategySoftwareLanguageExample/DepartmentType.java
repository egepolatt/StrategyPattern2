package StrategySoftwareLanguageExample;

public enum DepartmentType {
    
    MOBILE("M"),
    WEB("W"),
    BACKEND("B"),
    ;

    private String department;

    DepartmentType(String department) {
        this.department = department;
    }
}
