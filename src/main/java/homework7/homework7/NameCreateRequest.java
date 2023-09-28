package homework7.homework7;

public class NameCreateRequest {
    private String familyName;
    private String middleName;

    public NameCreateRequest(String familyName, String middleName) {
        this.familyName = familyName;
        this.middleName = middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getMiddleName() {
        return middleName;
    }
}


