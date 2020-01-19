package homeworks.oop;

import homeworks.oop.model.CompanyModel;
import homeworks.oop.model.EmployeeModel;

import java.time.LocalDate;

public class CreateCompany {
    public static void main(String[] args) {
        CompanyModel company = new CompanyModel ();


////        EmployeeModel employee = new EmployeeModel ();
//        System.out.println ( employee.signature () );
//        System.out.println ( employee.getStartOfCarrier (  ) );
//        System.out.println ( employee.getStartOfCarrierInCompany (  ) );
//
//        employee.getDaysToFromSalary ( 10 );

//        System.out.println ( "amout of salary " + employee.getAmountOfSalaryFormHiringDate ( LocalDate.of ( 2018 , 1 , 10 ) , 1000 ) );
        System.out.println ( "age of company is " + company.getAgeOfCompany ( LocalDate.of ( 2010 , 10 , 10 ) ) );
    }
}
