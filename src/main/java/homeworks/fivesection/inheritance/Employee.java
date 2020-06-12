package homeworks.fivesection.inheritance;

public class Employee extends AbstractHuman {

    private String profession;
    private double salary;

    public Employee() {
        super ();
    }

    public Employee(String firstName , String secondName , String profession) {
        super ( firstName , secondName );
        this.profession = profession;
    }

    public Employee(String firstName , String secondName , String profession , double salary) {
        super ( firstName , secondName );
        this.profession = profession;
        this.salary = salary;
    }

    @Override
    public String getFirstName() {
        return super.getFirstName ();
    }

    @Override
    public String getLastName() {
        return super.getLastName ();
    }

    @Override
    public void setFirstName(String firstName) {
        super.setLastName ( firstName );
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName ( lastName );
    }

    @Override
    public void setNativeLanguage(String nativeLanguage) {
        super.setNativeLanguage ( nativeLanguage );
    }

    @Override
    public String getBio() {
        return String.format ( "The bio of employee should not be so long for %s, %s" , getFirstName () , getLastName () );
    }
}
