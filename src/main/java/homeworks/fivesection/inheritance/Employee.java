package homeworks.fivesection.inheritance;

public class Employee extends Human {

    private String firstName;
    private String secondName;
    private String profession;
    private double salary;

    public Employee() {
    }

    public Employee(String firstName , String secondName , String profession) {
    }


    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getSecondName() {
        return secondName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getBio() {

        return String.format ( "The bio should not so long for \n , \n" , getFirstName () , getSecondName () );
    }
}
