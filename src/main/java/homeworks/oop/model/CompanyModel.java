package homeworks.oop.model;

import java.time.LocalDate;
import java.time.Period;

public class CompanyModel {

    /**
    Реальний список працівників

     функцію щоб виволила всі дані про компанію і про всіх працівників,
     ( два формати, офіційний коли суто про роботу, і не офіціійний деталі про людину ітселф)

     DONE -  Date to calculate age of company function


     Builder pattern
     */

    private String nameOfTheCompany;
    private String sphereOfCompanyActivity;
    private int numbersOfEmployee;

    private LocalDate companyFounded;

    LocalDate date= ;
    //TODO: use array usual for employee []
    EmployeeModel employee = new EmployeeModel ("Ira","Rak",1991,7,24,"F","n","")

//    String firstName , String secondName ,
//    int year , int month , int day , String sex ,
//    String nationality , int age , String qualificationOfEmployee ,
//    LocalDate hiringDate , int yearsOfExperience , int yearsOfExperienceOfEmployee ,
//    int startOfCarrier , int startOfCarrierInCompany , MonthDay dayOfSalary ,
//    int salaryOfEmployee , String educationOfEmployee




    public long getAgeOfCompany(LocalDate companyFounded) {
      long ageOfCompany = Period.between ( companyFounded , LocalDate.now ()).getYears ();

        return ageOfCompany;
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


}
