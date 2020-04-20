package homeworks.foursection.local.time.example;


import java.time.LocalDate;

public class ExampleLocalDate {

    private int age(LocalDate birthday) { //TODO:  full years count  ---

        if
//        (LocalDate.now ().getMonth ().getValue () >= birthday.getMonth ().getValue ()
//                && LocalDate.now ().getDayOfMonth () >= birthday.getDayOfMonth ())
        ((LocalDate.now ().getDayOfYear () >= birthday.getDayOfYear ())
        ) {

            return LocalDate.now ().getYear () - birthday.getYear ();
        }
        return LocalDate.now ().getYear () - birthday.getYear () - 1;
    }


//        return (int) ChronoUnit.YEARS.between ( birthday , LocalDate.now () )+1;

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of ( 1990 , 5 , 15 );
        ExampleLocalDate exL = new ExampleLocalDate ();
//birthday.get ( Calendar. )
        System.out.println ( exL.age ( birthday ) );

    }

    public class SecondClassInside {

        public class ThirdClassInside {
            public class FourClassInside {
            }
            public class EightHClassInside{
            }
        }
    }
    public class FiveClassInside {
    }
    public class SixClassInside {
    }
}
//public class SevenClassInside {
//
//
//}
