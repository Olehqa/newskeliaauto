package homeworks.fivesection.inheritance;

public class InheritanceMain {

    public static void main(String[] args) {
        Human hum = new Student ( "Manu" , "Pkiao" );
        Human hum2 = new Employee ( "Alice" , "Kimble" , "oldProfession" );

        Human humanAbs = new Human () {
            @Override
            public String getBio() {
                return null;//for what it should be used
            }
        };
    }
}