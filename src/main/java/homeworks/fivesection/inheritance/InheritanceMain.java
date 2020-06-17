package homeworks.fivesection.inheritance;

public class InheritanceMain {

    public static void main(String[] args) {
        AbstractHuman hum = new Student ( "Manu" , "Pkiao" );
        AbstractHuman hum2 = new Employee ( "Alice" , "Kimble" , "oldProfession" );
        Student student1 = new Student ( "Funtic" , "Puntik" );

        AbstractHuman humanAbs = new AbstractHuman () {
            @Override
            public String getBio() {
                System.out.println ( "Bio from overrated method from abstract" );
                return null;
            }
        };

        humanAbs.getBio ();
        System.out.println ( hum.getFirstName () );
        System.out.println ( hum.getBio () );
        System.out.println ( hum2.getBio () );

        if (hum.equals ( hum2 )) {
            System.out.println ( "Object are equal" );
        } else {
            System.out.println ( "Object are not equal" );
        }
    }
}