package homework1.company.model;

/** Задачка

        треба написати такі класи:
        людина
        працівник
        компанія
        поля довільні  просто логічно  функції поки що теж тдовільні

 */

public class HumanModel {

    private String nameOfHuman;
    private String secondNameOfHuman;
    private int ageOfHuman;
    private String sexOfHuman;

    public String getNameOfHuman() {
        return nameOfHuman;
    }

    public void setNameOfHuman(String nameOfHuman) {
        this.nameOfHuman = nameOfHuman;
    }

    public String getSecondNameOfHuman() {
        return secondNameOfHuman;
    }

    public void setSecondNameOfHuman(String secondNameOfHuman) {
        this.secondNameOfHuman = secondNameOfHuman;
    }

    public int getAgeOfHuman() {
        return ageOfHuman;
    }

    public void setAgeOfHuman(int ageOfHuman) {
        this.ageOfHuman = ageOfHuman;
    }

    public String getSexOfHuman() {
        return sexOfHuman;
    }

    public void setSexOfHuman(String sexOfHuman) {
        this.sexOfHuman = sexOfHuman;
    }

    public String getNationalityOfHuman() {
        return nationalityOfHuman;
    }

    public void setNationalityOfHuman(String nationalityOfHuman) {
        this.nationalityOfHuman = nationalityOfHuman;
    }

    String nationalityOfHuman;


}
