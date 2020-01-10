package homeworks.oop.model;

public class EmployeeModel extends HumanModel {
    private String qualificationOfEmployee;
    private int yearsOfExperienceOfEmployee; //(update to start of Career )
    //start at this company hiring date
    //add salary day and function to say how long to wait for salary, latest salary days ago
    //amount os salaries from hiring date
    private int salaryOfEmployee;
    private String educationOfEmployee;


    public EmployeeModel() {
        super ("Human", "Humanovush");
    }

// функцію щоб просто про працівника і дженерал, де є і про працівника і про людтну)

    public EmployeeModel(String qualificationOfEmployee , int yearsOfExperienceOfEmployee , int salaryOfEmployee , String educationOfEmployee) {
        super ("Ivan", "Ivanovuch");
        this.qualificationOfEmployee = qualificationOfEmployee;
        this.yearsOfExperienceOfEmployee = yearsOfExperienceOfEmployee;
        this.salaryOfEmployee = salaryOfEmployee;
        this.educationOfEmployee = educationOfEmployee;
    }

    public EmployeeModel(String qualificationOfEmployee , int yearsOfExperienceOfEmployee , String educationOfEmployee) {
        super ("Vasyl", "Vasulovuch");
        this.qualificationOfEmployee = qualificationOfEmployee;
        this.yearsOfExperienceOfEmployee = yearsOfExperienceOfEmployee;
        this.educationOfEmployee = educationOfEmployee;
    }





    public String getQualificationOfEmployee() {
        return qualificationOfEmployee;
    }

    public void setQualificationOfEmployee(String qualificationOfEmployee) {
        this.qualificationOfEmployee = qualificationOfEmployee;
    }

    public int getYearsOfExperienceOfEmployee() {
        return yearsOfExperienceOfEmployee;
    }

    public void setYearsOfExperienceOfEmployee(int yearsOfExperienceOfEmployee) {
        this.yearsOfExperienceOfEmployee = yearsOfExperienceOfEmployee;
    }

    public int getSalaryOfEmployee() {
        return salaryOfEmployee;
    }

    public void setSalaryOfEmployee(int salaryOfEmployee) {
        this.salaryOfEmployee = salaryOfEmployee;
    }

    public String getEducationOfEmployee() {
        return educationOfEmployee;
    }

    public void setEducationOfEmployee(String educationOfEmployee) {
        this.educationOfEmployee = educationOfEmployee;
    }


}
