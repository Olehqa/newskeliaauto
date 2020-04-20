package homeworks.foursection.agregation;

public class Company {

    private String name ="yup yup";
    private int Age  = 30;

//aggregation
    public String positionOfEmployee(String name, String secondName, String position) {
        Employee em = new Employee (); // dependency
        em.setName ( name );
        em.setSecondName ( secondName );

        return "Mr/Mrs " + em.getName () + em.getSecondName () + " obtain the " + position + " in current company"; // return with out string - done
    }







}
