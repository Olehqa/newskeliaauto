package homeworks.fivesection.inheritance;

/*
 * AbstractHuman
 *
 * 12.06.2020
 */

public abstract class AbstractHuman {

    private String firstName;
    private String lastName;
    private String nativeLanguage;

    public AbstractHuman() {
    }

    public AbstractHuman(String firstName , String secondName) {
        this.firstName = firstName;
        this.lastName = secondName;
    }

    public AbstractHuman(String firstName , String secondName , String nativeLanguage) {
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