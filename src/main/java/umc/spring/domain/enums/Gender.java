package umc.spring.domain.enums;

public enum Gender {
    MALE("M"),
    FEMALE("F");

    private final String genderMark;

    Gender(String genderMark) {
        this.genderMark = genderMark;
    }

    public String getGenderMark() {
        return genderMark;
    }
}
