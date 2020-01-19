package homeworks.oop.model;

import java.time.*;

/**
 * DONE - конструктор з всіма параметрами
 * DONE - конструктор з іменами( всі інші параметри приймають значення по замовчуванню
 * DONE - додати функцію яка буде формувати підпис людини
 * - формувати маленьку біографію стрінгами
 */

public class HumanModel {
    enum Sex {MAN, WOMAN}


    //TODO:default value should be here in init and declaration of variable
    private final String firstName;
    private final String lastName;
    private final LocalDate birthday;
    //TODO:update to birth day (Date) and add function to return age
    private final Sex sex ; //TODO:update to enum
    private final String nationality;
    private final String city;





    HumanModel(final HumanBuilder humanBuilder) {
        this.firstName = humanBuilder.getFirstName ();
        this.lastName = humanBuilder.getLastName ();
        this.birthday = humanBuilder.getBirthday ();
        this.sex = humanBuilder.getSex ();
        this.nationality = humanBuilder.getNationality ();
        this.city = humanBuilder.getCity ();
    }





//    public void bio(String firstName , String secondName , LocalDate birthday , String nationality ,
//                    String city) {
//
//        System.out.println ( "Mr/Mrs " + firstName + secondName + " is born as " + nationality + " in " +
//                city + " in " + birthday ); //TODO:update to StringFormat
//    }


    //TODO: functions order, first geters seters
//    public String signature() { // TODO: Use String methods
//        String signatureOfHuman = null;
//        if (firstName == null && lastName == null) {
//            System.out.println ( "Name is empty" );
//        } else {
//            signatureOfHuman = firstName.charAt ( 0 ) + "." + lastName;
//        }
//        return signatureOfHuman;
//    }


}
