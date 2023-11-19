package umc.spring.domain.enums;

public enum Gender {
    MALE('M'),
    FEMALE('F');

    private final char genderMark;

    Gender(char genderMark) {
        this.genderMark = genderMark;
    }

    public char getGenderMark() {
        return genderMark;
    }
}
