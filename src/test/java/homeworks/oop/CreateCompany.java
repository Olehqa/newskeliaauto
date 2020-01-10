package homeworks.oop;

import homeworks.oop.model.CompanyModel;
import homeworks.oop.model.EmployeeModel;

public class CreateCompany {
    public static void main(String[] args) {
        CompanyModel company = new CompanyModel ();
        EmployeeModel employee = new EmployeeModel ();
        System.out.println (  employee.getAge ( employee.getBirthday () ));
        System.out.println (employee.signature ( "Ivan", "Ivanovych" ));
        System.out.println ();

    }
}
