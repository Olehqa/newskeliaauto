package homeworks.foursection.local.time.example;


import java.time.LocalDate;

public class ExampleLocalDate {

    private static int age(LocalDate birthday) { //TODO:  full years count  ---
        LocalDate dateNow = LocalDate.now ();
        if (dateNow.getDayOfYear () >= birthday.getDayOfYear ()) {
            return dateNow.getYear () - birthday.getYear ();
        }
        return dateNow.getYear () - birthday.getYear () - 1;
    }

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of ( 1990 , 5 , 15 );
        System.out.println ( age ( birthday ) );
    }
}
