package homeworks.oop.model;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Period;
import java.time.Year;
import java.util.Calendar;


public class EmployeeModel extends HumanModel {

    /**
     * DONE - (update to start of Career )
     * DONE - start at this company hiring date
     * DONE add salary day and function to say how long to wait for salary, latest salary days ago
     * DONE amount os salaries from hiring date
     * <p>
     * функцію щоб просто про працівника
     * дженерал, де є і про працівника і про людтну)
     */

    private String qualification;
    private LocalDate hiringDate;
    private int startOfCarrier;//date
    private MonthDay dayOfSalary;
    private int salary;

    private String educationOfEmployee;


    public EmployeeModel(String firstName , String secondName ,
                         int year , int month , int day , String sex ,
                         String nationality , int age , String qualification ,
                         LocalDate hiringDate ,
                         int startOfCarrier , MonthDay dayOfSalary ,
                         int salary , String educationOfEmployee) {
        super ( firstName , secondName , year , month , day , sex , nationality );
        this.qualification = qualification;
        this.hiringDate = hiringDate;
        this.startOfCarrier = startOfCarrier;
        this.dayOfSalary = dayOfSalary;
        this.salary = salary;
        this.educationOfEmployee = educationOfEmployee;
    }

    public EmployeeModel(String qualification ,
                         int salary , String educationOfEmployee) {
        super ( "BlaBla" , "Ivanovuch" );
        this.qualification = qualification;
        this.salary = salary;
        this.educationOfEmployee = educationOfEmployee;
    }

    public EmployeeModel(String qualification ,
                         String educationOfEmployee) {
        super ( "Vasyl" , "Vasulovuch" );
        this.qualification = qualification;
        this.educationOfEmployee = educationOfEmployee;
    }


    public Year getStartOfCarrier() {
        //TODO: yearsOfExperience to be calculated by diff from start of career by other function
        Year yearsOfStartCarrier = Year.now ().minusYears ( yearsOfExperience );
        return yearsOfStartCarrier;
    }

    public Year getStartOfCarrierInCompany() {
        return Year.parse (String.valueOf ( hiringDate.getYear () ) );
    }

    //TODO: two functions get int
    public void getDaysToFromSalary(int dayOfSalary) {
        int daysToSalary = 0;
        int daysFromSalary = 0;
        Calendar calendar = Calendar.getInstance ();
        int currentDay = calendar.get ( Calendar.DAY_OF_MONTH );
        int daysInCurrentMonth = LocalDate.now ().lengthOfMonth ();
        int daysInPreviousMonth = LocalDate.now ().minusMonths ( 1 ).lengthOfMonth ();

        if (dayOfSalary < 1 || dayOfSalary > 31) {
            System.out.println ( "You chose wrong value as for day in month" );
        } else if (currentDay > dayOfSalary) {

            daysToSalary = daysInCurrentMonth - currentDay + dayOfSalary;
            daysFromSalary = currentDay - dayOfSalary;
        } else if (currentDay < dayOfSalary) {
            daysToSalary = dayOfSalary - currentDay;
            daysFromSalary = daysInPreviousMonth - dayOfSalary + currentDay;
        }
        System.out.println ( "Days to next salary " + daysToSalary );
        System.out.println ( "Days from last salary " + daysFromSalary );
    }

    public long getAmountOfSalaryFormHiringDate(int salary) {
        long amountOfMonth = Period.between ( hiringDate , LocalDate.now () ).toTotalMonths ();
        System.out.println ( "amount of month " + amountOfMonth );
        return salary * amountOfMonth;
    }

    public LocalDate getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(LocalDate hiringDate) {
        this.hiringDate = hiringDate;
    }


    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public String getEducationOfEmployee() {
        return educationOfEmployee;
    }

    public void setEducationOfEmployee(String educationOfEmployee) {
        this.educationOfEmployee = educationOfEmployee;
    }


}
