package homeworks.foursection.date.example;

import java.time.LocalDate;
import java.util.Date;

import org.joda.time.DateTime;

public class ExampleDate {

    private static int age(Date dateOfBirth) { //TODO:  full years count  ---
        int yearStartCount = 1900;

        Date now = new Date ();
//        System.out.println ( "in method: " + now.getMonth () );
        if (now.getMonth () + 1 >= dateOfBirth.getMonth () && now.getDate () >= dateOfBirth.getDate ()) {
            return now.getYear () - dateOfBirth.getYear () + yearStartCount;
        }
        return now.getYear () - dateOfBirth.getYear () + yearStartCount - 1;
    }

    public static void main(String[] args) {

        Date dateOfBirth = new Date ( 1990 , 4 , 23 );

        System.out.println ( age ( dateOfBirth ) );
        DateTime scheduleDate;
        DateTime now = DateTime.now ();
        System.out.println ( "current date: " + now + " formated: " + now.getYear () + "-" + now.getDayOfMonth () + "-" + now.getDayOfMonth () );
    }
}
