package homeworks.oop.model;

import java.time.LocalDate;
import java.time.MonthDay;

public class EmployeeBuilder extends HumanBuilder {


    private String qualification;
    private LocalDate hiringDate;
    private LocalDate startOfCarrier;
    private MonthDay dayOfSalary;
    private int salary;
    private String educationOfEmployee;





    public EmployeeBuilder qualification(final String qualification) {
        this.qualification = qualification;
        return this;
    }


    public EmployeeBuilder hiringDate(final LocalDate hiringDate) {
        this.hiringDate = hiringDate;
        return this;
    }


    public EmployeeBuilder startOfCarrier(final LocalDate startOfCarrier) {
        this.startOfCarrier = startOfCarrier;
        return this;
    }


    public EmployeeBuilder dayOfSalary(final MonthDay dayOfSalary) {
        this.dayOfSalary = dayOfSalary;
        return this;
    }


    public EmployeeBuilder salary(final int salary) {
        this.salary = salary;
        return this;
    }


    public EmployeeBuilder educationOfEmployee(final String educationOfEmployee) {
        this.educationOfEmployee = educationOfEmployee;
        return this;
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

    public EmployeeBuilder (HumanBuilder humanBuilder) {
        super ( humanBuilder );}

}
