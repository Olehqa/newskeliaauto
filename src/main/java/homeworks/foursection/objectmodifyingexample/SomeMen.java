package homeworks.foursection.objectmodifyingexample;

public class SomeMen {
    String firstName;
    int pushUps;

    public SomeMen(String firstName , int pushUps) {
        this.firstName = firstName;
        this.pushUps = pushUps;
    }

    public SomeMen() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getPushUps() {
        return pushUps;
    }

    public void setPushUps(int pushUps) {
        this.pushUps = pushUps;
    }
}

class Spotzal {
    public static void main(String[] args) {

        SomeMen kep = new SomeMen ( "Macalan" , 50 );
        SomeMen potc = new SomeMen ( "Nalacam" , 5 );

        System.out.println ( "first value value: " + kep.getFirstName () + " made " + kep.getPushUps () );
        System.out.println ( "second value: " + potc.getFirstName () + ",  made " + potc.getPushUps () );

        System.out.println ( "changed value of pushUps " + increasePushUps ( 40 , kep ).getPushUps () );

        SomeMen kep2;
        SomeMen kep3;

        kep = increasePushUps ( 30 , kep );
        kep2 = kep;
//        kep3 = 89;

        System.out.println ( "changed value of push ups with assignment for " + kep.getFirstName () + ", " + kep.getPushUps () );

        System.out.println ( "Kep2 " + kep2.getFirstName () + ", " + kep2.getPushUps () );
        System.out.println ();

        newSomeMen ( "Macalanius" , 40 , kep );
        System.out.println ();

        System.out.println ( " changed with newSomeMen: " + kep.getFirstName () + ", " + kep.getPushUps () );

        changeName ( potc , "Magda" );
        System.out.println ( "changed name in void method " + potc.getFirstName () );
    }

    private static SomeMen increasePushUps(int number , SomeMen x) {
        x.setPushUps ( x.getPushUps () + number );
        return x;
    }

    private static SomeMen newSomeMen(String name , int number , SomeMen y) {
        y = new SomeMen ( name , number );
        return y;
    }

    private static void changeName(SomeMen x , String newName) {
        x.setFirstName ( x.getFirstName ().replaceAll ( x.getFirstName () , newName ) );
    }
}