package homeworks.oop.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class CompanyModel {

    /**
     * Реальний список працівників
     * <p>
     * функцію щоб виволила всі дані про компанію і про всіх працівників,
     * ( два формати, офіційний коли суто про роботу, і не офіціійний деталі про людину ітселф)
     * <p>
     * DONE -  Date to calculate age of company function
     * <p>
     * <p>
     * Builder pattern
     */

    private String nameOfTheCompany;
    private String sphereOfCompanyActivity;
    private int numbersOfEmployee;

    private LocalDate companyFounded;

    public CompanyModel() {
    }

    public CompanyModel(String nameOfTheCompany) {
        this.nameOfTheCompany = nameOfTheCompany;
    }

    public long getAgeOfCompany(LocalDate companyFounded) {
        return Period.between ( companyFounded , LocalDate.now () ).getYears ();
    }

    public String getNameOfTheCompany() {

        return nameOfTheCompany;
    }

    public void setNameOfTheCompany(String nameOfTheCompany) {
        this.nameOfTheCompany = nameOfTheCompany;
    }

    public String getSphereOfCompanyActivity() {
        return sphereOfCompanyActivity;
    }

    public void setSphereOfCompanyActivity(String sphereOfCompanyActivity) {
        this.sphereOfCompanyActivity = sphereOfCompanyActivity;
    }

    public int getNumbersOfEmployee() {
        return numbersOfEmployee;
    }

    public void setNumbersOfEmployee(int numbersOfEmployee) {
        this.numbersOfEmployee = numbersOfEmployee;
    }

    public LocalDate getCompanyFounded() {
        return companyFounded;
    }

    public void setCompanyFounded(LocalDate companyFounded) {
        this.companyFounded = companyFounded;
    }

    private ArrayList<EmployeeModel> company = new ArrayList<> ();

    public boolean addEmployee(EmployeeModel employee) {
        EmployeeModel eM = new EmployeeModel ();
        if (company.contains ( employee )) {
            System.out.println ( eM.getLastName () + " , " + employee.getFirstName () + " is already on this company" );
            return false;
        } else {
            company.add ( employee );
            System.out.println ( eM.getLastName () + " , " + employee.getFirstName () + " added to the company " + this.nameOfTheCompany );
            return true;
        }
    }


//        public static void printEmployee(ArrayList n) {
//            for (Object i : n){
//                System.out.println ( i );
//            }
//    }


    //TODO: use array usual for employee []
//    EmployeeModel employee = new EmployeeModel ("Ira","Rak",1991,7,24,"F","n","");

//    String firstName , String secondName ,
//    int year , int month , int day , String sex ,
//    String nationality , int age , String qualificationOfEmployee ,
//    LocalDate hiringDate , int yearsOfExperience , int yearsOfExperienceOfEmployee ,
//    int startOfCarrier , int startOfCarrierInCompany , MonthDay dayOfSalary ,
//    int salaryOfEmployee , String educationOfEmployee


}
