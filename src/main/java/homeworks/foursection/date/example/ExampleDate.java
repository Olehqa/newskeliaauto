package homeworks.foursection.date.example;

import java.time.LocalDate;
import java.util.Date;

import org.joda.time.DateTime;

public class ExampleDate {

    private int age(Date dateOfBirth) { //TODO:  full years count  ---

        Date now = new Date ();
        System.out.println ( "in method: " + now.getMonth () );
        if (now.getMonth () + 1 >= dateOfBirth.getMonth () && now.getDate () >= dateOfBirth.getDate ()) {
            return now.getYear () - dateOfBirth.getYear () + 1900;
        }
        return now.getYear () - dateOfBirth.getYear () + 1900 - 1;
    }

    public static void main(String[] args) {

//        Date dateOfBirth1 = new Date ( 1990 , 4 , 17 );
//        ExampleDate ex = new ExampleDate ();
//        System.out.println ( ex.age ( dateOfBirth1 ) );
//        DateTime scheduleDate;
        DateTime now = DateTime.now ();
        System.out.println ( "current date: " + now + " formated: " + now.getYear () + "-" + now.getDayOfMonth () + "-" + now.getDayOfMonth () );
    }
}
