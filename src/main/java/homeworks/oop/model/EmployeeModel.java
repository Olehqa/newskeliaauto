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
    private LocalDate startOfCarrier;
    private MonthDay dayOfSalary;
    private int salary;
    private String educationOfEmployee;

    public EmployeeModel(HumanBuilder humanBuilder) {
        super ( humanBuilder );
    }


//    public Year getStartOfCarrier() {
//  //     TODO: yearsOfExperience to be calculated by diff from start of career by other function
//        Year yearsOfStartCarrier = Year.now ().minusYears ( yearsOfExperience );
//        return yearsOfStartCarrier;
//    }

    public Year getStartOfCarrierInCompany() {
        return Year.parse ( String.valueOf ( hiringDate.getYear () ) );
    }

    //TODO: two functions get int
    public int getDaysToSalary(int dayOfSalary) {
        int daysToSalary = 0;
        Calendar calendar = Calendar.getInstance ();
        int currentDay = calendar.get ( Calendar.DAY_OF_MONTH );
        int daysInCurrentMonth = LocalDate.now ().lengthOfMonth ();

        if (dayOfSalary < 1 || dayOfSalary > 31) {
            System.out.println ( "You chose wrong value as for day in month" );
        } else if (currentDay > dayOfSalary) {
            daysToSalary = daysInCurrentMonth - currentDay + dayOfSalary;

        } else if (currentDay < dayOfSalary) {
            daysToSalary = dayOfSalary - currentDay;
        }
        return daysToSalary;
    }

    public int getDaysFromSalary(int dayOfSalary) {
        int daysFromSalary = 0;
        Calendar calendar = Calendar.getInstance ();
        int currentDay = calendar.get ( Calendar.DAY_OF_MONTH );
        int daysInCurrentMonth = LocalDate.now ().lengthOfMonth ();
        int daysInPreviousMonth = LocalDate.now ().minusMonths ( 1 ).lengthOfMonth ();

        if (dayOfSalary < 1 || dayOfSalary > 31) {
            System.out.println ( "You chose wrong value as for day in month" );
        } else if (currentDay > dayOfSalary) {
            daysFromSalary = currentDay - dayOfSalary;
        } else if (currentDay < dayOfSalary) {
            daysFromSalary = daysInPreviousMonth - dayOfSalary + currentDay;
        }
        return daysFromSalary;
    }

    public long getAmountOfSalaryFormHiringDate(int salary) {
        long amountOfMonth = Period.between ( hiringDate , LocalDate.now () ).toTotalMonths ();
        System.out.println ( "amount of month " + amountOfMonth );
        return salary * amountOfMonth;
    }


}
