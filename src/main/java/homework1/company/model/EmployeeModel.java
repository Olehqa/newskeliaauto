package homework1.company.model;

public class EmployeeModel extends HumanModel {
    private String qualificationOfEmployee;
    private int yearsOfExperienceOfEmployee;
    private int salaryOfEmployee;
    private String educationOfEmployee;

    public EmployeeModel(String qualificationOfEmployee , int yearsOfExperienceOfEmployee , int salaryOfEmployee , String educationOfEmployee) {
        this.qualificationOfEmployee = qualificationOfEmployee;
        this.yearsOfExperienceOfEmployee = yearsOfExperienceOfEmployee;
        this.salaryOfEmployee = salaryOfEmployee;
        this.educationOfEmployee = educationOfEmployee;
    }

    public EmployeeModel(String qualificationOfEmployee , int yearsOfExperienceOfEmployee , String educationOfEmployee) {
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
