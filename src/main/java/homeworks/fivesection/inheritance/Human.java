package homeworks.fivesection.inheritance;

public abstract class Human {
    public abstract String getBio();

    private String firstName;
    private String secondName;
    private String nativeLanguage;

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getNativeLanguage() {
        return nativeLanguage;
    }


}