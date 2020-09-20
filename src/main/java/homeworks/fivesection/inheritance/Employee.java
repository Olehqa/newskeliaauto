package homeworks.fivesection.inheritance;

import java.util.Objects;

public class Employee extends AbstractHuman {
    private String profession;
    private double salary;

    public Employee() {
        super();
    }

    Employee(String firstName, String secondName, String profession) {
        super(firstName, secondName);
        this.profession = profession;
    }

    public Employee(String firstName, String secondName, String profession, double salary) {
        super(firstName, secondName);
        this.profession = profession;
        this.salary = salary;
    }

    private String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    private double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getFirstName() {

        //additional validation
        return super.getFirstName();
    }

    @Override
    public String getLastName() {

        //additional validation
        return super.getLastName();
    }

    @Override
    public void setNativeLanguage(String nativeLanguage) {
        super.setNativeLanguage(nativeLanguage);
    }

    @Override
    public String getBio() {
        return String.format("The bio of employee should not be so long for %s, %s", getFirstName(), getLastName());
    }

    public boolean equals(Object otherEmployee) {

        if (this == otherEmployee) {
            return true;
        }

        if (otherEmployee == null) {
            return false;
        }

        if (getClass() != otherEmployee.getClass()) {
            return false;
        }

        Employee other = (Employee) otherEmployee;
        return getFirstName().equals(other.getFirstName()) && getLastName().equals(other.getFirstName())
                && getProfession().equals(other.getProfession()) && getSalary() == (other.getSalary());
    }
}
