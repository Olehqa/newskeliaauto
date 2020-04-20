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
    public Builder builder = new Builder ();

    EmployeeModel(HumanModel.Builder builder) {
        super ( builder );
    }

    public EmployeeModel() {
        super ();
    }

    public String getQualification() {
        return qualification;
    }

    public LocalDate getHiringDate() {
        return hiringDate;
    }

    public LocalDate getStartOfCarrier() {
        return startOfCarrier;
    }

    public MonthDay getDayOfSalary() {
        return dayOfSalary;
    }

    public int getSalary() {
        return salary;
    }

    public String getEducationOfEmployee() {
        return educationOfEmployee;
    }

    private void setQualification(String qualification) {
        this.qualification = qualification;
    }

    private void setHiringDate(LocalDate hiringDate) {
        this.hiringDate = hiringDate;
    }

    private void setStartOfCarrier(LocalDate startOfCarrier) {
        this.startOfCarrier = startOfCarrier;
    }

    private void setDayOfSalary(MonthDay dayOfSalary) {
        this.dayOfSalary = dayOfSalary;
    }

    private void setSalary(int salary) {
        this.salary = salary;
    }

    public void setEducationOfEmployee(String educationOfEmployee) {
        this.educationOfEmployee = educationOfEmployee;
    }

    //      TODO: yearsOfExperience to be calculated by diff from start of career by other function - DONE
    public Year getYearOfExperience() {
        return Year.now ().minusYears ( startOfCarrier.getYear () );
    }

    public Year getYearsInCompany() {
        return Year.now ().minusYears ( hiringDate.getYear () );
    }

    //TODO: two functions get int - DONE
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

    public class Builder extends HumanModel.Builder {
        private String qualification;
        private LocalDate hiringDate;
        private LocalDate startOfCarrier;
        private MonthDay dayOfSalary;
        private int salary;
        private String educationOfEmployee;

        public Builder(){
            super();
        }

        public Builder qualification(String qualification) {
            this.qualification = qualification;
            return this;
        }

        public Builder hiringDate(LocalDate hiringDate) {
            this.hiringDate = hiringDate;
            return this;
        }

        public Builder startOfCarrier(LocalDate startOfCarrier) {
            this.startOfCarrier = startOfCarrier;
            return this;
        }

        public Builder dayOfSalary(MonthDay dayOfSalary) {
            this.dayOfSalary = dayOfSalary;
            return this;
        }

        public Builder salary(int salary) {
            this.salary = salary;
            return this;
        }

        public Builder educationOfEmployee(String educationOfEmployee) {
            this.educationOfEmployee = educationOfEmployee;
            return this;
        }

        @Override
        public EmployeeModel build() {
            return new EmployeeModel ( this );
        }
    }

    private EmployeeModel(EmployeeModel.Builder builder) {
        super ( builder );
        this.qualification = builder.qualification;
        this.hiringDate = builder.hiringDate;
        this.startOfCarrier = builder.startOfCarrier;
        this.dayOfSalary = builder.dayOfSalary;
        this.salary = builder.salary;
        this.educationOfEmployee = builder.educationOfEmployee;
    }

}



