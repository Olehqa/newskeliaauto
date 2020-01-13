package homeworks.oop.model;

import java.time.*;

/**
 * DONE - конструктор з всіма параметрами
 * DONE - конструктор з іменами( всі інші параметри приймають значення по замовчуванню
 * DONE - додати функцію яка буде формувати підпис людини
 * DONE - формувати маленьку біографію
 */

public class HumanModel {
    //TODO:default value should be here in init and declaration of variable
    private String firstName = "";
    private String secondName = "";
    private LocalDate birthday = LocalDate.of ( 1990 , 01 , 01 );
    //TODO:update to birth day (Date) and add function to return age
    private String sex;//TODO:update to enum
    private String nationality;
    private String city;


    public void bio(String firstName , String secondName , LocalDate birthday , String sex , String nationality ,
                    String city) {

        System.out.println ( "Mr/Mrs " + firstName + secondName + " is born as " + nationality + " in " +
                city + " in " + birthday ); //TODO:update to StringFormat
    }

    public HumanModel(String firstName , String secondName) {

        sex = "undefined";
        nationality = "undefined";
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public HumanModel(String firstName , String secondName ,
                      int year , int month , int day , String sex , String nationality) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthday = LocalDate.of ( year , month , day );
        this.sex = sex;
        this.nationality = nationality;
    }

    //TODO: functions order, first geters seters
    public String signature() {
        String signatureOfHuman = null;
        if (firstName == null && secondName == null) {
            System.out.println ( "Name is empty" );
        } else {
            signatureOfHuman = firstName.charAt ( 0 ) + "." + secondName;
        }
        return signatureOfHuman;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return Period.between ( birthday , LocalDate.now () ).getYears ();
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
