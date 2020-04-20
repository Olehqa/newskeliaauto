package homeworks.oop.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


/**
 * // * DONE (builder ) - конструктор з всіма параметрами
 * // * DONE (builder) - конструктор з іменами( всі інші параметри приймають значення по замовчуванню
 * DONE - додати функцію яка буде формувати підпис людини
 * DONE- формувати маленьку біографію стрінгами
 */

public class HumanModel {
    //TODO: default value should be here in init and declaration of variable
    private String firstName; // забрати файнал - done
    private String lastName;

    //TODO: update to birth day (Date) and add function to return age -- DONE
    // TODO:update Sex to enum --- DONE
    private LocalDate birthday;
    private Sex sex;
    private String nationality;
    private String city;

    public HumanModel() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    //TODO: functions order, first geters seters - DONE
    // TODO: Use String methods -- DONE
    public String signature() {

        String signatureOfHuman = null;

        if ((firstName == null || lastName == null) || (firstName.isEmpty () || lastName.isEmpty ())) {
            System.out.println ( "Name is empty or too short" );
        } else {
            signatureOfHuman = firstName.substring ( firstName.indexOf ( 0 ) , lastName.indexOf ( 7 ) );
        }

        return signatureOfHuman;

    }

   /**__________________________________________________________________________ */

    private int age() { //TODO:  full years count  ---
        return (int) ChronoUnit.YEARS.between ( birthday , LocalDate.now () );
    }



    //TODO:update to StringFormat  -- DONE
    public String bio() {     // do not path parameters -done

        return "Mr/Mrs " + firstName + lastName + " is born as " + nationality + " in " +
                city + " in " + age (); // return with out string - done
    }


    public class Builder {       // with out extend - done

        private String firstName;
        private String lastName;
        private LocalDate birthday;
        private Sex sex = Sex.undefined;
        private String nationality = "undefined";
        private String city = "undefined";

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder birthday(LocalDate birthday) {
            this.birthday = birthday;
            return this;
        }

        public Builder sex(Sex sex) {
            this.sex = sex;
            return this;
        }

        public Builder nationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public HumanModel build() {
            return new HumanModel ( this );
        }
    }

    HumanModel(Builder builder) {
        firstName = builder.firstName;
        lastName = builder.firstName;
        birthday = builder.birthday;
        sex = builder.sex;
        nationality = builder.nationality;
        city = builder.city;
    }
}








