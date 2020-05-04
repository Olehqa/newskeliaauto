package homeworks.foursection.agregation;

public class Company {
    private String name;
    private int age;

    public Company(String name) {
        this.name = name;
    }

    Company(String name , int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //aggregation
    Employee empl1 = new Employee ( "Vasylko" , "Kodivskiy" );
    Employee empl2 = new Employee ( "Vasylyna" , "Kodivkska" );

    public String positionOfEmployee(String name , String secondName , String position) {
        Employee em = new Employee (); // dependency

        return "Mr/Mrs " + em.getName () + em.getSecondName () + " obtain the " + position + " in current company"; // return with out string - done
    }

    public static void main(String[] args) {
        Company skelia1 = new Company ( "Skelia1" , 15 );
        System.out.println ( skelia1.empl1.getName () );
    }
}