package homeworks.oop.model;

import java.time.LocalDate;
import java.time.Period;

/**
 * DONE - конструктор з всіма параметрами
 * DONE - конструктор з іменами( всі інші параметри приймають значення по замовчуванню
 * DONE - додати функцію яка буде формувати підпис людини
 * формувати маленьку біографію
 */

public class HumanModel {

    private String firstName = "";
    private String secondName = "";
    private LocalDate birthday = LocalDate.of ( 1990 , 01 , 01 );
    //update to birth day (Date) and add function to return age
    private String sex;
    private String nationality;
    private int age;

    public HumanModel(String firstName , String secondName) {

        sex = "undefined";
        nationality = "undefined";
        age = 18;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public HumanModel(String firstName , String secondName ,
                      LocalDate birthday , String sex , String nationality , int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthday = birthday;
        this.sex = sex;
        this.nationality = nationality;
        this.age = age;
    }

    public String signature(String firstName , String secondName) {
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

    public int getAge(LocalDate birthday) {
        LocalDate now = LocalDate.now ();
        int age = Period.between ( getBirthday () , LocalDate.now () ).getYears ();
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
