package Response;

public class NameResponse {
    private String givenName;
    private String middleName;
    private String familyName;
    private Integer age;

    public String getGivenName() {
        return givenName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public Integer getAge() {
        return age;
    }

    public NameResponse(String givenName, String middleName, String familyName, Integer age) {
        this.givenName = givenName;
        this.middleName = middleName;
        this.familyName = familyName;
        this.age = age;
    }
}
