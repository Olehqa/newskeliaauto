package homeworks.fivesection.inheritance;


public abstract class AbstractHuman {
    String firstName;
    String lastName;
    String nativeLanguage;

    AbstractHuman() {
    }

    AbstractHuman(String firstName, String secondName) {
        this.firstName = firstName;
        this.lastName = secondName;
    }

    public AbstractHuman(String firstName, String secondName, String nativeLanguage) {
        this.firstName = firstName;
        this.lastName = secondName;
        this.nativeLanguage = nativeLanguage;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNativeLanguage() {
        return nativeLanguage;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNativeLanguage(String nativeLanguage) {
        this.nativeLanguage = nativeLanguage;
    }

    public abstract String getBio();
}