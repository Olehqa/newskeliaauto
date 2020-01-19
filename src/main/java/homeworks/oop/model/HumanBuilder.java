package homeworks.oop.model;

import java.time.LocalDate;

public class HumanBuilder {

    public HumanBuilder(HumanBuilder humanBuilder) {
    }

    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private HumanModel.Sex sex;
    private String nationality;
    private String city;

    public HumanBuilder firstName(final String firstName) {
        this.firstName = firstName;
        return this;
    }

    public HumanBuilder lastName(final String lastName) {
        this.lastName =lastName;
        return this;
    }

    public HumanBuilder birthday( final LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }

    public HumanBuilder sex(final HumanModel.Sex sex) {
        this.sex = sex;
        return this;
    }

    public HumanBuilder nationality(final String nationality) {
        this.nationality = nationality;
        return this;
    }

    public HumanBuilder city (final String city) {
        this.city = city;
        return this;
    }

       public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public HumanModel.Sex getSex(){
        return sex;
    }

    public String getNationality() {
        return nationality;
    }

    public String getCity() {
        return city;

    }

    public HumanModel build(){
        return new HumanModel ( this );

    }

}
