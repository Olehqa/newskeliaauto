package homeworks.oop.model;

public class CompanyModel {

    private String nameOfTheCompany;
    private String sphereOfCompanyActivity;
    private int numbersOfEmployee;
    //реальні працівники список
    private int companyAge;// Date to calculate age function

    // функцію щоб виволила всі дані про компанію і про всіх працівників, ( два формати, офіційний коли суто про роботу, і не офіціійний деталі про людину ітселф)
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

    public int getCompanyAge() {
        return companyAge;
    }

    public void setCompanyAge(int companyAge) {
        this.companyAge = companyAge;
    }


}
