package umc.spring.domain.enums;

public enum Gender {
    MALE('M'),
    FEMALE('F');

    private final char status;

    Gender(char status) {
        this.status = status;
    }

    public char getStatus() {
        return status;
    }
}
