package homeworks.oop;


import homeworks.oop.model.CompanyModel;
import homeworks.oop.model.EmployeeModel;

import homeworks.oop.model.Sex;

import java.time.LocalDate;





public class CreateCompany {


    public static void main(String[] args) {


        EmployeeModel employeeNumber1 = (EmployeeModel) new EmployeeModel().builder
                .firstName ( "hello" )
                .lastName ( "Helovovych" )
                .birthday ( LocalDate.of ( 10 , 10 , 20 ) )
                .city ( "SyperCity" )
                .nationality ( "uhandish" )
                .sex ( Sex.MAN )
                .build ();

        EmployeeModel employeeNumber2 =(EmployeeModel) new EmployeeModel().builder
                .firstName ( "hello" )
                .lastName ( "Helovovych" )
                .birthday ( LocalDate.of ( 10 , 10 , 20 ) )
                .city ( "SyperCity" )
                .nationality ( "uhandish" )
                .sex ( Sex.MAN )
                .build ();

        EmployeeModel employeeNumber3 = (EmployeeModel) new  EmployeeModel().builder
                .firstName ( "hello" )
                .lastName ( "Helovovych" )
                .birthday ( LocalDate.of ( 10 , 10 , 20 ) )
                .city ( "SyperCity" )
                .nationality ( "uhandish" )
                .sex ( Sex.MAN )
                .build ();


 CompanyModel skelia = new CompanyModel ("Skelia");
         skelia.addEmployee ( employeeNumber1 );
        skelia.addEmployee ( employeeNumber2 );
        skelia.addEmployee ( employeeNumber3 );

        System.out.println (employeeNumber1.getFirstName ());



//        skelia.printEmployee ();
//        System.out.println ( employee.signature () );
//        System.out.println ( employee.getStartOfCarrier (  ) );
//        System.out.println ( employee.getStartOfCarrierInCompany (  ) );
//
//        employee.getDaysToFromSalary ( 10 );

//        System.out.println ( "amout of salary " + employee.getAmountOfSalaryFormHiringDate ( LocalDate.of ( 2018 , 1 , 10 ) , 1000 ) );
//        System.out.println ( "age of company is " + company.getAgeOfCompany ( LocalDate.of ( 2010 , 10 , 10 ) ) );


//    @Override
//    public String toString(){
//
//      return ;
//    }





    }

}
