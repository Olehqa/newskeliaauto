package homeworks.foursection.agregation;

public class Main {
    public static void main(String[] args) {

            Company skelia = new Company ( "Skelia" , 15 );
            Employee empl3 = new Employee ( );
            Employee empl4 = new Employee ( "Vasylyna" , "Kodivkska" );
            String secondName = empl3.getSecondName ();

            System.out.println ( "empl3 = " + secondName );
            System.out.println ( empl4.getName () );
        }
    }